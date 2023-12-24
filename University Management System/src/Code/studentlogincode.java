
import java.util.Scanner;


public class studentlogincode {
    protected
      String stdName;
      String regNO;
      int stdSem;
      String stdDep;
      double CGPA;
      String stdPass;

      studentlogincode(String stdName,String regNO,int stdSem,String stdDep,double CGPA,String stdPass){
        this.stdName=stdName;
        this.regNO=regNO;
        this.stdSem=stdSem;
        this.stdDep=stdDep;
        this.CGPA=CGPA;
        this.stdPass=stdPass;

      }
      studentlogincode(){

      }
  public void setName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Name ");
      stdName = input.nextLine();
  }
  public void setReg(){
   Scanner input1 = new Scanner(System.in);
    System.out.println("Reg no. ");
      regNO = input1.nextLine();
  }
  public void setSem(){
    Scanner input2 = new Scanner(System.in);
    System.out.println("Semester ");
      stdSem = input2.nextInt();
  }
  public void setDep(){
    Scanner input3 = new Scanner(System.in);
    System.out.println("Department ");
      stdDep = input3.nextLine();
  }
   public void setCGPA(){
    Scanner input4 = new Scanner(System.in);
    System.out.println("CGPA ");
      CGPA = input4.nextDouble();
   }
   public void setPass(){
    Scanner input5 = new Scanner(System.in);
    System.out.println("Password ");
      stdPass = input5.nextLine();
  }
  public void getName(){
    System.out.println(stdName);
  }
  public void getReg(){
    System.out.println(regNO);
  }
  public void getSem(){
    System.out.println(stdSem);
  }
public void getDep(){
    System.out.println(stdDep);
  }
  public void getCGPA(){
    System.out.println(CGPA);
  }
  public void getPass(){
    System.out.println(stdPass);
  
            

}
      
}

