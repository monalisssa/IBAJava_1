package drugstore.drugstoreproduct.medicine;

import drugstore.drugstoreproduct.assortment.DrugstoreProduct;

abstract public class MedicineInTabletForm extends DrugstoreProduct {

    protected int amount; // количество таблеток в упаковке
    public MedicineInTabletForm()
    {
        super();
        amount = 0;
        generateName();
        generateMedicationUse();
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    @Override
    protected void generateName() {
        drug_name="Лекарство в виде таблеток";
    }
    @Override
    protected void generateMedicationUse()
    {
        this.medicationUse ="Применение лекарства в виде таблеток";
    }
    @Override
    public String toString()
    {
        String str;
        str=super.toString()+"\n     Лекарство в виде таблеток.\n     Количество таблеток в упаковке --------- " + amount + "шт. \n     Применение -------- "+ medicationUse + "\n---------------------------------";
        return str;
    }
}
