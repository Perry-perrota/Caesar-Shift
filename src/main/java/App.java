import java.io.Console;
import java.util.ArrayList;

public class App {
    public static void main(String []args){
        Console myUse=System.console();
        System.out.println("--------------------------------------------");
        System.out.println("Welcome to Decode Encode java app");
        System.out.println("Select from one of the following options");
        System.out.println("1:Encode");
        System.out.println("2:Decode");
        System.out.println("3:Exit");
        int selection=Integer.parseInt((myUse.readLine()));
        System.out.println("Please input a name");
        String word=myUse.readLine();
        System.out.println("Please input a key");
        int key=Integer.parseInt(myUse.readLine());
        Navigate navigation=new Navigate(selection,key,word);
           navigation.navigateApp(selection, key,word);





    }
}

