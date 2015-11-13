package com.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Ravikumar Maddi";
      e.address = "aaaaaaaaaaaaaaaaa";
      e.SSN = 99999999;
      e.number = 999;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}