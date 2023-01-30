public class TestaBuscaLinear {

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

        int encontrei = buscaLinear(notas, 0, notas.length, 9.3);

        System.out.println("Enontrei a nota na posicao " + encontrei);
        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static int buscaLinear(Nota[] notas, int de, int ate, double buscando) {
        for (int atual = de; de < ate; atual++) {
            if(notas[atual].getValor() == buscando) {
                return atual;
            }
        }
        return -1;
    }
}

