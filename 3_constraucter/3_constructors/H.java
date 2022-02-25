class Student {
    String name;
    byte eng;
    byte hi;
    byte physics;
    byte math;
    byte chemistry;
    float totalp;
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name="Ritesh";
        s1.eng=78;
        s1.hi=90;
        s1.physics=92;
        s1.math=95;
        s1.chemistry=88;
        Student s2 = new Student();
        s2.name="Raj   ";
        s2.eng=89;
        s2.hi=78;
        s2.physics=82;
        s2.math=96;
        s2.chemistry=90;
        Student s3 = new Student();
        s3.name="Mohan ";
        s3.eng=80;
        s3.hi=88;
        s3.physics=86;
        s3.math=89;
        s3.chemistry=79;
        System.out.println("Student Hindi English Physics Math Chemistry Total percent");
        s1.display();
        s2.display();
        s3.display();
    }
    // void display(){
    //     totalp=(hi+eng+physics+math+chemistry)/5;
    //     System.out.println("\t\tSCORECARD\nSchool: ABC School,\nStudent Name: "+name);
    //     System.out.println("Enlish: "+eng+"\nHindi: "+hi+"\nPhysics: "+physics+"\nMathematics: "+math+"\nChemistry: "+chemistry);
    //     System.out.println("Congratulation... You have passed this Exam.\nTotal Percent: "+totalp);
    // }
    void display(){
        totalp=(hi+eng+physics+math+chemistry)/5;
        System.out.println(name+"  " +hi+"\t"+eng+"  \t"+physics+"  \t"+math+"   "+chemistry+"\t\t"+totalp);
    }
}
