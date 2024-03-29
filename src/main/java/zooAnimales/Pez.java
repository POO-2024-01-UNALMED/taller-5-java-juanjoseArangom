package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        this(null, 0, null, null, null, 0);
    }

    public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);
    }

    public static Pez crearSalmon(String nombre,int edad, String genero) {
        Pez pez=new Pez(nombre,edad,"oceano",genero, "rojo", 6);
        salmones++;
        return pez;
    }

    public static Pez crearBacalao(String nombre,int edad, String genero) {
        Pez pez=new Pez(nombre,edad,"oceano",genero, "gris", 6);
        bacalaos++;
        return pez;
    }

    public static int cantidadPeces() {
        return Pez.listado.size();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

}