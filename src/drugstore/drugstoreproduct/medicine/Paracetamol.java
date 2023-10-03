package drugstore.drugstoreproduct.medicine;

public class Paracetamol extends MedicineInTabletForm{
    private static int pNum=0;
    private int pId;
    public Paracetamol()
    {
        super();
        generateName();
        generateMedicationUse();
        pNum=pNum+1;
        pId=pNum;
    }

    @Override
    protected void generateName()
    {
        this.drug_name="Парацетамол";
    }

    @Override
    protected void generateMedicationUse()
    {
        this.medicationUse ="Анальгетик, антипиретик, обезболивающее";
    }


    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Paracetamol )
        {
            Paracetamol temp=(Paracetamol) obj;
            return this.pId==temp.pId && this.drug_cost==temp.drug_cost &&
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
        hash = 47 * hash + this.pId;
        return hash;
    }
}
