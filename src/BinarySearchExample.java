public class BinarySearchExample {
    static int binarySearch(int[] arr,int numberOfSearch){

        int start = 0 ,end = arr.length - 1;
        int trails = 0;

        while (start <= end){
            int middle = start + (end - start)/2;
            trails++;

            System.out.println("Trail = " + trails);

            if(arr[middle]== numberOfSearch)
                return middle;

            if(numberOfSearch > arr[middle])
                start = middle + 1 ;

            else
                end = middle -1;

        }

        return -1;
    }
}
