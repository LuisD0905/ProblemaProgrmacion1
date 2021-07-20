import java.util.Scanner;

public class Examen1 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Favor digite el nombre de la empresa");
        String nombreEmpresa = escaner.toString();
        System.out.println("La provincia en la que se ubica su empresa es: ");
        String provinciaElegida = escaner.toString();
        System.out.println("Didgite el numero total de trabajadores en su empresa ");
        int numTotalTrabajadores = escaner.nextInt();
        System.out.println("Digite el numero de trabajadores con COVID19 ");
        int numTrabajoderesConCOVID19 = escaner.nextInt();
        System.out.println("Digite el monto de ingreso promedio de su empresa por mes");
        long montoPromedioPorMes = escaner.nextLong();
        System.out.println("Digite el numero de creditos de su empresa: ");
        int numCreditos = escaner.nextInt();
        System.out.println(nombreEmpresa + " " + provinciaElegida + "  " + numTotalTrabajadores + "  " + numTrabajoderesConCOVID19 + "  " + montoPromedioPorMes + "  " + numCreditos);
        if (numTrabajoderesConCOVID19 > 20) {
            System.out.println("¡¡ALERTA!!, en su empresa hay más de 20 trabajadores con COVID19");
        }

        int poblacionAlajuela = 848146;
        int poblacionSanJose = 1404242;
        int poblacionCartago = 490903;
        int poblacionGuanacaste = 326953;
        int poblacionPuntarenas = 410929;
        int poblacionlimon = 386862;
        int poblacionHeredia = 433677;

        int poblaciones = poblacionAlajuela = 848146, poblacionSanJose = 1404242, poblacionCartago = 490903, poblacionGuanacaste = 326953, poblacionPuntarenas = 410929, poblacionlimon = 386862, poblacionHeredia = 433677;

        int montoPrestamo = escaner.nextInt();
        montoPrestamo = montoPrestamo < 1000000;
        if (montoPrestamo >= 1000000) {
            System.out.println("ERROR, el monto es mayor de lo que se le puede permitir a su PC");
        }
        int poblacion;
        System.out.println("Favor indicar en cual provincia es la requerida: ");
        String provinciaElegida2 = escaner.toString();
        switch (provinciaElegida2) {
            case "Alajuela": {
                poblacion = poblacionAlajuela;
                break;
            }
            case "San Jose": {
                poblacion = poblacionSanJose;
                break;
            }
            case "Cartago": {
                poblacion = poblacionCartago;
                break;
            }
            case "Guanacaste": {
                poblacion = poblacionGuanacaste;
                break;
            }
            case "Puntarenas": {
                poblacion = poblacionPuntarenas;
                break;
            }
            case "Limon": {
                poblacion = poblacionlimon;
                break;
            }
            case "Heredia": {
                poblacion = poblacionHeredia;
                break;
            }

        }
        montoAPrestar = ((numTrabajoderesConCOVID19 / numTotalTrabajadores) * poblacion);
        switch (numTotalTrabajadores) {
            case (0 < numTotalTrabajadores < 10)  {
                System.out.println("Tasa de interes de 0.5");
            }
            case (10 <= numTotalTrabajadores < 30)  {
                System.out.println("Tasa de interes es de 0.4");
            }
            case (30 <= numTotalTrabajadores)  {
                System.out.println("Tasa de interes de 0.3 ");
            }
        }

    }

    public Examen1(int poblaciones) {
        this.poblaciones = poblaciones;
        System.out.println("A partir de aqui puede notarse que se borraron casi todos los datos a excepcion de los datos de las provincias");
       int poblacionAlajuela = 848146;
        int poblacionSanJose = 1404242;
        int poblacionCartago = 490903;
        int poblacionGuanacaste = 326953;
        int poblacionPuntarenas = 410929;
        int poblacionlimon = 386862;
        int poblacionHeredia = 433677;
    }
}