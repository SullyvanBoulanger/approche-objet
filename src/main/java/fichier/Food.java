package fichier;

public class Food {
    private String category;
    private String brand;
    private String rank;

    public Food(String category, String brand, String rank) {
        this.category = category;
        this.brand = brand;
        this.rank = rank;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getRank() {
        return rank;
    }

    public String toCSV(char separator, long count) {
        return category + separator + brand + separator + rank + separator + count;
    }

    @Override
    public boolean equals(Object arg0) {
        if(arg0 == null){
            return false;
        }

        if(getClass() != arg0.getClass()){
            return false;
        }

        Food food = (Food) arg0;

        if(
            category.equals(food.category) && 
            brand.equals(food.brand) && 
            rank.equals(food.rank)
        )
            return true;
        
        return false;
    }
}
