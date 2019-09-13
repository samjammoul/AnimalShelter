package View;
import Logic.*;
import Model.Gender;
import Model.Type;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interface {



    private  static Scanner scanner = new Scanner(System. in);

    public static void main(String[] args) {

        DierenasielLogic dierenasielLogic = new DierenasielLogic();

        //To show the fnctions of program
        showFunctions();
        String functionNumber = scanner. nextLine();
        if("1".equals(functionNumber)){
            addDog();
        } else if ("2".equals(functionNumber)){
            addCat();
        } else {System.out.println("Please enter a good value");}


      //  System.out.println("Please  write the number of function:");

    //    dierenasielLogic.addAnimal(new DogLogic());



    }
    public static void showFunctions(){
        System.out.println("Welcome  to our Application");
        System.out.println("To add dog please enter 1");
        System.out.println("To add dog please enter 2");
        System.out.println("Please Enter the name of function");

    }
    public static void addDog()
    {
        DierenasielLogic dierenasielLogic = new DierenasielLogic();
        DierenasielLogic dierenasielLogic1 = new DierenasielLogic();
        Gender gender ;
        Type type = Type.Dog;

        System.out.println("What is the name of the dog?");
        String NameofDog = scanner. nextLine();
        System.out.println("What is the gender of the dog?");
        String genderOfDog = scanner. nextLine();

        if("male".equals(genderOfDog))
        {
            gender = Gender.Male;

            dierenasielLogic.addAnimal(new DogLogic(NameofDog,type,gender," "));

        } else if("female".equals(genderOfDog)  ) {
            gender = Gender.Female;
            dierenasielLogic.addAnimal(new DogLogic(NameofDog,type,gender,""));

        } else {
            System.out.println("Pleas Enter male of female !");
        }

       DierenasielLogic.showDogs();


    }
    public static void addCat()
    {
        DierenasielLogic dierenasielLogic = new DierenasielLogic();
        DierenasielLogic dierenasielLogic1 = new DierenasielLogic();
        Gender gender ;
        Type type = Type.Dog;

        System.out.println("What is the name of the cat?");
        String NameofCat = scanner. nextLine();
        System.out.println("What is the gender of the Cat?");
        String genderOfCat = scanner. nextLine();
        System.out.println("What is the bad habits of the Cat?");
        String BadHabits = scanner. nextLine();

        if("male".equals(genderOfCat))
        {
            gender = Gender.Male;
            dierenasielLogic.addAnimal(new CatLogic(NameofCat,type,gender," ",BadHabits));

        } else if("female".equals(genderOfCat)  ) {
            gender = Gender.Female;
            dierenasielLogic.addAnimal(new CatLogic(NameofCat,type,gender,"",BadHabits));

        } else {
            System.out.println("Pleas Enter male of female !");
        }

        DierenasielLogic.showCats();


    }
}
