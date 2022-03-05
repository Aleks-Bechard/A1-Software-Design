package week1;
/**
 * Aleks Bechard
 */
public class start
{
   public static void main (String[] args)
   {
      student[] list = new student[4];

      list[0] = new student("s1", "Aleks Bechard");
      list[1] = new student("s2", "Tina Beclcher");
      list[2] = new student("s3", "Bob Belcher");
      list[3] = new student("s4", "Linda Belcher");

      for (int i = 0; i < list.length; i++) {
         System.out.println(list[i].getStudentId() + "  " + list[i].getStudentName());

      }


   }
}
