public class Dog extends Animal {
    private double ageInDogYears;
    private boolean walked;
    public Dog(boolean walked, int age, String name, boolean vaccinated) {
        super(age, name, vaccinated);
        this.walked = walked;
        ageInDogYears = age / 7;
    }
    public void walk() {
        walked = true;
    }
    public boolean hasBeenWalked() {
        return walked;
    }
    public double getAgeInDogYears() {
        return ageInDogYears;
    }
    public int getAgeInMonths() {
        return (int) (ageInDogYears * 84);
    }
}