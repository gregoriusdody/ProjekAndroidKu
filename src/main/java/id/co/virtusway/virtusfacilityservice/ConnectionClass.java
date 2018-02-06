package id.co.virtusway.virtusfacilityservice;

/**
 * Created by Virtus026 on 06/02/2018.
 */

public class ConnectionClass {
    String ip = "192.168.2.10\SVR03,1433";
    String db = "OperationMonitoring"";
    String un = "OperationMonitoring";
    String password = "Virtus123";

    @SuppressLint("NewApi")
    public Connection CONN()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnURL = "jdbc:jtds:sqlserver://" + ip + "/" + db+ ";user=" + un + ";password=" + password + ";";
            conn = DriverManager.getConnection(ConnURL);

        }catch (SQLException se)
        {
            Log.e(“error here 1 : “, se.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            Log.e(“error here 2 : “, e.getMessage());
        }
        catch (Exception e)
        {
            Log.e(“error here 3 : “, e.getMessage());
        }
        return conn;
    }
}
