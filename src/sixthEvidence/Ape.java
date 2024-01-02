package sixthEvidence;

public class Ape extends  Animal{


    public Ape(String name, String species, String features, String likedThings) {
        super(name, species, features, likedThings);
    }

    public Ape(){
        this.name="John";
        this.species ="Ape";
        this.features="They are too strong";
        this.likedThings="They like fruits and they are very curious";
    }

    @Override
    public String toString() {
        return "Ape{" +
                "name='" + name + '\'' +
                ", Species='" + species + '\'' +
                ", features='" + features + '\'' +
                ", likedThings='" + likedThings + '\'' +
                '}';
    }
}
