import java.util.*;
class Student {
    int id;
    String fname;
    double cgpa;
    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, fname, cgpa));
        }
      Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (Double.compare(b.cgpa, a.cgpa) != 0) {
                    return Double.compare(b.cgpa, a.cgpa); 
                } else if (!a.fname.equals(b.fname)) {
                    return a.fname.compareTo(b.fname); 
                } else {
                    return a.id - b.id; // ID ascending
                }
            }
        });
        for (Student s : studentList) {
            System.out.println(s.getFname());
        }
    }
}
