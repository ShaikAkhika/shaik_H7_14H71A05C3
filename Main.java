package studentalign;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
Student[] test = new Student[7];

        for(int i=0; i<7;i++)

        {

            Scanner kb = new Scanner(System.in);

            System.out.println("What is the Students name?: ");

            test[i].setName(kb.nextLine());

            System.out.println("What is the Students ID number?: ");
            test[i].setIdnum(kb.nextLine());

            System.out.println("What is the Students major?: ");

            test[i].setMajor(kb.nextLine());

           System.out.println("What is the Students anticipated year of " +

                    "graduation?: ");

            test[i].setGradDate(kb.nextLine());

            test[i].readGrades();

        }

        System.out.println("Name            " + "ID Number    "+
                "Major        "+ "Average");

        System.out.println("---------------------------------------------" +

                "--------");
        for(int x=0; x<7;x++)

        {

            System.out.print(test[x].mySetw(test[x].getName(), 15));

            System.out.print(test[x].mySetw(test[x].getIdnum(), 15));

            System.out.print(test[x].mySetw(test[x].getMajor(), 15));

            System.out.print(test[x].getAverage());

        }

    }

}

  

