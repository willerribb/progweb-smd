package E2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }

    public List<Produto> obterTodas() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Produto obter(int id) {
        Produto p = null;
        String sql = "SELECT * FROM produto WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    p = new Produto();
                    p.setId(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setDescricao(rs.getString("descricao"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    public boolean inserir(String nome, String descricao) {
        String sql = "INSERT INTO produto (nome, descricao) VALUES (?, ?)";
        boolean sucesso = false;

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, descricao);

            int linhasAfetadas = ps.executeUpdate();
            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sucesso;
    }

    public boolean atualizar(String nome, String descricao, int id) {
        String sql = "UPDATE produto SET nome = ?, descricao = ? WHERE id = ?";
        boolean sucesso = false;

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, descricao);
            ps.setInt(3, id);

            int linhasAfetadas = ps.executeUpdate();
            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sucesso;
    }

    public boolean remover(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        boolean sucesso = false;

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);

            int linhasAfetadas = ps.executeUpdate();
            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sucesso;
    }
}