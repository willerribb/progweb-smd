import java.util.Scanner;

public class Main {

    public static void sequencial() {
        System.out.println("Alô mundo, alô questão 1!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Questão 2! Digite um número... ");
        System.out.printf("O número digitado é %d%n", scanner.nextInt());

        System.out.println("Questão 3! Digite três notas e veja a média aritmética!");
        System.out.print("Nota 1: ");
        double n1 = scanner.nextInt();
        System.out.print("Nota 2: ");
        double n2 = scanner.nextInt();
        System.out.print("Nota 3: ");
        double n3 = scanner.nextInt();
        System.out.printf("A média das três notas é igual a %.2f%n", (n1+n2+n3)/3.0);

        System.out.println("Questão 4 agora! Digite uma medida, em metros... ");
        System.out.printf("A sua media, em centímetros é %dcm%n", scanner.nextInt()*100);

        System.out.println("Por fim, a questão 5.");
        System.out.println("Vamos calcular a área de um círculo de raio r. Insira o raio do círculo, em centímetros: ");
        int raio = scanner.nextInt();
        System.out.printf("A área do círculo de raio %dcm é igual a %.1fcm²", raio, (Math.PI * (raio*raio)));

        scanner.close();
    }

    public static void decisao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos à questão 6!");
        System.out.println("Digite os preços de três produtos e vou te dizer qual é o mais barato!");
        System.out.print("Produto 1: R$ ");
        long p1 = Math.round(scanner.nextDouble() * 100);
        System.out.print("Produto 2: R$ ");
        long p2 = Math.round(scanner.nextDouble() * 100);
        System.out.print("Produto 3: R$ ");
        long p3 = Math.round(scanner.nextDouble() * 100);
        if(p1 <= p2 && p1 <= p3) System.out.printf("Compre o produto 1 por R$ %.2f%n", p1/100.0);
        else if(p2 <= p1 && p2 <= p3) System.out.printf("Compre o produto 2 por R$ %.2f%n", p2/100.0);
        else System.out.printf("Compre o produto 3 por R$ %.2f%n", p3/100.0);

        System.out.println("Questão 7! Digite quantas notas você deseja inserir para calcular a média: ");
        int n = scanner.nextInt();
        if(n == 0) System.out.println("Você inseriu zero notas :(");
        else {
            double notas = 0;
            for(int i = 0; i < n; i++) {
                System.out.print("Digite uma nota: ");
                notas += scanner.nextDouble();
            }
            if(notas == 0) System.out.println("A média é zero. Loucura.");
            else {
                double avg = notas / n;
                if(avg >= 7.0) System.out.printf("O aluno foi aprovado com média %.2f%n", avg);
                else System.out.printf("O aluno foi reprovado com média %.2f%n", avg);
            }
        }

        System.out.println("Questão 8! Digite duas notas e eu digo a média final do discente.");
        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();
        double avg = (n1+n2)/2.0;
        if(avg >= 7) System.out.printf("Discente aprovado por média, com MF igual a %.2f%n", avg);
        else if(avg >= 4) {
            System.out.print("Discente precisou fazer AF. Digite a nota da AF: ");
            double af = scanner.nextDouble();
            if(af < 4 || (avg + af)/2 < 5) System.out.printf("Discente reprovado pós AF, com nota %.2f e média final %.2f%n", af, (avg + af)/2);
            else System.out.printf("Discente aprovado pós AF, com nota %.2f e média final %.2f%n", af, (avg + af)/2);
        }
        else System.out.printf("Discente reprovado por média, com MF igual a %.2f%n", avg);

        System.out.println("Questão 9! Digite três números e eu digo qual o maior deles.");
        System.out.print("Número 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Número 2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Número 3: ");
        double number3 = scanner.nextDouble();
        System.out.printf("O maior número é %.1f%n", Math.max(number1, Math.max(number2, number3)));


        System.out.println("Por fim, a questão 10! Digite um número: ");
        int number = scanner.nextInt();
        if(number % 2 == 0) System.out.printf("O número %d é par!%n", number);
        else System.out.printf("O número %d é ímpar!%n", number);

        scanner.close();
    }

    public static void repeticao() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

    public static void main(String[] args) {
        // Questões 01 a 05
        //sequencial();

        // Questões 06 a 10
        //decisao();

        // Questões 11 a 16
        repeticao();
    }
}