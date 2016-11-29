
public class TestArrays {
	public static void main(String[] args){
		int[] array1;
		int[] array2;
		array1 = new int[15];
		for (int i = 0; i < array1.length; i++) 
		    array1[i] = ((int)(Math.random() * 15) - 13);
		printArray(array1);
		
		array2=array1;
		for (int j=0; j<array2.length; j++)
			if (j%2 == 0)
				array2[j] = j;
		System.out.println();
		printArray(array1);
	}
		public static void printArray (int[] array){
			for (int i=0; i<array.length; i++)
				System.out.print("\t" + array[i]);
		}
	}


