public class WhileLoopApp{
 public static void main(String[] args){
  int x = 1;
  System.out.println("This is Before the Loop");
  while (x < 10){
   System.out.println("In the Loop");
   System.out.println("Value of x is " + x);
   x = x + 1;
  }
  System.out.println("This is After the Loop, It ends here");
 }
}