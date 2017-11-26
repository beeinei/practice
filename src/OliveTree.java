import java.util.Scanner;

public class OliveTree {

    //    properties
    String species;
    int age;
    double price;


    //    constructor
    public OliveTree(String species, int age, double price) {
        this.species = species;
        this.age = age;
        this.price = price;
    }


    //    methods
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPlanted(int thisYear) {
        return thisYear - this.getAge();
    }

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter species:");
        String species = s.nextLine();
        System.out.println("Enter age:");
        int age = s.nextInt();
        System.out.println("Enter price:");
        double price = s.nextDouble();
        OliveTree myTree = new OliveTree(species, age, price);
        System.out.println("Enter current year:");
        int thisYear = s.nextInt();
        System.out.println("The tree was planted in: " + myTree.getYearPlanted(thisYear));
    }
}
