//App.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
// import java.util.Arrays;

import java.sql.ResultSet;

public class App{
    void createTable(){
        final String DB_URL = "jdbc:mysql://localhost:3306/";
        final String USER = "root";
        final String PASS = "Aman@2023";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);Statement stmt = conn.createStatement();){
            String sql = "CREATE TABLE PAYSLIP.PAYSLIP (ID INT ,NAME VARCHAR(100),SALARY DOUBLE , WORKING_DAYS INT,DAILYWAGES DOUBLE,DEDUCTION DOUBLE , BONUS DOUBLE ,TYPE VARCHAR(2))";
            stmt.executeUpdate(sql);
            // System.out.println("Successfully.");
            JOptionPane.showMessageDialog(null, "TABLE CREATED.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addRecord(int id, String name, int workingDays, double dailyWage, double deductions, double bonuses, String type){
        final String DB_URL = "jdbc:mysql://localhost:3306/";
        final String USER = "root";
        final String PASS = "Aman@2023";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);Statement stmt = conn.createStatement();){
            name = "'" + name + "'";
            type = "'" + type + "'";
            String sql = "INSERT INTO PAYSLIP.PAYSLIP VALUES(" + id + ',' + name + ',' + workingDays + ',' + dailyWage + ',' + deductions + ',' + bonuses + ',' + type + ")";
            stmt.executeUpdate(sql);
            // System.out.println("Successfully.");
            JOptionPane.showMessageDialog(null, sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static String[] generatePaySlipContract(int id){
        final String DB_URL = "jdbc:mysql://localhost:3306/";
        final String USER = "root";
        final String PASS = "Aman@2023";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);Statement stmt = conn.createStatement();){
            ResultSet r;
            
            String sql = "SELECT * from payslip.payslip where id = " + id;

            // Calculate Gross Salary
            // sql = "SELECT ((dailywages * working_days) - deduction + bonus) as salary from payslip.payslip where id = " + id;
            r = stmt.executeQuery(sql);
            while (r.next()) {
                String[] data = {
                    Integer.toString(r.getInt("ID")),
                    r.getString("NAME"),
                    Integer.toString(r.getInt("WORKING_DAYS")),
                    Double.toString(r.getDouble("DAILYWAGES")),
                    Double.toString(r.getDouble("DEDUCTION")),
                    Double.toString(r.getDouble("BONUS")),
                    r.getString("TYPE")
                };
                // System.out.println(Arrays.toString(data));
                return data;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}