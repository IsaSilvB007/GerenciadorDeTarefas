import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SEÇÃO DE VARIÁVEIS
        int opcao;
        int quantidade = 0;

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
                        System.out.println("Você selecionou -- CADASTRAR TAREFA --\n");

                        if(quantidade < tarefas.length){
                            System.out.print("DESCRIÇÃO DA TAREFA: ");
                            tarefas[quantidade] = scanner.nextLine();
                            quantidade++;

                            System.out.printf("Tarefa N° %d cadastrada com sucesso!\n\n", quantidade);
                        } else {
                            System.out.println("Lamento, mas a quantidade de Tarefas EXCEDIDA!\n");
                        }
                    break;
                case 2:
                    System.out.println("Você selecionou -- LISTAR TAREFAS --\n");

                    for(int i = 0; i < quantidade; i++){
                        System.out.println("Tarefa N°" + (i + 1) + ": " + tarefas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Você selecionou -- CONCLUIR TAREFA --");

                    if (quantidade == 0){
                        System.out.println("Lamento, mas não há tarefas cadastradas para serem concluídas");
                    } else {
                        System.out.print("Informe o N° da tarefa a ser concluída: ");
                        int escolha = scanner.nextInt();
                            if (escolha >= 1 && escolha <= quantidade){

                                tarefas[escolha - 1] = "[X] " + tarefas[escolha - 1];
                                System.out.println("\nTarefa N°" + (escolha) + " concluída com sucesso!\n");
                            } else {
                                System.out.println("Número de tarefa inválida!");
                            }
                    }
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