import java.util.ArrayList;
import java.util.List;

public class CatracaEmpresa {
    private boolean acessoLiberado;

    public CatracaEmpresa() {
        this.acessoLiberado = false;
    }

    public void passarCartao(FuncionarioEmpresa funcionario) {
        if (validarCartao(funcionario)) {
            liberarAcesso();
            System.out.println("Acesso permitido. Bem-vindo, " + funcionario.getNome() + "!");
        } else {
            bloquearAcesso();
            System.out.println("Acesso negado. Por favor, verifique seu cartão.");
        }
    }

    private boolean validarCartao(FuncionarioEmpresa funcionario) {
        // Simulação de validação do cartão
        String numeroCartaoFuncionario = funcionario.getNumeroCartao(); // Obtém o número do cartão do funcionário
        boolean cartaoValido = false;

        // Verifica se o número do cartão está na lista de cartões válidos da empresa
        List<String> cartoesValidos = obterCartoesValidos(); // Método que retorna a lista de cartões válidos da empresa
        if (cartoesValidos.contains(numeroCartaoFuncionario)) {
            cartaoValido = true;
        }

        return cartaoValido;
    }

    private List<String> obterCartoesValidos() {
        // Simulação da obtenção da lista de cartões válidos da empresa
        List<String> cartoesValidos = new ArrayList<>();
        cartoesValidos.add("1234567890"); // Exemplo de cartão válido
        cartoesValidos.add("9876543210"); // Exemplo de cartão válido

        return cartoesValidos;
    }

    private void liberarAcesso() {
        acessoLiberado = true;
    }

    private void bloquearAcesso() {
        acessoLiberado = false;
    }

    public boolean isAcessoLiberado() {
        return acessoLiberado;
    }
}

