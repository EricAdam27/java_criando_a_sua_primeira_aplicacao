public class Main {
    public static void main(String[] args) {

        System.out.println("Esse e o Screen Match!");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: "+ anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Descricao: Filme de aventura com gala dos anos 80. Muito Bom!
                Ano de lancamento: """+ anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}