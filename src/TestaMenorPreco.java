public class TestaMenorPreco {

    public static void main(String[] args) {

        double precos[] = new double[5];
        precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;

        int maisBarato = 0;
        int atual = 0;

        // pseudo código, não compila
//        executa do 0 até 4 inclusive {
//            se preco do atual < preco do maisBarato {
//                maisBarato = atual
//            }
//            atual = atual + 1
//        }

        for(atual = 0; atual < precos.length; atual++) {
            if(precos[atual] < precos[maisBarato]) {
                maisBarato = atual;
            }
        }

        System.out.println(maisBarato);
        System.out.println("O carro mais barato custa " + precos[maisBarato]);
    }

}
