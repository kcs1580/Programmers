package level1.삼진법뒤집기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int mok = -1;
        int temp = 0;
        String numstr = "";
        
    
        while(n != 0 ){
            temp= n%3;
            System.out.println("나머지: "+temp);
            numstr += Integer.toString(temp);
            n/=3;
            System.out.println("n: "+n);
                
        }
        
        int result = Integer.parseInt(numstr,3);
               System.out.println("resut: " +result);
        answer = result;

        return answer;
    }
}