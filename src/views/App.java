package views;
import controllers.MetodosBusqueda;
import models.Persona;


public class App {
    public static void main(String[] args) {
        MetodosBusqueda mBusqueda = new MetodosBusqueda();

        ShowConsole showConsole = new ShowConsole();

        Persona[] personas = new Persona[] {
            new Persona("Ana", 25),
            new Persona("Luis", 30),
            new Persona("Maria", 28),
            new Persona("Carlos", 35),
            new Persona("Sofia", 22),
            new Persona("Jorge", 27),
            new Persona("Lucia", 24),

        };

        //Busqueda de Juan
        Persona resultadoPer = mBusqueda.searchPersonByName(personas, "Juan");
        //Imprime la persona si encontro
        //Imprime no encontro una persona con el nombre
        showConsole.showPersonResult(resultadoPer, "Juan");

        //Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = mBusqueda.findPersonByAgeAnd(personas, 25);
        showConsole.showPersonResult(resultadoPer2, 25); 
    }
}
