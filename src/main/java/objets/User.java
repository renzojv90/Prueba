package objets;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email; //used like Username
    private String celPhone;
    private Date birthDate;
    private String address;

    /*Pet idPet = new Pet("Rufo","Adopción","Pequeño, amigable.");//<--Prueba*/


    public User(String firstName,String lastName,String email,String celPhone,Date birthDate,String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.celPhone = celPhone;
        this.birthDate = birthDate;
        this.address = address;
    }

    public User(String firstName, String celPhone,String address,String idPet ){
        this.firstName = firstName;
        this.celPhone = celPhone;
        this.address = address;
       /* this.idPet = idPet;*/
    }


    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = celPhone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Nombre: " + this.firstName + ", Email: " + this.email;
    }

}
