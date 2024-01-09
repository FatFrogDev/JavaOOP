package collections.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private String name="MyMenu";
    private List<Recipe> recipes;

    {
        recipes.set(2, null);
    }

    public void addFiveRecipes(Scanner scan){
        boolean keepOn=false;
        do {
            Recipe recipe = new Recipe();
            System.out.println("Type the recipe id");
            recipe.setId(scan.nextInt()); scan.nextLine();
            System.out.println("Now its name");
            recipe.setName( scan.nextLine() );
            System.out.println("Finally, its price");
            recipe.setPrice( scan.nextDouble() );
            recipes.add(recipe);
            System.out.println("Do you want to continue? 1.Yes 2.No");
            keepOn = scan.nextInt() == 1;
        }while (keepOn && recipes.size()<5);
    }

    public void replaceThird(Scanner scan){
        Recipe recipe = new Recipe();
        recipe.setId(scan.nextInt()); scan.nextLine();
        System.out.println("Now its name");
        recipe.setName( scan.nextLine() );
        System.out.println("Finally, its price");
        recipe.setPrice( scan.nextDouble() );
        recipes.set(2,recipe);
    }

    public void printAmountOfRecipes(){
        System.out.println(recipes.size()+1);
    }

    public void printWholeMenu(){
        for (Recipe recipe:recipes){
            System.out.println(recipe.toStringNameAndPrice());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
