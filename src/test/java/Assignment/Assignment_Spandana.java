package Assignment;

class Assignment_Spandana {

    /* write a short program that print each number from 1 to 100 on a new line
     * for each number mul of 3 , print "fizz" instead of the number
     * for each number mul of 5 , print "BUZZ" instead of the number
     * for number which are multiple of both 3 and 5 "FizzBuzz" instead of the number*/

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)

        {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }

        }

    }
}


