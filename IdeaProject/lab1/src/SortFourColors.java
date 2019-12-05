import java.util.Arrays;

public class SortFourColors {
    static int[] a = {0,1,1,0,2,3,3,2,1,0,2,3,1,1};
    public static int[] sort(int[] a){
        int i =0;
        int j=0;
        int k = a.length-1;


        while(i<=k){
            if(a[i]==0){
                i++;
            }
            if(a[i]==1){
                swap(i,j);
                i++;
                j++;
            }
           else {
                swap(i,k);
                k--;
            }

        }
        i=0;
        k=a.length-1;
        while(i<=k){
            if(a[i]==0 || a[i]==1 || a[i]==2){
                i++;
            }
            if(a[i]==3){
                swap(i,k);
                k--;
            }
        }
      return a;
    }
    static void swap(int s , int t){
        int temp = a[s];
        a[s] = a[t];
        a[t] = temp;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(sort(a)));
    }
}
