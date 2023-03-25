package adv;

public class Supervisor extends Employee {
    private int experience;
    public static int numOfSupervisor=0;

    public Supervisor() {
       ++ numOfSupervisor;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public double calculateSalary(){

      return  (experience*0.5*getBaseSalary())+getBaseSalary();

    }
    public void print(){
        System.out.println();
        super.print();
        System.out.print("Experience of supervisor is: "+experience+" numOfSupervisor is "+numOfSupervisor+"\n");
    }
}
