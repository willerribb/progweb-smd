package E2;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            ProdutoDAO dao = new ProdutoDAO(conn);

            System.out.println("--- 1. Testando Inserção ---");
            boolean inseriu = dao.inserir("Câmera Digital", "Câmera 14.1 MP");
            System.out.println("Inseriu produto? " + inseriu);

            System.out.println("\n--- 2. Testando Obter Todas as Entidades ---");
            List<Produto> produtos = dao.obterTodas();
            for (Produto p : produtos) {
                System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + " | Descrição: " + p.getDescricao());
            }

            if (!produtos.isEmpty()) {
                int idTeste = produtos.get(0).getId();

                System.out.println("\n--- 3. Testando Obter por ID (" + idTeste + ") ---");
                Produto produtoObtido = dao.obter(idTeste);
                if (produtoObtido != null) {
                    System.out.println("Produto encontrado com sucesso: " + produtoObtido.getNome());
                }

                System.out.println("\n--- 4. Testando Atualização ---");
                boolean atualizou = dao.atualizar("Câmera Digital Atualizada", "Lente trocada e firmware atualizado", idTeste);
                System.out.println("Atualizou produto? " + atualizou);

                Produto produtoAtualizado = dao.obter(idTeste);
                System.out.println("Novo nome salvo no banco: " + (produtoAtualizado != null ? produtoAtualizado.getNome() : "Falha ao buscar"));

                System.out.println("\n--- 5. Testando Remoção ---");
                boolean removeu = dao.remover(idTeste);
                System.out.println("Removeu produto? " + removeu);

                System.out.println("Total de registros agora: " + dao.obterTodas().size());

            } else {
                System.out.println("\nNenhum produto cadastrado para dar andamento aos testes de obter, atualizar e remover.");
            }

        } catch (Exception e) {
            System.err.println("Erro durante a execução dos testes: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
