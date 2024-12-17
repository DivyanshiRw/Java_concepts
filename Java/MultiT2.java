class Process1 extends Thread{
    public void run(){
        int i;
        for (i=1; i<=10; i++){
            System.out.println("Process1 : "+ i);
        }
    }
}

class Process2 extends Thread{
    public void run(){
        int i;
        for (i=1; i<=10; i++){
            System.out.println("Process2 : "+ i);
        }
    }
}

public class MultiT2 {
    public static void main(String[] args) {
        Process1 p1= new Process1();
        Process2 p2= new Process2();
        p1.start();
        p2.start();
    }
}




// Thread states
// new thread, runnable, not runnable, dead state

// new thread: start(), stop()    (if any other func. used, throws IllegalThreadException)
// Runnable: run()

// Thread is made safe using synchronization

// switching from not runnable to runnable:
// resume(), notify(), notifyAll()

//dead state: stop()     (can not run again)

//Thread Priority
// setPriority(), getPriority()
// MIN_PRIORITY ---- predefined static variable  (can also use 0 in place) ---- lowest priority
// NORM_PRIORITY ----(5) ----- Default priority
// MAX_PRIORITY ---- (10) ----- Highest priority




// ThreadSyn.java






