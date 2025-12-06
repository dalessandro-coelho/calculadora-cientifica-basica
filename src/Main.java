import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println(" CALCULADORA CIENTIFICA ");
        System.out.println("=========================");

        byte op = 0;
        do {
            System.out.println("5 - Somar\n4 - Subtrair \n3 - Multiplicar \n2 - Dividir\n1 - Sair");
            System.out.print("Qual Operação será utilizada? ");
            op = sc.nextByte();
            System.out.println("=========================");

            if (op == 1){
                break;
            } else {
                System.out.print("Digite o 1º Valor: ");
                int n1 = sc.nextInt();
                System.out.print("Digite o 2º Valor: ");
                int n2 = sc.nextInt();

                switch (op) {
                    case 5:
                        System.out.println("Resultado: " + Operacoes.somar(n1, n2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + Operacoes.subtrair(n1, n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + Operacoes.multiplicar(n1, n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + Operacoes.dividir(n1, n2));
                        break;
                    default:
                        System.out.println("Operação não encontrada.Tente novamente!");
                }
                System.out.println("=========================");
            }
        } while ( (true));
    }
}