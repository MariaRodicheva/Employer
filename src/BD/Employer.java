package BD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employer {
    private int id;
    private static int globalId;
    private final LocalDate birthday;
    private String sex;
    private String post;
    private BigDecimal salary;
    private Set<String> skills;
    private final LocalDate dataOfStarts;
    private boolean fired;
    private List<Employer> employers;

    //public void FullName(String firstName, String lastName, String fatherName) {};

    public Employer(LocalDate birthday, LocalDate dataOfStarts) {
        this.id = globalId;
        globalId++;
        this.birthday = birthday;
        this.dataOfStarts = dataOfStarts;

    }

    public Employer(String fullName, LocalDate birthday, String sex, String post, BigDecimal salary, Set<String> skills, LocalDate dataOfStarts, boolean fired, LocalDate birthday1, LocalDate dataOfStarts1) {
        this.birthday = birthday1;
        this.dataOfStarts = dataOfStarts1;
    }

    public Employer() {
        this.birthday=getBirthday();
        this.dataOfStarts=getDataOfStarts();

    }

    public String getFirstName() {
        return getFirstName();
    }

    public String getLastName() {
        return FullName.getLastName();
    }
    public String getFatherName() {
        return FullName.getFatherName();
    }

    public String getFullName() {
        return FullName.getFullName();
    }

    public void addProduct(FullName fullName, LocalDate birthdayDate1, String sexMALE, String menagerie, BigDecimal valueOf, HashSet<String> skills1, LocalDate startDate1, boolean b) {
    }

    public List<Employer> getListSecondNameCount(int count) {
        List<Employer> tempList = new ArrayList<>();
        for (Employer w : employers) {
            if (w.getLastName().length() == count) {
                tempList.add(w);
            }
        }
        return tempList;
    }


    public enum Sex {
        MALE,

        FEMALE,

        UNDEFINED
    }

    public Employer(FullName fullName, LocalDate birthday,
                    String sex, String post, BigDecimal salary, Set<String> skills,
                    LocalDate dataOfStarts, boolean fired) {

        this.id = globalId;
        globalId++;
        this.birthday = birthday;
        this.sex=sex;
        this.post=post;

        if (salary.compareTo(BigDecimal.ZERO)==1)  this.salary = salary;
        else System.out.println("Ошибка введенной зарплаты");

        this.fired=fired;
        this.dataOfStarts = dataOfStarts;
        this.skills = skills;

    }

    public int getId() {
        return id;
    }

    //public void setBirthday(LocalDate birthday) { this.birthday=birthday; }
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setPost(String post) {
        String expression = "^[a-zA-Z\\s]+";
        if (post.matches(expression) == false) System.out.println("Ошибка введенной должности");
        else this.post=post;
    }

    public String getPost() {
        return post;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO)==1)  this.salary = salary;
        else System.out.println("Ошибка введенной зарплаты");
    }

    public BigDecimal getSalary() {
        return salary;
    }

    //public void setDataOfStarts() { this.DataOfStarts=DataOfStarts; }
    public LocalDate getDataOfStarts() {
        return dataOfStarts;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }

    public boolean getFired() {
        return fired;
    }

    public void setSkills(Set<String> skills) { this.skills=skills; }

    public Set<String> getSkills() {
        return skills;
    }

    public int workExperience(LocalDate DateOfStarts){
        LocalDate start = getDataOfStarts();
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);
        return period.getYears();
    }

    public int ageEmployee(LocalDate Birthday){
        LocalDate start = getBirthday();
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);
        return period.getYears();
    }





}