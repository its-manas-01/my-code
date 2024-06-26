class z extends Thread {
    public void run()
    {
        try 
        {
            // for (int i = 0; i < 10; i++)
            // {
                System.out.println("BCA");
                Thread.sleep(5000);
                System.out.println("BBA");
                Thread.sleep(5000);
            // }
        } 
        catch (Exception e) 
        {
            // TODO: handle exception
            System.out.println("Exception arise");
        }
    }
}

public class Test_Thread
{
    public static void main(String[] args) {
        z ob = new z();
        ob.start();
    }
}