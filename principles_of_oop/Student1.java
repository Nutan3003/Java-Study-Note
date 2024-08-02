class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return total()/3;
    }

    public char grade(){
        if(average()>60)  
            return 'A';
        else if(average()<60 && average()>50)
            return 'B';
        else if(average()<50 && average()>40)
            return 'C';
        else
            return 'D';

    }

    public String details(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }

}

public class Student1 {
    public static void main(String args[]){
        Student s=new Student();
        s.roll=1;
        s.name="Nutan";
        s.course="ENTC";
        s.m1=70;
        s.m2=89;
        s.m3=80;
        System.out.println("The total is:"+s.total());
        System.out.println("The avarge is:"+s.average());
        System.out.println("The grades is:"+s.grade());
        System.out.println("Student details:\n"+s.details());
       


    }
    
}
