public class FormatadorCep {

    static class cepInvalidoException extends Exception {
        public cepInvalidoException() {
            super("CEP inválido");
        }
    }

    public static void main(String[] args) {

        try {

            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        } catch (cepInvalidoException e) {
            System.out.println("cep nao corresponde ");
        }
    }

    static String formatarCep(String cep) throws cepInvalidoException {

        if (cep.length() != 8) {
            throw new cepInvalidoException();
        }
        // simulando um cep
        return "23.765-064";
    }

}
