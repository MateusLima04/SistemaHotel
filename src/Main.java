import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean executar = true;

        while (executar){
            System.out.println("===================");
            System.out.println("   SISTEMA HOTEL   ");
            System.out.println("===================");

            System.out.println("[1] - Cadastrar Quarto");
            System.out.println("[2] - Listar Quarto");
            System.out.println("[3] - Reservar Quarto");
            System.out.println("[4] - Cancelar Quarto");
            System.out.println("[5] - Sair");

            int opcao  = scanner.nextInt();

            switch (opcao){
                case 5:
                    System.out.println("Programa saindo...");
                    executar = false;
                    break;
            }
        }
    }
}