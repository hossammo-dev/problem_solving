      //Problem Description//
 
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//For example, 2 is written as II in Roman numeral, just two one's added together.
//12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
/*
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

   I can be placed before V (5) and X (10) to make 4 and 9. 
   X can be placed before L (50) and C (100) to make 40 and 90. 
   C can be placed before D (500) and M (1000) to make 400 and 900.
  
Given a roman numeral, convert it to an integer.
*/

class Solution {   
   public int romanToInt(String s) {
        int previousValue = 0;
        int currentValue = 0;
        int result = 0;
        
        //store symobles into hashMap
        Map<Character, Integer> symboles = new HashMap<>();
        symboles.put('I', 1);
        symboles.put('V', 5);
        symboles.put('X', 10);
        symboles.put('L', 50);
        symboles.put('C', 100);
        symboles.put('D', 500);
        symboles.put('M', 1000);
        
        //loop over each character into string 
        for(int i = 0; i < s.length(); i++){
            // ex: current character is [X] and its value equals [10]
            currentValue = symboles.get(s.charAt(i));
            
            //special cases
            if(previousValue == 0 || currentValue <= previousValue){
                previousValue = currentValue;
                result += currentValue;
            }else {
                // ex: current = [100] and previous = [10]
                result = result - previousValue + (currentValue - previousValue);
                previousValue = currentValue;
            }
            
        }
        return result;
        }
}
