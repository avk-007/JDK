package Session10;

import java.util.Arrays;
import java.util.function.Function;

/*ex;;
Function<String,Integer> f=s->s.length();
 f.apply("sreenu"); //op


Q.When we should go for Predicate and function??
ans--Predicate-->If we want to filter the data use Predicate
 if we want to filter the data i.e out of "n" elements the result maybe n or n-1 or n-2
ex---list-10 elements ,after filter apply then 10 or 5 or 3 element.
        function::
        if  we dont filter the data but the logic should be apply for all the elements
 if input "n" elements--apply some logic --output 'n' elements with Resultant output.*/
public class FUNCTION {
    public static void main(String[] args) {
        Function<String,String> strr= s-> s.concat("Kumar");
        String apply = strr.apply("abhi");
        System.out.println(apply);
        //req is add fruit with all the fruits names
        String[] fruites={"apple","bananna","lemon","mango"};

        Function<String,String> fruitss=s->s.concat("fruit");
     for (String fruit : fruites){
         System.out.println(fruitss.apply(fruit));
     }
      Function<String,String> uparCaase= s-> s.toUpperCase();
        System.out.println(uparCaase.apply(Arrays.toString(fruites) ));
    }
}
