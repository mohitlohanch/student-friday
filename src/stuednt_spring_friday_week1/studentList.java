
package stuednt_spring_friday_week1;

public class studentList {
    public static void main(String args[]) {
        student[] studentList = new student[3];
        student s1 = new student (1,"Mohit");
        student s2 = new student (1,"Lohanch");
        student s3 = new student (1,"xyz");
        
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        
        for(int i = 0; i<studentList.length;i++) {
            System.out.println(studentList[i].getStudentNum());
        }//endo for
    }
}
