package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Filme;

public class FilmeControle {
    //metodo para adicionar filme chama a classe filme
    public void adicionarFilme(String nome, String diretor, String genero, String comentario, String nickName){
        Filme f = new Filme(nome, diretor, genero, comentario, nickName);
        f.adicionarFilme(f);
    }
    //metodo para listar filmes
    public String listarFilme(String nick) throws FileNotFoundException, ClassNotFoundException, IOException{
        //System.out.println( "alooo"+nick );
        Filme f = new Filme();
        String listFilmes = "";
        ArrayList<Filme> retorno = f.listarFilme();        
        
        for(int i = 0; i<retorno.size(); i++){//guarda os filmes do usuario na string        
            if(retorno.get(i).getNickName().equals(nick)){         
                listFilmes +="\n----------------------------------------------------------"+
                "\n"+retorno.get(i).getNome()+" - Dirigio por: "+retorno.get(i).getDiretor()+
                "\n"+retorno.get(i).getComentario()+" \n"+ retorno.get(i).getNickName()+
                "\n----------------------------------------------------------"; 
            }
        }
   return listFilmes;
    }
}
