public class MainCourse extends Food{
    //Set data types
    private boolean GF; //Gluten free
    private boolean vegetarian;
    
    //Set functions
    public void setGF(boolean GF){
        this.GF = GF;
    }
    
    public void setVegetarian(boolean vegtarian){
        this.vegetarian = vegetarian;
    }
    
    //Get functions
    public boolean getVegetarian(){
        return vegetarian;
    }
    
    public boolean getGF(){
        return GF;
    }
    
    //Constructor
    public MainCourse(String name, String description, double price, boolean vegetarian, boolean GF){
        super(name, description, price, "Main Course");
        this.GF = GF;
        this.vegetarian = vegetarian;
    }
    
    //Super print functions
    public void print(){
        super.print();
        System.out.println("Vegetarian: " + vegetarian + "\nGluten Free: " + GF);
    }
}