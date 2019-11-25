import java.util.Random;

public class Algo2 {
    public static void main(String[] args){
        Algo2 algo1 = new Algo2();
        Random random = new Random();
        int[] array = random.ints(1000, 10,100000).toArray();
        long start = System.currentTimeMillis();
        System.out.println(algo1.findLargestDistance(array));
        long end = System.currentTimeMillis();
        System.out.print("Execution time is " + (end - start)  + " millseconds");
    }

    public int findLargestDistance(int[] a){
        int d = 0;
        int dif = 0;
        for(int i=0; i<a.length; i++){
            for(int j=1; j<a.length; j++){
                if(a[i]%2==0 && a[j]%2==0) {
                    dif = Math.abs(a[i] - a[j]);
                    if (d < dif) {
                        d = dif;
                    }
                }
            }
        }
        return d;
    }
}
