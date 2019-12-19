package lab;
import java.sql.*;
import java.util.Scanner;

public class studentsignup {

    String name, uname, pwd;
    int age, select;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to University Management System\n\n....\nStudent Registration");
        System.out.println("\nPlease Submit the following information,\nName: ");
        name = sc.next();
        System.out.println("Username: ");
        uname = sc.next();
        System.out.println("Password: ");
        pwd = sc.next();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Select Course Number from following list");
        System.out.println("[1] SENG 11111 - Introduction to Programming");
        System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
        System.out.println("[3] SENG 11113 - Data Structures and Algorithms");
        select = sc.nextInt();
    }

    public void add() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oop", "root", "tharun");

            Statement st = con.createStatement();
            PreparedStatement sts = con.prepareStatement("insert into memberdetail(Username,Name,Password,AGE)" +
                    "values(?,?,?,?)");
            sts.setString(1, uname);
            sts.setString(2, name);
            sts.setString(3, pwd);
            sts.setInt(4, age);
            sts.executeUpdate();

            PreparedStatement sts1 = con.prepareStatement("insert into coursetable(Username,Course_no)" +
                    "values(?,?)");
            sts1.setString(1,uname);
            sts1.setInt(2,select);
             sts1.executeUpdate();

            con.close();
            System.out.println("hi  " + name+"!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}






