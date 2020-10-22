package day23overridingnt;

class A {
    int i;
    public void display() {
        System.out.println(i);
    }    
}    
class B extends A{
    int j;
    public void display() {
        System.out.println(j);
    } 
}    
class Main {
    public static void main(String args[]){
        B obj2 = new B();
        obj2.i = 1;
        obj2.j = 2;
        A r = obj2;
        System.out.println(obj2.i);
        r.display();     
    }
}