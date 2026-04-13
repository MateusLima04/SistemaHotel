import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean executar = true;
        Hotel hotel = new Hotel();
        int numero;

        while (executar){
            System.out.println("===================");
            System.out.println("   SISTEMA HOTEL   ");
            System.out.println("===================");

            System.out.println("[1] - Cadastrar Quarto");
            System.out.println("[2] - Listar Quarto");
            System.out.println("[3] - Quarto disponíveis");
            System.out.println("[4] - Quarto indiponíveis");
            System.out.println("[5] - Reservar Quarto");
            System.out.println("[6] - Cancelar Quarto");
            System.out.println("[7] - Sair");

            int opcao  = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();

                    System.out.println("Escolha o tipo do quarto: ");
                    System.out.println("[1] - Simples");
                    System.out.println("[2] - Duplo");
                    System.out.println("[3] - Luxo");

                    int tipoOpcao = scanner.nextInt();
                    String tipo = "";

                    if (tipoOpcao == 1){
                        tipo = "Simples";
                    } else if (tipoOpcao == 2) {
                        tipo = "Duplo";
                    } else if (tipoOpcao == 3) {
                        tipo = "Luxo";
                    }else {
                        System.out.println("Tipo invalído!");
                        System.out.println("Tente novamente o cadastro");
                        continue;
                    }

                    Quarto q = new Quarto(numero, tipo);
                    hotel.adicionarQuarto(q);
                    break;
                case 2:
                    hotel.listarQuarto();
                    break;
                case 3:
                    hotel.listarDisponiveis();
                    break;
                case 4:
                    hotel.listarIndisponiveis();
                    break;
                case 5:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.reservaQuarto(numero);
                    break;

                case 6:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.cancelarReserva(numero);
                    break;
                case 7:
                    System.out.println("Programa saindo...");
                    executar = false;
                    break;
            }
        }
    }
}