import java.util.*;
public class SortingList{
	public static void main(String[] args){
		int[] list = {1, 8, 5, 3, 9, 4, 1};
		int i = 0;
		int temp;

		while (i < list.length - 1){
			int j = 0;

			while (j < list.length - 1 - i){
				if (list[j + 1] < list[j]){
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}

				j++;
			}

			i++;
			System.out.println(Arrays.toString(list));
		}

		//System.out.println(Arrays.toString(list));
	}
}