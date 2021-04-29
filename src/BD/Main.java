package BD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] argv){
        List<Employer> employers = new ArrayList<Employer>();
        String sexMALE = Employer.Sex.MALE.toString();
        String sexFEMALE = Employer.Sex.FEMALE.toString();

        //Employer.Sex sexUNDEFINED = Employer.Sex.UNDEFINED;

        LocalDate birthdayDate1 = LocalDate.of(1989, Month.NOVEMBER, 10);
        LocalDate startDate1 = LocalDate.of(2015, Month.SEPTEMBER, 18);

        HashSet<String> skills1 = new HashSet<String>();
        skills1.add("Exel C++");


        /*Employer emp1= new Employer(fullName1, birthdayDate1,
                sexMALE.toString(), "menagerie", 70000, skills1, startDate1, true);*/


        LocalDate birthdayDate2 = LocalDate.of(1968, Month.APRIL, 20);
        LocalDate startDate2 = LocalDate.of(2010, Month.OCTOBER, 14);
        HashSet<String> skills2 = new HashSet<String>();
        skills2.add("SQL Java English");

        List<Employer> employers1 = new ArrayList<Employer>();
        BD.Employer e1 = new Employer();
        BD.Employer e2 = new Employer();
        e1.addProduct(new FullName("Elena", "Ivanova", "Vara"), birthdayDate1,
                sexMALE, "Menagerie", BigDecimal.valueOf(70000), skills1, startDate1, true);
        e2= (Employer) e2.getListSecondNameCount( 0);
    }
}
