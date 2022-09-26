import java.util.Scanner;
import java.util.Vector;

public class Client {

    private String name;

    //constructeur
    public Client(String name){
        this.name = name;
    }

    //getter
    public String getName(){
        return("Name: "+this.name);
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void createEarth(int age, int population){
        String s = Terre.createEarth(age,population);
        if(s.equals("true")){
            System.out.println("object created!!!!!!!!!!");
        }
        else{
            System.out.println("object already created!!!!!!!!!!");
        }
    }

    public  String affiche(){
        return(this.name);
    }

    private static void showClients(Vector<Client> clients){
        for(var i = 0; i<clients.size(); i++){
            System.out.println("-> "+i+":"+clients.elementAt(i).affiche()+"\n");
        }
    }

    public  boolean isCreated(){
        return Terre.isCreated();
    }

    public void showInfos(){
        System.out.println(Terre.affiche());
    }

    public static void main(String[] args) {
        Vector<Client> clients = new Vector<Client>();
        int programm = 1;
        int choice;
        String name;
        Scanner input = new Scanner(System.in);
        while(programm==1){
            System.out.println("#########################################################\n");
            System.out.println("* 1: Creat client");
            System.out.println("* 2: Show clients");
            System.out.println("* 3: Create Earth");
            System.out.println("* 0: cancel programme");

            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Set the name of client: ");
                    name = input.next();
                    clients.add(new Client(name));
                    break;
                case 2:
                    if(clients.size()==0){
                        System.out.println("No clients yet!!!");
                    }
                    else{
                        showClients(clients);
                    }
                    break;
                case 3:
                    if(clients.size()==0){
                        System.out.println("No clients yet!!!");
                    }
                    else{
                        showClients(clients);
                        System.out.println("choisir un client:");
                        int numClient = input.nextInt();
                        if(!clients.elementAt(numClient).isCreated()){
                            System.out.println("donner l'age:");
                            int age = input.nextInt();
                            System.out.println("donner la population:");
                            int population = input.nextInt();
                            clients.elementAt(0).createEarth(age, population);
                        }
                        else{
                            System.out.println("la terre deja exist ");
                        }

                    }
                    break;
                case 0:
                    System.out.println("Programme finished!!!");
                    programm = 0;
            }

        }
        input.close();
    }
}

