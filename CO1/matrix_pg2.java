import java.util.*;

public class matrix_pg2 {
	public static void main(String[] args){
		int m1[][] = new int[10][10];
		int m2[][] = new int[10][10];
		int m3[][] = new int[10][10];
		int i,j;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the first matrix");
	    for(i=0;i<3;i++){
	    	for(j=0;j<3;j++){
	    		m1[i][j]=in.nextInt();
	    	}
	    }
	    System.out.println("Enter the second matrix");
	    for(i=0;i<3;i++){
	    	for(j=0;j<3;j++){
	    		m2[i][j]=in.nextInt();
	    	}
	    }
	    System.out.println("First matrix");
	    for(i=0;i<3;i++){
	    	for(j=0;j<3;j++){
	    		System.out.print(m1[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("Second matrix");
	    for(i=0;i<3;i++){
	    	for(j=0;j<3;j++){
	    		System.out.print(m2[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("Sum matrix");
	    for(i=0;i<3;i++){
	    	for(j=0;j<3;j++){
	    		m3[i][j] = m1[i][j]+m2[i][j];
	    		System.out.print(m3[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}
}
