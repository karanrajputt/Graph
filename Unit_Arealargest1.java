import java.io.*;
public class Unit_Arealargest1 {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        for(int i=0;i<testCases;i++)
        { 
            System.out.println("enter rows");
            int m=sc.nextInt();
            System.out.println("enter col");
            int n=sc.nextInt();
            int mat[][]=new int[m][n];
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    mat[j][k]=sc.nextInt();
                }
            }

            int num=0;
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(mat[j][k]==1){
                        count(j,k,mat);
                        num=num+1;
                    }
                }
            }
        
        System.out.print("numneer of islands    :"+num);
      }}
  public static void count(int i,int j,int[][] mat){
        if(i==mat.length||j==mat[0].length||i<0||j<0)
        return;
          
        if(mat[i][j]==0)
        return;
        mat[i][j]=0;
        count(i+1, j, mat);
        count(i-1, j, mat);
        count(i, j+1, mat);
        count(i, j-1, mat);

    }

}
