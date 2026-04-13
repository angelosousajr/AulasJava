//principal chama Pilha.java
public class Principal {
    public static void main(String[] args) {
        //criamos uma pilha com espaço para 3 números
        Pilha minhaPilha = new Pilha(3);

        //colocando livros (números) na pilha
        minhaPilha.adicionar(10);
        minhaPilha.adicionar(20);
        minhaPilha.adicionar(30);

        System.out.println("------------------------------------");

        //tirando o livro que está no topo
        int tirou = minhaPilha.remover();
        System.out.println("Tirei o número: " + tirou);

        //tirando o próximo que ficou no topo
        int tirouDeNovo = minhaPilha.remover();
        System.out.println("Agora tirei o número: " + tirouDeNovo);

        //tirando o próximo que ficou no topo
        int tirouMais = minhaPilha.remover();
        System.out.println("Dessa vez tirei o número: " + tirouMais);
    }
}
