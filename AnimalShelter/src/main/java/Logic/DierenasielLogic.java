package Logic;

import Model.Gender;

import java.util.ArrayList;
import java.util.List;

public class DierenasielLogic {

    private  static List<AnimalLogic> Animals =  new ArrayList<AnimalLogic>();

    public void addAnimal(AnimalLogic animal)
    {
        Animals.add(animal);
    }

    public static void showDogs()
    {

        String reservorName ;


        for (int i = 0; i < Animals.size(); i++) {

            if ("Dog".equals(Animals.get(i).getType())) {


                reservorName = Animals.get(i).getReservedBy();

                System.out.println("Name of Dog: " + Animals.get(i).getName());

                System.out.println("Gender of Dog: " + Animals.get(i).getGender());


                if (" ".equals(reservorName)) {
                    System.out.println("Name of Reservor: " + "Nobody");
                } else {
                    System.out.println("Name of Reservor: " + reservorName);

                }
                System.out.println("===========");

            }else {System.out.println("There is no dogs" );}

        }
    }
    public static void showCats()
    {


        String reservorName ;

        for (int i = 0; i < Animals.size(); i++) {

            if ("Cat".equals(Animals.get(i).getType())) {


                reservorName = Animals.get(i).getReservedBy();

                System.out.println("Name of Cat: " + Animals.get(i).getName());

                System.out.println("Gender of Cat: " + Animals.get(i).getGender());


                if (" ".equals(reservorName)) {
                    System.out.println("Name of Reservor: " + "Nobody");
                } else {
                    System.out.println("Name of Reservor: " + reservorName);

                }
                System.out.println("===========");

            }else {System.out.println("There is no cats" );}

        }
    }
}
