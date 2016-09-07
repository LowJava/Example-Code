import java.util.*;
public class Simple_Calculator_3_3
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String input;
      double firstNum=1;
      double secondNum=1;
      double answer=0;
      char operation=' ';
      
		while(true)
      {
   		System.out.print("Enter an equation: (Enter 0 to end)");//Print prompt
   		firstNum	= console.nextDouble();	//take input
            if(firstNum == 0)
               break;
   		input	= console.next();
   		secondNum =	console.nextDouble();
   		
   		operation =	input.charAt(0);
   		
   		if(operation == '+'){
   			answer =	firstNum	+ secondNum;
            System.out.print(firstNum + " " + operation + " " + secondNum + " = " +	answer + "\n");//Print prompt
         }
   		else if(operation	==	'-'){
   			answer =	firstNum	- secondNum;
            System.out.print(firstNum + " " + operation + " " + secondNum + " = " +	answer + "\n");//Print prompt
         }
   		else if(operation	==	'/'){
   			answer =	firstNum	/ secondNum;
            System.out.print(firstNum + " " + operation + " " + secondNum + " = " +	answer + "\n");//Print prompt
         }
   		else if(operation	==	'*'){
   			answer =	firstNum	* secondNum;
            System.out.print(firstNum + " " + operation + " " + secondNum + " = " +	answer + "\n");//Print prompt
         }
   		else
   			System.out.print("You didn't enter a valid equation.\n");
   		
      }
   		System.out.print("Thank you, have a good day");//Print prompt
   		
   		
      
		
	}
	
}