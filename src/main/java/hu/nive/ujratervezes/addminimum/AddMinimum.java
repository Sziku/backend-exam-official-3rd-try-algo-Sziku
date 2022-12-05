package hu.nive.ujratervezes.addminimum;

public class AddMinimum {
    public int[] addMinimum(int[] numbers, int n)  {
        if(numbers.length == 0){
            return new int[0];
        } else if (numbers == null || n < 1) {
            try {
                throw new  IllegalAccessException();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        int minumum = numbers[0];

        for(int number : numbers){
            if(number < minumum){
                minumum = number;
            }
        }


    }
}
