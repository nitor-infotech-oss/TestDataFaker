import com.qa.*;

public class fakerUsage 
{
    public static void main(String[] args) {
        new fakerUsage().giveMeFakeData();
    }
    public void giveMeFakeData()
    {
        System.out.println("------------------General Fakers------------------");
        System.out.println("First Name: "+ new fakerClass().getFirstName());
        System.out.println("Last Name: "+ new fakerClass().getLastName());
        System.out.println("Email ID: "+ new fakerClass().getFakeEmailID());
        System.out.println("Mobile Number: "+ new fakerClass().getPhoneNumber());
        System.out.println("------------------Xpath Util------------------");
        System.out.println("Xpath utility: "+ new commonUtils().dynamicXpath("//div[text()='SampleXpath']", "SampleXpath", "ReplacedXpath"));
        System.out.println("------------------Date Utils------------------");
        System.out.println("Date in DD MM YY HM Format: "+ new dateUtils().getTodaysDateAndTime_ddMMMYYHM());
        System.out.println("Date in dd MMM YYYY Format: "+ new dateUtils().getTodaysDate_ddMMMYYYY());
        System.out.println("Date after next 5 days: "+ new dateUtils().getNextDate(5));
        System.out.println("Next 3rd Month: "+ new dateUtils().getNextMonths(3));
        System.out.println("Current year + 2: "+ new dateUtils().getNextYear(2));
    }
}