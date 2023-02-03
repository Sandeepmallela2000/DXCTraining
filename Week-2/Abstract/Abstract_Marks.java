package dxc_Next;

abstract class Student{

private String studentName;
private int[] testScores = new int[4];

public Student(String studentName)
{
    this.studentName = studentName;
}

public void setTestScore(int testNumber, int testScore)
{
    testScores[testNumber] = testScore;
}

public String getStudentName()
{
    return studentName;
}

public int[] getTestScores()
{
    return testScores;
}

public abstract void generateResult();
}

class UndergraduateStudent extends Student
{
private String testResult;

public UndergraduateStudent(String studentName)
{
    super(studentName);
}

public void generateResult()
{
    int total = 0;
    int[] scores = getTestScores();
    for(int i = 0; i < scores.length; i++)
    {
        total = total + scores[i];
    }
    int avg = total / scores.length;
    if(avg >= 60)
    {
        testResult = "PASS";
    }
    else
    {
        testResult = "FAIL";
    }
}

public String getTestResult(){
    return testResult;
}
}

class GraduateStudent extends Student
{
private String testResult;

public GraduateStudent(String studentName)
{
    super(studentName);
}

public void generateResult()
{
    int total = 0;
    int[] scores = getTestScores();
    for(int i = 0; i < scores.length; i++)
    {
        total = total + scores[i];
    }
    int avg = total / scores.length;
    if(avg >= 70)
    {
        testResult = "PASS";
    }
    else
    {
        testResult = "FAIL";
    }
}

public String getTestResult()
{
    return testResult;
}
}


 class Abstract_Marks {
	 public static void main(String[] args)
	    {
	        UndergraduateStudent u = new UndergraduateStudent("Philip");
	        u.setTestScore(0, 70);
	        u.setTestScore(1, 69);
	        u.setTestScore(2, 71);
	        u.setTestScore(3, 55);
	        u.generateResult();
	        System.out.println("Student name: "+u.getStudentName());
	        System.out.println("Result: "+u.getTestResult());

	        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
	        graduateStudent.setTestScore(0, 70);
	        graduateStudent.setTestScore(1, 69);
	        graduateStudent.setTestScore(2, 71);
	        graduateStudent.setTestScore(3, 55);
	        graduateStudent.generateResult();
	        System.out.println("Student name: "+graduateStudent.getStudentName());
	        System.out.println("Result: "+graduateStudent.getTestResult());
	    }
	}



