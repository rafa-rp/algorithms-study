public class OpcionalOrdenaNomes {

    public static void main(String[] args) {

         String[] nomes = {
            "Andressa",
            "Camila",
            "Enzo",
            "Fernando",
            "Maria",
            "Alberto",
            "Jonas",
            "Junior",
            "Paloma",
            "Paulo"
        };

         String[] arrayOrdenado = intercalaNomes(nomes,0, 5, nomes.length);
         for(String nome : arrayOrdenado) {
             System.out.println(nome);
         }
    }

    public static String[] intercalaNomes(String[] nomes, int inicio, int miolo, int termino) {

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

        return nomes;
    }
}
