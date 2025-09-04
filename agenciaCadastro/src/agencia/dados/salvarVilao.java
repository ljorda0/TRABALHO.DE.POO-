package  agencia.dados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import agencia.negocio.Vilao;

public class salvarVilao {
    public void inserirVilao(Vilao vilao){
        ArrayList<Vilao> viloes = this.lerVilao();
        if(viloes == null){
            viloes = new ArrayList();
        }
        viloes.add(vilao);
        File file = new File("vilao.bin");
        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(viloes);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private ArrayList<Vilao> lerVilao(){
        ArrayList<Vilao> vilao = null;
        File file = new File("vilao.bin");
        FileInputStream fileIn;
        try{
            fileIn = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            vilao = (ArrayList<Vilao>) objIn.readObject();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return vilao;
    }

}