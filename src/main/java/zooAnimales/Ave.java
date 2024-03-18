package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;

    public Ave() {
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public static Ave crearHalcon(String nombre,int edad, String genero) {
        Ave ave=new Ave(nombre,edad,"montanas",genero, "cafe glorioso");
        halcones++;
        return ave;
    }

    public static Ave crearAguila(String nombre,int edad, String genero) {
        Ave ave=new Ave(nombre,edad,"montanas",genero, "blanco y amarillo");
        aguilas++;
        return ave;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static int cantidadAves() {
        return Ave.listado.size();
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
}
