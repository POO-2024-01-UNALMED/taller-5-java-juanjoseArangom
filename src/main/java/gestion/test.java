package gestion;
import zooAnimales.Animal;
import zooAnimales.Ave;

public class test {
    public static void main(String[] args) {

        Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
        boolean ok = false;
        String  comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
        if(an2.toString().equals(comp)) {
            ok = true;
        }
        System.out.println(an2.toString());
    }
}
