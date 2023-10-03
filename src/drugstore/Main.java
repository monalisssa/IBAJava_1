package drugstore;

import drugstore.drugstoreproduct.medicine.ActivatedCarbon;
import drugstore.drugstoreproduct.medicine.HydrogenPeroxide;
import drugstore.drugstoreproduct.medicine.Paracetamol;
import drugstore.order.Order;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        Paracetamol paracetamol = new Paracetamol();
        paracetamol.setAmount(10);
        paracetamol.setDrugCost(20);
        paracetamol.setIsByRecipe(true);
        paracetamol.setDrugPrice();

        ActivatedCarbon activatedCarbon = new ActivatedCarbon();
        activatedCarbon.setAmount(20);
        activatedCarbon.setDrugCost(8);
        activatedCarbon.setDrugPrice();

        HydrogenPeroxide hydrogenPeroxide = new HydrogenPeroxide();
        hydrogenPeroxide.setVolume(100);
        hydrogenPeroxide.setDrugCost(10);
        hydrogenPeroxide.setIsByRecipe(true);
        hydrogenPeroxide.setDrugPrice();

        order.addDrug(paracetamol);
        order.addDrug(activatedCarbon);
        order.addDrug(hydrogenPeroxide);

        order.calculateThePrice();
        order.printOrder();



    }
}