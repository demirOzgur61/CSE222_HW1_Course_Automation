package com.hasanmen.cse222_HW1_131044009_2016;

import sun.plugin.dom.core.CoreConstants;

public class Main {
    public static void main(String... args) {

        try {
            Admin admin = null;

            AutomationSystem GTUStudentSystem = new AutomationSystem("Gebze Technical University Moodle System");
            User loginUser = GTUStudentSystem.login("hmenn", "hasan5669");


            if (loginUser instanceof Admin) {
                admin = (Admin) loginUser;
                System.out.println("->Admin Login to system.");
            }

            Course cse222 = new Course("CSE222");
            Course cse102 = new Course("CSE102");
            Course cse108 = new Course("CSE108");

            admin.addCourse(cse222);
            admin.addCourse(cse222); // wont add
            admin.addCourse(cse108);
            admin.addCourse(cse102);

            Student stdMercan = new Student("Mercan", "Karacabey", "mkrcby", "123", "mercankrcby@gmail.com", 131044009);
            Student stdGokce = new Student("Gokce", "Demir", "gokdemir", "123", "gdemir@gmail.com", 141044001);
            Student stdOsman = new Student("Osman", "Suzer", "osuzer", "123", "osuzer@gmail.com", 123456789);
            Student stdAliYasin = new Student("Ali Yasin", "ESER", "aliysn", "123", "aliyasineser@gmail.com", 141044058);

       /* admin.addStudent(stdMercan);
        admin.addStudent(stdGokce);
        admin.addStudent(stdOsman);
        admin.addStudent(stdAliYasin);*/

            Teacher tErdogan = new Teacher("Fatih Erdogan", "Sevilgen", "ferdogansev", "123", "ferdogan@gtu.edu.tr");
            Teacher tYSA = new Teacher("Yusuf Sinan", "Akgul", "ysakgul", "123", "ysa@gtu.edu.tr");
            Teacher tYGenc = new Teacher("Yakup", "Genc", "ygenc", "123", "ygenc@gtu.edu.tr");
            Teacher tFTektas = new Teacher("Furkan", "Tektas", "ftektas", "123", "ftektas@gtu.ed.tr");

            admin.addTeacher(cse222, tErdogan);
            admin.addTeacher(tFTektas);
            admin.addTeacher(cse102, tYGenc);
            admin.addTeacher(cse108, tFTektas);
            admin.addTeacher(cse102, tFTektas);

            System.out.println(GTUStudentSystem);
            //ftektas = null;

            loginUser = GTUStudentSystem.login(tErdogan.getUserName(), tErdogan.getPassWord());
            if (loginUser instanceof Teacher) {
                tErdogan = (Teacher) loginUser;
                System.out.println("-> " + tErdogan.getName() + " login the system.");
            }


        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("ARRAY INDEX OUT OF BOUND. BE CAREFULL \n PLEASE LOOK STACT TRACE !!!");
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void foo(){}

}
