
public class Encode {


    public void encodeString(int key, String word) {
        String resultword = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            char shifted = (char) (ch + key);
            resultword += shifted;

        }
        System.out.println("Your encrypted word is "+resultword);
        System.out.println("Your input word is "+word);

    }


}
















