package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	  static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	  static final String DB_URL = "jdbc:mysql://localhost/dxc";

	  static final String USER = "root";
	  static final String PASS = "Mallela@4b8";
	  
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
	    Connection conn = null;
	    Statement stmt = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql111 = "INSERT INTO BookManagementSystem (BookId, BookName, AuthorName, Edition) " +
                  "VALUES (1, 'Advanced Java', 'Ling', 12)";
     stmt.executeUpdate(sql111);
     System.out.println("Book added successfully");
     
     String sql1111 = "SELECT BookId, BookName, AuthorName, Edition FROM BookManagementSystem";
     ResultSet rs = stmt.executeQuery(sql1111);
     while (rs.next()) {
       int BookId = rs.getInt("BookId");
       String BookName = rs.getString("BookName");
       String AuthorName = rs.getString("AuthorName");
       int Edition = rs.getInt("Edition");
       
       System.out.print("Book ID: " + BookId);
       System.out.print(", Book Name: " + BookName);
       System.out.print(", Author Name: " + AuthorName);
       System.out.println(", Edition: " + Edition);
     }
     
     rs.close();
      
      String sql = "DELETE FROM BookManagementSystem WHERE BookId = 5";
      stmt.executeUpdate(sql);
      System.out.println("Deleted the row successfully!");
      
      String sql1 = "UPDATE BookManagementSystem SET BookName = 'Advanced Java' WHERE BookId =1 ";
      stmt.executeUpdate(sql1);
      System.out.println("Updated the row successfully!");
      
      System.out.println("Searching a row in the table...");
      stmt = conn.createStatement();
      String sql11 = "SELECT BookId, BookName, AuthorName, Edition FROM BookManagementSystem WHERE BookId = 2";
      ResultSet rs1 = stmt.executeQuery(sql11);
      while (rs1.next()) {
          String bookId = rs1.getString("BookId");
          String bookName = rs1.getString("BookName");
          String authorName = rs1.getString("AuthorName");
          int edition = rs1.getInt("Edition");

          System.out.println("BookId: " + bookId);
          System.out.println("BookName: " + bookName);
          System.out.println("AuthorName: " + authorName);
          System.out.println("Edition: " + edition);
        }
      rs1.close();
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  
	  System.exit(0);
}
}
