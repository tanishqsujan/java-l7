class student{
    private String name;
    public String getname(){
        return name;
    }
public void setname(String name){
    this.name=name;
}
}
class getset{
    public static void main(String[] args){
        student s= new student();
        s.setname("Tanishq Codingal");
        System.out.println(s.getname());
    }
}