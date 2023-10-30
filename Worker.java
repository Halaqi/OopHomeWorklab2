import java.util.Scanner;
public class Worker {
    String name;
    int ssn;
    float wage;
    int workingH;

    public void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter worker's name");
        name=scanner.nextLine();
        System.out.println("enter worker's SSN");
        ssn=scanner.nextInt();
        System.out.println("enter worker's wage");
        wage=scanner.nextFloat();
        System.out.println("enter working hours");
        workingH=scanner.nextInt();

    }
   public void displayinfo()
   {
       System.out.println("The worker's name :"+name);
       System.out.println("The worker's SSN: "+ssn);
   }
  public float displaysalary()
  {
      float salary = wage*workingH;
      System.out.println("The worker's salary is :"+salary);
      return (float) salary;
  }

}
