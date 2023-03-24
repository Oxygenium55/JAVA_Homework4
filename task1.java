import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод(не void), который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> link_list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            link_list.add(getRandomNumber());
        }
        System.out.println(link_list);

        for (int i = 0; i < 10; i++) {
            System.out.print(link_list.getLast() + ", ");
            link_list.removeLast();
        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}