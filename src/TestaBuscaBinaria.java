import java.sql.SQLOutput;

public class TestaBuscaBinaria {
    public static void main (String[] args) {


        Nota[] notas = {
                new Nota("jonas", 3.0),
                new Nota("andre", 4.0),
                new Nota("mariana", 5.0),
                new Nota("juliana", 6.7),
                new Nota("Guilherme", 7.0),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9.0),
                new Nota("lucia", 9.3),
                new Nota("ana", 10.0)
        };

        int encontrei = buscaBinaria(notas, 0, notas.length, 3.7);
        if (encontrei < 0){
            System.out.println("Nao encontrei o elemento");
        } else {
            System.out.println("Enontrei a nota na posicao " + encontrei);
        }

        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }

    }

    private static int buscaBinaria(Nota[] notas, int de, int ate, double buscando) {
        if(ate < de){
            return -1;
        }

        System.out.println("Buscando " + buscando + " entre " + de + " e " + ate);
        int meio = (de + ate) / 2;
        Nota notaMeio = notas[meio];

        if (notaMeio.getValor() == buscando) {
            return meio;
        }
        if (buscando < notaMeio.getValor()) {
           return buscaBinaria(notas , de, meio - 1, buscando);
        }
        return buscaBinaria(notas, meio + 1, ate, buscando);

    }

}
