/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongestCommonSubsequenceFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiprotich Japheth
 */
public class LongestCommonSubsequenceFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*This is the main program for the system*/        
        try {
            // TODO code application logic here
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            /*BufferedReader allows reading of the text from a character-input stream
            Buffering characters so as to provide for the efficient reading of characters, lines and arrays.*/
            System.out.println("Longest Common Subsequence Function\n");/*print function in java*/
            System.out.println("Enter the First String:\n");
            String s1 = bufferedReader.readLine();  /*reads data in every line*/
            
            System.out.println("Enter the Second String:\n");
            String s2 = bufferedReader.readLine();
            
            Operator operator = new Operator(); /*calls the operator class*/
            String output = operator.manipulation(s1, s2); /*calls the manipulation method for the operation*/
            
            System.out.println("\nLongest Common Subsequence : " + output);
        } catch (IOException ex) {

            /*Error Handling block*/
            Logger.getLogger(LongestCommonSubsequenceFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
