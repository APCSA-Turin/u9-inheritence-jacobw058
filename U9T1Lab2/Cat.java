public class Cat extends Animal {
    private String species;
    private boolean playedWith;
    public Cat(boolean playedWith, int age, String name, boolean vaccinated, String species) {
        super(age, name, vaccinated);
        this.playedWith = playedWith;
        this.species = species;
    }
    public void play() {
        playedWith = true;
    }
    public boolean hasPlayedWith() {
        return playedWith;
    }
    public String getSpecies() {
        return species;
    }
    public static void catGeneralInfo() {
        System.out.println("cats are four-legged furry mammals often kept as pets by humans");
    }
}