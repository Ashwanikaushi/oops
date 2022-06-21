public class student {
   private String name;
    private int rollno;
    // getters and setters
    public String getname(){
        return name;
    }
    public int getrollno(){
        return rollno;

    }
    public void setname(String username){
        if(username.length() == 0){
            System.out.println("error");
            return;
        }
        name = username;
    }
    public void setrollno(int userrollno){
        if(userrollno <=0){
             System.out.println("error");
            return;
        }
        rollno = userrollno;
    }

    public void introduceYourself(){
        System.out.println("Hello, my name is "+name+". My rollno is "+rollno );
    }

    // constructors
    // 1.default 
    student(){
        System.out.println("yay, we got a new admission");
        name = "-";
        rollno = 1;
    }
    //2. parameterised
    student(String username, int userrollno){
        name = username;
        rollno = userrollno;
    }
}