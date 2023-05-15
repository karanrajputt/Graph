import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import javax.annotation.processing.RoundEnvironment;

public class rottenOranges {
    

          public int orangesRotting(int [][]grid)
          {
            if(grid==null&& grid.length==0)  return -1;

            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[0].length;j++)
                {
                    if(grid[i][j]==2) 
                    rotAdjacent(grid,i,j,2);
                }
                
            }
            int minutes=2;
            for(int []row:grid)
            {
                for(int cell:row)
                {
                    if(cell==1)
                       return -1;

                    minutes=Math.max(minutes,cell);
                }
            }

            return minutes-2;
          }

          private void rotAdjacent(int [][]grid,int i,int j,int minutes)
          {
            if(i<0||i>=grid.length || j<0|| j>=grid.length || grid[i][j]==0||1<grid[i][j]&&grid[i][j]<minutes) 
            return;




            else{
                grid[i][j]=minutes;

                rotAdjacent(grid, i-1, j, minutes+1);
                rotAdjacent(grid, i+1, j, minutes+1);
                rotAdjacent(grid, i, j-1, minutes+1);
                rotAdjacent(grid, i, j+1, minutes+1);
            }
          }

          public static void main(String[] args) {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           int T=Integer.parseInt(br.readLine().trim());
           while(T-->0){
            String[] s=br.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int [][]grid=new int[n][m];
            for(int i=0;i<n;i++){
              String []s=br.readLine().trim().split(" ");
              for(int j=0;j<m;j++){
                grid[i][j]=Integer.parseInt(s[j]);
              }
            }
           Solution obj=new Solution();
                       int ans=obj.orangesRotting(grid);
                        System.out.println(ans);
          }}
}
