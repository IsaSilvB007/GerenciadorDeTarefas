import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        String[] tarefas = new String[7];

        do {
            System.out.println("----------------------------------------");
            System.out.println("|   GERENCIADOR DE TAREFAS E HÁBITOS   |");
            System.out.println("----------------------------------------");
            System.out.println("|          SELETOR DE OPÇÕES           |");
            System.out.println("----------------------------------------");
            System.out.println("|          |0| Encerrar Serviço        |");
            System.out.println("|          |1| Cadastrar Tarefa        |");
            System.out.println("|          |2| Listar Tarefas          |");
            System.out.println("|          |3| Concluir Tarefas        |");
            System.out.println("|          |4| Remover Tarefa          |");
            System.out.println("----------------------------------------\n");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Esse scanner.nextLine limpa o '\n' que ficou no buffer (armazenamento temporário)

            switch (opcao){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (int quantidade = 0; quantidade < 5; quantidade ++){

                        System.out.println("Você selecionou -- CADASTRAR TAREFA --\n");
                        System.out.print("DESCRIÇÃO DA TAREFA: ");

                        tarefas[quantidade] = scanner.nextLine();
                        System.out.println("Tarefa Cadastrada com Sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Você selecionou -- LISTAR TAREFAS --");
                    break;
                case 3:
                    System.out.println("Você selecionou -- CONCLUIR TAREFA --");
                    break;
                case 4:
                    System.out.println("Você selecionou -- REMOVER TAREFA --");
                    break;
                default:
                    System.out.println("Opção INVÁLIDA! Tente novamente...");
            }
        } while (opcao != 0);

    }
    }