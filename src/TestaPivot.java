public class TestaPivot {

    public static void main (String[] args) {

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

        quebraNoPivo(notas, 0, notas.length);
        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static void quebraNoPivo(Nota[] notas, int incio, int termino) {
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
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];

        notas[de] = nota2;
        notas[para] = nota1;
    }
}
