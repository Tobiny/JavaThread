public class Pairs implements Runnable{
    public void run(){
        for(int x = 1; x <= 10; x+=2){
            System.out.print(x+" ");
        }
    }

}
