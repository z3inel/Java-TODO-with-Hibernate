/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_hibernate_lab12.spring_hibernate_art.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface DataRepository extends CrudRepository<DB, Integer> {

    
    
}
