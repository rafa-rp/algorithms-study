public class TestaQuickSort {

    public static void main(String[] args) {

        Nota guilherme = new Nota("Guilherme", 7.0);
        Nota[] notas = {
                new Nota("andre", 4.0),
                new Nota("carlos", 8.5),
                new Nota("ana", 10.0),
                new Nota("jonas", 3.0),
                new Nota("juliana", 6.7),
                new Nota("paulo", 9.0),
                new Nota("mariana", 5.0),
                new Nota("lucia", 9.3),
                guilherme,
        };

        quickSort(notas, 0, notas.length);

        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    public static void quickSort(Nota[] notas, int de, int ate) {
        int qtdElementos = ate - de;

        if(qtdElementos > 1){
            int posicaoPivot = particiona(notas, de, ate);
            quickSort(notas, de, posicaoPivot);
            quickSort(notas, posicaoPivot + 1, ate);
        }
    }

    private static int particiona(Nota[] notas, int incio, int termino) {
        Nota pivo = notas[termino -1];
        int quantidadeMenores = 0;

        for (int analisando = 0; analisando < termino -1; analisando++) {
            Nota atual = notas[analisando];
            if (atual.getValor() <= pivo.getValor()) {
                troca(notas, analisando, quantidadeMenores);
                quantidadeMenores++;
            }
        }
        troca(notas,termino-1, quantidadeMenores);
        return quantidadeMenores;
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];

        notas[de] = nota2;
        notas[para] = nota1;
    }
}
