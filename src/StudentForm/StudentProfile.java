package StudentForm;

public class StudentProfile
{
    private String fullName;
    private String TUIdNumber;
    private String email;
    private int phoneNumber;
    private String major;
    private String exGradDate;
    private String isStudentAnUndergraduate;


    /*CONSTRUCTOR*/
    public StudentProfile(String fullName, String TUIdNumber, String email, int phoneNumber, String major, String exGradDate, String isStudentAnUndergraduate) {
        this.fullName = fullName;
        this.TUIdNumber = TUIdNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.exGradDate = exGradDate;
        this.isStudentAnUndergraduate = isStudentAnUndergraduate;
    }

    /*SETTERS*/
    public String getFullName() {
        return fullName;
    }

    public String getTUIdNumber() {
        return TUIdNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public String getExGradDate() {
        return exGradDate;
    }

    public String isStudentAnUndergraduate() {
        return isStudentAnUndergraduate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTUIdNumber(String TUIdNumber) {
        this.TUIdNumber = TUIdNumber;
    }

    /*SETTERS*/
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setExGradDate(String exGradDate) {
        this.exGradDate = exGradDate;
    }

    public void setStudentAnUndergraduate(String studentAnUndergraduate) {
        isStudentAnUndergraduate = studentAnUndergraduate;
    }

    @Override
    public String toString() {
        String convert = " \n"+"StudentProfile\n"+
                "\n"+"Full Name = " + fullName  +
                "\n"+"TUIdNumber = " + TUIdNumber +
                "\n"+"Email = " + email  +
                "\n"+"Phone Number = " + phoneNumber +
                "\n"+"Major = " + major  +
                "\n"+"Expected Graduating Date = " + exGradDate +
                "\n"+"Is Student An Undergraduate = " + isStudentAnUndergraduate+"\n"
                ;
        return convert;
    }
}
