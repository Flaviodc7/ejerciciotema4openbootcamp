public class Main {
    public static void main(String[] args) {
        int numeroIf = 2;
        if (numeroIf > 0){
            System.out.println("numero es mayor a cero");
        } else if (numeroIf == 0){
            System.out.println("numero es igual a cero");
        } else {
            System.out.println("numero es menor que cero");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("la estación es verano");
                break;
            case "invierno":
                System.out.println("la estación es invierno");
                break;
            case "primavera":
                System.out.println("la estación es primavera");
                break;
            case "otoño":
                System.out.println("la estación es otoño");
                break;
            default:
                System.out.println("no hay una estación válida");
        }

    }
}