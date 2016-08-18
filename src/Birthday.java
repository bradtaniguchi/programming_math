import java.util.Scanner;
public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
int answer, numP, days;
double prob, inputP;

do{
	
	do{
		
		System.out.print("\nEnter a prob - at least 2 people share the same Bday:");
		inputP=input.nextDouble();
	}while(inputP<=0||inputP>=1.0);
	
	numP=0; days =366; prob=1;
	for(;days>0;){
		numP++;
		days--;
		prob*=days/365.0;
		
		if(1-prob>inputP)
			break;
	}
	System.out.println(numP+" people are required");
	System.out.println("The prob that two or more have the same birthday is "+(1-prob));
	System.out.print("\nRun again? 1 for yes, any other number for no: ");
	answer=input.nextInt();
}while(answer==1);
		
	}

}
