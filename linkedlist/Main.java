package n.mtx;

public class Main {
    public static void main(String[] args) {

        IList linkedList = new ILinkedList();
        linkedList.add(12345);
        linkedList.add(2542);
        linkedList.add(31243);
        linkedList.add(42134);
        linkedList.add(5565);
        linkedList.add(6776);
        linkedList.add(7117);
        linkedList.add(8989);
        linkedList.add(9999);
        System.out.println(linkedList.get(0)); //Вывести элемент с ключом 0 (1 элемент списка)
        linkedList.remove(2); //Удалить элемент с ключом 2 и поставить на его место следющий за ним элемент
        System.out.println(linkedList.get(1)); //Вывести элемент с ключом 1
        System.out.println(linkedList.get(2)); //Вывести элемент с ключом 2 (Замененный)
        System.out.println(linkedList.get(3)); //Вывести элемент с ключом 3

    }

}
