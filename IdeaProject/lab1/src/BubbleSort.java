public class BubbleSort {
    int[] arr = {34,8,64,51,32,21};
    int[] sort(){
        int len = arr.length;
        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < (len-1); ++j) {
                if(arr[j] > arr[j+1]){
                    swap(j,j+1);
                }
            }
        }
        return arr;
    }
    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        new BubbleSort().sort();
        System.out.println("asf");
    }
}

