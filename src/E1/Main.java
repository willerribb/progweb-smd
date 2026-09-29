import java.util.Arrays;
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

        System.out.print("Questão 11! Escolha um número, entre 0 e 10, e eu te mostro a tabuada dele: ");
        int tabuada = scanner.nextInt();
        if(tabuada > 10 || tabuada < 0) System.out.println("Eu disse entre 0 e 10...");
        else for(int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d%n", tabuada, i, tabuada * i);

        System.out.print("Questão 12! Digite uma nota, entre 0 e 10: ");
        double nota = scanner.nextDouble();
        while (nota > 10 || nota < 0) {
            System.out.print("Número inválido! Eu disse 'entre 0 e 10'... Tente novamente: ");
            nota = scanner.nextDouble();
        }
        System.out.println("Número válido!");

        System.out.print("Questão 13! Digite o número total de eleitores: ");
        int eleitores = scanner.nextInt();
        int cand1 = 0, cand2 = 0, cand3 = 0;
        for (int i = 1; i<= eleitores; i++) {
            System.out.printf("Voto do eleitor %d (Escolha candidato 1, 2 ou 3): ", i);
            int voto = scanner.nextInt();
            if(voto == 1) cand1++;
            else if(voto == 2) cand2++;
            else if(voto == 3) cand3++;
            else System.out.println("Voto inválido! Eu disse candidato 1, 2 OU 3!");
        }
        System.out.printf("Resultado: Candidato 1 (%d votos), Candidato 2 (%d votos), Candidato 3 (%d votos)%n", cand1, cand2, cand3);

        System.out.println("Questão 14... Digite 10 números inteiros maiores que 1:");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%dº número: ", i);
            int num = scanner.nextInt();
            if(num < 1) {
                System.out.println("Insira um número MAIOR que 1!");
                continue;
            }
            boolean isPrime = true;
            if(num <= 1) isPrime = false;
            for(int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.printf("%d é um número primo.%n", num);
            else System.out.printf("%d não é um número primo.%n", num);
        }

        System.out.println("Questão 15! Seguem os 10 primeiros termos de Fibonacci:");
        int a = 0, b = 1;
        for(int i = 0; i < 10; i++) {
            System.out.print(a + (i < 9 ? "-" : ""));
            int temp = a;
            a = b;
            b += temp;
        }
        System.out.println();

        System.out.print("Questão 16! Digite um número inteiro positivo: ");
        int fat = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= fat; i++) factorial *= i;
        System.out.printf("O fatorial de %d é %d", fat, factorial);

        scanner.close();
    }

    public static void vetores() {
        // Tecnicamente falando, strings SÃO vetores.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Questão 17! Digite 5 números inteiros:");
        int[] vectorfive = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dª número: ", i + 1);
            vectorfive[i] = scanner.nextInt();
        }
        System.out.println("Vetor: " + Arrays.toString(vectorfive));

        System.out.println("Questão 18! Agora digite 10 números reais!");
        double[] vectorten = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dª número: ", i + 1);
            vectorten[i] = scanner.nextDouble();
        }
        System.out.print("Ordem inversa: ");
        for (int i = 9; i >= 0; i--) System.out.print(vectorten[i] + (i > 0 ? ", " : ""));
        System.out.println();

        System.out.println("Questão 19! Digite 5 números inteiros, de novo...");
        int[] vectorfive19 = new int[5];
        int soma = 0;
        long mult = 1;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dª número: ", i + 1);
            vectorfive19[i] = scanner.nextInt();
            soma += vectorfive19[i];
            mult *= vectorfive19[i];
        }
        System.out.println("Vetor: " + Arrays.toString(vectorfive19));
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + mult);

        System.out.println("Questão 20, então digite 20 números inteiros!");
        int[] vectortwenty = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contPar = 0, contImpar = 0;
        for(int i = 0; i < 20; i++) {
            System.out.printf("Digite o %dª número: ", i + 1);
            int n = scanner.nextInt();
            vectortwenty[i] = n;
            if(n % 2 == 0) par[contPar++] = n;
            else impar[contImpar++] = n;
        }
        System.out.println("Vetor: " + Arrays.toString(vectortwenty));
        System.out.println("Vetor par: " + Arrays.toString(Arrays.copyOf(par, contPar)));
        System.out.println("Vetor ímpar: " + Arrays.toString(Arrays.copyOf(impar, contImpar)));
        scanner.nextLine();

        System.out.println("Questão 21, digite uma frase ou palavra: ");
        String s1 = scanner.nextLine();
        System.out.println("Digite outra frase ou palavra: ");
        String s2 = scanner.nextLine();
        System.out.printf("String 1: '%s' de tamanho %d%n", s1, s1.length());
        System.out.printf("String 2: '%s' de tamanho %d%n", s2, s2.length());
        if(s1.length() == s2.length()) System.out.println("As duas strings têm o mesmo comprimento.");
        else System.out.println("As duas strings não têm o mesmo comprimento.");
        if(s1.equals(s2)) System.out.println("As duas strings são iguais em conteúdo.");
        else System.out.println("As duas strings não são iguais em conteúdo.");

        System.out.print("Questão 22, digite um número inteiro e eu te mostro o reverso: ");
        int number = scanner.nextInt();
        int reverse = 0, temp = Math.abs(number);
        while(temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        if(number < 0) reverse *= -1;
        System.out.printf("O reverso de %d é %d%n", number, reverse);

        System.out.println("Por fim... a questão 23! Vamos fazer uma calculadora básica.");
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double result = 0;
        boolean isPossible = true;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if(n2 != 0) result = n1 / n2;
                else {
                    System.out.print("Não é possível dividir por zero. ");
                    isPossible = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                isPossible = false;
        }
        if(isPossible) System.out.printf("Resultado = %.1f", result);

        scanner.close();
    }

    public static void main(String[] args) {
        // Questões 01 a 05
        //sequencial();

        // Questões 06 a 10
        //decisao();

        // Questões 11 a 16
        //repeticao();

        // Questões 17 a 23
        vetores();
    }
}