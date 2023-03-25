package adv;

public class main {
    public static void main(String[] args) {
      Employee em=new Employee();
      em.setName("Shahd");
      em.Tel="0535891021";
      em.setBaseSalary(12000);
      em.setID(441017891);
em.print();
System.out.println(" the final salary is  "+  em.calculateSalary());
Supervisor sup=new Supervisor();
sup.setExperience(10);
sup.Tel="0800060";
sup.setBaseSalary(15000);
sup.setID(4417789);
sup.setName("heba");
sup.print();
System.out.println(" the final salary is  "+ sup.calculateSalary());

SaleMan sm=new SaleMan();
sm.setBouns(500);
sm.setExtraHours(6);
sm.setName("sha");
sm.setBaseSalary(15000);
sm.setID(555555555);
sm.Tel="55555555555";
sm.setSpvr(sup);
        sm.print();
        System.out.println(" the final salary is "+  sm.calculateSalary());

    }
}
