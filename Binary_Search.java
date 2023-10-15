import java.util.*;
public class Binary_Search {
    public static void binarySearch(int arr[],int start,int end,int key){

   int mid=(start+end)/2;
   while(start<=end){
    if(arr[mid]<key){
        start=mid+1;
    }
    else if(arr[mid]==key){
        System.out.println("element is found"+mid);
    break;}
    else{
        end=mid-1;
    }
    if(start>end){
        System.out.println("element not found");
    }
}

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    
    int arr[]={5,10,15,20,30};
    int end=arr.length-1;
    System.out.println("elements");
    int key=sc.nextInt();
    binarySearch(arr,0,end,key);
}    
}
