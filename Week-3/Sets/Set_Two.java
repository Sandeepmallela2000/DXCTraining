package dxc_Next;

/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;

public class Set_Two {
public static void main(String[] args) {
if (args.length < 1) {
System.out.println("Usage: java Main a b c");
System.exit(1);
}
HashSet<String> names = new HashSet<>();
for (String filename : args) {
  try (Scanner scan = new Scanner(new File(filename))) {
    while (scan.hasNextLine()) {
      String name = scan.nextLine();
      names.add(name);
    }
  } catch (FileNotFoundException e) {
    System.out.println("File not found: " + filename);
    System.exit(1);
  }
}

TreeSet<String> sortedNames = new TreeSet<>(names);
for (String name : sortedNames) {
  System.out.println(name);
}
}
}*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Two
{
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter names of students (enter 'a' to quit):");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equals("a")) {
                break;
            }
            students.add(name);
        }

        Set<String> sortedStudents = new TreeSet<>(students);

        System.out.println("\nStudents who have attended the course:");
        for (String name : sortedStudents) {
            System.out.println(name);
        }
        System.out.println("\nTotal number of students: " + sortedStudents.size());
    }
}

