import org.testng.annotations.Test;
import com.qa.*;

public class Main 
{
    @Test
    public void giveMeFakeData(){
        System.out.println("------------------General Fakers------------------");
        System.out.println("First Name: "+ new FakerClass().getFirstName());
        System.out.println("Last Name: "+ new FakerClass().getLastName());
        System.out.println("Email ID: "+ new FakerClass().getFakeEmailID());
        System.out.println("Mobile Number: "+ new FakerClass().getPhoneNumber());
        System.out.println("Minor Birth Date: "+ new FakerClass().getFakeBirthdayMinor());
        System.out.println("Adult Birth Date: "+ new FakerClass().getFakeBirthdayAdult());
        System.out.println("Senior Citizen Birth Date: "+ new FakerClass().getFakeBirthdaySeniorCitizen());

        System.out.println("------------------Xpath Util------------------");
        System.out.println("Xpath utility: "+ new CommonUtils().dynamicXpath("//div[text()='SampleXpath']", "SampleXpath", "ReplacedXpath"));
        
        System.out.println("------------------Date Utils------------------");
        System.out.println("Date in DD MM YY HM Format: "+ new DateUtils().getTodaysDateAndTime_ddMMMYYHM());
        System.out.println("Date in dd MMM YYYY Format: "+ new DateUtils().getTodaysDate_ddMMMYYYY());
        System.out.println("Date after next 5 days: "+ new DateUtils().getNextDate(5));
        System.out.println("Next 3rd Month: "+ new DateUtils().getNextMonths(3));
        System.out.println("Current year + 2: "+ new DateUtils().getNextYear(2));
        System.out.println("Date: "+ new DateUtils().getTodaysDate_MMddYYYY());
    }
}