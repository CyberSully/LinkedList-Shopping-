package LinkedList;
import java.util.Scanner;

import LinkedList.BagInterface;
import LinkedList.Item;
import LinkedList.LinkedBag;

/** A class that maintains an inventory for an online store.
 @author Brett Sullivan
 @version 4.0
 */
public class Inventory
{
    public static void main(String[] args)
    {
        Item[] items = {new Item("Bird feeder", 20.50, 5549, 15),
                new Item("Squirrel guard", 15.47, 5550, 8),
                new Item("Bird bath", 44.99, 5551, 5),
                new Item("Sunflower seeds", 12.95, 5552, 24),
                new Item("Cat Bed", 58.99, 5553, 9),
                new Item("Dog Bed", 68.99, 5554, 9),
                new Item("Squirrel Bed", 38.99, 5555,4),
                new Item("Pig Bed", 78.99, 5556, 2),
                new Item("Cat Brush", 12.99, 5557, 30),
                new Item("Dog Brush", 14.99, 5558, 20),
                new Item("Squirrel Brush", 99.99, 5559, 2)
        };

        BagInterface<Item> shopInventory = new LinkedBag<Item>();
        double totalCost = 0;

        // Statements that add selected items to the shopping cart:
        for (int index = 0; index < items.length; index++)
        {
            Item nextItem = items[index]; // Simulate getting item from shopper
            shopInventory.add(nextItem);
            totalCost = totalCost + nextItem.getPrice();
            System.out.println(nextItem);
        } // end for
        System.out.println();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the SKU number of the item you want to find");
        int skuWanted  = input.nextInt();
        //ask user for sku
        System.out.println(((LinkedBag<Item>) shopInventory).getItem(skuWanted));
    } // end main
} // end Inventory

