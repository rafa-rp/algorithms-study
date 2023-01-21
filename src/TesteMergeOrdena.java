public class TesteMergeOrdena {

    public static void main (String[] args) {

        Nota[] notas = {
            new Nota("Andre", 4.0),
            new Nota("Guilherme", 7.0),
            new Nota("Mariana", 5.0),
            new Nota("Ana", 10.0),
            new Nota("Carlos", 8.5),
            new Nota("Jonas", 3.0),
            new Nota("Paulo", 9.0),
            new Nota("Juliana", 6.7),
            new Nota("Lucia", 9.3)
        };

        ordena(notas, 0, notas.length);

        for (Nota nota : notas) {
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }
    }

    private static void ordena(Nota[] notas, int inicio, int termino) {
        int quantidade = termino - inicio;
        if(quantidade > 1) {
            int meio = (inicio + termino) /2;
            ordena(notas, inicio, meio);
            ordena(notas, meio, termino);
            intercala(notas, inicio, meio, termino);
        }
    }

    private static void intercala(Nota[] notas, int inicio, int miolo, int termino) {
        Nota[] resultado = new Nota[termino - inicio];
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

        for(int contador = 0; contador < atual; contador++) {
            notas[inicio + contador] = resultado[contador];
        }
    }
}
