public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",indices));
    }

}
