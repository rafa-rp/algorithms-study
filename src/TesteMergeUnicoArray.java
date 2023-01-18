public class TesteMergeUnicoArray {

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

        Nota[] rank = junta(notas, 0, 4, notas.length);
        for (Nota nota : rank) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static Nota[] junta(Nota[] notas, int inicio, int miolo, int termino) {
        Nota[] resultado = new Nota[notas.length];
        int atual = 0;
        int atual1 = inicio;
        int atual2 = miolo;

        while(atual1 < miolo && atual2 < termino) {

            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atual1++;
            } else {
                resultado[atual] = nota2;
                atual2++;
            }
            atual++;
        }

        while(atual1 < miolo){
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }

        while(atual2 < termino){
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }
        return resultado;
    }
}
