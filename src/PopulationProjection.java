import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        int currentpop =312032486;
        //every 45 seconds there is a net population increase of ~4 people
        //45 secs there is +1 immigrant, -3.46 Deaths, +6.43 Births. giving us a net increase of ~4 people per 45secs
        //31536000/45= 70,080... then 70,080 * 4. Giving us a total of ~280320 population increase a year
        int growth = 280320;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years ");
        int years = input.nextInt();
        int increase = years*growth;
        int total= currentpop+increase;
        System.out.println("The total population in "+years+" years is "+total);
    }
}
