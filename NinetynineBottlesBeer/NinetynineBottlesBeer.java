public class NinetynineBottlesBeer{
	public static void main(String[] args){
		int num = 99;
		String word = "bottles";

		while (num > 0){
			if (num == 1){
				word = "bottle";
			}

			System.out.print(num + " " + word + " of beer on the wall, ");
			System.out.println(num + " " + word + " of beer.");
			System.out.print("Take one down and pass it around, ");

			num = num - 1;

			if (num > 1){
				System.out.println(num + " " + word + " of beer on the wall.");
				System.out.println();
			}
			else if(num == 1){
				word = "bottle";
				System.out.println(num + " " + word + " of beer on the wall.");
				System.out.println();
			}
			else{
				System.out.println("No more bottles of beer on the wall.");
			}
		}
	}
}