class MyThread2 extends Thread{
/* job of the thread*/
public void run(){
for(int i=0; i<10; i++){
System.out.println("Child Thread");
}
}
}
class MainThread2{
/* job of main thread*/
public static void main(String args[]){
MyThread2 mt = new MyThread2(); /* main thread created the child thread*/
mt.start();
for(int i=0; i<10; i++){
System.out.print("Main Thread");
}
}
}