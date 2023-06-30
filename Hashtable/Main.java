package HashTable;

public class Main {
    public static void main(String[] args) throws Exception {
        Hash table = new Hash(10);
        table.put("name", "Andrey");
        table.put("age", "18");
        table.put("high", "176");
        table.put("born", "19.01.2005");
        table.put("addres", "moldavskiy,2");
        table.put("car", "none");
        table.put("city", "Voronezh");
        table.put("child", "none");

        
        table.remove("addres");

        System.out.println(table.get("age"));
        System.out.println(table.get("name"));
    }
}
