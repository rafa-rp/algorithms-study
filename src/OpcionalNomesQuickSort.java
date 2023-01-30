public class OpcionalNomesQuickSort {

    public static void main (String[] args) {

        String[] nomes = {
                "Maria",
                "Camila",
                "Fernando",
                "Jonas",
                "Andressa",
                "Paloma",
                "Alberto",
                "Junior",
                "Enzo",
                "Paulo"
        };

        quickSortNomes(nomes, 0, nomes.length);

        for (String nome : nomes) {
            System.out.println (nome);
        }
    }

    private static void quickSortNomes(String[] nomes, int de, int ate) {
        int qtdNomes = ate - de;
        if(qtdNomes > 1) {
            int posicaoMenor = particionaNomes(nomes, de , ate);
            quickSortNomes(nomes, de, posicaoMenor);
            quickSortNomes(nomes, posicaoMenor + 1, ate);
        }

    }

    private static int particionaNomes (String[] nomes, int inicio, int termino) {
        String pivotNome = nomes[termino - 1];
        int menores = 0;

        for(int analisandoNome = 0; analisandoNome < termino -1; analisandoNome++ ) {
            String nomeAtual = nomes[analisandoNome];
            if(nomeAtual.compareTo(pivotNome) <=  0) {
                trocaNomes(nomes, analisandoNome, menores);
                menores++;
            }
        }
        trocaNomes(nomes,termino -1, menores);
        return menores;
    }

    private static void trocaNomes(String[] nomes, int de, int para) {

        String nome1 = nomes[de];
        String nome2 = nomes[para];

        nomes[de] = nome2;
        nomes[para] = nome1;
    }
}
