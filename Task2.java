import java.util.*;
class Task2
{
    public static void main(String[] args)
    {
        System.out.println("GRADE CALACULATION");
        System.out.println();
        String name;
        int s1,s2,s3,s4,s5,tot,avg;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Student Name:");
        name=s.nextLine();
        System.out.println();
        System.out.print("Enter Subject 1 Marks:");
        s1=s.nextInt();
        System.out.print("Enter Subject 2 Marks:");
        s2=s.nextInt();
        System.out.print("Enter Subject 3 Marks:");
        s3=s.nextInt();
        System.out.print("Enter Subject 4 Marks:");
        s4=s.nextInt();
        System.out.print("Enter Subject 5 Marks:");
        s5=s.nextInt();
        System.out.println();
        tot=s1+s2+s3+s4+s5;
        avg=tot/5;
        if (avg>=95)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: A+");
        }
        else if (avg>=90 && avg<95)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: A");
        }
        else if (avg>=80 && avg<90)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: B");
        }
        else if (avg>=60 && avg<80)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: C");
        }
        else if (avg>=50 && avg<60)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: D");
        }
        else if (avg>=40 && avg<50)
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: E");
        }
        else
        {
            System.out.println("Name:"+name);
            System.out.println("Total Marks="+tot);
            System.out.println("Percentage="+avg);
            System.out.println("Grade: F");
        }
    }
}