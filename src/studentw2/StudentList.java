/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentw2;

/**
 *
 * @author Sarah
 */
public class StudentList {
    
    public static void main(String[] args){
        
       // StudentW2 s1 = new StudentW2("s1", "Sarah");
        
       //assigning objects to an array
        StudentW2[] studentList = new StudentW2[3];
        studentList[0] = new StudentW2("s1", "Sarah");
        studentList[1] = new StudentW2("s2", "abc");
        studentList[2] = new StudentW2("s3", "xyz");
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }//end of main method
    
}//end of class
