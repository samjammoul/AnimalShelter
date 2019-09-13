package Logic;
import Model.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CatLogic extends AnimalLogic{

    private String badHabits;

    AnimalLogic animalLogic  = new AnimalLogic();


    public CatLogic (String Name,Type type ,Gender gender , String reserverName , String badHabits)
    {


        super(Name,type,gender," ");
        animalLogic.setGender(gender);
        reservorLogic.setName(reserverName);
        animalLogic.setType(type);
        this.badHabits = badHabits;





    }


}
