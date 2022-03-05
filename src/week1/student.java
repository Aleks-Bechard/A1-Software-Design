package week1;
/**
 * Aleks Bechard
 */
public class student
//1/25/2022 did this from gitHub
{
//1/25/2022 did this from gitHub

//must commit before pushing
//steps to push,
//git>remote>push>next>finish

//steps to mergre git>remote>fetch
//then git Repositry browser
//remote(right click)> merge reversion>finich

   private String studentId;
   private String studentName;
   private String address;

   public void setAddress (String address)
   {
      this.address = address;
   }

   public String getAddress ()
   {
      return address;
   }

   public student (String studentId, String studentName)
   {
      this.studentId = studentId;
      this.studentName = studentName;
   }

   public void setStudentId (String studentId)
   {
      this.studentId = studentId;
   }

   public void setStudentName (String studentName)
   {
      this.studentName = studentName;
   }

   public String getStudentId ()
   {
      return studentId;
   }

   public String getStudentName ()
   {
      return studentName;
   }

}
