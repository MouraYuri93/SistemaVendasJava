package classes;

public class Opcoes {
    // Definir campos privados para encapsular valores
    private String valor;
    private String descricao;

    // Construtor da classe para inicializar os campos
    public Opcoes(String valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    // Métodos getters para acessar os campos privados
    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método toString para retornar a descrição do objeto
    @Override
    public String toString() {
        return descricao;
    }
}
