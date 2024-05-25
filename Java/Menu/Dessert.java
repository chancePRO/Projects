public class Dessert extends Food{
    //Set data types
    private int calories;
    private boolean nuts;
    
    //Constructor
    public Dessert(String name, String description, double price, int calories, boolean nuts){
        super(name, description, price, "Dessert");
        this.calories = calories;
        this.nuts = nuts;
    }
    
    //Get functions
    public boolean getNuts(){
        return nuts;
    }
    
    public int getCalories(){
        return calories;
    }
    
    //Set functions
    public void setCalories(int calories){
        this.calories = calories;
    }
    
    public void setNuts(boolean nuts){
        this.nuts = nuts;
    }
    
    //Super print function
    public void print(){
        super.print();
        System.out.println("Calories: " + calories + "\nContains Nuts: "+ nuts);
    }
}
