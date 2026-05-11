public class MainFila {
    public static void main(String[] args) {
        // Criamos uma fila com capacidade para 3 elementos
        FilaEstatica minhaFila = new FilaEstatica(3);

        // Testando a inserção
        minhaFila.enfileirar(10);
        minhaFila.enfileirar(20);
        minhaFila.enfileirar(30);

        minhaFila.exibir(); // 10, 20, 30

        // Testando a remoção (FIFO, 10 sai primeiro)
        System.out.println("Removido: " + minhaFila.desenfileirar());

        minhaFila.exibir(); // 20, 30

        // Testando a circularidade (inserindo após remover)
        minhaFila.enfileirar(40);
        minhaFila.exibir(); // 20, 30 40
    }
}
