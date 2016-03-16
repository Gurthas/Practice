package com.firstweb;
import java.sql.*;

public class JdbcConnection
{
	private static String userName;
    private static String password;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static boolean validate()
    {
        String url = "jdbc:mysql://localhost:3306/testmy1";
        String user= "root";
        String dbpassword = "123456";
        boolean result = false;
        
        try {
             String driver ="com.mysql.jdbc.Driver";
             Class.forName(driver);
             Connection  con = DriverManager.getConnection(url,user,dbpassword);
             
            if(con==null){
                System.out.println("can't open DBConnection");
            }
            
            String sql = "select * from users";
            
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            //System.out.println(sql);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                System.out.println("�ű���");
                result=true;
                
            }
            else
            {
                System.out.println("Failed");
                result=false;
            }
            
            pstmt.close();
            rs.close();
            con.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
        
    }
}
