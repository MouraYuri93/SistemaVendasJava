package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
    
    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios [] = new Usuario [maxUsu];
    private Produto msProdutos [] = new Produto [maxPro];
    private Cliente msClientes [] = new Cliente [maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    
    public Dados() {
        
        Usuario mUsuario;
        mUsuario = new Usuario("user","Yuri", "Moura", "123", 1);
        msUsuarios [conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("tania","Tania","Maria","123",2);
        msUsuarios [conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("teste1","Teste1", "Teste1","123",2);
        msUsuarios [conUsu] = mUsuario;
        conUsu++;
        
        Produto mProduto;
        mProduto = new Produto("1","Arroz",4,0,"Arroz branco");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto( "2","Feijão",7,1,"Feijão preto");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        mProduto = new Produto("3","Farinha",3,0,"Farinha Branca");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        Cliente mCliente;
        mCliente = new classes.Cliente("1",1,"Yuri","Moura","Rua","71983429008",1,Utilidades.stringtoDate("27/06/1993"));
        msClientes [conCli] = mCliente;
        conCli++;
        
        mCliente = new classes.Cliente("2",2,"Tania","Moura","Rua","71983429008",1,Utilidades.stringtoDate("11/07/1967"));
        msClientes [conCli] = mCliente;
        conCli++;
        
        mCliente = new classes.Cliente("3",3,"Jailton","Souza","Rua","71983429008",1,Utilidades.stringtoDate("20/08/1965"));
        msClientes [conCli] = mCliente;
        conCli++;
        
    }
    
    public int numeroUsuarios() {
        return conUsu;
    }
    
    public int numeroProdutos() {
        return conPro;
    }
    
    public int numeroClientes() {
        return conCli;
    }
    
    public Usuario[] getUsuarios() {
        return msUsuarios;
    }
    
    public Produto[] getProdutos() {
        return msProdutos;
    }
    
    public Cliente [] getClientes() {
        return msClientes;
    }
    
public boolean validarUsuario(String usuario, String senha) {
        boolean aux = false;
         for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario) && 
                    msUsuarios[i].getSenha().equals(senha)) {
                return true;
                    }
          }
         return false;
 }

public boolean validarProduto(String produto) {
        boolean aux = false;
         for(int i = 0; i < conPro; i++) {
            if(msProdutos[i].getIdProduto().equals(produto)){
                return true;
                    }
          }
         return false;
 }

public boolean validarCliente(String cliente) {
    boolean aux = false;
    for(int i = 0; i < conCli; i++) {
        if(msClientes[i].getIdCliente().equals(cliente)) {
            return true;
        }
    }
    return false;
}

public int getPerfil (String usuario) {
    for(int i = 0; i < conUsu; i++) {
        if (msUsuarios[i].getIdUsuario().equals(usuario)) {
            return msUsuarios[i].getPerfil();
            }
        }
        return -1;
 }

public void trocarSenha(String usuario,String senha) {
    for(int i = 0; i < conUsu; i++) {
        if(msUsuarios[i].getIdUsuario().equals(usuario)) {
            msUsuarios[i].setSenha(senha);
            return;
        }
    }
}

public int posicaoUsuario(String usuario) {
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario) ) {
                return i;
                    }
          }
         return -1;
 }

public int posicaoProduto(String produto) {
        for (int i = 0; i < conPro; i++) {
            if (msProdutos[i].getIdProduto().equals(produto) ) {
                return i;
                    }
          }
         return -1;
 }

public int posicaoCliente(String cliente) {
        for (int i = 0; i < conCli; i++) {
            if (msClientes[i].getIdCliente().equals(cliente) ) {
                return i;
                    }
          }
         return -1;
 }

public String adicionarUsuario(Usuario mUsuario) {
    if(conUsu == maxUsu) {
        return "Não é possivel cadastar mais usuario, limite maximo atingido";
    }
    msUsuarios[conUsu] = mUsuario;
    conUsu++;
    return "Usuário cadastrado com sucesso!";
}

public String adicionarProduto(Produto mProduto) {
    if(conPro == maxPro) {
        return "Não é possivel cadastar mais produtos, limite maximo atingido";
    }
    msProdutos[conPro] = mProduto;
    conPro++;
    return "Produto cadastrado com sucesso!";
}

public String adicionarCliente(Cliente mCliente) {
    if(conCli == maxCli) {
        return "Não é possivel cadastar mais clientes, limite maximo atingido";
    }
    msClientes[conCli] = mCliente;
    conCli++;
    return "Cliente cadastrado com sucesso!";
}
   
public String editarUsuario(Usuario mUsuario, int pos) {
    msUsuarios [pos].setNome(mUsuario.getNome());
    msUsuarios [pos].setSobreNome(mUsuario.getSobreNome());
    msUsuarios [pos].setSenha(mUsuario.getSenha());
    msUsuarios [pos].setPerfil(mUsuario.getPerfil());
    
    return "Usuário editado com sucesso!";
}

public String editarPoduto(Produto mProduto, int pos) {
    msProdutos [pos].setDescricao(mProduto.getDescricao());
    msProdutos [pos].setPreco(mProduto.getPreco());
    msProdutos [pos].setImposto(mProduto.getImposto());
    msProdutos [pos].setAnotacao(mProduto.getAnotacao());
    
    return "Produto editado com sucesso!";
}

public String editarCliente(Cliente mCliente, int pos) {
    msClientes [pos].setIdCliente(mCliente.getIdCliente());
    msClientes [pos].setNome(mCliente.getNome());
    msClientes [pos].setSobrenome(mCliente.getSobrenome());
    msClientes [pos].setEndereço(mCliente.getEndereço());
    msClientes [pos].setTelefone(mCliente.getTelefone());
    msClientes [pos].setIdCidade(mCliente.getIdCidade());
    msClientes [pos].setDataNascimento(mCliente.getDataNascimento());
        
    return "Cliente editado com sucesso!";
}

public String deletarUsuario(int pos) {
    for(int i = pos; i < conUsu -1; i++) {
        msUsuarios[i] = msUsuarios[i + 1];
    }
    conUsu--;
    return "Usuário deletado com sucesso!" ;
}

public String deletarProduto(int pos) {
    for(int i = pos; i < conPro -1; i++) {
        msProdutos[i] = msProdutos[i + 1];
    }
    conPro--;
    return "Produto deletado com sucesso!" ;
}

public String deletarCliente(int pos) {
    for(int i = pos; i < conCli -1; i++) {
        msClientes[i] = msClientes[i + 1];
    }
    conCli--;
    return "Cliente deletado com sucesso!" ;
}

public void salvarTodo() {
    salvarUsuarios();
    salvarProdutos();
    salvarClientes();
}

public void salvarUsuarios() {
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/usuarios.txt");
        pw = new PrintWriter(fw);
        
        for(int i = 0; i < conUsu; i++) {
            pw.println(msUsuarios[i].toString());
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fw!= null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
    
}

public void salvarProdutos() {
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/produtos.txt");
        pw = new PrintWriter(fw);
        
        for(int i = 0; i < conPro; i++) {
            pw.println(msProdutos[i].toString());
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fw!= null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void salvarClientes() {
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/clientes.txt");
        pw = new PrintWriter(fw);
        
        for(int i = 0; i < conCli; i++) {
            pw.println(msClientes[i].toString());
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fw!= null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherUsuarios() {
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("Data/usuarios.txt");
      fr = new FileReader(arquivo);
      br = new BufferedReader(fr);
      
      int pos;
      String aux;
      String linha;
      String idUsuario;
      String nome;
      String sobreNome;
      String senha;
      int perfil;
      
      while((linha = br.readLine())!= null) {
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         idUsuario = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         nome = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         sobreNome = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         senha = aux;
         linha = linha.substring(pos + 1);
         
         perfil = new Integer(linha);
         
         Usuario mUsuario = new Usuario(idUsuario, nome, sobreNome, senha, perfil);
         msUsuarios[conUsu] = mUsuario;
         conUsu++;
      }
      
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fr != null) {
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherProdutos() {
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("Data/produtos.txt");
      fr = new FileReader(arquivo);
      br = new BufferedReader(fr);
      
        int pos;
        String aux;
        String linha;
        String idProduto;
        String descricao;
        int preco;
        int imposto;
        String anotacao;
      
      while((linha = br.readLine())!= null) {
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         idProduto = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         descricao = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         preco = new Integer(aux);
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         imposto = new Integer(aux);
         linha = linha.substring(pos + 1);
         
         anotacao = linha;
         
         Produto mProduto = new Produto(idProduto, descricao, preco, imposto, anotacao);
         msProdutos[conPro] = mProduto;
         conPro++;
      }
      
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fr != null) {
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherCLientes() {
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("Data/clientes.txt");
      fr = new FileReader(arquivo);
      br = new BufferedReader(fr);
      
        int pos;
        String aux;
        String linha;
        String idCliente;
        int idTipo;
        String nome;
        String sobrenome;
        String endereço;
        String telefone;
        int idCidade;
        Date dataNascimento;
      
      while((linha = br.readLine())!= null) {
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         idCliente = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         idTipo = new Integer(aux);
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         nome = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         sobrenome = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         endereço = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         telefone = aux;
         linha = linha.substring(pos + 1);
         
         pos = linha.indexOf('|');
         aux = linha.substring(0, pos);
         idCidade = new Integer(aux);
         linha = linha.substring(pos + 1);
         
         dataNascimento = Utilidades.stringtoDate(linha);
         
         Cliente mCliente = new Cliente(idCliente, idTipo, nome, sobrenome, endereço, telefone, idCidade, dataNascimento);
         msClientes[conCli] = mCliente;
         conCli++;
      }
      
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if(fr != null) {
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}





}
