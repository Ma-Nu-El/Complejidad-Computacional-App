public class Controller {

    public void start(){
        App aplicacion = new App();

        aplicacion.mostrarPalabras();
        System.out.println(hline);


        aplicacion.buscarPalabra();
        System.out.println(hline);


        aplicacion.agregarPalabras();
        System.out.println(hline);


        aplicacion.eliminarPalabra();
        System.out.println(hline);

        System.out.println(hline);
        System.out.println("Fin.");
    }
}
