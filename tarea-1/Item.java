public abstract class Item{
    protected String n;
    public Item(String n){
        this.n=n;
    }
    public abstract void printItemA();



}

class Comida extends Item{
    private int Ham;
    

    public Comida (int ham, String n){
        super(n);
        this.Ham=ham;
    }
    @Override
    public void printItemA(){
        System.out.println("Dando de comer"+ n);
    }
    public int getHam(){
        return Ham;
    }
}
class Medicina extends Item{
    private int Cur;

    public Medicina (int Cur, String n){
        super(n);
        this.Cur=Cur;
    }
    public void printItemA(){
        System.out.println("Dando"+n+"para que su salud mejore :)");

    }
    public int getCur(){
        return Cur;
    }
}
class Juguete extends Item{
    private int Div;
    public Juguete(int Div, String n){
        super(n);
        this.Div=Div;
    }
    public void printItemA(){
        System.out.println("Jugando con"+n);
    }
    public int getDiv(){
        return Div;
    }
}