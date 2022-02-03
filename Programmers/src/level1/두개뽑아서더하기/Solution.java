package level1.두개뽑아서더하기;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Arrays.sort(numbers);
        ArrayList <Integer> list = new ArrayList();
    
        for(int i=0; i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                
                int mul = numbers[i]+numbers[j];
                
                if(!list.contains(mul)){
                    
                    list.add(mul);
                        
                }
            }
        }
        answer=new int [list.size()];
        for(int k : list){
        System.out.println(k);
            answer[list.indexOf(k)]=k;
            }
        
     
        Arrays.sort(answer);
        
        return answer;
    }
}