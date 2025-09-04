package  agencia.dados;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import agencia.negocio.Heroi;

public class salvarHeroi{
    public void inserirHeroi(Heroi heroi){
        ArrayList<Heroi> herois = this.lerHeroi();
        if(herois == null){
            herois = new ArrayList();
        }
        herois.add(heroi);
        File file = new File("heroi.bin");
        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(herois);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
	private ArrayList<Heroi> lerHeroi(){
        ArrayList<Heroi> heroi = null;
        File file = new File("heroi.bin");
        FileInputStream fileIn;
        try{
            fileIn = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            heroi = (ArrayList<Heroi>) objIn.readObject();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return heroi;
    }
}