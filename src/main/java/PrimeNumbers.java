import java.util.*;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> List= ListOfNumber();
        List<Integer> primeNumberList = new ArrayList<Integer>();

        System.out.println(List.stream().filter(IsPrime::numPrime).collect(Collectors.toList()));

    }
    public  static  List<Integer> ListOfNumber(){
        List<Integer> NumberList =new ArrayList<>();
        for(int i=0; i< 100 ;i++)
        {
            NumberList.add(randomnumbers());
        }
        return NumberList;
    }
    public static int randomnumbers(){
        Random r = new Random();
         int rand=r.nextInt(100)+1;
         return rand;
    }
}
