/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author vicks
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    public int[] quicksort(int[] array){
        if (array.length == 0){
            return array;
        }
        int pivot = array[0];
        for (int i = 1; i< array.length; i++){
            if (i < pivot){

                int tmp = array[0];
                array[0] = array[i];
                array[i] = tmp;
             //   tmp =
            }
        }

        return array;
    }

    //fib(int n)

    //factorial(n)


}
