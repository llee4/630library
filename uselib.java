import java.util.ArrayList;

public class uselib{
    public static void main (String []args){
        ArrayList <Integer> list = new ArrayList <Integer> ();
        list.add(70);
        list.add(69);
        list.add(68);
        list.add(67);

        Shuffle.shuffle(list);
    }
}
