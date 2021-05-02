public class SumCuad extends Thread{
    int[] v;

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i]*v[i];
        }
        System.out.println("La suma de los números al cuadrado del arreglo es: " + sum);
    }

    public void setV(int[] v) {
        this.v = v;
    }

}
