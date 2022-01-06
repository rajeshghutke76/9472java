
//Example of Descending array sort

import java.util.Arrays;
import java.util.Collections;
public class Javasortingdesc {
public static void main(String[] args) {
Integer[] numbers = new Integer[] { 18, 19, 13, 12, 15, 17, 16,};

Arrays.sort(numbers, Collections.reverseOrder());
System.out.println(Arrays.toString(numbers));
}

}
/*
output:

[19, 18, 17, 16, 15, 13, 12]

*/