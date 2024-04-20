import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       while (true){
           try {
               menu();
            int opcion = sc.nextInt();

            if (opcion == 0){
                break;
            }
            switch (opcion){
                case 1:
                    System.out.println("----------- ");
                    Agregar();

                    break;

            }

           }catch (InputMismatchException e){
               System.out.println("Por favor ingrese un valor correcto " + e.getMessage());
           }sc.nextLine();
       }
    }
    public static void menu(){
        System.out.println("Ingrese una opcion: \n"+"1.Agregar articulo\n"+"2.Modificar articulo\n"+"3.Consultar articulos\n"+"Opcion ->");
    }
    public static void Agregar(){
        String nombre;
        String modelo;
        String ram;
        String almacenamiento;
        String procesador;
        double PrecioBase;
        int tipo;
        String CamaraPixeles;
        String capacidadbateria;
        String TarjetaGrafica;
        long codigo =
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de articulo: 1.telefono, 2.laptop");
        tipo =sc.nextInt();
        System.out.println("Agregar nombre del articulo: ");
        nombre = sc.nextLine();
        System.out.println("Agregar modelo del articulo");
        modelo = sc.nextLine();
        System.out.println("Ingrese capacidad de ram: ");
        ram = sc.nextLine();
        System.out.println("Ingrese capacidad de almacenamiento: ");
        almacenamiento = sc.nextLine();
        System.out.println("Ingrese precio base del articulo: ");
        PrecioBase = sc.nextDouble();


        if (tipo==1){
            System.out.println("Ingrese capacidad de bateria del telefono en mAh");
            capacidadbateria = sc.nextLine();
            System.out.println("Ingrese los pixeles de la camara: ");
            CamaraPixeles = sc.nextLine();
            Telefono telefono = new Telefono(nombre, modelo,ram,almacenamiento,PrecioBase, capacidadbateria, CamaraPixeles, codigo);
        }else {
            System.out.println("Ingrese tarjeta grafica de la laptop:");
            TarjetaGrafica = sc.nextLine();
            System.out.println("Ingrese procesador de la laptop");
            procesador = sc.nextLine();
            Laptop laptop = new Laptop(nombre, modelo, ram,almacenamiento, PrecioBase,procesador, TarjetaGrafica);

        }

        System.out.println("El codigo del articulo es: "+codigo);
    }
    public static void modificar(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese codigo del producto: ");
        String codigo = sc.nextLine();

    }
}
