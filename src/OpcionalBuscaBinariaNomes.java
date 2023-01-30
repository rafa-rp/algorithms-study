public class OpcionalBuscaBinariaNomes {

    public static void main (String[] args) {

        String[] nomes = {
                "Alberto",
                "Andressa",
                "Camila",
                "Enzo",
                "Fernando",
                "Jonas",
                "Junior",
                "Maria",
                "Paloma",
                "Paulo"
        };

        int encontrei = buscaBinariaNomes(nomes, 0, nomes.length, "Jonas");

        if(encontrei < 0) {
            System.out.println("O elemento nao foi encontrado");
        } else {
            System.out.println("Encontrei o elemento na posicao " + encontrei);
        }

        for (String nome : nomes) {
            System.out.println (nome);
        }
    }

    private static int buscaBinariaNomes(String[] nomes, int de, int ate, String buscando) {

        if(de > ate) {
            return -1;
        }

        int meio = (de + ate) / 2;
        String nomeMeio = nomes[meio];

        if(buscando.compareTo(nomeMeio) == 0) {
            return meio;
        }
        if(buscando.compareTo(nomeMeio) > 0) {
           return buscaBinariaNomes(nomes, meio + 1, ate, buscando);
        }
        return buscaBinariaNomes(nomes, de, meio -1, buscando);

    }


}
