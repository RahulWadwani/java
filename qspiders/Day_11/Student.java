class Student {
    
    
    int Stud_id;        //global variable
    String Stud_name;   //global variable
    double Stud_per;    //global variable

    //constructor 
    Student(int stud_id,String stud_name,double stud_per)
    {
        this.Stud_id = stud_id;
        this.Stud_name = stud_name;
        this.Stud_per = stud_per; 
    }
    public static void main(String[]args)
    {
        // non static method calling 
        System.out.println("      Student Details      ");
        System.out.println("---------------------------");
        Student ref1 = new Student(123456, "Rahul", 83.6);
        System.out.println("student id         : " + ref1.Stud_id);
        System.out.println("student name       : " + ref1.Stud_name);
        System.out.println("student Percentage : " + ref1.Stud_per);
        
        System.out.println("---------------------------");
        // non static method calling 
        Student ref2 = new Student(123457, "Ruksar", 89.6);
        System.out.println("student id         : " + ref2.Stud_id);
        System.out.println("student name       : " + ref2.Stud_name);
        System.out.println("student Percentage : " + ref2.Stud_per);

        System.out.println("---------------------------");
    }
    
}
