class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId,String name,int maxMarks){
               this.subId=subId;
               this.name=name;
               this.maxMarks=maxMarks;
    }


    public String getSibId(){
        return subId;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtaind(){
        return marksObtain;
    }

    public void setMaxMarks(int m1){
        maxMarks=m1;
    }

    public void setMarksObtaind(int tol){
      marksObtain=tol;
    }

    boolean isQualified(int tol){
        return marksObtain>=maxMarks/10*4;
    }

    public String toString(){
        return "\nSubjextId:"+subId+"\nNmae:"+name+"\nMarks Obtained:"+marksObtain;
    }

   


}

class Student{
    private int rollNo;
    private String name;
    private String depart;
    private String subject;

    public Student(int rollNo,String name,String depart,String subject){
        this.rollNo=rollNo;
        this.name=name;
        this.depart=depart;
        this.subject=subject;

    }
    
    public int  getRollNo(){
        return rollNo;
    }

    public String getNmae(){
        return name;
    }

    public String getDepart(){
        return depart;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

  

    public String disply(){
        return "Roll no:"+rollNo+"\nName:"+name+"\nDepartment:"+depart+"\nSubject:"+subject;
    }
}





public class ArrayObject {
    public static void main(String[] args) {
        Subject sub[] = new  Subject[3];
        sub[0]=new  Subject("s101","DS",100);
        sub[1]=new Subject("s102","OS",200);
        sub[2]=new Subject("s102","MATH", 300);

        for(Subject s:sub){
            System.out.println(s);
        }

        Student s1[]=new Student[1];
        s1[0]=new Student(49,"Nutan","ENTC","MATH");

        for(Student std:s1){
            System.out.println(std);
        }
        
    }
    
}
