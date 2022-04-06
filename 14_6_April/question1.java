import java.util.ArrayList;

public class question1 
{
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("how");
        words.add("are");
        words.add("you");

        for (String string : words) {
            System.out.println(string);
        }
        System.out.println("=========");
        words=doubles(words);

        for (String string : words) {
            System.out.println(string);
        }




    }
    public static ArrayList <String> doubles(ArrayList <String> x) {
        
        ArrayList <String> temp = new ArrayList <String>();
        for (int j = 0; j < x.size(); j++) {
            for (int i = 0; i < 2; i++) {
                temp.add(x.get(j));
            }
        }
        


        return temp;
    
    }
}