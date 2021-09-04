/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroster.service;

import classroster.dao.ClassRosterPersistenceException;
import classroster.dto.Student;
import java.util.List;

/**
 *
 * @author hayle
 */
public class ClassRosterDuplicateIdException extends Exception {

   public ClassRosterDuplicateIdException(String message) {
        super(message);
    }

    public ClassRosterDuplicateIdException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
