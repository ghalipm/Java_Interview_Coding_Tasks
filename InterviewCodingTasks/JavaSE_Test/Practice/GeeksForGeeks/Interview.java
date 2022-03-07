package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.*;

public class Interview {
    public static class Item {
        public long id;
        public String value;
        public Map<String, Boolean> keys;
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        public Map<String, Boolean> getKeys() {
            return keys;
        }
        public void setKeys(Map<String, Boolean> keys) {
            this.keys = keys;
        }
    }
    public Map<Long, String> identifyActiveKeys(List<Item> keys) {
        List<Item> active = new ArrayList<>();
        Iterator<Item> iter = keys.iterator();
        do {
            Item next = iter.next();
            if (next != null) {
                if (next.keys != null) {
                    for (Map.Entry<String, Boolean> entry : next.keys.entrySet()) {
                        if (entry.getValue()) {
                            active.add(next);
                            break;
                        }
                    }
                }
            }
        } while (iter.hasNext());
        Map<Long, String> activeKeyIds = new HashMap<>();
        Iterator<Item> iter2 = active.iterator();
        do {
            Item activeItem = iter2.next();
            activeKeyIds.put(activeItem.id, activeItem.value);
        } while (iter.hasNext());
        return activeKeyIds;
    }

    public static void main(String[] args) {
        Item item=new Item();
        item.setId(123456789);
        item.setValue("Alpha Man");

        System.out.println("item.getId() = " + item.getId());
        System.out.println("item.getValue() = " + item.getValue());
    }
}
