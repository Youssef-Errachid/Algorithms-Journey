public class LinearSearchExample {
   static int linearSearch(int[] arr,int numberOfSearch){
        int n = arr.length;
        int trails = 0;
        for (int i = 0 ; i < n ;i++){
            trails ++;
            System.out.println("Trail = " + trails);
            //return the index of the element if it found.
            if(arr[i] == numberOfSearch)
                return i;

        }
          //return -1 if the element is not found.
        return -1;
    }

}
