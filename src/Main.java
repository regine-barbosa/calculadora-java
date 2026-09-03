package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


        while (opcao != 5){

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o primeiro número: ");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o segundo número: ");
                    int n2 = scanner.nextInt();
                    scanner.nextLine();

                    Calculadora calc = new Calculadora(n1, n2);
                    int resultado = calc.somar();

                    System.out.println("O resultado da soma entre os números " + n1 + " e " + n2 + " é de: " + resultado +"\n");
                }

                case 2 ->{
                    System.out.println("Digite o primeiro número: ");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o segundo número: ");
                    int n2 = scanner.nextInt();
                    scanner.nextLine();

                    Calculadora calc = new Calculadora(n1, n2);
                    int resultado = calc.subtrair();

                    System.out.println("O resultado da subtração entre os números " + n1 + " e " + n2 + " é de: " + resultado +"\n");
                }
                case 3 -> {
                    System.out.println("Digite o primeiro número: ");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o segundo número: ");
                    int n2 = scanner.nextInt();
                    scanner.nextLine();

                    Calculadora calc = new Calculadora(n1, n2);
                    int resultado = calc.multiplicar();


                    System.out.println("O resultado da multiplicação entre os números " + n1 + " e " + n2 + " é de: " + resultado +"\n");
                }
                case 4 -> {
                    System.out.println("Digite o primeiro número: ");
                    int n1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o segundo número: ");
                    int n2 = scanner.nextInt();
                    scanner.nextLine();

                    Calculadora calc = new Calculadora(n1, n2);
                    double resultado = calc.dividir();


                    System.out.println("O resultado da divisão entre os números " + n1 + " e " + n2 + " é de: " + resultado +"\n");
                }
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! tente novamente.");
            }

        }

    }
}
