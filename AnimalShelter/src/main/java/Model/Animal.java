package Model;

public class Animal {

    public String Name ;
    public Gender Gender ;
    public Reserver ReservedBy ;

    // Getter
    public String getName() {
        return Name;
    }

    // Setter
    public void setName(String Name) {
        this.Name = Name;
    }



    // Getter
    public String getGender() {
        return Gender.toString();
    }

    // Setter
    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }



    // Getter
  // public String getReservedBy() {
  //      return ReservedBy;
  //  }

    // Setter
    public void setReservedBy(Reserver ReservedBy) {
        this.ReservedBy = ReservedBy;
    }
}
