import java.util.LinkedList;

/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> link_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(link_list, getRandomNumber());
        }
        System.out.println(link_list);

        System.out.println(dequeue(link_list));
        System.out.println(link_list);

        System.out.println(first(link_list));
        System.out.println(link_list); 
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) {
        int num = ll.get(0);
        return num;
    }

    
}
