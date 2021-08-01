package dados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


import modelo.Filme;

public class FilmeDados implements Serializable{// gravar um objeto do tipo filme no arquivo .ser
    public void adicionarFilme(Filme objFilme){
        ArrayList<Filme> listFilme = new ArrayList<>();
            try{
                listFilme = listarFilme();
            }catch(FileNotFoundException e){
                File arquivo = new File("filmes.ser");
               try{     
                arquivo.createNewFile(); 
               }catch(IOException x){ }
            }catch(ClassNotFoundException | IOException e){
                e.printStackTrace();
            }
            try{
                listFilme.add(objFilme);
                File endereco = new File("filmes.ser");
                FileOutputStream fluxo = new FileOutputStream(endereco);
                ObjectOutputStream oos = new ObjectOutputStream(fluxo);
               oos.writeObject(listFilme);
               oos.flush();
               fluxo.flush();
               oos.close();
               fluxo.close();
           }catch(IOException e){
               e.printStackTrace();
           }
        }
        //listar filmes gravados no aquivo .ser
        public ArrayList<Filme> listarFilme() throws FileNotFoundException, IOException, ClassNotFoundException{
            ArrayList <Filme> listFilme = new ArrayList<>();
            File endereco = new File ("filmes.ser");
            FileInputStream fluxo = new FileInputStream(endereco);
            ObjectInputStream lerObj = new ObjectInputStream(fluxo);
            try{
                listFilme = (ArrayList<Filme>) lerObj.readObject();
            }catch(ClassCastException e){
                e.getMessage();
            }
            lerObj.close();
            return listFilme;
          }
}
