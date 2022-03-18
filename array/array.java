public class array{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.printf("%s%8s%n", "Index", "Value");
		for (int i = 0; i < arr.length; i++){
			System.out.printf("%5d%8d%n", i, arr[i]);
		}
	}
}
