public class Odds implements Runnable{
    public void run(){
        for(int x = 2; x <= 10; x+=2){
            System.out.print(x+" ");
        }
    }
}
