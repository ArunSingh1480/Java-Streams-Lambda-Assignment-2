import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IsPrime {
        public static boolean numPrime(int i) {

            IntPredicate isDivisible = index -> i % index == 0;
            return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
        }
    }

