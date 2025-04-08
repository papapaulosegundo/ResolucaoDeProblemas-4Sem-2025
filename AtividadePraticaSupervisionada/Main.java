public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Fila f = new Fila();

        System.out.println("Testando Pilha...");
        p.inserir(5);
        p.listar();
        p.inserir(10);
        p.listar();
        p.inserir(15);
        p.listar();
        System.out.println("Removendo " + p.remover());
        p.listar();
        System.out.println("Removendo " + p.remover());
        p.listar();
        System.out.println("Removendo " + p.remover());
        p.listar();
        System.out.println("Removendo " + p.remover());
        p.listar();

        System.out.println("\nTestando Fila...");
        f.inserir(5);
        f.listar();
        f.inserir(10);
        f.listar();
        f.inserir(15);
        f.listar();
        System.out.println("Removendo " + f.remover());
        f.listar();
        System.out.println("Removendo " + f.remover());
        f.listar();
        System.out.println("Removendo " + f.remover());
        f.listar();
        System.out.println("Removendo " + f.remover());
        f.listar();

        System.out.println("\nTestando MERGE");
        Merge merge = new Merge();
        Fila A = new Fila();
        A.inserir(12);
        A.inserir(35);
        A.inserir(52);
        A.inserir(64);
        
        Fila B = new Fila();
        B.inserir(5);
        B.inserir(15);
        B.inserir(23);
        B.inserir(55);
        B.inserir(75);

        System.out.println("Fila A: ");
        A.listar();
        System.out.println("Fila B: ");
        B.listar();

        Fila C = merge.merge(A, B);
        System.out.println("Fila C: ");
        C.listar();

        System.out.println("\nTestando MERGE com vetor");
        MergeV mergev = new MergeV();
        FilaV AV = new FilaV();
        AV.inserir(12);
        AV.inserir(35);
        AV.inserir(52);
        AV.inserir(64);
        
        FilaV BV = new FilaV();
        BV.inserir(5);
        BV.inserir(15);
        BV.inserir(23);
        BV.inserir(55);
        BV.inserir(75);

        System.out.println("Fila A: ");
        AV.listar();
        System.out.println("Fila B: ");
        BV.listar();

        FilaV CV = mergev.merge(AV, BV);
        System.out.println("Fila C: ");
        CV.listar();
    }
}