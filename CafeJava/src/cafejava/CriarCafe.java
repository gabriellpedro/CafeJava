package cafejava;

public class CriarCafe {
    
    Cafe varCafe = null;
    
    public void criaCafe(Integer NumCafe){
        var factory = new CafeFactory();
        varCafe = factory.CriarCafe(NumCafe);
    }
    
    public void descricaoCafe(){
        System.out.println(varCafe.toString());
    }
    
}
