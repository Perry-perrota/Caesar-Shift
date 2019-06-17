import java.io.Console;

public class Navigate {


    private int mKey;
    private String mWord;
    private int mSelection;
   private Console myUse= System.console();
   public Navigate(int  selection,int key,String word){
        mSelection=selection;
        mKey=key;
        mWord=word;
    }



    public static void navigateApp(int  selection,int key,String word){



        if(selection==1){
            Encode encodeString=new Encode();
            encodeString.encodeString(key,word);




        }
        else if(selection==2){

            Decode decodeString=new Decode();
            decodeString.decodeString( key, word);


        }
        else{

            System.out.println("Please try again");
        }
    }

public int getSelection(){
        return mSelection;
}

    public int getmKey() {
        return mKey;
    }

    public String getmWord() {
        return mWord;
    }

    public int getmSelection() {
        return mSelection;
    }

    public Console getMyUse() {
        return myUse;
    }
}

