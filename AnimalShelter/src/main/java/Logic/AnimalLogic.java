package Logic;
import Model.*;



public class AnimalLogic {

    private  String Name ;
    private  Type   type;
    private  Gender Gender ;
    private  String ReservedBy ;

    ReservorLogic reservorLogic = new ReservorLogic();


    // setter Name
    public  void setName(String Name) {
       this.Name = Name;
    }

    //setter Gender
    public  void setGender(Gender gender) {
        this.Gender = gender;
    }

    // Getter Type
    public String getType()
    {
        return type.toString();
    }

    // Getter Gender
    public String getGender()
    {
        return Gender.toString();
    }

    // Getter Name
    public String getName()
    {

        return Name;
    }

    //setter Type
    public  void setType(Type type) {
        this.type = type;
    }


    // Getter Name
    public String getReservedBy()
    {
        return ReservedBy;
    }

    public AnimalLogic(){}

    public AnimalLogic(String Name,Type type,Gender Gender,String ReservorName)
    {

        this.Name = Name;
        this.Gender = Gender;
        this.type = type;
        this.ReservedBy = ReservorName;
       reservorLogic.setName(ReservorName);
    }



   /* public AnimalLogic(String name,Gender gender,String reserverName)
    {
        this.Name = name;
        this.Gender =   gender;
        reservorLogic.setName(reserverName);
    } */

   /* public boolean  Reserve(String reservedBy)
    {
        if (this.ReservedBy == null)
        {
      //    this.ReservedBy = new Reservor(reservedBy, DateTime.Now);
            return true;
        }
        return false;
    }

*/
}
