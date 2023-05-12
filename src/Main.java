import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de CatracaEmpresa
        CatracaEmpresa catraca = new CatracaEmpresa();

        // Criando instâncias de Funcionario
        FuncionarioEmpresa funcionario1 = new FuncionarioEmpresa("João", "1234567890");
        FuncionarioEmpresa funcionario2 = new FuncionarioEmpresa("Maria", "9876543210");

        // Testando a catraca com os funcionários
        catraca.passarCartao(funcionario1); // Acesso negado, cartão não está na lista de cartões válidos
        catraca.passarCartao(funcionario2); // Acesso permitido, cartão está na lista de cartões válidos

        // Verificando o status de acesso após o teste
        boolean acessoLiberado = catraca.isAcessoLiberado();
        System.out.println("Status de acesso: " + (acessoLiberado ? "Liberado" : "Bloqueado"));
    }
}
