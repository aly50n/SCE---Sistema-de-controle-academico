package application;

import models.Usuario;
import views.TelaCadastroUsuario;
import views.TelaLogin;
import sql.Sql;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        Sql.setPassword("G1rRIq9JYH1_gyafCXHKZeAxQ1UmA8Bf");
        
    }
}
