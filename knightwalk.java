import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class knightwalk {
    static int min(int x,int y)
    {
        Set<String>set=new HashSet<>();
        Queue<int[]>q=new LinkedList<>();
        final int dir[][]=new int[][]{{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
        q.offer(new int[]{0,0});

        int steps=0;
        x=Math.abs(x);
        y=Math.abs(y);
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                int []new=q.poll();
                int row=new[0];
                int col=new[1];
                if(row==x && col==y){
                    return step;
                }
            }
        }
    }
}
