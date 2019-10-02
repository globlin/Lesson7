public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void info() {
        System.out.println("plate: " + food);
    }

    void addFood(int food) {
        this.food += food;
    }
}

