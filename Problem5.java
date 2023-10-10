import java.util.*;
public class Problem5 {
    /*Partner's Name: Awad Khawaja
    */
     
   
    public static int[] union(int[] a1, int[] a2){
        int[] temp = new int[a1.length + a2.length];
        int i = 0;    
        int j = 0;   
        int k = 0;   
        int leftEnd = a1.length - 1;
        int rightEnd = a2.length - 1;
        Sort.quickSort(a1);
        Sort.quickSort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    while (i <= leftEnd && j <= rightEnd) {
        if (k != 0 && temp[k-1] == a1[i]) {
            i++;
        }else if(k != 0 && temp[k-1] == a2[j]) {
            j++;
        }
        else if(a1[i] < a2[j]){
            temp[k] = a1[i];
            i++;k++;
        }
        else{
            temp[k] = a2[j];
            j++;k++;
        }
    }
    System.out.println(Arrays.toString(temp));
    while (k != 0 && i <= leftEnd) {
    if(k != 0 && temp[k-1] == a1[i]){
        i++;
    }
    else{
        temp[k] = a1[i];
        i++; k++;
    }
}

    while (k > 0 && j <= rightEnd) {
        if(k != 0 && temp[k-1] == a2[j]){
            j++;
        }
        else{
            temp[k] = a2[j];
            j++; k++;
        }
    }
    System.out.println(Arrays.toString(temp));
return temp;
}
    
    
public static void main(String[] args){
    int[] a1 = {10, 5, 7, 5, 9, 4};
    int[] a2 = {7, 5, 15, 7, 7, 9, 10};
    union(a1,a2);
}
}