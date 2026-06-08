class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i) - 'a']==1)
            {
                return i;
            }
        }
        return -1;

    //     int n=s.length();
    //     for(int i=0;i<n;i++)
    //     {
    //         int count=1;
    //         for(int j=0;j<n;j++)
    //         {
    //             if(i==j)
    //             {
    //                 continue;
    //             }
    //             if(s.charAt(i)==s.charAt(j))
    //             {
    //                 count++;
    //             }
    //         }
    //         if(count==1)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    }
}
