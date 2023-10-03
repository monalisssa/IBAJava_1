package drugstore.drugstoreproduct.assortment;

import drugstore.CalculateThePriceInterface;

abstract public class DrugstoreProduct implements CalculateThePriceInterface {

    protected String drug_name;//Название препарата
    protected int drug_cost;//Цена препарата, официально установленная
    protected boolean isByRecipe;//По рецепту или нет
    protected double drug_price;//Окончательная стоимость препарата, при заказе
    protected String medicationUse; //Применение
    public DrugstoreProduct()
    {
        drug_name =new String();
        drug_price =0;
        isByRecipe = false;
        drug_cost = 0;
        medicationUse = new String();

    }
    abstract protected void generateName(); //абстрактная функция
    abstract protected void generateMedicationUse();

    public void setIsByRecipe(boolean isByRecipe)
    {
        this.isByRecipe = isByRecipe;
    }
    public void setDrugCost(int drug_cost) {this.drug_cost = drug_cost; }

    public void setDrugPrice() {
        if(isByRecipe) this.drug_price = calculateThePrice();
        else this.drug_price = this.drug_cost;
    }

    public String getProductName()
    {
        return drug_name;
    }

    public boolean getIsByRecipe()
    {
        return isByRecipe;
    }
    public int getDrugCost() {return drug_cost; }

    public double getDrugPrice() {
        return drug_price;
    }
    @Override
    public double calculateThePrice() // подсчёт стоимости препарата со скидкой 40% (это если по рецепту)
    {
        double price;
        price= (double) this.drug_cost * 0.4;
        return price;
    }

    @Override
    public String toString()
    {
        String str;
        str= "   Название препарата ---------- " + drug_name + ".\n     Цена препарата  -------- " + drug_cost + " руб.";
        if(isByRecipe) str += "\n     Был выписан по рецепту.\n     Цена со скидкой (40%) -------- " + drug_price + " руб.";
        else str += "\n     Не был выписан по рецепту\n     Скидка не предоставляется. ";
        return str;
    }
}

