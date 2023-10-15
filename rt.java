package Assignment_4;

public class rt {
    public static void main(String[] args) {
        int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (search < array[middle]){
			return binarySearchRecursive(search, array, start, middle - 1);
		}
		
		if (search > array[middle]){
			return binarySearchRecursive(search, array, middle + 1, end);
		}
		
		if (search == array[middle]){
			return middle;
		}
		
		return -1;
    }
}
