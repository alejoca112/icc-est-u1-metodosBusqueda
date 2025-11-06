package views;
public class ShowConsole {


    public ShowConsole() {

    }


    public void printArray(int[] num) {
        for(int i = 0; i< num.length; i++) {
            System.out.print(num[i] + " ,");
        }
        System.out.println();
    }


    public void printResult(int result1) {
        if(result1 == -1) {
            System.out.println("Error -> No se encontro el valor");

        } else {
            System.out.println("Se encontro en la posicion:" + result1);
        }
    
    }


    public void printResult(int result1, int clave) {
        if(result1 == -1) {
            System.out.println("Error -> No se encontro el valor: " + "{" + clave + "}");

        } else {
            System.out.println("Se encontro el valor: " + "{" + clave + "}" +  " en la posicion:" + result1);
        }
    
    }

    public void printResult(Integer result4) {
        if(result4 != null) {
            System.out.println("Se encontro el valor:" + result4);

        } else {
            System.out.println("Error -> El valor buscado No se encontro");
        }
    }

    public void printResult1(Integer result5) {
        if(result5 == null) {
            System.out.println("Error -> No se encontro el valor buscado ");

        } else {
            System.out.println("Se encontro el valor:" + "{" + result5 + "}");
        }
    }
}