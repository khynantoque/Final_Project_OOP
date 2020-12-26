public class Food implements Entity {
    private double nutrients;
    private String type;

    public Food(double nutrients, String type) {
        this.nutrients = nutrients;
        this.type = type;
    }

    public void setNutrients(double nutrients) {
        this.nutrients = nutrients;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getNutrients() {
        return nutrients;
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public String getState() {
        return "solid";
    }

    @Override
    public String toString() {
        return "Food: " + type + "\nNutrients: " + nutrients;
    }
}
