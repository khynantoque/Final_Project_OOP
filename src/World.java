//Antoque BSCS-2
public class World {
    public static void main(String[] args) {
        Person human = new Person("John");
        human.setHealth(10);
        System.out.println("Stats");
        System.out.println(human.toString());

        System.out.println("\n==Carrot Created==");
        Food carrot = new Carrot(10);
        System.out.println(carrot.toString());

        System.out.println("==Cheese Created==");
        Food cheese = new Food(50, "Cheese");
        System.out.println(cheese.toString());

        System.out.println("==Chantenay Created==");
        Chantenay chantenay = new Chantenay(10);
        chantenay.setType("carrot");
        System.out.println(chantenay.toString());

        System.out.println("\n[==]Eating[==]");

        System.out.println(human.getName() + " eats cheese. Calculating new stats...");
        human.eat(cheese);
        System.out.println(human.toString());

        System.out.println(human.getName() + " eats carrot. Calculating new stats...");
        human.eat(carrot);
        System.out.println(human.toString());

        System.out.println(human.getName() + " eats a chantenay. Calculating new stats...");
        human.eat(chantenay);
        System.out.println(human.toString());

    }
}
