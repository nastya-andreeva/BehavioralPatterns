package iterator.presentation;

import iterator.domain.Item;
import iterator.domain.ItemType;
import iterator.domain.TreasureChest;
import iterator.domain.TreasureChestItemIterator;

public class Application {
    public static void main(String[] args) {
        TreasureChest treasureChest = new TreasureChest();

        TreasureChestItemIterator treasureChestIterator = (TreasureChestItemIterator) treasureChest.iterator(ItemType.ANY);
        while (treasureChestIterator.hasNext()) {
            Item item = treasureChestIterator.next();
            System.out.println(item.toString());
        }
    }
}