/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_hibernate_lab12.spring_hibernate_art.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class ControllerMap {
    @Autowired
        private DataRepository dataRepository;
        
    @RequestMapping("/")
    public String tasks(Model model) throws Exception {
    //    DateConfig.isDeadlineUp(dataRepository);
       // model.addAttribute("deadlineisup", DateConfig.isDeadlineUp(dataRepository.findAll()));
        model.addAttribute("tasks", dataRepository.findAll());
	return "home";       
    }
    
    
      @PostMapping("/add")
        public String add(@RequestParam(name="todo_name",required=true,defaultValue="") String data) {
        try {
        DB to_add = new DB();
        to_add.setTask_name(data);
        to_add.setTask_date(DateConfig.getDate());
      //  DateConfig.setUserPersonalTimeWait(DateConfig.getDate_LDT());
        dataRepository.save(to_add);
        return "redirect:/";
        }
           catch(Exception e){
               System.out.println("Exception occured in next traceback:");
               System.out.println(e);
               System.out.println("Short description: Failed to save data");
               return "failed";
          }
           
         }
    
    
        @PatchMapping("/tasks/{id}")
        public String update(Model model,@RequestParam(name="todo_name",required=true,defaultValue="") String data,  @PathVariable("id") int id){
        DB to_add = new DB();
        to_add.setId(id);
        to_add.setTask_name(data);
        to_add.setTask_date(DateConfig.getDate());
        
        dataRepository.save(to_add);
        return "redirect:/";
        }
       
        @DeleteMapping("/tasks/{id}")
        public String delete(@PathVariable("id") int id){
        System.out.println(id);
        dataRepository.deleteById(id);
     
        return "redirect:/";
        }

        
    //update
    //delete
    //submit
    
    
        
}
