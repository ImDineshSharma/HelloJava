public class PhraseOMaticApp{
 public static void main(String[] args){
  // Make theree sets of words to choose from. Add your own!

  String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "dynamic"};
  
  String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "focused"};

  String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "software", "engineer", "mission"};

  // find out how many words are in each list
  int oneLength = wordListOne.length;
  int twoLength = wordListTwo.length;
  int threeLength = wordListThree.length;

 // generate three random numbers
  int rand1 = (int) (Math.random() * oneLength);
  int rand2 = (int) (Math.random() * twoLength);
  int rand3 = (int) (Math.random() * threeLength);

 // now build a phrase
  String phrase = wordListOne[rand1] + " " +
  wordListTwo[rand2] + " " + wordListThree[rand3];

 // print out the phrase

  System.out.println("What we need is a " + phrase);
 }
}