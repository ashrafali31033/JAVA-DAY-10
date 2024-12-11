import java.util.*;
public class Main5 
{
    String name;
    Main5(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);

    }
    public static void main(String arsg[])
    {
        Main5 o=new Main5("asharf");
        o.agt();
    }
}
class teacher{
    public void teach(Main5 s)
    {
        s.dis1();
    }
}