package sixthEvidence;

public  class Giraffe extends Animal{

    public Giraffe(String name, String species, String features, String likedThings) {
        super(name, species, features, likedThings);
    }


    public Giraffe(){
        this.name="Marie";
        this.species="Giraffe";
        this.features="She's black and yellow and has a large neck";
        this.likedThings="His neck is funny and she's so beautiful";
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", Species='" + species + '\'' +
                ", features='" + features + '\'' +
                ", likedThings='" + likedThings + '\'' +
                '}';
    }
}
