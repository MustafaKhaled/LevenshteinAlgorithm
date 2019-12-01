package com.levenshteinalgorithm.src;


/**
 *
 * @author Mustafa.Khaled
 */
public class LevenshteinAlgorithm {
    
       private static int getMinimumValue(int a, int b, int c) {                            
        return Math.min(Math.min(a, b), c);                                      
    }                                                                            
                                                                                 
    public static int computeLevenshteinDistance(CharSequence lhs, CharSequence rhs) {      
        int[][] distance = new int[lhs.length() + 1][rhs.length() + 1];  
        
        if(lhs.length() == 0)
            return rhs.length();
        
        if(rhs.length() == 0)
            return lhs.length();
        
        
        for (int i = 0; i <= lhs.length(); i++)                                 
            distance[i][0] = i;                                                  
        for (int j = 1; j <= rhs.length(); j++)                                 
            distance[0][j] = j;                                                  
                                                                                 
        for (int i = 1; i <= lhs.length(); i++)                                 
            for (int j = 1; j <= rhs.length(); j++)                             
                distance[i][j] = getMinimumValue(                                        
                        distance[i - 1][j] + 1,                                  
                        distance[i][j - 1] + 1,                                  
                        distance[i - 1][j - 1] + ((lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1));
                                                                                 
        return distance[lhs.length()][rhs.length()];                           
    }                                                                            


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CharSequence s1 = "Kartoffelsalat";
        CharSequence s2 = "Runkelrüben";
        int result = computeLevenshteinDistance(s1, s2);
        System.out.println("Minumum distance between "+s1+" and "+s2+" is "+result);
    }
    
}
