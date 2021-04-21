/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_hibernate_lab12.spring_hibernate_art.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class DB {
    
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String task_name;

  private String task_date;
  

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setTask_date(String task_date) {
        this.task_date = task_date;
    }




    //get
    public Integer getId() {
        return id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getTask_date() {
        return task_date;
    }




    @Override
    public String toString() {
        return "DB{" + "id=" + id + ", task_name=" + task_name + ", task_date=" + task_date + '}';
    }


}
