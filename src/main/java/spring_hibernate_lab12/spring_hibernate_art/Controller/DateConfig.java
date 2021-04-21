/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_hibernate_lab12.spring_hibernate_art.Controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 *
 * @author user
 */

public class DateConfig {
    
        @Autowired
        private static DataRepository dataRepository;
        
   private static String pattern = "yyyy-MM-dd HH:mm:ss";
   private static LocalDateTime userPersonalTimeWait ;
   private static final long await_time = 1;
   
    /*
   DEPRECATED BECAUSE OF DATABASE
   public static void setUserPersonalTimeWait(LocalDateTime userPersonalTimeWait) {
        DateConfig.userPersonalTimeWait = userPersonalTimeWait.plusMinutes(await_time);
    }

    public static LocalDateTime getUserPersonalTimeWait() {
        return userPersonalTimeWait;
    }*/
   
     public static String getDate(){
         
        LocalDateTime now = LocalDateTime.now();  

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);  
         String votedDate = dtf.format(now);
         return votedDate;
 }
     
     
     public static LocalDateTime getDate_LDT(){
             LocalDateTime now = LocalDateTime.now();  
             return now;
     }
     
     
     public static void isDeadlineUp(DataRepository fromMainFile){
         int max = 1;
         
        // System.out.println( fromMainFile.findAll().iterator().h );
       /* while(fromMainFile.findAll().iterator().hasNext()){
            DB db = fromMainFile.findAll().iterator().next();
            System.out.println(db.getTask_name());
        }*/
    List<DB> data = new ArrayList<>();
    fromMainFile.findAll().forEach(data::add);
    
    while(data.iterator().hasNext()){
        System.out.println(data.iterator().next());
    }
        
    LocalDateTime now = LocalDateTime.now();  
   // System.out.println(getUserPersonalTimeWait());
   // LocalDateTime user_wait_time = fromMainFile.findAll();
   
   
    /* 
    if a > b return 1
    a == b return 0
    a < b return -1
    */
  /*  Duration duration = Duration.between(now, user_wait_time);
    int status = now.compareTo(user_wait_time);
       if(status == 1){
       return "true";       
       }
       else{
       return "false";       
       }
    */
}
     
     
     
     
}
