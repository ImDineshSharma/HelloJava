/* This is just a little piece of program
that  uses the while loop to perfrom the instructions we gave it.
In this case, let me explain it right in front of the line of the code

*/

public class ShuffleApp{
 public static void main(String[] args){
  int x = 3; // An integer type variable "x" has the value "3"
  while(x > 0){ // this is our condition for looping, here we said that keep looping while x is greater than 0
   if (x == 1){ // this is another condition that says print "d" if x is 1, same thing follows for all statments
     System.out.print("d");}
   if (x == 2){
     System.out.print("b c");}
   if (x > 2){
     System.out.print("a");}
  System.out.print("-");
  x = x - 1; 
  }
 }
}
