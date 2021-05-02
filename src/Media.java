public class Media extends Thread{
    int[] v;

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        System.out.println("La media de los números del arreglo es: " + sum / v.length);
    }

    public void setV(int[] v) {
        this.v = v;
    }

}
