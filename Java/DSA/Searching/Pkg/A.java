package Pkg;

public class A {
    public int Linear_search(int[] x, int y)
    {
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==y)
            {
                return i;
            }
        }
        return -1;
    }
}
