package lab;
import java.sql.*;
import java.util.Scanner;

public class Home {

    public static void main(String args[]) {

        System.out.println("Welcome to University Management System");

        Scanner sc = new Scanner(System.in);
        lab.studentsignup stu = new lab.studentsignup();
        lab.studentlogin sl = new lab.studentlogin();

        int x=1;
        for (; x != 0; ) {
            System.out.println("Select, [1] Sign Up [2] Sign in");int selection = sc.nextInt();
            System.out.println("Please select your registration role [1] Student [2] lect");
            int s1 = sc.nextInt();
            if (selection == 1) {
                switch (s1) {
                    case 1:
                        stu.input();
                        stu.add();

                }
            } else
                switch (s1) {
                    case 1:
                        sl.input();
                        sl.retrieve();
                }
            System.out.println("if exit=0 or press any key"); x=sc.nextInt();
        }
    }
}
