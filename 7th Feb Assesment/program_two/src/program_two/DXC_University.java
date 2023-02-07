package program_two;
class CourseRegistration {
	  private int qualifyingMarks;
	  private int courseId;
	  private double courseFee;
	  private double discount;

	  public int getQualifyingMarks() {
	    return qualifyingMarks;
	  }

	  public void setQualifyingMarks(int qualifyingMarks) {
	    this.qualifyingMarks = qualifyingMarks;
	  }

	  public int getCourseId() {
	    return courseId;
	  }

	  public void setCourseId(int courseId) {
	    this.courseId = courseId;
	  }

	  public double getCourseFee() {
	    return courseFee;
	  }

	  public void setCourseFee(double courseFee) {
	    this.courseFee = courseFee;
	  }

	  public double getDiscount() {
	    return discount;
	  }

	  public void setDiscount(double discount) {
	    this.discount = discount;
	  }

	  public boolean validateMarks() {
	    if (qualifyingMarks >= 65 && qualifyingMarks <= 100) {
	      return true;
	    } else {
	      System.out.println("Invalid marks, should be in the range of 65 to 100");
	      return false;
	    }
	  }

	  public boolean validateCourseId() {
	    if (courseId >= 1001 && courseId <= 1005) {
	      return true;
	    } else {
	      System.out.println("Invalid course id, should be in the range of 1001 to 1005");
	      return false;
	    }
	  }

	  public void calculateCourseFee() {
	    if (validateMarks() && validateCourseId()) {
	      switch (courseId) {
	        case 1001:
	          courseFee = 55000.0;
	          break;
	        case 1002:
	          courseFee = 35675.0;
	          break;
	        case 1003:
	          courseFee = 28300.0;
	          break;
	        case 1004:
	          courseFee = 22350.0;
	          break;
	        case 1005:
	          courseFee = 150000.0;
	          break;
	      }
	      if (qualifyingMarks >= 80) {
	        discount = 0.05 * courseFee;
	      } else if (qualifyingMarks >= 70) {
	        discount = 0.10 * courseFee;
	      } else if (qualifyingMarks >= 65) {
	        discount = 0.15 * courseFee;
	      }
	      
	    	  
	      courseFee -= discount;
	    }
	  }
	}

	public class DXC_University {
	  public static void main(String[] args) {
	    CourseRegistration cr = new CourseRegistration();
	    cr.setQualifyingMarks(75);
	    cr.setCourseId(1002);
	    cr.calculateCourseFee();
	      System.out.println("Qualifying marks: " + cr.getQualifyingMarks());
	      System.out.println("Course id: " + cr.getCourseId());
	      System.out.println("Discount: " + cr.getDiscount());
	      System.out.println("Course fee: " + cr.getCourseFee());
	       if (cr.validateMarks() && cr.validateCourseId()) {
	       System.out.println(" Eligible for admission");
	    }
	    else
	    {
	    System.out.println("not eligible for admission");
	  }
	}
	}
	


/*class CourseRegistration 
{

	  private int studentId;
	  private int qualifyingMarks;
	  private int courseId;
	  private double courseFee;

	  public  CourseRegistration(int studentId, int qualifyingMarks, int courseId)
	  {
	    this.studentId = studentId;
	    this.qualifyingMarks = qualifyingMarks;
	    this.courseId = courseId;
	  }

	  public boolean validateMarks()
	  {
	    if (qualifyingMarks >= 65 && qualifyingMarks <= 100) {
	      return true;
	    }
	    return false;
	  }

	  public boolean validateCourseId()
	  {
	    if (courseId >= 1001 && courseId <= 1005) {
	      return true;
	    }
	    return false;
	  }

	  public double calculateCourseFee(double baseFee) 
	  {
	    if (qualifyingMarks >= 85) 
	    {
	      courseFee = baseFee - (baseFee * 0.15);
	    }
	    else if (qualifyingMarks >= 70 && qualifyingMarks < 84)
	    {
	      courseFee = baseFee - (baseFee * 0.1);
	    } 
	    else if (qualifyingMarks >= 65 && qualifyingMarks<69)
	    {
	      courseFee = baseFee - (baseFee * 0.05);
	    } 
	    else 
	    {
	      courseFee = baseFee;
	    }
	    return courseFee;
	  }

	  public int getStudentId()
	  {
	    return studentId;
	  }

	  public int getQualifyingMarks()
	  {
	    return qualifyingMarks;
	  }

	  public int getCourseId()
	  {
	    return courseId;
	  }

	  public double getCourseFee() 
	  {
	    return courseFee;
	  }
	}

public class DXC_University 
{
	  public static void main(String[] args)
	  {
	    CourseRegistration cr1 = new CourseRegistration(1001, 65, 1002);
	    CourseRegistration cr2 = new CourseRegistration(1002, 71, 1004);
	    CourseRegistration cr3 = new CourseRegistration(1003, 86, 1003);

	    double baseFee = 50000;

	    if (cr1.validateMarks() && cr1.validateCourseId())
	    {
	      System.out.println("Student ID: " + cr1.getStudentId());
	      System.out.println("Qualifying Marks: " + cr1.getQualifyingMarks());
	      System.out.println("Course ID: " + cr1.getCourseId());
	      System.out.println("Course Fee: " + cr1.calculateCourseFee(baseFee));
	      System.out.println();
	    }
	    else 
	    {
	      System.out.println("Admission Denied");
	      System.out.println();
	    }
	    
	    
}
	}*/

