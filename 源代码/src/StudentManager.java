
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> stu = new ArrayList<Student>();
    StudentManager()
   { 
   }
    public int Get_Student_sum()
   {   
      return stu.size();
   } 
    void Insert_Student(int id, String name, String  birthday, boolean stu_gender) throws Exception {
        if(stu_birDate.length() != 10) throw new Exception();   
        else {
            for(int i = 0;i < stu_birDate.length();++i)
             {
                if((i == 4 || i == 7) && stu_birDate.charAt(i) != '.')
                    throw new Exception();
                if(i != 4 && i != 7 && stu_birDate.charAt(i) == '.')
                    throw new Exception();
             }
        }
        Student add_Student = new Student(stu_id, stu_name, stu_birDate, stu_gender);
        int add_Index = stu.size();
        for(int i = 0;i < stu.size();++i)
      {
            Student t = stu.get(i);
            if(add_Student.Get_ID() < t.Get_ID()) {
                add_Index = i;
                break;
            }
        }
        stu.add(add_Index, add_Student);  
        System.out.println("Insert successfully!");
    }
public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<Student>();
    void App(){
        while (true){
            System.out.println("");
            System.out.println("��ѡ�������");
            System.out.println("***********************************");
            System.out.println("*                           1  ����                                  *");
            System.out.println("*                           2  ����                                  *");
            System.out.println("*                           3  ɾ��                                  *");
            System.out.println("*                           4  �޸�                                  *");
            System.out.println("*                           5  ���                                  *");
            System.out.println("*                           6  �˳�                                  *");
            System.out.println("***********************************");
    public void Print_Student() {
        if(stu.size() == 0) System.out.println("No students!"); 
        else {
            for(Student res : stu) {
                System.out.println("ID: " + res.Get_ID() + ", Name: " + 
                    res.Get_name() + ", Birthday: " + res.Get_birDate() + 
                    ", Gender: " + res.Get_gender());
            }
        }
    }
    public void Find_Student(String name) {
        boolean flg = false;  
        for(Student res : stu) {
            if(name.equals(res.Get_name())) {
                flg = true;
                break;
            }
        }
        if(flg) System.out.println("Query successful");
        else System.out.println("Query failed");
    }
    public void Del_Student(String name) {
        Iterator<Student> it = stu.iterator();  
        while(it.hasNext()) {
            Student t_student = it.next();
            if(t_student.Get_name().equals(name)) it.remove();        
  }
        System.out.println("successfully deleted");
    }
  
    public void Modify_Studen(String name, int year, int month, int day) {
        Iterator<Student > it = stu.iterator();
        while(it.hasNext()) {
            Student t = it.next();
            if(t.Get_name().equals(name)) t.Set_birDate(year, month, day);         }
        System.out.println("Successfully modified");
    }
        System.out.println("��ѡ����Ҫ���еĲ���");
	System.out.println("1����������");
	System.out.println("2���޸�����");
	System.out.println("3��ɾ������");
	System.out.println("4����������");
	System.out.println("5���鿴ȫ����Ϣ");
	System.out.println("6������������Ӵ�С");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();//��������������
    public void App() {
        Scanner in = new Scanner(System.in);
        while(true) {
            try {
                Get_Menu()
                int op = in.nextInt(); 
                boolean is_quit = false; 
                in.nextLine(); 
                switch (op) {
                    case 1: 
                        System.out.println("������ѧ����id, ����, ����(��.��.����ʽ��ex: 1999.01.01), �Ա�(man, woman): ");
                        int stu_id = in.nextInt();
                        String stu_name = in.next(); 
                        String stu_birDate = in.next(); 
                        boolean stu_gender;
                        String gender = in.next();
                        if(gender.equals("man")) stu_gender = true;
                        else if(gender.equals("woman")) stu_gender = false;
                        else throw new Exception();
                        Insert_Student(stu_id, stu_name, stu_birDate, stu_gender);
                        break;
                    case 2:
                        System.out.println("������ѧ������: ");
                        String Find_Name = in.next();
                        Find_Student(Find_Name);
                        break;
                    case 3: 
                        System.out.println("������ѧ������: ");
                        Del_Student(in.next());
                        break;
                    case 4: 
                        System.out.println("������ѧ������, ��, ��, �� ");
                        String name = in.next();
                        int year = in.nextInt();
                        int month = in.nextInt();
                        int day = in.nextInt();
                        Modify_Studen(name, year, month, day);
                        break;
                    case 5: 
                        Print_Student();
                        break;
                    case 6:
                        is_quit = true;
                        break;
                    default: 
                        throw new Exception();
                }
                if(is_quit) {
                    System.out.println("Goodbye!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect operation input! Please input again!");
                in.nextLine();
            }
        }
      public static void search(Map<Integer, Mymap> map)
	{
		System.out.println("������Ҫ���ҵ�ѧ��");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Integer A=new Integer(a);
		int l=1;
		for (Map.Entry<Integer, Mymap> i:map.entrySet())
		{
			if (A.equals(i.getKey()))
			{
				l=2;
				System.out.println("ѧ��     ����   ����");
				System.out.println("��ѯ��������Ϊ��"+i.getKey()+" "+i.getValue());
			}
		}
		if (l==1)
		{
			System.out.println("û��ƥ�䵽������ݣ�");
		}
	}
	public static void change(Map<Integer,Mymap> map)
	{
		System.out.println("������Ҫ�޸ĵ�ѧ��");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Integer A=new Integer(a);//int��Ҫ��װ��integer��
		int l=1;
		for (Map.Entry<Integer, Mymap> i:map.entrySet())
		{
			if (A.equals(i.getKey()))
			{
				l=2;
				System.out.println("ѧ��     ����   ����");
				System.out.println("��Ҫ�޸ĵ����ݣ�"+i.getKey()+" "+i.getValue());
				System.out.println("�������µ�ѧ��");
				int a1=sc.nextInt();
				Integer A1=new Integer(a1);
				A=A1;
				System.out.println("����������");
				i.getValue().name=sc.next();
				System.out.println("�������·���");
				i.getValue().score=sc.nextInt();
				System.out.println("�޸ĳɹ����޸ĺ�����");
				for (Map.Entry<Integer, Mymap> k:map.entrySet())
				{
					System.out.println(k.getKey()+" "+k.getValue());
				}
			}
		}
		if (l==1)
		{
			System.out.println("û��ƥ�䵽������ݣ�");
		}	
	}
	public static void delete(Map<Integer,Mymap>map)
	{
		System.out.println("������Ҫɾ����ѧ��");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Integer A=new Integer(a);//int��Ҫ��װ��integer��
		int l=1;
		for (Map.Entry<Integer, Mymap> i:map.entrySet())
		{
			if (A.equals(i.getKey()))
			{
				
				System.out.println("ѧ��    ����   ����");
				System.out.println("Ҫɾ��������Ϊ��"+i.getKey()+" "+i.getValue());
				l=2;
			}
		}
		if (l==1)
		{
			System.out.println("û��ƥ�䵽������ݣ�");
		}
		else
		{
			if (l==2)
			{
				map.remove(A);
				System.out.println("�ɹ�ɾ������ɾ������������£�");
				for (Map.Entry<Integer, Mymap> k:map.entrySet())
				{
					System.out.println(k.getKey()+" "+k.getValue());
				}
			}
		}	
	}
	public static void add(Map<Integer,Mymap> map)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ѧ��");
		int a1=sc.nextInt();
		for (Map.Entry<Integer, Mymap> i:map.entrySet())
		{
			if (a1==i.getKey())
			{
				System.out.println("���ѧ���Ѵ��ڣ�����������");
				a1=sc.nextInt();
			}
		}
		Integer A1=new Integer(a1);
		System.out.println("�������µ�����");
		String str=sc.next();
		System.out.println("�������µķ���");
		int a11=sc.nextInt();
		map.put(A1,new Mymap(str,a11));
		Map<Integer,Mymap> map1=new TreeMap<Integer,Mymap>();
		map1.putAll(map);
		System.out.println("��ӳɹ�������Ӻ���������£�");
		for (Map.Entry<Integer, Mymap> i:map1.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	 }	
         }	
        in.close();
    }
}