import java.util.Scanner;
public class Birthday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer, numP=0, days=366;
        double prob=1, inputP;
        
        do {
            do { 
                System.out.print("\nEnter a prob - at least 2 people share the same Bday:");
                inputP=input.nextDouble();
            } while(inputP<=0||inputP>=1.0);
            
            System.out.println("Calculation section:\n------------------");
            while(days>0) {
                numP++;
                prob *= days/365.0;
                System.out.println(days + " :" + prob);
                days--;
                if(1-prob>inputP)
                    break;
            }
            System.out.println("------------------");
            System.out.println(numP + " people are required");
            System.out.println("The prob that two or more have the same birthday is " + (1-prob));
            System.out.print("\nRun again? 1 for yes, any other number for no: ");
            answer=input.nextInt();
        } while(answer == 1);
    }
}
