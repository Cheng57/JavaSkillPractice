public class PhraseOMatic{
	public static void main(String[] args){
		// create three sets of Strings
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

		// obtain the length of each String array
		// array.length return the length of the array
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate a random number for the use of index in each String array
		// (int) convert double to int
		// Math.random() generate a random number
		int random1 = (int)(Math.random() * oneLength);
		int random2 = (int)(Math.random() * twoLength);
		int random3 = (int)(Math.random() * threeLength);

		// create a phrase
		String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}