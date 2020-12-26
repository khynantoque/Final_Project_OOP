public class Chantenay extends Carrot{

    public Chantenay(double nutrients) {
        super(nutrients);
    }

    public int getInch() {
        return 7;
    }

    @Override
    public boolean isEdible() {
        return false;//sample only
    }

    @Override
    public String toString() {
        return "Carrot Name: Chantenay\nNutrients: " + getNutrients() + "\nSize: " + getInch();
    }
}
