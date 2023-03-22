package Singleton;

 class First {
    String name,majority;
    int age;
    private static First admin;

   private First(String name,int age ,String majority) {
       this.name = name;
       this.age = age;
       this.majority = majority;
   }
    public  static  First getAdmin(String name,int age ,String majority){
       if(admin==null){
           admin=new First(name, age, majority);
       }
       return admin;
    }

    public  void printinfo(){
        System.out.println("Your name is\t"+name+"\nyour age is \t"+age+"\n and your majoroty is"+majority);
    }

     public static void main(String[] args) {
         First f1=new First("asd",66,"dasd");
         f1.printinfo();
     }

}
