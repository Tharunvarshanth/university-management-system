package lab;
import java.util.*;
import java.sql.*;
public class studentlogin {
     String uname,pw;
    public void input(){
        System.out.println("Student Login Form\nUsername: ");
        Scanner sc = new Scanner(System.in);
        uname = sc.next();
        System.out.println("Password: ");
        pw= sc.next();
    }
    public void retrieve(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oop", "root", "tharun"
            );
            String sql = "SELECT memberdetail.Username,memberdetail.Password  FROM memberdetail ";
            String Name = null;
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            String sql1 = "SELECT Username,course_no FROM coursetable ";
            PreparedStatement st1 = con.prepareStatement(sql1);
            ResultSet rs1 = st1.executeQuery();

            while(rs.next()){
                String x=rs.getString(2);
                Name = rs.getString(1);

                if(uname.equals(Name)&&pw.equals(x)) {
                    while (rs1.next()) {
                        String y = rs1.getString(1);
                        if (uname.equals(y)) {
                            lab.course c1=new  lab.course(rs1.getInt(2));
                            System.out.println(Name + " ");
                        }
                    }
                }
            }

    }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
}

}
