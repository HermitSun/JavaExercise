package test;

public class Exercise26 {
	public static void main(String[] args) {
		int[] sortedArray=new int[] {1,2,3,4};
		System.out.println(binarySearch(sortedArray,5));
	}
	public static int binarySearch(int[] sortedArray,int target) {
		int low = 0;
        int high = sortedArray.length - 1;
        while(low <= high)
        {
            int middle = (low + high) / 2;
            if(target == sortedArray[middle])
            {
                return middle;
            }
            if(target > sortedArray[middle])
            {
                low = middle + 1;
            }
            if(target < sortedArray[middle])
            {
                high = middle - 1;
            }
        }
        return -1;
	}
}
