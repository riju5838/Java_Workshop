import java.util.*;
public class Q90 {
    public static void WaveArray2(int[]arr){
        int size=arr.length;
    
            
        for(int i=0;i<size;i++){
            for(int j=1;j<size;j++){
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
                
            }
        }
    }
        public static void main(String[]args){
int arr[]={4,5,6,7,8};
WaveArray2(arr);
System.out.println(arr.length);

        
    }
}