package restaurant;

public class MenuItem {
    private String item;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String item, double price, String description, String category, boolean isNew){
        this.item = item;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public boolean getNew(){
        return isNew;
    }

    public void setNew(boolean isNew){
        this.isNew = isNew;
    }
}
