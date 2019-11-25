import java.util.Random;

public class Algo3 {
    public static void main(String[] args){
        Algo3 algo1 = new Algo3();
        Random random = new Random();
        int[] array = random.ints(1000, 10,100000).toArray();
        long start = System.currentTimeMillis();
        System.out.println(algo1.findLargestDistance(array));
        long end = System.currentTimeMillis();
        System.out.print("Execution time is " + (end - start)  + " millseconds");
    }

    public int findLargestDistance(int[] a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                if(max<a[i]){
                    max = a[i];
                }
                else if(min > a[i]){
                    min = a[i];
                }
            }
        }
        return max - min;
    }
}
