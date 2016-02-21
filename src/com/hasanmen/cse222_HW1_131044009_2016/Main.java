package com.hasanmen.cse222_HW1_131044009_2016;



public class Main {
    public static void main(String... args){
        Admin admin=null;
        User user=null;


        AutomationSystem GTUStudentSystem = new AutomationSystem("Gebze Technical University Moodle System");
        User loginUser = GTUStudentSystem.login("hmenn","hasan5669");


        if(loginUser instanceof Admin ){
            admin = (Admin) loginUser;
        }

        admin.addCourse(new Course("CSE222"));
        admin.addStudent(new Student("Mercan","Karacabey","mkrcby","123","mercankrcby@gmail.com",131044009));

        admin.getAccessibleCourses().get(0).getCourseTeachers().add(new Teacher("Fatih Erdogan","Sevilgen","ferdogansev","123","ferdogan@gtu.edu.tr"));
        admin.getAccessibleCourses().get(0).getCourseTeachers().add(new Teacher("Yusuf Sinan","Akgul","ysakgul","123","ysa@gtu.edu.tr"));

        System.out.println(GTUStudentSystem);







    }

    public static void foo(){}
}
