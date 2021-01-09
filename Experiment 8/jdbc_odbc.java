public class abc {                                                                                                           
   public static void main(String[] args) throws Exception {                                                                 
                                                                                                                             
      Class.forName("com.mysql.cj.jdbc.Driver");                                                                             
                                                                                                                             
      final String url = "jdbc:mysql:///java";                                                                               
      final String user = "root";                                                                                            
      final String password = "";                                                                                            
                Statement stmt = null;                                                                                       
      Connection con = DriverManager.getConnection(url, user, password);                                                     
                                                                                                                             
      if (con == null) {                                                                                                     
         System.out.println("JDBC connection is not established");                                                           
         return;                                                                                                             
      } else                                                                                                                 
         System.out.println("Congratulations," +                                                                             
              " JDBC connection is established successfully.\n");                                                            
      //insert                                                                                                               
      stmt = con.createStatement();                                                                                          
                                                                                                                             
            String sql = "INSERT INTO student "+"VALUES (4,'Anni', 'Misra', Anni@gmail.com', 'CSE')";                   
           stmt.executeUpdate(sql);                                                                                          
        sql = "INSERT INTO student " +"VALUES (5,’Anish’, 'Mehta', 'Anishn@gmail.com', 'Hindi')";                             
            stmt.executeUpdate(sql);                                                                                         
            sql = "INSERT INTO student " + "VALUES (6,'Kaveri', 'Gupta', 'KAveri@gmail.com', 'PHYSICS')";                    
            stmt.executeUpdate(sql);

      String msql = "SELECT id, fname, lname, email, major_in FROM student";                                                   
         ResultSet rs = stmt.executeQuery(msql);                                                                             
                                                                                                                             
         while(rs.next()){                                                                                                   
                                                                                                                             
            int id  = rs.getInt("id");                                                                                       
            String fname = rs.getString("fname");                                                                            
            String lname = rs.getString("lname");                                                                            
            String email = rs.getString("email");                                                                            
            String major = rs.getString("major_in");                                                                         
                                                                                                                             
                                                                                                                             
            System.out.print("ID: " + id);                                                                                   
            System.out.print(", First name: " + fname);                                                                      
            System.out.print(", Last name: " + lname);                                                                       
            System.out.println(", Email: " + email);                                                                         
            System.out.println(", Major_in: " + major);                                                                      
         }                                                                                                                   
         rs.close();                                                                                                         
         //update                                                                                                            
         String sqlu = "UPDATE student " +                                                                             
         "SET major_in = 'Chemistry' WHERE id =2";                                                        
         stmt.executeUpdate(sqlu);                                                                                      
         System.out.print("ID 2 updated sucessfully!!!");                                                               
        
        //Delete                                                                                                                  
        sqlu = "DELETE FROM student " +"WHERE id = 3";     
        stmt.executeUpdate(sqlu);                                                                                      
        System.out.print("ID 2 Deleted !!!");  
        con.close();                                                                        
   }  
                