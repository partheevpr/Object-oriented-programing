public class Cat extends Pet {

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public void eat() {
        energy += 15;
        if (energy > 100) energy = 100;
        System.out.println(petName + " eats quietly.");
    }

    @Override
    public void play() {
        energy -= 10;
        if (energy < 0) energy = 0;
        System.out.println(petName + " lazily swats at a toy.");
    }

    @Override
    public void sleep() {
        energy += 50;
        if (energy > 100) energy = 100;
        System.out.println(petName + " is sleeping...");
    }
}
