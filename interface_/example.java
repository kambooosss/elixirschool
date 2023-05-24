
package interface_;
import java.util.*;
interface A 
{
    void show();
}
interface B
{
    void show();
}
class Inter implements A,B 
{
    public void show()
    {
        System.out.printf("insdie show");
    }
}
public class example {
    public static void main(String[] args) {
    Inter obj = new Inter();
    obj.show();
    }
}
