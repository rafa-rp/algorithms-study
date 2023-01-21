public class TestaEncontraMenor {

    public static void main (String[] args) {

        Nota[] notas = {
                new Nota("Andre", 4.0),
                new Nota("Mariana", 5.0),
                new Nota("Carlos", 8.5),
                new Nota("Paulo", 9.0),
                new Nota("Jonas", 3.0),
                new Nota("Juliana", 6.7),
                new Nota("Guilherme", 7.0),
                new Nota("Lucia", 9.3),
                new Nota("Ana", 10.0)
        };

        int qtdMenores = buscaMenores(notas, notas[1]);
        System.out.println(qtdMenores + " Alunos foram piores");
    }

    private static int buscaMenores(Nota[] notas, Nota notaAnalisada) {

        int menores = 0;
        for (Nota nota : notas) {
            if(nota.getValor() < notaAnalisada.getValor()) {
                menores++;
            }
        }
        return menores;
    }
}
