/**
 * Java1 HomeWork7
 * @author Лукьянова Елизавета
 * @version 30.10.2021
 */

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik",5), new Cat("Murzik", 5), new Cat("Vasya",10)
        };

        Plate plate = new Plate(15, 30);
        System.out.println(plate);

        for (Cat cat: cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        for (Cat cat: cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat " + name + ", appetite " + appetite + ", fullness = " + fullness;
    }
}

class Plate {
    private int volume;
    private int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood (int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
