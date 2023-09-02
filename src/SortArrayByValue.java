import java.util.Arrays;

public class SortArrayByValue {
    public static void main(String[] args) {
        var x = new Array();
        int[] y =  x.array();
        //Для сортировки массива по значению в порядке возрастания
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(sortArreyRev(y)));
    }

    //для сортировки по убыванию
    static int[] sortArreyRev (int[] arr) {
        int [] newArr = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--){
            newArr[k] = arr[i];
            k++;
        }
        return newArr;
    }
}
