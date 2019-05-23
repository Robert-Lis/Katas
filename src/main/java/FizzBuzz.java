public class FizzBuzz {


    public static String caluate(Integer numberToCheck) {

        if (numberToCheck % 15 == 0){
            return "fizzbuzz";
        } else if (numberToCheck % 5 == 0){
            return "buzz";
        } else if (numberToCheck % 3 == 0){
            return "fizz";
        }

        return String.valueOf(numberToCheck);
    }
}
