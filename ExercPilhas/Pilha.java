public class Pilha {
    //onde vamos guardar os números
    public int[] dados;

    //indica qual posição é o topo (-1 significa que está vazia)
    public int topo;

    //construtor: cria a pilha com o tamanho que você escolher
    public Pilha(int tamanho){
        dados = new int[tamanho];
        topo = -1;
    }

    //método para ADICIONAR (empilhar/push)
    public void adicionar(int valor){
        if(topo < dados.length - 1){
            topo = topo + 1; //sobe um degrau
            dados[topo] = valor; //coloca o valor lá
            System.out.println("Colocou o " + valor + " na pilha");
        }else{
            System.out.println("A pilha está cheia!");
        }
    }

    //método para REMOVER (desempilhar/pop)
    public int remover() {
        if (topo >= 0){
            int valorQueSaiu = dados[topo];
            topo = topo - 1; //desce um degrau (o anterior vira o topo)
            return valorQueSaiu;
        }else{
            System.out.println("A pilha está vazia!");
            return -1;
        }
    }
}
