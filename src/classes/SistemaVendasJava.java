
package classes;

import formularios.frmLogin;

public class SistemaVendasJava {

 
    public static void main(String[] args) {
        
        Dados msDados = new Dados();
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(msDados);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        
        
    }
    
}
