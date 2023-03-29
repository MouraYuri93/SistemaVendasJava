package classes;

import java.util.Date;

public class Cliente {
  
    private String idCliente;
    private int idTipo;
    private String nome;
    private String sobrenome;
    private String logradouro;
    private String telefone;
    private int idCidade;
    private Date dataNascimento;

    public Cliente(String idCliente, int idTipo, String nome, String sobrenome, String endereço, String telefone, int idCidade, Date dataNascimento) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.logradouro = endereço;
        this.telefone = telefone;
        this.idCidade = idCidade;
        this.dataNascimento = dataNascimento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String endereço) {
        this.logradouro = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    @Override
    public String toString() {
        return idCliente +"!"
              + idTipo +"!"
              + nome +"!"
              + sobrenome +"!"
              + logradouro +"!"
              + telefone +"!"
              + idCidade +"!"
              + Utilidades.formatDate(dataNascimento);
    }


    
    

}