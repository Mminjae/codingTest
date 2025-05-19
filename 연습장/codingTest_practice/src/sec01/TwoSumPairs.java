package sec01;

//### **예제 1: 두 수의 합(Two Sum)**
//
//다음과 같은 리스트가 주어졌을 때, 두 수의 합이 `target`이 되는 모든 쌍을 찾아보는 문제를 해결해봅시다.

import java.util.ArrayList;
import java.util.List;

public class TwoSumPairs {
    public static void twoSum(int[] arr,int target){
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) { //첫 번째 수 선택
            for(int j = i + 1; j < n; j++) { //두 번째 수 선택(중복 방지)
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,9,1};
        int target = 10;
        twoSum(arr, target);
    }
}


