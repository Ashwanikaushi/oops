public class driver{
    public static void main(String args[]){
        student s1 = new student();// new object
        s1.setname("Ashwani");
        s1.setrollno(0);
        s1.introduceYourself();

        student s2 = new student("kaushik", 2);// new object
        
        s2.introduceYourself();
    }
}