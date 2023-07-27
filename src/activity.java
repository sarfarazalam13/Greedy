import java.util.ArrayList;

public class activity {
    public static void main(String args[])
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int activitiesq[][]=new int[start.length][3];
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(0);
        int last=end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=last)
            {
                maxAct++;
                ans.add(i);
                last=end[i];
            }
        }
        System.out.println("max"+maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
