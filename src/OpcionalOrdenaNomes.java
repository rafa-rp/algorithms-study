public class OpcionalOrdenaNomes {

    public static void main(String[] args) {

         String[] nomes = {
            "Andressa",
            "Paloma",
            "Camila",
            "Enzo",
            "Paulo",
            "Maria",
            "Alberto",
            "Fernando",
            "Jonas",
            "Junior"
        };

         ordenaNomes(nomes, 0, nomes.length);
         for(String nome : nomes) {
             System.out.println(nome);
         }
    }

    private static void ordenaNomes(String[] nomes, int inicio, int termino) {

        int meio = (inicio + termino) / 2;
        int quantidade = termino - inicio;
        if(quantidade > 1) {
            ordenaNomes(nomes, inicio, meio);
            ordenaNomes(nomes, meio, termino);
            intercalaNomes(nomes, inicio, meio, termino);
        }

    }

    public static void intercalaNomes(String[] nomes, int inicio, int miolo, int termino) {

        String[] resultado = new String[termino - inicio];
        int atual = 0;
        int atual1 = inicio;
        int atual2 = miolo;

        while (atual1 < miolo && atual2 < termino) {

            String nome1 = nomes[atual1];
            String nome2 = nomes[atual2];

            if(nome1.compareTo(nome2) < 0) {
                resultado[atual] =  nome1;
                atual1++;
            } else {
                resultado[atual] = nome2;
                atual2++;
            }
            atual++;
        }

        while(atual1 < miolo){
            resultado[atual] = nomes[atual1];
            atual1++;
            atual++;
        }

        while(atual2 < termino){
            resultado[atual] = nomes[atual2];
            atual2++;
            atual++;
        }

        for(int contador = 0; contador < atual; contador++) {
            nomes[inicio + contador] = resultado[contador];
        }
    }
}
