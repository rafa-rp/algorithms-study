public class TestaMaiorPrecoComObjeto {

    public static void main (String[] args) {

        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Lamburguini", 1000000);
        produtos[1] = new Produto("Brasilia", 16000);
        produtos[2] = new Produto("Jeep", 45000);
        produtos[3] = new Produto("Gol", 20000);
        produtos[4] = new Produto("Civic", 80000);

        int maisBarato = 0;

        for(int i=0; i < produtos.length; i++){
            if(produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = i;
            }
        }

        System.out.println("O carro mais barato é " + produtos[maisBarato].getNome());
        System.out.println("Seu preço é de " + produtos[maisBarato].getPreco());
    }
}
