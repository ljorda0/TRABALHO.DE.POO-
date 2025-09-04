package  agnecia.dados;
import negocio.*;

public class salvarVilao {
    @Override
    public void inserirVilao(Vilao vilao){
        ArrayList<Vilao> vilao = this.lerVilao();
        if(vilao == null){
            vilao = new ArrayList();
        }
        vilao.add(vilao);
        File file = new File("vilao.bin");
        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(vilao);
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