public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Kyzma", 15),
                new Cat("Vaska", 15),
                new Cat("Grey", 10),
                new Cat("Odisey", 10)
        };

        Plate plate = new Plate(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.info();
    }

}