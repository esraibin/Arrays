package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students =new ArrayList<>(10);
        students.add(new Student(100,"Van",15));
        students.add(new Student(101,"Irvine",12));
        students.add(new Student(102,"Sam",8));
        students.add(new Student(103,"Betty",14));

        System.out.println("\n Sorted by Age");
        Collections.sort(students,new AgeSorting());
        for(Student st :students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
        System.out.println("\n Sorted by Id");
        Collections.sort(students, new IDSorting());
        for(Student st :students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
        System.out.println("\n Sorted by Name");
        Collections.sort(students, new NameSorting());
        for(Student st : students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
    }
}
