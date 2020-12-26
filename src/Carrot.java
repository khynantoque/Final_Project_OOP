public class Carrot extends Food{

    public Carrot(double nutrients) {
        super(nutrients + 3.2, "Vegetable");
    }

    @Override
    public String toString() {
        return "Carrot is a " + getType() + " and it belongs to food.";
    }
}
