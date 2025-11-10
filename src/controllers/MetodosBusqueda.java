package controllers;
import views.ShowConsole;
import models.Persona;


public class MetodosBusqueda {
    private ShowConsole showConsole;
    private int[] arreglo;

    public MetodosBusqueda() {
        this.arreglo = new int[] { 10, 11, -2, 5, 6, 8, 15, 22} ;
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

        //Buscar el 5
        int result1 = busquedaLinealWhile(5);
        showConsole.printResult(result1, 5);

        //Buscar el -2
        
        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(result2, -2);

        //Buscar el -20
        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(result3, 20);

        //Buscar el 100
        //int result4 = busquedaLinealObj(100);      /*Esto dara un error porque int es entero y retorna null  */
        //showConsole.printResult(result4, 100);

        //Buscar el 100
        Integer result4 = busquedaLinealObj(100);
        showConsole.printResult(result4);

        //Buscar el 100
        Integer result5 = busquedaLinealObj(10); 
        showConsole.printResult(result5);
    }

    ///Retorna la posicion del valor buscado
    ///Si no encontro retorna -1
    public int busquedaLineal(int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i;
            }
        }
        return -1;
    }




    public int busquedaLinealWhile(int clave) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == clave) {
                return i;
            }
            i++;
        }
        return -1;
    }


    ///Retorna el OBJETO buscado si lo encontro;
    /// Si no encontro retorna NULL;
    public Integer busquedaLinealObj(int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return arreglo[i];
            }
        }
        return null;
    }

    public Persona searchPersonByName(
        Persona[] personas,
        String name) {
    for (Persona persona : personas) {
        if(persona.getName().equals(name)){
            return persona;
        }
            
        
    }        
        return null;
    }


    //Encontrar una persona que sea mayor de: age 
    //Y La edad sea impar
    public Persona findPersonByAgeAnd(
        Persona[] personas,
        int age) {
            for(Persona persona : personas){
                if(persona.getAge() > age && persona.getAge() % 2 != 0){
                    return persona;
                }
            }
            //Siempre que se trate de objetos se debe hacer un return null sino no funcion y dira que metodo no retorna.
            return null;
        }
    
    public Persona findPersonByValueName(Persona[] personas, int valueName) {
        for(Persona persona : personas){
            int valorNombre = 0;
            for(char letra: persona.getName().toCharArray()){
                int intvalorLetra = (int) letra;
                valorNombre += (int) intvalorLetra;
                
            }
            if(valorNombre == valueName){
                return persona;
            }
        }
        return null;
        

    }    
        
    
    
}

