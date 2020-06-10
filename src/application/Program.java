
package application;

import entities.Student;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Roberto
 */
public class Program {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++){
            int userNum = sc.nextInt();
            set.add(new Student(userNum));
        }
        
        System.out.print("How many students for course B? ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++){
            int userNum = sc.nextInt();
            set.add(new Student(userNum));
        }
        
        System.out.print("How many students for course C? ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++){
            int userNum = sc.nextInt();
            set.add(new Student(userNum));
        }
        
       
        System.out.println("Total students: " + set.size());
    }
    
}
