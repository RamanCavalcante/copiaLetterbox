package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import dados.FilmeDados;

public class Filme implements Serializable{
    private String nome;
    private String diretor;
    private String genero;
    private String comentario;
    private String nickNameF;
  
    public Filme(){}
    public Filme(String nome, String diretor, String genero, String comentario, String nickNameF){
        this.nome = nome;
        this.diretor = diretor;
        this.genero = genero;
        this.comentario = comentario;
        this.nickNameF = nickNameF;
    }
    //metodo para adicionar filme chamando o metodo da classe FilmeDados
    public void adicionarFilme(Filme objFilme){
        FilmeDados fd = new FilmeDados();
        fd.adicionarFilme(objFilme);
    }
    //metodo usada pra listar filmes chamando metodo da classe FilmeDados
    public ArrayList<Filme> listarFilme() throws FileNotFoundException, ClassNotFoundException, IOException{
        FilmeDados fd = new FilmeDados();
        return fd.listarFilme();
    }
    
    public void setNome(String filme){
        this.nome = filme;
    }
    public String getNome(){
        return this.nome;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return diretor;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenenro(){
        return genero;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public String getComentario(){
        return comentario;
    }
    public void setNickName(String nickNameF){
        this.nickNameF = nickNameF;
    }
    public String getNickName(){
        return this.nickNameF;
    }
}
