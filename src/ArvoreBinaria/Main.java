package ArvoreBinaria;

public class Main {

    public static void main(String[] args) {
        
        ArvoreBinaria ab = new ArvoreBinaria();
         ab.insere(5);
         ab.insere(3);
         ab.insere(4);
         ab.insere(7);
         ab.insere(6);
         ab.insere(17);
         ab.insere(12);
        // ab.insere(2);
         
         System.out.println ("______");
         ab.percorre(new EmOrdem());
         
         System.out.println ("______");
         ab.percorre(new Profundidade());
         
         System.out.println ("______");
         ab.percorre(new EmNivel());
         ab.remove();
    }
    
}
    

