class student{
    String name ;
    int no;

    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.no);
    }

}


public class classobj {
    

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "krishnaji";
        s1.no = 7;
       s1.studentinfo();
        
    }
}
