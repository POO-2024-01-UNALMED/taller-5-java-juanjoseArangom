package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    }

    public static Anfibio crearRana(String nombre,int edad, String genero) {
        Anfibio anfibio=new Anfibio(nombre,edad,"selva",genero, "rojo", true);
        ranas++;
        return anfibio;
    }

    public static Anfibio crearSalamandra(String nombre,int edad, String genero) {
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras++;
        return anfibio;
    }

    public static int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    @Override
    public String movimiento(){
        return "Saltar";
    }

    public static void setListado(ArrayList<Anfibio> listado){
        Anfibio.listado = listado;
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }

    public boolean isVenenoso(){
        return this.venenoso;
    }

    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

}
