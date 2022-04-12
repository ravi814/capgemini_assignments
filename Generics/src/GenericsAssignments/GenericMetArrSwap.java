package GenericsAssignments;

public class GenericMetArrSwap {
	public static <T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {1,2,3,4,5};
		swap(arr,3,4);
		for(Integer i: arr) {
			System.out.println(i +",");
		}
		

	}

}
