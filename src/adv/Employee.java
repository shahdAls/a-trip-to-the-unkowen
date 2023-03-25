package adv;

public class Employee {
  private String name;
  private int ID;
  public String Tel;
  private double baseSalary;

    public Employee(){
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
   public double calculateSalary(){

        return baseSalary;

   }

    public void print(){

        System.out.println(" The Name "+name+" ID is "+ID+" Base Salary " +baseSalary);


    }
}
