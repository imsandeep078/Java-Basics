import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;

class Uniquestring1 
{

    public static void main(String[] args) 
{
        System.out.print("enter a string : ");
            String s = new Scanner(System.in).next();
            System.out.println("Total frequency of input string :" + s.length());

            char[] c = s.toCharArray();

            HashMap<Character,Integer> d = new HashMap<Character,Integer>();
            for (char ch : c)
            {
                if(d.containsKey(ch))
                {
                    d.put(ch,d.get(ch)+1);
                }
                else
                {
                    d.put(ch,1);
                }
            }
                for(Map.Entry entry : d.entrySet())
                {
                    System.out.println(entry.getKey()+" "+ entry.getValue());
                }
              
            System.out.print("Total frequency of unique characters = "+ d.size()+ " ");
    }
    
}
