package java8;

public class MaxmSubArrayClass {
    public int maxSubArray(int [] arr){
        int highestSoFar = arr[0];
        int sumSofar = arr[0];
        for (int i =1; i < arr.length; i++){
            if ((sumSofar + arr[i]) > highestSoFar){
                highestSoFar = sumSofar + arr[i];
                        sumSofar = sumSofar + arr[i];
            }
            else {
                sumSofar = arr[i];

            }


        }
        return highestSoFar;

    }
    public static void main (String[] argv){
        int [] todo = {1,2,3,-100,3,4};
        MaxmSubArrayClass maxmSubArrayClass  = new MaxmSubArrayClass();
        int x = maxmSubArrayClass.maxSubArray(todo);
        int [] todo1={1,2,3,4,5,6};
        x = maxmSubArrayClass.maxSubArray(todo1);
    }
}
