public class SelectionSort {
    int[] arr = {34,8,64,51,32,21};
    void sort(){
        int len = arr.length;
        int temp = 0;
        for(int i = 0; i < len; ++i) {
            int nextMinPos = minpos(i,len-1);
            swap(i,nextMinPos);
        }
    }
    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int minpos(int bottom, int top){
        int m = arr[bottom];
        int index = bottom;
        for(int i = bottom+1; i <= top; ++i) {
            if(arr[i]<m){
                m=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        new SelectionSort()il.sort();
        System.out.println("asf");
    }
}
