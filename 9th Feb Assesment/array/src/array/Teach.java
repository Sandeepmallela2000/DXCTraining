package array;
class Teacher {
    private String teacherName;
    private String subject;
    private double salary;
    
    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }
    
    public String getTeacherName() {
        return teacherName;
    }
    public String getSubject() {
        return subject;
    }
    public double getSalary() {
        return salary;
    }
    
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Teach {
    public static void main(String[] args) {
        Teacher[] array = new Teacher[4];
        array[0] = new Teacher("Alex,", "Java Fundamentals,",1200L);
        array[1] = new Teacher("John,", "RDBMS,", 800L);
        array[2] = new Teacher("Sam,", "Networking,", 900L);
        array[3] = new Teacher("Maria,", "Python,", 900L);
        
        for (Teacher teacher : array)
        {
            System.out.print(" Name: " + teacher.getTeacherName());
            System.out.print(" Subject: " + teacher.getSubject());
            System.out.println(" Salary: " + teacher.getSalary());
        }
    }
}


