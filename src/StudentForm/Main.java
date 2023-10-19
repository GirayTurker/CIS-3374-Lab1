//@author Giray Turker
package StudentForm;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner kb = new Scanner (System.in);
        boolean b=true;
        long i;
        int j =9;


        do {

            System.out.print ("\nDo you want to add a New Student? Press 'Y' for yes 'N' for no : ");
            String newStudent;
            newStudent = kb.next ();

            if ("Y".equalsIgnoreCase (newStudent) || "y".equalsIgnoreCase (newStudent)){

                System.out.print ("Student Full Name: ");
                String fullName = kb.next ();
                String TUIdNumber;


                do {

                    System.out.print ("Enter 9 Digit Student TU id: ");
                    TUIdNumber =kb.next ();

                    try {
                        i= Long.parseLong (TUIdNumber);
                    }
                    catch (NumberFormatException e){
                        System.out.println(TUIdNumber +" is not an integer");
                        b=false;
                    }


                    if (TUIdNumber.length ()>j){
                        System.out.println ("The Student TU id number is more than 9 digit");
                        b=false;
                    }

                    else if (TUIdNumber.length () <j ){

                        System.out.println ("The Student TU id number is less than 9 digit");
                        b=false;
                    }

                    else {
                        b=true;
                        break;
                    }

                }while (b=true);

                System.out.print ("Student Email: ");
                String email = kb.next ();
                System.out.print ("Student Phone Number: ");
                int phoneNumber = kb.nextInt ();
                System.out.print ("Student Major: ");
                String major = kb.next ();
                System.out.print ("Enter Expected Graduation Date: ");
                String exGradDate = kb.next ();
                String isStudentAnUndergraduate;



                do {

                    System.out.print ("Is the Student an Undergraduate? Yes for 'Y' No for 'N': ");
                    isStudentAnUndergraduate = kb.next ();

                    if ("Y".equalsIgnoreCase (isStudentAnUndergraduate)  || "y".equalsIgnoreCase (isStudentAnUndergraduate)) {
                        //System.out.println ("The Student Undergraduate");
                        isStudentAnUndergraduate =" Yes";
                        b=true;
                        break;
                    }

                    else if ("N".equalsIgnoreCase (isStudentAnUndergraduate)  || "n".equalsIgnoreCase (isStudentAnUndergraduate)) {
                        //System.out.println ("The Student is NOT Undergraduate");
                        isStudentAnUndergraduate = " No";
                        b=true;
                        break;
                    }

                    else {

                        b=false;
                        System.out.println ("Enter the Correct character");

                    }

                }while (b=true);


                StudentProfile StudentProfile1 = new StudentProfile (fullName, TUIdNumber, email, phoneNumber, major, exGradDate, isStudentAnUndergraduate);

                System.out.println (StudentProfile1);

                writeString (StudentProfile1);

            }

            else {
                b=false;
                System.out.println ("Exit from Program");
                System.exit (0);
            }

        }while (b=true);

    }


    public static void writeString(StudentProfile SP1) throws IOException {
        Path fileName = Path.of ("StudentsProfile.txt");
        Files.writeString (fileName, SP1.toString () );
    }

}


