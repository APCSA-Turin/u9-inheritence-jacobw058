public class Animal {
    private int id;
    private int age;
    private String name;
    private boolean vaccinated;
    public Animal(int age, String name, boolean vaccinated) {
        this.age = age;
        this.name = name;
        this.vaccinated = vaccinated;
    }
    public void adopt() {
        System.out.println("adopted");
    }
    public void feed() {
        System.out.println("fed");
    }
    public void getAnimalInfo() {
        System.out.println("name: " + name + "\nid: " + id + "\nage: " + age + "\nvaccinated: " + vaccinated);
    }
    public int getId() {
        return id;
    }
}