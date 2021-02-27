package finalexam.iterator;

import java.util.Iterator;

public class ItemRepository {
    private String[][] items = {{"item1", "item2", "item3", "item4"},
            {"item5", "item6"},
            {"item7", "item8", "item9"}};

    public Iterator getIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator {
        
        int position =0;
        int iteminsede = 0;
        @Override
        public boolean hasNext() {
            if((position >= items.length) || items[position] == null)
                return false;
            return true;
        }

        @Override
        public Object next() {
            String item = items[position][iteminsede];
            iteminsede++;
            if((iteminsede >= items[position].length) || items[position] == null){
                position++;
                iteminsede = 0;
            }
            return item;
        }
    }

    public static void main(String... args){
        ItemRepository rep = new ItemRepository();
        Iterator itr = rep.getIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
