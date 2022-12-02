public class GoodStudent
{
private String firstname;
private String lastName;
private int number;
private double gpa;
private boolean csStudent;
private static int numStudents;
private String createID;

public GoodStudent(String myFirstName, String myLastName, int myNumber, double myGPA, boolean myCsStudent)
        {
        this.firstname = myFirstName;
        this.lastName = myLastName;
        this.number = myNumber;
        this.gpa = myGPA;
        this.csStudent = myCsStudent;
        numStudents++;
        }

public GoodStudent (String myLastName, String myFirstName, double myGPA, int myNumber, boolean myCsStudent)
        {
        firstname = myFirstName;
        lastName = myLastName;
        number = myNumber;
        gpa = myGPA;
        csStudent = myCsStudent;
        }

public String CreateID()
        {
        String loveFirstName = firstname.toLowerCase();
        return loveFirstName.substring(0,1) + lastName.toLowerCase() + number%1000;
        }

public double CSAGPA()
        {
        if(csStudent == true)
        {
        return gpa * .15 + gpa;
        }
        return gpa;
        }
public String getFirstName()
        {
        return firstname;
        }

public String getLastName()
        {
        return lastName;
        }

public boolean getcsStudent()
        {
        return csStudent;
        }

public int getNumber()
        {
        return number;
        }

public double getGPA()
        {
        return gpa;
        }

public void setNumber (int myNumber)
        {
        number = myNumber;
        }

public void setGPA (double myGPA)
        {
        gpa = myGPA;
        }

public String toString()
        {
        String output = "\n Students first name: " + firstname +
        "\n Last name: " + lastName + "\n Number: " + number + "\n GPA " + gpa + "\n and their CSA gpa: " + CSAGPA() + "\n CS STUDENT?: " + csStudent + "\n ID: " + CreateID();
        return output;
        }
        }
