class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int countT = 0;
        int countY = 0;
        
        for (int i = 0; i<s.length(); i++){
            if ( s.charAt(i) == 'y'|| s.charAt(i) == 'Y') {
            countT++;
          }
        }
        
        for(int i =0; i < s.length(); i++){
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                countY++;
           }
        }
        
        if (countT != countY) {
            answer = false;
        } else {
            answer = true;
        }
       

        return answer;
    }
}
