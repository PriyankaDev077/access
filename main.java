class parent{
    protected void protect(){
        System.out.println("i am inside protected method");
    }
}
class child extends parent{
     void privatemethod(){
        System.out.println("i am inside private method");
    }
}
class main{
    public static void main(String[] args){
        child x=new child();
        x.privatemethod();
        parent x1=new parent();
        x1.protect();
    }
}