package ArvoreBinaria;

import java.util.LinkedList;
import java.util.Queue;

public class EmNivel implements IPercorre {

    @Override
    public void percorre(Nodo nodo) {
        Queue<Nodo> q = new LinkedList<>(); //cria Lista
        q.add(nodo);
        while (!q.isEmpty()) { // verifica se esta vasio
            Nodo item = q.poll(); // insera no final da lista e remove o primeiro 
            System.out.println(item.getValor());
            if (item.getEsquerda() != null) { // verifica valor a esquerda
                q.add(item.getEsquerda());
            }
            if (item.getDireita() != null) { // verifica valor a direita
                q.add(item.getDireita());
            }
        }
    }

}
