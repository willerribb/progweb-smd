import java.util.Scanner;

public class Main {

    public static void sequencial(){
        System.out.println("Alô mundo! Alô SMD! Alô questão 01!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Questão 2... Digite um número...");
        System.out.println("O número digitado é " + scanner.nextInt());

        System.out.println("Questão 3! Agora digite 3 notas...");
        System.out.print("Nota 1:");
        int n1 = scanner.nextInt();
        System.out.print("Nota 2:");
        int n2 = scanner.nextInt();
        System.out.print("Nota 3:");
        int n3 = scanner.nextInt();
        System.out.println("A média das notas inseridas é " + (n1 + n2 + n3)/3);

        System.out.println("Questão 4 agora! Digite uma medida em metros...");
        System.out.print("A sua medida, convertida para centímetros: " + scanner.nextInt());

        System.out.println("Questão 5, enfim! Vamos calcular a área de um círculo. Insira o raio do círculo, em centímetros...");
        int raio = scanner.nextInt();
        System.out.print("A área do círculo de raio " + raio + "cm é:" + Math.PI * (raio * raio) + "cm²");
    }

    public static void main(String[] args) {
        // Questões 01 a 05

    }
}