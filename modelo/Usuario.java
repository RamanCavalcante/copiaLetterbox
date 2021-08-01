package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import dados.UsuarioDados;

public class Usuario implements Serializable {
    private String nickName;
    private String email;
    private long senha;

    public Usuario(){}
    public Usuario(String nickName,String email, long senha){
        this.nickName = nickName;
        this.email = email;
        this.senha = senha;
    }
    //chama o metedo cadastra Usuario com o método de UsuarioDados
    public void cadastrarUsuario(Usuario objUser){
        UsuarioDados objUserDados = new UsuarioDados();
        objUserDados.adicionarUsuario(objUser);
    }
    //metedo para pesquisar Usuario chama o metodo pesquisaUsuario da classe UsuarioDados
    public Usuario pesquUsuario(String nickName) throws FileNotFoundException, ClassNotFoundException, IOException{
        UsuarioDados userD = new UsuarioDados();
        Usuario retorno = userD.pesquisaUsuario(nickName);
        return retorno;
    }
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    public String getNickName(){
        return this.nickName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setSenha(long senha){
        this.senha = senha;
    }
    public long getSenha(){
        return this.senha;
    }
}
