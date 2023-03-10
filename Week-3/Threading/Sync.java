package dxc_Next;
class Counter {
    int sum;
    public Counter() {
        sum = 0;
    }
    public void add(int value) {
        sum += value;
    }
}

public class Sync {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numberOfThreads = 1000;
        Thread[] threads = new Thread[numberOfThreads];
        
        // Without synchronization
       
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    counter.add(1);
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Without synchronization, sum = " + counter.sum);
        counter.sum = 0;
        
        // With synchronization
      
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    synchronized(counter) {
                        counter.add(1);
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("With synchronization, sum = " + counter.sum);
    }
}


