public class Condicionales_Tema4 {
    public static void main(String[] args) {


        // PARTE 1 IF
        final int numeroIf = 10;

        if(numeroIf>0) {
            System.out.printf("El número %d es positivo\n", numeroIf);
        } else if (numeroIf<0) {
            System.out.printf("El número %d es negativo\n", numeroIf);
        } else {
            System.out.println("El número es 0");
        }


        // PARTE 2 WHILE

        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        // PARTE 3 DO WHILE

        numeroWhile=0;

        do {
            numeroWhile++;
            System.out.println("Valor de la variable " + numeroWhile);
        } while (numeroWhile<0);


        // PARTE 4 FOR

        for(int numeroFor=0; numeroFor<=3; numeroFor++) {
            System.out.println("El valor es : " + numeroFor);
        }


        // PARTE 5 SWITCH

        int valorEstacion = 1 ;

        switch(valorEstacion) {
            case 1:
                System.out.println("Es primavera");
                break;
            case 2:
                System.out.println("Es verano");
                break;
            case 3:
                System.out.printf("Es Otoño");
                break;
            case 4:
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("El valor no es válido");
        }



    }
}
