public class Appetizer extends Food{
    //Set properties
    private String temp;
    private int numPortions;
    
    //Appetizer constructor
    public Appetizer(String name, String description, double price, int numPortions, String temp){
        super(name, description, price, "Appetizer");
        this.numPortions = numPortions;
        this.temp = temp;
    }
    
    //Get functions
    public String getTemp(){
        return temp;
    }
    
    public int getNumPortions(){
        return numPortions;
    }
    
    //Set functions
    public void setTemp(String temp){
        this.temp = temp;
    }
    
    public void setNumPortions(int numPortions){
        this.numPortions = numPortions;
    }
    
    //Super print method
    public void print(){
        super.print();
        System.out.println("Number of Portions: "+numPortions+"\nTemperature: "+temp);
    }
}