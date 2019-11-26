import java.text.NumberFormat;
import java.util.Random;

public class Algo1 {

    public int findLargestDistance(int[] a){
        int count = 0;
        int[] evenArray = new int[a.length];

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                evenArray[count] = a[i];
                count++;
            }
        }

        int distance = 0;
        int dif = 0;
        for(int j=0;j<count; j++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2==0){
                    dif = Math.abs(evenArray[j]-a[i]);
                    if(distance<dif){
                        distance = dif;
                    }
                }
            }
        }

        return distance;
    }

    public static void main(String[] args){
        Algo1 algo1 = new Algo1();
        Random random = new Random();
        int[] array = random.ints(4000, 10,100000).toArray();
        long start = System.currentTimeMillis();
        System.out.println(algo1.findLargestDistance(array));
        long end = System.currentTimeMillis();
        System.out.print("Execution time is " + (end - start)  + " millseconds");
    }
}
