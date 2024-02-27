package architecture1;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
        System.out.println(name + " has enrolled in " + course);
    }

    public void dropCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(name + " has dropped " + course);
        } else {
            System.out.println(name + " is not enrolled in " + course);
        }
    }

    public void viewCourses() {
        if (!courses.isEmpty()) {
            System.out.println(name + "'s enrolled courses:");
            for (String course : courses) {
                System.out.println(course);
            }
        } else {
            System.out.println(name + " is not enrolled in any courses");
        }
    }
}

public class lab2 {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Enroll students in courses
        student1.enrollCourse("Math");
        student1.enrollCourse("Physics");
        student2.enrollCourse("Biology");

        // View enrolled courses
        student1.viewCourses();
        student2.viewCourses();

        // Drop a course
        student1.dropCourse("Math");

        // View updated enrolled courses
        student1.viewCourses();
    }
}

