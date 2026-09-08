
/**
 * BigO.java 
 *
 * I have an array of the numbers 1 to 10 in random order. 
 * One of the numbers is missing (value changed to zero). Write an algorithm to 
 * figure out what the number is (and what position is missing). 
 */

public class BigO{
    public static void main(String[] args){
        findTheBlank(new int[]{1, 2, 3, 4, 5, 0, 7, 8, 9, 10}, 0);
    }

    public static void findTheBlank(int[] theNumbers, int num) {
        int missingNumber = 1;
        int blankSpace = -1;
        boolean found = false;

        /**for(int i = 0; i < theNumbers.length; i++) {
            if(theNumbers[i] == 0) {
                missingNumber = i + 1;
                blankSpace = i;
            }
        }
            */
        if(num >= theNumbers.length) {
            return;
        }
        if(missingNumber == theNumbers[num]) {
            missingNumber++;
        }
        if(theNumbers[num] == 0) {
            blankSpace = num;
            found = true;
        }
        
        findTheBlank(theNumbers, num + 1);
        if(found) {
        System.out.println("Missing number = " + missingNumber + 
            " at location " + blankSpace +" of the array");
        }
    
    }
}