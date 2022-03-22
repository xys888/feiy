package test;

public class TestPrint {
    static int i = 1;

    public static void main(String[] args) throws Exception {
        final Object obj = new Object();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        synchronized (obj) {
                            Thread.sleep(1000);
                            obj.notifyAll();
                            obj.wait();
                            if (i == 1)
                                System.out.println(i++ % 3);
                        }
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        synchronized (obj) {
                            Thread.sleep(1000);
                            obj.notifyAll();
                            obj.wait();
                            if (i == 2)
                                System.out.println(i++ % 3);
                        }
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        synchronized (obj) {
                            Thread.sleep(1000);
                            obj.notifyAll();
                            obj.wait();
                            if (i == 3) {
                                System.out.println(3);
                                i = 1;
                            }
                        }
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    };
}