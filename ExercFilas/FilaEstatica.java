// Imagine um estacionamento com vagas numeradas, em um sistema circular

public class FilaEstatica {
    private int[] elementos; //O vetor que guarda os números das vagas
    private int inicio; // Índice de quem será o próximo a sair
    private int fim; // Índice de onde o próximo vai entrar
    private int total; // Quantos elementos estão na fila agora

    // Construtor
    public FilaEstatica (int capacidade){
        elementos = new int[capacidade]; // Cria o vetor com o tamanho
        inicio = 0; // No começo, tudo aponta 0
        fim = 0;
        total = 0;
    }

    // Método para inserir (Enqueue), enfileirar
    public void enfileirar(int valor){
        if (total == elementos.length){
            System.out.println("Erro: A fila está cheia!");
            return;
        }
        elementos[fim] = valor; // Estaciona = Coloca o "carro" no lugar
        fim = (fim + 1) % elementos.length; // Lógica circular
        total++; // Avisa que tem um carro no estacionamento
    }

    // Método para remover (Dequeue), desenfileirar
    public int desenfileirar(){
        if(total == 0){
            System.out.println("Erro: A fila está vazia!");
            return -1;
        }
        int valor = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        total--;
        return valor;
    }

    // Método para visualizar, é a foto da fila
    public void exibir(){
        System.out.println("Fila: ");
        for (int i = 0; i < total; i++){
            int idx = (inicio + i) % elementos.length;
            System.out.println(elementos[idx] + " ");
        }
        System.out.println();
    }
}
