package drugstore.drugstoreproduct.medicine;

public class ActivatedCarbon extends MedicineInTabletForm{
    private static int aNum=0;
    private int aId;
    public ActivatedCarbon()
    {
        super();
        generateMedicationUse();
        generateName();
        aNum=aNum+1;
        aId=aNum;
    }

    public void setNumber_of_packages(int numberOfPackages)
    {
        this.amount = numberOfPackages;
    }
    @Override
    protected void generateName()
    {
        this.drug_name="Уголь активированный";
    }

    @Override
    protected void generateMedicationUse()
    {
        this.medicationUse ="От пищевой токсикоинфекции, дизентерии";
    }


    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof ActivatedCarbon)
        {
            ActivatedCarbon temp=(ActivatedCarbon) obj;
            return this.aId==temp.aId && this.drug_cost==temp.drug_cost &&

                    this.drug_name.equals(temp.drug_name) &&
                    this.medicationUse.equals(temp.medicationUse) &&
                    this.drug_price==temp.drug_price &&
                    this.amount==temp.amount;


        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.amount;
        hash = 47 * hash + this.aId;
        return hash;
    }
}
