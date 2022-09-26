import java.util.ArrayList;
import java.util.List;

public class Terre {

    //is earth already created
    private static boolean created = false;
    private  int age;
    private  int population;

    private static List list = new ArrayList();

    //constructeur
    private Terre(int age, int population){
        this.age = age;
        this.population = population;
    }

    //getters
    public  int getAge(){
        return this.age;
    }

    public  int getPopulation(){
        return this.population;
    }

    public static boolean isCreated(){
        return created;
    }
    public static String createEarth(int age, int population){
        if(created){
            System.out.println("Earth already created");
            return "false";
        }

        Terre terre = new Terre(age,population);
        int x=terre.age;
        int y= terre.population;
        list.add(x);
        list.add(y);

        created = true;
        System.out.println("Earth created ");
        return "true";
    }

    public static String affiche(){
        if(isCreated()){
            return("Age: "+list.get(0)+"\nPopulation: "+list.get(1));
        }
        return("Earth need to be created!!!!!");
    }

}
