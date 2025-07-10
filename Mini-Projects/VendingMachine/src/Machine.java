public class Machine {
    private Item[][] items;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]); //copie nu referinta
            }
        }
    }

    public Item getItem(int row, int spot){
        return new Item(items[row][spot]);
    }

    public void setItem(Item item, int row, int spot){
        this.items[row][spot] = new Item(item);
    }
}
