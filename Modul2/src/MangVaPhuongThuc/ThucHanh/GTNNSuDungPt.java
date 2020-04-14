package MangVaPhuongThuc.ThucHanh;

public class GTNNSuDungPt {
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr = {1,4, 12, 7, 8,3, 188, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]+" tai vi tri "+index);
    }
}
