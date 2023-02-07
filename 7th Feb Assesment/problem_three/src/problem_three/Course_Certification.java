package problem_three;


interface Certificate 
{
int fees =0;

double calculateFee(int admissionTestMarks);
}


abstract class RRTechnicalCertification implements Certificate
{
private static int regId = 1000;
private String studentName;
private String courseName;
private int admissionTestMarks;

RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks)
{
this.studentName = studentName;
this.courseName = courseName;
this.admissionTestMarks = admissionTestMarks;
}


int generateRegistrationId()
{
regId++;
return regId;
}


public String getStudentName() 
{
return studentName;
}

public String getCourseName()
{
return courseName;
}

public int getAdmissionTestMarks()
{
return admissionTestMarks;
}


public double calculateFee(int admissionTestMarks)
{
int discount = 0;
if (admissionTestMarks >= 90)
{
discount = 10;
} 
else if (admissionTestMarks >= 75 && admissionTestMarks <= 89) 
{
discount = 5;
}

return fees - (fees * discount) / 100;
}
}

class RegularCourseCertification extends RRTechnicalCertification
{
private int courseDuration;

RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) 
{
super(studentName, courseName, admissionTestMarks);
this.courseDuration = courseDuration;
}


public int getCourseDuration() {
return courseDuration;
}

public double calculateFee(int admissionTestMarks)
{
int discount = 0;
if (admissionTestMarks >= 90) 
{
discount = 10;
} 
else if (admissionTestMarks >= 75 && admissionTestMarks <= 89) 
{
discount = 5;
}

return fees - (fees * discount) / 100;
}
}

class CrashCourseCertification extends RRTechnicalCertification 
{
private static final int fees = 5000;

CrashCourseCertification(String studentName, String courseName, int admissionTestMarks)
{
super(studentName, courseName, admissionTestMarks);
}


public double calculateFee(int admissionTestMarks)
{
int discount = 0;
if (admissionTestMarks >= 90)
{
discount = 10;
}
else if (admissionTestMarks >= 75 && admissionTestMarks <= 89)
{
discount = 5;
}

double discountedFee = fees - (fees * discount) / 100;
return discountedFee + (discountedFee * 12.36) / 100;
}
}

public class Course_Certification
{
    public static void main(String[] args)
    {
       
        RegularCourseCertification regularCourse = new RegularCourseCertification("Rakesh", "J2EE", 5, 85);
        System.out.println("1. Regular Course Registration Details");
        System.out.println("3. Student Name : " + regularCourse.getStudentName());
        System.out.println("4. Course Name : " + regularCourse.getCourseName());
        System.out.println("5. Course Duration : " + regularCourse.getCourseDuration() + " months");
        System.out.println("6. Registration ID : " + regularCourse.generateRegistrationId());
        
        CrashCourseCertification crashCourse = new CrashCourseCertification("Roshan", "Angular", 71);
        System.out.println("\n1. Crash Course Registration Details");
        System.out.println("3. Student Name : " + crashCourse.getStudentName());
        System.out.println("4. Course Name : " + crashCourse.getCourseName());
        System.out.println("5. Registration ID : " + crashCourse.generateRegistrationId());
        System.out.println("6. Fees : " + crashCourse.calculateFee(0));
    }
}
