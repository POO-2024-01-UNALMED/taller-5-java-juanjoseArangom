package zooAnimales;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " +
                Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString() {
        if (zona == null) {
            return "Mi nombre es " + nombre + "\nMi edad es " + edad + "\nMi habitat es " + habitat + "\nMi genero es " + genero;
        }
        else {
            return "Mi nombre es " + nombre + "\nMi edad es " + edad + "\nMi habitat es " + habitat + "\nMi genero es " + genero +
                    "la zona en la que me ubico es " + zona.getNombre() + ", en el zoo " + zona.getZoo().getNombre();
        }
    }

    public String movimiento () {
        return "desplazarse";
    }

    public void setHabitat(String habitat) {
    	this.habitat=habitat;
    }

    public String getHabitat() {
    	return habitat;
    }

    public void setGenero(String genero) {
    	this.genero=genero;
    }

    public String getGenero() {
    	return genero;
    }

    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }

    public String getNombre() {
    	return nombre;
    }

    public void setEdad(int edad) {
    	this.edad=edad;
    }

    public int getEdad() {
    	return edad;
    }

    public void setZona(Zona zona) {
    	this.zona=zona;
    }

    public Zona getZona() {
    	return zona;
    }
}
