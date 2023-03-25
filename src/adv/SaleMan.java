package adv;

public class SaleMan extends Employee {

    private double bouns;
    private double extraHours;
    private Supervisor spvr;
    public static int numOfSaleMan=0;

    public SaleMan() {
     ++numOfSaleMan;
    }
    public void setBouns(double bouns){
        this.bouns= bouns;
    }
    public double getBouns(){return bouns;}

    public double getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(double extraHours) {
        this.extraHours = extraHours;
    }

    public Supervisor getSpvr() {
        return spvr;
    }

    public void setSpvr(Supervisor spvr) {
        this.spvr = spvr;
    }

    @Override
    public double calculateSalary() {
        bouns=extraHours*50;
        return bouns+getBaseSalary();
    }

    @Override
    public void print() {
        System.out.println();
       super.print();
        System.out.println( "SaleMan{" + "bouns= " + bouns + ", extraHours= " + extraHours + numOfSaleMan+" + numOfSaleMan\n "+ numOfSaleMan  );
        spvr.print();

    }
}
