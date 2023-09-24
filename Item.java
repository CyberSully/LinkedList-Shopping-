package LinkedList;

/** A class of items for sale.
 @author Brett Sullivan
 @version 4.0
 */
public class Item
{
    private String name;

    private int SKUnum;

    private double itemCost;

    private int itemQuantity;


    public Item(String productName, double productPrice, int skuNumber, int quantity)
    {
        name = productName;
        itemCost = productPrice;
        SKUnum = skuNumber;
        itemQuantity = quantity;


    } // end constructor

    public String getDescription()
    {
        return name;
    } // end getDescription

    public double getPrice()
    {
        return itemCost;
    } // end getPrice

    public int getSKUnum() {
        return SKUnum;
    }

    public String toString()
    {
        return name + "\t$" + itemCost + "," + " sku number is " + SKUnum + ", Quantity is "+ itemQuantity;
    } // end toString
} // end Item
//Specifically, add instance variables for all four data fields (Name, SKU number, Cost of item,
//Quantity on hand)
//Change the constructor to initialize all four data fields.
//Change the toString() method to return all four fields.
