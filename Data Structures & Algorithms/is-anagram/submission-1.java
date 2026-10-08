class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }


        char[] sCharArr = s.toCharArray();
        java.util.Arrays.sort(sCharArr);

        char[] tCharArr = t.toCharArray();
        Arrays.sort(tCharArr);

        String sString = new String(sCharArr);
        String tString = new String(tCharArr);

        if(sString.equals(tString)){
            return true;
        }
        else{
            return false;
        }



    }
}
