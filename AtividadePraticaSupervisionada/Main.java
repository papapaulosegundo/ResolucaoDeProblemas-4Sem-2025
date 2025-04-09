import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Fila A = new Fila();
        Fila B = new Fila();

        FilaV AV = new FilaV();
        FilaV BV = new FilaV();


        Merge merge = new Merge();
        MergeV mergev = new MergeV();

        int dado, opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir na Pilha");
            System.out.println("2 - Remover da Pilha");
            System.out.println("3 - Listar Pilha");
            System.out.println("4 - Inserir na Fila");
            System.out.println("5 - Remover da Fila");
            System.out.println("6 - Listar Fila");
            System.out.println("7 - Merge em Fila com Lista");
            System.out.println("8 - Merge em Fila com Vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma op��o: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para inserir na Pilha: ");
                    pilha.inserir(scanner.nextInt());
                    break;
                case 2:
                	if( pilha.vazia() ) 
                		System.out.println("Pilha vazia!");
                	else
                		System.out.println("Removido da Pilha: " + pilha.remover());
                    break;
                case 3:
                    pilha.listar();
                    break;
                case 4:
                    System.out.print("Digite um valor para inserir na Fila: ");
                    fila.inserir(scanner.nextInt());
                    break;
                case 5:
                	if( fila.vazia() ) 
                		System.out.println("Fila vazia!");
                	else
                		System.out.println("Removido da Fila: " + fila.remover());
                    break;
                case 6:
                    fila.listar();
                    break;
                case 7:
                    System.out.println("Insira elementos em ordem na Fila A (-1 para terminar):");
                    dado = scanner.nextInt();
                    while( dado != -1 ) {
                        A.inserir(dado);
                        dado = scanner.nextInt();
                    }

                    System.out.println("Insira elementos em ordem na Fila B (-1 para terminar):");
                    dado = scanner.nextInt();
                    while( dado != -1 ) {
                        B.inserir(dado);
                        dado = scanner.nextInt();
                    }

                    System.out.println("Fila A:");
                    A.listar();
                    System.out.println("Fila B:");
                    B.listar();

                    Fila C = merge.merge(A, B);
                    System.out.println("Fila C (merge):");
                    C.listar();
                    break;
                case 8:
                    System.out.println("Insira elementos em ordem na Fila A (-1 para terminar):");
                    dado = scanner.nextInt();
                    while( dado != -1 ) {
                        AV.inserir(dado);
                        dado = scanner.nextInt();
                    }

                    System.out.println("Insira elementos em ordem na Fila B (-1 para terminar):");
                    dado = scanner.nextInt();
                    while( dado != -1 ) {
                        BV.inserir(dado);
                        dado = scanner.nextInt();
                    }

                    System.out.println("FilaV A:");
                    AV.listar();
                    System.out.println("FilaV B:");
                    BV.listar();

                    FilaV CV = mergev.merge(AV, BV);
                    System.out.println("FilaV C (merge):");
                    CV.listar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Op��o inv�lida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
