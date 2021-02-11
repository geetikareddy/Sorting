public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int[] {100,25,75,50,125};
		bubble (Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
			}
		} 
	private static void bubble (int[] Array) {
		int N = Array.length;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			for(int j = 1; j < (N-i); j++) { 
		 if (Array[j-1] > Array[j]) {
			 temp = Array[j-1];
			 Array[j-1] = Array[j];
			 Array[j] = temp;
			 }
		 }
			}
		}
	}