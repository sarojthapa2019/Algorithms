import java.util.Arrays;
import java.util.Random;

public class Algo4 {
    public static void main(String[] args){
        Algo4 algo1 = new Algo4();
        Random random = new Random();
        int[] array = random.ints(4000, 10,100000).toArray();
        long start = System.currentTimeMillis();
        System.out.println(algo1.findLargestDistance(array));
        long end = System.currentTimeMillis();
        System.out.print("Execution time is " + (end - start)  + " millseconds");
    }

    public int findLargestDistance(int[] a){
        int min = Arrays.stream(a).filter(i->i%2==0).min().getAsInt();
        int max = Arrays.stream(a).filter(i->i%2==0).max().getAsInt();
        return max -min;
    }
}
