package sixthEvidence;

public abstract class Animal {
    public String name;
    public String species;
    public  String features;
    public String likedThings;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", Species='" + species + '\'' +
                ", features='" + features + '\'' +
                ", likedThings='" + likedThings + '\'' +
                '}';
    }

    public Animal(String name, String species, String features, String likedThings) {
        this.name = name;
        this.species = species;
        this.features = features;
        this.likedThings = likedThings;
    }

    public Animal(){ }
}