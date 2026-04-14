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
            System.out.println("[3] - Consultar Disponibilidade");
            System.out.println("[4] - Reservar Quarto");
            System.out.println("[5] - Cancelar Quarto");
            System.out.println("[6] - Sair");

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
                    System.out.println("Consultar: ");
                    System.out.println("[1] - Disponível");
                    System.out.println("[2] - Indisponível");
                    int tipoDisponivel = scanner.nextInt();


                    if (tipoDisponivel == 1){
                        hotel.listarDisponiveis();
                    } else if (tipoDisponivel == 2){
                        hotel.listarIndisponiveis();
                    }else {
                        System.out.println("Opção inválida!");
                        continue;
                }
                    break;
                case 4:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.reservaQuarto(numero);
                    break;

                case 5:
                    System.out.println("Digite o número do quarto: ");
                    numero = scanner.nextInt();
                    hotel.cancelarReserva(numero);
                    break;
                case 6:
                    System.out.println("Programa saindo...");
                    executar = false;
                    break;
            }
        }
    }
}