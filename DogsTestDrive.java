class DogsTestDrive{
	public static void main(String[] args){
		Dogs d1 = new Dogs();
		d1.size = 70;

		Dogs d2 = new Dogs();
		d2.size = 8;

		Dogs d3 = new Dogs();
		d3.size = 35;

		d1.bark();
		d2.bark();
		d3.bark();
	}
}