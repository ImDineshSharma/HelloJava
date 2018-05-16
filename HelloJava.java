// Welcome
// You see the line "public class HelloJava"
// This is the main class of this program with the name HelloJava, Every Program in must have atleast one main class
// let me explain other things below

public class HelloJava{
 // This is our main method like a main class every program in java must contain a main method,
 // a java program could have so many methods but in
 // order to run a program it must have a main method
 public static void main (String[] args){ 
  // here we have assigned the value "1" to integer type varibale name "x"
  int x = 1;
  // here we are telling the computer to print "Before the loop"
  System.out.println("Before the loop");
  // we are using a while loop here
  // we are telling the computer that keep looping until a criteria matches the condition, in this case its' "x < 4"
  while (x < 4){
   System.out.println("In the loop");
   System.out.println("Value of x is " + x);
    x = x + 1;
  }
  System.out.println("This is after the loop");
 }
}
// if you have anything you wanna share about this code, please feel free to do so in the comments section
