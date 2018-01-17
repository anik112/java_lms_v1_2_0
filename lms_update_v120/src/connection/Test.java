/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import lms_V1.pkg2.pkg0.service.BookIssueService;
import lms_V1.pkg2.pkg0.service.BookReciveService;

/**
 *
 * @author anik
 */
public class Test {
    
    public static void main(String[] args) {
        
        Connection connection=DBconnect.getConnection();
        System.out.println(connection);
        
        
//        BookReciveService bookReciveService=new BookReciveService();
//        
//        bookReciveService.updateQtyInBookReciveTable("1231", 2);
        
        
//        BookIssueService bookIssueService=new BookIssueService();
//        
//        
//        if(bookIssueService.updateQtyInBookInfoTable("1231", 5) == 101){
//            System.out.println(":: OK ::");
//        }

        
    }
    
    
}
