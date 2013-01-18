package physique.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionService {

    private String dbDriver;
    private String dbURL;
    private String dbUser;
    private String dbPasswd;
    private Connection cnx;
    private Statement st;
    private boolean connected;

    static ConnectionService getInstance(String base, String host, String nomBase, String dbDriver, String dbUser, String dbPasswd) throws Exception {
        ConnectionService connector = new ConnectionService(base, host, nomBase, dbDriver, dbUser, dbPasswd);
        connector.connect();
        return connector;
    }

    private ConnectionService(String base, String host, String nomBase, String dbDriver, String dbUser, String dbPasswd) {
        this.dbDriver = dbDriver;
        this.dbUser = dbUser;
        this.dbPasswd = dbPasswd;
        this.dbURL = "jdbc:" + base + "://" + host + "/" + nomBase;
    }

    Statement getStatement() throws Exception {
        if (!this.connected) {
            throw new Exception("not connected");
        }
        return this.st;
    }

    private void connect() throws Exception {
        System.out.println("Log: Tentative de connexion Ã  : " + dbURL);
        try{
            Class.forName(this.dbDriver);
            this.cnx=DriverManager.getConnection(this.dbURL,this.dbUser,this.dbPasswd);
            this.st=this.cnx.createStatement();
            this.connected=true;
            System.out.println("Connexion ok");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
   
        
    }
}
