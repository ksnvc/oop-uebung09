package ueb09.fz;
import java.util.Arrays;
public class Fahrzeug {

    private String hersteller;
    private String modell;
    public Bremse [] bremsen;

    public Fahrzeug(String hersteller, String modell, Bremse [] bremsen){

        this.hersteller = hersteller;
        this.modell = modell;
        this.bremsen = bremsen;
    }

    public String toString() {
        return "Ich bin ein" + hersteller + " " + modell
                + " mit " + bremsen.length + " Bremsen ("
                + Arrays.toString(bremsen) +  ")";
    }
}

