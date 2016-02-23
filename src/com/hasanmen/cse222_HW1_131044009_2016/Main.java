package com.hasanmen.cse222_HW1_131044009_2016;


public class Main {
    public static void main(String... args) {

        try {

            // SCENARIO ONE ADD CREATE TEACHER
            AutomationSystem GTUStudentSystem = new AutomationSystem("Gebze Technical University Moodle System");
            Admin admin = null;

            Student stdMercan = new Student("Mercan", "Karacabey", "mkrcby", "123", "mercankrcby@gmail.com", 131044009);
            Student stdGokce = new Student("Gokce", "Demir", "gokdemir", "123", "gdemir@gmail.com", 141044001);
            Student stdOsman = new Student("Osman", "Suzer", "osuzer", "123", "osuzer@gmail.com", 123456789);
            Student stdAliYasin = new Student("Ali Yasin", "ESER", "aliysn", "123", "aliyasineser@gmail.com", 141044058);

            Teacher tErdogan = new Teacher("Fatih Erdogan", "Sevilgen", "ferdogansev", "123", "ferdogan@gtu.edu.tr");
            Teacher tYGenc = new Teacher("Yakup", "Genc", "ygenc", "123", "ygenc@gtu.edu.tr");
            Teacher tFTektas = new Teacher("Furkan", "Tektas", "ftektas", "123", "ftektas@gtu.ed.tr");



            User loginUser = GTUStudentSystem.login("hmenn", "hasan5669");


            if (loginUser instanceof Admin) {
                admin = (Admin) loginUser;
                System.out.println("-->Admin Login to system.");
            }

            loginUser = GTUStudentSystem.login(tErdogan.getUserName(), tErdogan.getPassWord());
            if (loginUser instanceof Teacher) {
                tErdogan = (Teacher) loginUser;
                System.out.println("--> " + tErdogan.getName() + " login the system.");
            }

            loginUser = GTUStudentSystem.login(stdMercan.getUserName(), stdMercan.getPassWord());
            if (loginUser instanceof Student) {
                stdMercan = (Student) loginUser;
                System.out.println("--> " + stdMercan.getName() + " login the system.");
            }

            loginUser = GTUStudentSystem.login(stdAliYasin.getUserName(), stdAliYasin.getPassWord());
            if (loginUser instanceof Student) {
                stdAliYasin = (Student) loginUser;
                System.out.println("--> " + stdAliYasin.getName() + " login the system.");
            }

            Course cse222 = new Course("CSE222");
            Course cse102 = new Course("CSE102");
            Course cse108 = new Course("CSE108");

            // Add independent copy of courses
            admin.addCourse(cse222);
            admin.addCourse(cse222); // wont add
            admin.addCourse(cse108);
            admin.addCourse(cse102);




            admin.addStudent(stdMercan);
            admin.addStudent(stdGokce);
            admin.addStudent(stdOsman);
            admin.addStudent(stdAliYasin);



            admin.addTeacher(cse222, tErdogan);
            admin.addTeacher(tFTektas);
            admin.addTeacher(cse102, tYGenc);
            admin.addTeacher(cse102, tYGenc);
            admin.addTeacher(cse108, tFTektas);
            admin.addTeacher(cse102, tFTektas);



            System.out.println(GTUStudentSystem);





            stdMercan.enrolCourse(cse222);
            stdAliYasin.enrolCourse(cse222);

            System.out.println(cse222+ " ENROLMENTS : " );
            System.out.print(tErdogan.showEnrolments(cse222));
            System.out.println(cse222 + "BEFORE TEACHER ACCEPT STUDENTS");
            System.out.print(tErdogan.showCourseStudents(cse222));

            stdMercan.unEnrolCourse(cse222);

            tErdogan.acceptEnrolment(cse222,stdMercan);
            tErdogan.acceptEnrolment(cse222,stdAliYasin);
            System.out.println(cse222 +" AFTER TEACHER ACCEPT ENROLMENTS ");
            System.out.print(tErdogan.showEnrolments(cse222));
            System.out.println(cse222 + "AFTER TEACHER ACCEPT STUDENTS");
            System.out.print(tErdogan.showCourseStudents(cse222));


            tErdogan.addCourseItem(cse222,new Book("Java Programming","Koffman","2015",50));
            tErdogan.addCourseItem(cse222,new Book("Effective Java","hmenn","2011",25));
            tErdogan.addCourseItem(cse222,new URL("GTU","www.gtu.edu.tr"));
            System.out.println(tErdogan.showCourseItems(cse222));


        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ARRAY INDEX OUT OF BOUND. BE CAREFULL \n PLEASE LOOK STACT TRACE !!!");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
