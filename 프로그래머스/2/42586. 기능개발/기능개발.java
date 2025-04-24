import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    ArrayList<Integer> result = new ArrayList<>();
        
        //각 작업이 며칠이 걸리는지 progresses에 배열길이 만큼 배열 만들기
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int minus = 100 - progresses[i];
            days[i] = (int)(Math.ceil((double)(minus) / speeds[i]));
        }

        // 첫 번째 기능을 완료해야하는 로직
        int max = days[0];
        int count = 1;
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= max) {
                count++;
            } else {
                result.add(count);
                max = days[i];
                count = 1;
            }
        }
        result.add(count); // 결과값을 맨 위에 만든 result 배열에 add 

        // 리스트를 출력  ( 지피티 사용 )
        // result.stream()     -->        List를 스트림(Stream) 으로 변환해.
        //                                List에 들어 있는 요소들을 하나씩 순회할 수 있도록 해줘.
        // .mapToInt(i -> i)   -->        이 부분은 각 Integer 객체를 int 기본형으로 변환(mapping) 하는 과정이야.
        //                                i -> i는 람다식이고, 그냥 각 요소를 그대로 int로 바꾼다는 의미야.
        return result.stream().mapToInt(i -> i).toArray();
    }
}