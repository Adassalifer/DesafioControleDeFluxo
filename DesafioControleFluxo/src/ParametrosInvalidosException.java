public class ParametrosInvalidosException {
    public ParametrosInvalidosException(String mensagem) {
        throw new ParametrosInvalidosException
        ("O segundo parâmetro deve ser maior ou igual ao primeiro");

    }
}
