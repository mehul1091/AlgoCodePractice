import com.arrays.sort.BubbleSort;
import org.junit.jupiter.api.Test;

public class TestBubbleSort {

    BubbleSort bubbleSort = new BubbleSort();

    int[] input = null;

    //check with single number

    @Test
    public void testWithSingleElement(){

        input = new int[] {1};

        bubbleSort.sort(input);

        assert input[0] == 1;

    }

    //check with empty array

    //all decreasing
    @Test
    public void testAllDecreasingElements(){
        input = new int[]{5,4,3,2,1};

        bubbleSort.sort(input);

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

        bubbleSort.sort(input);

        assert input[0] == -4;
        assert input[1] == -2;
        assert input[2] == -1;
        assert input[3] == 0;
        assert input[4] == 15;


    }

    @Test
    public void testArrayInput2(){

        int[] arr = {12, 45, 23, 51, 19, 8};

        bubbleSort.sort(arr);

        assert arr[0] == 8;
        assert arr[1] == 12;
        assert arr[2] == 19;
        assert arr[3] == 23;
        assert arr[4] == 45;
        assert arr[5] == 51;

    }

    @Test
    public void testAlreadySortedArray(){

        int[] arr = {1,2,3,4,5,6,7,8,9};

        bubbleSort.sort(arr);

        assert arr[0] == 1;
        assert arr[1] == 2;
        assert arr[2] == 3;
        assert arr[3] == 4;
        assert arr[4] == 5;
        assert arr[5] == 6;
        assert arr[6] == 7;
        assert arr[7] == 8;
        assert arr[8] == 9;

    }


}
