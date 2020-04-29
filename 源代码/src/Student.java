import java.io.*;

public class Student {
    private int ID;         // ID
    private String name;    // 姓名
    private String birthday; // 生日
    private boolean gender; // 性别
  
    public Student()
   {
   }
    
    Student(int id, String name, String birthday, boolean gender) 
{
        ID = id;
        name = name;
        birDate = birthday;
        gender = gender;
    }
    public int Get_ID() {
      return ID;
    }  
    public void Set_ID(int xc_ID) { 
      ID = xc_ID;
    }  
    public String Get_name() { 
      return name; 
    }  
    public void Set_name(String xc_name) { 
      name = xc_name;
    } 
    public String Get_birthday() { 
      return birthday; 
    }
    public void Set_birthday(int year, int month, int day) { 
      birDate = year + "." + month + "." + day; 
    } 
    public String Get_gender() { 
        if(gender == true) return String.valueOf("man");
        return String.valueOf("woman");
    }
   
    public void Set_gender(String xc_gender) throws Exception {
        if(xc_gender.equals("man")) gender = true;
        else if(xc_gender.equals("woman")) gender = false;
        else throw new Exception();
    }
   
    public void Set_gender(boolean xc_gender) { 
        gender = xc_gender; }
    }