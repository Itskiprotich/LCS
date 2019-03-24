/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongestCommonSubsequenceFunction;

/**
 *
 * @author Kiprotich Japheth
 */
class Operator {
       
    public String manipulation(String s1, String s2)
    {
        /*we first obtain the length of the two string*/
        int length1 = s1.length();
        int length2 = s2.length();
 
        int[][] arr = new int[length1 + 1][length2 + 1]; /*Array of Integers*/
 
        for (int i = length1 - 1; i >= 0; i--) /*filling the matrix table*/
        {
            for (int j = length2 - 1; j >= 0; j--)
            {
                if (s1.charAt(i) == s2.charAt(j))
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
 
        int i = 0, j = 0; /*initializing*/
        StringBuffer stringBuffer = new StringBuffer();
        while (i < length1 && j < length2) 
        {
            if (s1.charAt(i) == s2.charAt(j)) 
            {
                stringBuffer.append(s1.charAt(i));
                i++;
                j++;
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) 
                i++;
            else
                j++;
        }
        return stringBuffer.toString(); /*returns the final subsequent string */
    }
    
}
