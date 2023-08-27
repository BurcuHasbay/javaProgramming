package day31_Constructors;

public class Offer {

    public String location;
    public String companyNum;
    public String jobTitle;

    public void setInfo (String location, String companyNum, String jobTitle, double salary, boolean hasTPO, boolean isWTF, boolean isFullTime) {
        this.location = location;
        this.companyNum = companyNum;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasTPO = hasTPO;
        this.isWTF = isWTF;
        this.isFullTime = isFullTime;
    }

    public double salary;
    public boolean hasTPO;
    public boolean isWTF;
    public boolean isFullTime;

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyNum='" + companyNum + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasTPO=" + hasTPO +
                ", isWTF=" + isWTF +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
