import com.arrays.sort.BubbleSort;
import com.arrays.sort.InsertionSort;
import org.junit.jupiter.api.Test;

public class TestInsertionSort {

    InsertionSort insertionSort = new InsertionSort();
    int[] input = null;

    //check with single number

    @Test
    public void testWithSingleElement(){

        input = new int[] {1};

        insertionSort.sort(input);

        assert input[0] == 1;

    }

    //check with empty array

    //all decreasing
    @Test
    public void testAllDecreasingElements(){
        input = new int[]{5,4,3,2,1};

        insertionSort.sort(input);

        assert input[0] == 1;
        assert input[1] == 2;
        assert input[2] == 3;
        assert input[3] == 4;
        assert input[4] == 5;

    }

    //negative numbers
    @Test
    public void testNegativeNumbers(){

        input = new int[]{-1,-2,0,-4, 15};

        insertionSort.sort(input);

        assert input[0] == -4;
        assert input[1] == -2;
        assert input[2] == -1;
        assert input[3] == 0;
        assert input[4] == 15;


    }

    //long

    @Test
    public void testArrayInput2(){

        int[] arr = {12, 45, 23, 51, 19, 8};

        insertionSort.sort(arr);

        assert arr[0] == 8;
        assert arr[1] == 12;
        assert arr[2] == 19;
        assert arr[3] == 23;
        assert arr[4] == 45;
        assert arr[5] == 51;

    }


}
