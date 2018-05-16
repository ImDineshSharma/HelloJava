public class LoopApp{ // again this is our main class
 public static void main (String[] args){ // just a main method
   int x = 4; // we declare the integer type variable "x" and assigned it the value 4
  System.out.println("This is before the loop");
  while ( x < 10 ){
   System.out.println("This is less than 10");
  }
  x = x + 1; // this means that when command hits run, the compiler looks for the count in this case it adds 1 to the value(whatever
  //value it is that is less than 10), this also descides the direction the loop will go
 } 
}

// one important thing i forgot to metion in previous exmaples is that every statement in java program ends with semicolon ";"
