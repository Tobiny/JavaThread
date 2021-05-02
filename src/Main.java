import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int v[], min, max, tam;
        min = max = tam = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try{
                System.out.print("Ingrese el tamaño del vector (mayor a 1): ");
                tam = sc.nextInt();
            } catch (NumberFormatException e){
                System.out.println("Ingrese obligatoriamente un número entero");
                sc.next();
            }
        } while (tam < 1);
        do {
            try{
                System.out.print("Ingrese el valor mínimo para la generación de números aleatorios (mayor o igual a 0): ");
                min = sc.nextInt();
            } catch (NumberFormatException e){
                System.out.println("Ingrese obligatoriamente un número entero");
                sc.next();
            }
        } while (min < -1);
        do {
            try{
                System.out.print("Ingrese el valor máximo para la generación de números aleatorios (mayor al mínimo): ");
                max = sc.nextInt();
            } catch (NumberFormatException e){
                System.out.println("Ingrese obligatoriamente un número entero");
                sc.next();
            }
        } while (max < min);

        System.out.println("El arreglo generado aleatoriamente es el siguiente");
        //Llenado del vector con números aleatorios
        v = new int[tam];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (min + Math.random() * max);
            System.out.print("["+v[i]+"] ");
        }

        System.out.println("\n");

        Sum sumThread = new Sum();
        SumCuad sumCuadThread = new SumCuad();
        Media mediaThread = new Media();

        sumThread.setV(v);
        sumCuadThread.setV(v);
        mediaThread.setV(v);

        sumThread.start();
        sumCuadThread.start();
        mediaThread.start();

    }
}
