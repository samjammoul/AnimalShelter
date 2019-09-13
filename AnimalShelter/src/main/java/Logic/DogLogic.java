package Logic;
import Model.Gender;
import Model.Type;
import sun.util.resources.LocaleData;
import javax.naming.Name;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DogLogic extends AnimalLogic{

    private String LastWalk;



    AnimalLogic animalLogic  = new AnimalLogic();


    public DogLogic (String Name,Type type,Gender gender ,String reserverName)
    {
        super(Name,type,gender," ");
     //   animalLogic.setName(Name);
        animalLogic.setGender(gender);
        reservorLogic.setName(reserverName);
        animalLogic.setType(type);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        LastWalk = formatter.format(date);



    }

    public String getLastWalk()
    {
        //getting the LastWalk variable instance
        return LastWalk;
    }
}
