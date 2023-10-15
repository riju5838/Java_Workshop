public class Q144 {
    
    public static int Sumarray(int arr[]){
        int size=arr.length;
        int total=0;
        for(int index=0;index<size;index++){
            total=total+arr[index];

        }
        return total;
    }
    public static void main(String[]args) {
        int[]arr={1,2,3,4,5};
        System.out.println("total sum is"+Sumarray(arr));
    }
}
