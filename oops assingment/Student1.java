
class Student
{
         String name;
         double math;
         double english;
         double science;
         double avg;
         double total;
		 
		 
   void assignInitialValues(String name,double math,double english,double science)
   {
         this.name=name;
         this.math=math;
         this.english=english;
         this.science=science;
   }

   void average()
   {
         total=(math+english+science);
         avg=(total/3.0);
 
   }
   void displayResult()
{
         System.out.println("Average="+avg);
          System.out.println("Total marks="+total);
		  System.out.println("name= "+name);
}
}
class StudentDemo2
{
     public static void main(String args[])
        {
             Student stud1=new Student();
              stud1.assignInitialValues("Nachiket",95.0,75.0,95.0);
              stud1.average();
              stud1.displayResult();


		}
}