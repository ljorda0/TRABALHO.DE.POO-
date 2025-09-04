package  agnecia.dados;
import negocio.*;


public class Arquivo{
    @Override
    public void inserirHeroi(Heroi heroi){
        ArrayList<Heroi> heroi = this.lerHeroi();
        if(heroi == null){
            heroi = new ArrayList();
        }
        heroi.add(heroi);
        File file = new File("heroi.bin");
        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(heroi);
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