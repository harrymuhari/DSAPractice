package TestGorilla;

public class ArrayScores {
    public static void main(String[] args){
        /*
        Given an array of integers, keep the total score based on the following
        1. Add 1 point for every even number in the array
        2. Add 3 points for every odd number in the array
        3. Add 5 points for every time you encounter 5 in the array
         */

        int[] array = new int[]{1,2,3,4,5};
        int counter = 0;

        for(int i=0; i<array.length; i++){

            if(array[i] % 2 != 0){
                if(array[i]==5){
                    counter += 5;
                } else {
                    counter += 3;
                }
            } else {
                counter += 1;
            }
        }

        System.out.println(counter);
    }
}
