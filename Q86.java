public class Q86 {
    public static void main(String[] args) {
     /* int[][]mat1={{1,2,3},
                   {4,5,6}};
      int[][]mat2={{8,9,7},
                   {10,11,12}};
        int[][]result={{0,0,0},
                      {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            
            for(int j=0;j<mat1[i].length;j++){
            System.out.format("setting value i=%d and j=%d\n",i,j);
            result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){
            
            for(int j=0;j<mat1[i].length;j++){
            System.out.print(result[i][j]+"  ");
            result[i][j]=mat1[i][j]+mat2[i][j];
    }
    System.out.println("");
}*/
    int[]arr={1,2,3,4,5};
    int l=arr.length;
    int n=Math.floorDiv(l,2);
    int temp;
      for(int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;
    }
    for(int element:arr){
        System.out.println(element);
    }
    }
}