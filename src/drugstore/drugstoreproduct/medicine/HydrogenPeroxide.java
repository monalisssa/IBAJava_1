package drugstore.drugstoreproduct.medicine;

import drugstore.drugstoreproduct.assortment.DrugstoreProduct;

public class HydrogenPeroxide extends DrugstoreProduct {
    protected int volume; // объем в мл

    private static int hNum=0;
    private int hId;
    public HydrogenPeroxide()
    {
        super();
        volume = 0;
        generateName();
        generateMedicationUse();
        hNum=hNum+1;
        hId=hNum;
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
    }



    @Override
    protected void generateName() {
        drug_name="Перекись водорода";
    }
    @Override
    protected void generateMedicationUse()
    {
        this.medicationUse ="Антисептик, гнойные раны, кровотечение, тонзилитт";
    }
    @Override
    public String toString()
    {
        String str;
        str=super.toString()+"\n     Жидкое лекарство\n     Объем  --------- " + volume + "мл. \n     Применение -------- "+medicationUse +"\n---------------------------------" ;
        return str;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof HydrogenPeroxide)
        {
            HydrogenPeroxide temp=(HydrogenPeroxide) obj;
            return this.hId==temp.hId && this.drug_cost==temp.drug_cost &&
                    this.drug_name.equals(temp.drug_name) &&
                    this.medicationUse.equals(temp.medicationUse) &&
                    this.drug_price==temp.drug_price &&
                    this.volume==temp.volume;


        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.volume;
        hash = 47 * hash + this.hId;
        return hash;
    }
}
