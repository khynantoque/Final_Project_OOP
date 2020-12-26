public class Person implements Life, Entity{
    private double health = 1;
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        if(food.isEdible())
            health += food.getNutrients();
        else
            System.out.println(name + " can't eat this " + food.getType() +".");
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
        return String.format("Name: %s\nHealth: %.2f", name, health);
    }
}
