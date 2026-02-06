class Solution {
    public boolean halvesAreAlike(String s) {
       int n=s.length();
       int countA=0;
       int countB=0;
       String vowels="aeiouAEIOU";
       for(int i=0;i<n/2;i++){
        if(vowels.indexOf(s.charAt(i))!= -1){
            countA++;
        }
       }
       for(int i= n/2;i<n;i++){
        if(vowels.indexOf(s.charAt(i))!=-1){
            countB++;
            }
       }
       return countA==countB;
    }
}
