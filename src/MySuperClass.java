/**
 * Created with IntelliJ IDEA.
 * User: fr0ga
 * Date: 18.10.13
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
class MySuperClass {
   void message() {
        System.out.println("From the super class!");
    }
}

class MySubClass extends  MySuperClass {
     public void message() {
        System.out.println("From the subclass");
    }

    public static void main(String args[]) {
        MySubClass mysub = new MySubClass();
        mysub.message();
    }
}
