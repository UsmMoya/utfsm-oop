public class Mascota {

    private String nombre;
    private int edad;
    private int salud;
    private int energia;
    private int felicidad;

    public Mascota(String n) {
        this.nombre = n;
        this.edad = 0;
        this.salud = 100;
        this.energia = 100;
        this.felicidad = 50;

        System.out.println("\nMascota Virtual");
        System.out.println("--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salud: " + salud);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidad: " + felicidad + "\n");
    }
}
