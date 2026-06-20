class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int maxlength=0;
        while(i<s.length()){
            char currch=s.charAt(i);
            if(map.containsKey(currch)){
                int currchidx=map.get(currch);
            
            if(currchidx>=j){
                j=currchidx+1;
            }
        }
        maxlength=Math.max(maxlength,i-j+1);
        map.put(currch,i);
        i=i+1;
        }
        return maxlength;
        
    }
}
