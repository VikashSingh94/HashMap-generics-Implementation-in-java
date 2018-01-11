
import java.util.*;


public class Generics {


    public static void main(String args[])throws Exception
    {


        HashMap<String,String> studentMap   =   new  HashMap<>();
        HashMap<String,String> studentNewMap;

        try
        {
             studentMap =  studentMap.put("vikash", "Singh");

             studentNewMap =  studentMap.put("Vickey", "Singh");

             studentNewMap =  studentNewMap.put("Xyz","singh");

            Iterator studentMapIterator = studentMap.iterator();

            Iterator studentNewMapIterator = studentNewMap.iterator();

            System.out.println("printing all value of the studentMap\n");

            while(studentMapIterator.hasNext())
            {
                //remember type casting
                Entry<String,String> temp = (Entry)studentMapIterator.next();
                System.out.println(temp.getKey() + " " + temp.getValue());

            }

            System.out.println("\nprinting all value of the studentNewMap\n");

            while(studentNewMapIterator.hasNext())
            {
                //remember type casting
                Entry<String,String> temp = (Entry)studentNewMapIterator.next();
                System.out.println(temp.getKey() + " " + temp.getValue());

            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
