public class LinearSearchExample {
   static int linearSearch(int[] arr,int numberOfSearch){
        int n = arr.length;
        for (int i = 0 ; i < n ;i++){
            //return the index of the element if it found.
            if(arr[i] == numberOfSearch){
                return i;
            }
        }
          //return -1 if the element is not found.
        return -1;
    }

}
