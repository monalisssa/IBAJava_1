package drugstore.order;

import drugstore.CalculateThePriceInterface;
import drugstore.drugstoreproduct.assortment.DrugstoreProduct;

import java.util.*;

public class Order implements CalculateThePriceInterface{

    private List<DrugstoreProduct> productsList;
    private int cost;
    private double price;
    private static int orderNum=0;

    public Order()
    {
        productsList = new ArrayList<DrugstoreProduct>();
        orderNum=orderNum+1;
    }

    public void addDrug(DrugstoreProduct obj)
    {
        productsList.add(obj);
    }

    public void removeDrug(DrugstoreProduct obj)
    {
        productsList.remove(obj);
    }

    public void printOrder()
    {
        int i=1;
        Iterator it=productsList.iterator();
        System.out.println("=================================================");
        while(it.hasNext())
        {
            System.out.println(i+")"+(it.next()).toString());
            i++;
        }
        System.out.println("     Цена заказа ---------- "+cost+" руб. \n     Цена заказа с учётом всех скидок ---------- "+price + " руб.");
        System.out.println("=================================================");


    }


    @Override
    protected void finalize()
    {
        try {
            super.finalize();
            System.err.println("Заказ удалён!");
        } catch (Throwable ex) {
            System.err.println("Ошибка при удалении заказа");
        }
        orderNum=orderNum-1;
    }

    @Override
    public double calculateThePrice() {
        double tempPrice = 0;
        int tempCost = 0;
        Iterator it=productsList.iterator();
        DrugstoreProduct obj;
        while(it.hasNext())
        {
            obj=(DrugstoreProduct) it.next();
            tempPrice=tempPrice+obj.getDrugPrice();
            tempCost=tempCost+obj.getDrugCost();
        }
        price = tempPrice;
        cost = tempCost;
        return tempPrice;
    }

}
