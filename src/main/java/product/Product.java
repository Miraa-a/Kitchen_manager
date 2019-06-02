package product;

public abstract class Product {

    private String category;
    private String Name;
    private double calorie;
    private double protein;

    protected Product() {};

    protected Product(String ctgr, String pName, double cContent, double pContent) {
        this.category = ctgr;
        this.Name = pName;
        this.calorie = cContent;
        this.protein = pContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public String ToString()
    {
        return "Категория продукта: " + getCategory() + ", название: " + getName() +
                ", калорийность: " + getCalorie() + ", содержание белка: " + getProtein() + "\n";
    }
}