public class Main{
    public static void main(String[] args){
//        Item item = new Item("Pepsi", 3.99, 3);
//        System.out.println(item);
        Item [][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 1.49, 3)},
                { new Item("Fanta", 1.99, 3), new Item("Barq's", 2.69, 1), new Item("A&W", 2.29, 2)},
                { new Item("Crush", 1.99, 3), new Item("C-Cola", 3.19, 0), new Item("Berry", 0.79, 5)},
        };

        Machine machine = new Machine(items);
        Item temp = machine.getItem(1,1);
        temp.setPrice(2.99);
        machine.setItem(temp,1,1);
        System.out.println(machine.getItem(1,1));
    }
}