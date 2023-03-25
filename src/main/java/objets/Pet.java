package objets;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class Pet {

    private String petName;
    private String situation;
    private String charac; // Characteristics of pet

    private String imagen;


    public Pet(String petName, String situation,String charac, String imagen){
        this.petName = petName;
        this.situation = situation;
        this.charac = charac;
        this.imagen = imagen;

    }

    public String getPetName(){return this.petName; }
    public void setPetName(String petName){this.petName = petName;}

    public String getSituation(){return this.situation;}
    public void setSituation(String situation){this.situation = situation; }

    public String getCharac(){return this.charac;}
    public void setCharac(String charac){this.charac = charac;}

    public String toString(){return "Nombre mascota: " + petName + ", su situación es: " + situation;}
}

