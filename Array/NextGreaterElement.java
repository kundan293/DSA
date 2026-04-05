package Array;
import java.util.*;
import java.util.Arrays;
public class NextGreaterElement {
    void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums1.length; i++) {  // time n
            for (int j = 0; j < nums2.length; j++) {  // time n
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            result[i] = nums2[k];                                     // this  code  is  very  slow  because its  time  complexity show high
                            break;

                        }
                    }

                }
            }
        }
        return result;
    }
}
