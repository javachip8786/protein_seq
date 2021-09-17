package placements;
import java.util.*;

public class anshul_DSALAB {
	
	
	public static void func(String str1 , String str2) {
		int n = str1.length();
		int m = str2.length();
		int[][] mat = new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				if(i == 0 && j == 0) {
					mat[0][0] = 0;
				}
				else if( i == 0) {
					mat[i][j] = mat[i][j-1]+1;
				}
				else if( j == 0) {
					mat[i][j] = mat[i-1][j]+1;
				}
				else {
					char a = str1.charAt(i-1);
					char b = str2.charAt(j-1);
					if(a == b) {
						mat[i][j] = mat[i-1][j-1];
					}
					else {
						mat[i][j] = Math.min(mat[i-1][j-1] , Math.min(mat[i-1][j] , mat[i][j-1]))+1;
					}
				}
			}
		}
		System.out.println(mat[n][m]);
	}
	

    public static void main(String args[])
    {
//    	String str1 = "GAGCCTACTAACGGGAT";
//    	String str2 = "CATCGTAATGACGGCCT";
    	String str1 = "INTENTION";
    	String str2 = "EXECUTION";
    	
    	func(str1 , str2);
    }


}


//4 5 
//0 0 0 0 0 
//0 0 2 0 0 
//0 0 0 0 0 
//0 0 0 0 0

//1 5
//1 1 2 0 1
