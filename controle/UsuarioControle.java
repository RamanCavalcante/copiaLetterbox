package controle;
import java.io.FileNotFoundException;
import java.io.IOException;

import modelo.Usuario;
public class UsuarioControle {
    //cadastrar usuario,chama o metodo da classe Usuario
    public void cadastrarUsuario(String nickName, String email, long senha){
        Usuario objUser = new Usuario(nickName,email,senha);
        objUser.cadastrarUsuario(objUser);
    }
    //pesquisa chamando metedo pesqUsuario da classe Usuario
    public Usuario pesquisaUsuario(String nickName) throws FileNotFoundException, ClassNotFoundException, IOException{
        Usuario objUsuario = new Usuario();
        Usuario retornoPesq = objUsuario.pesquUsuario(nickName);
        return retornoPesq;
    }
    //metodo para verificar o login
    public boolean verificaLogin(String nickName, long senha) throws FileNotFoundException, ClassNotFoundException, IOException{//metodo para verificar login do usuario
        Usuario retornoPesq = pesquisaUsuario(nickName);
        if(retornoPesq.getSenha() == senha){
            return true;
        }else{
            return false;
        }
    }
}
