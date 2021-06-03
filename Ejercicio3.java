public static void main(String args[]){
    scanner input = new scanner (sistem.in);

    System.out.println ("Ingrese un Numero: ");
    int num1 = input.nextInt();

    System.out.println ("Ingrese el otro Numero: ");
    int num2 = input.nextInt();

    System.out.println ("La multiplicacion es" + multiplicacion(num1,num2));
}
public static int multiplicacion (int num1, int num2) {
        return num1*num2;
        }