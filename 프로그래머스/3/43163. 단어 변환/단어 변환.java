import java.util.*;

class Solution {

    // 두 단어가 한 글자만 다른지 확인하는 메서드
    private boolean canTransform(String word1, String word2) {
        int diffCnt = 0;
        for (int i = 0; i < word1. length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                diffCnt++;
                if (diffCnt > 1) {  // 두 글자 이상 다르면 false
                    return false;  
                }
            }
        }
        return diffCnt == 1;  //정확히 한 글자만 다르면 ture  (boolean 타입이라)
    }

    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();  // BFS를 위한 큐 생성
        Map<String,Integer> dist = new HashMap<>();  // 각 단어까지의 변환 횟수를 저장할 맵

        queue.offer(begin);  // 시작 단어를 큐에 넣고 거리 0으로 초기화
        dist.put(begin, 0); // 시작 단어의 거리 = 0

        while (!queue.isEmpty()) {  // 큐가 빌 때까지 반복 (BFS 시작)
            String curWord = queue.poll();  // 현재 단어 꺼내기

            if (curWord.equals(target)) { // 현재 단어가 목표 단어라면, 해당 거리(변환 횟수) 반환
                return dist.get(curWord);
            }

            // words 배열을 돌면서 한 글자 차이 나는 단어 탐색
            for (String word : words) {
                // 아직 방문하지 않았고, 한 글자만 다른 경우
                if (!dist.containsKey(word) && canTransform(curWord, word)) {
                    queue.offer(word); // 큐에 추가
                    dist.put(word, dist.get(curWord) + 1); // 거리 정보 갱신
                }
            }
        }

        return 0; // 큐가 끝날 때까지 target에 도달하지 못했다면 변환 불가능 → 0 반환
    }
}