package Thread;
//多线程练习题：
//        创建3个线程，分别计算
//         1+2+3+4+...+1000000的和
//         1+3+5+7+...+100 0001的和
//         1^2 + 2^2 + 3^2 + ... +10 0000的和
//        对比单线程情况下的速度
public class CreateThreadPractice {
    private static class P1 extends Thread{
        private long count=100_0000;

        @Override
        public void run() {
            long sum1=0;
            for(int i=1;i<=count;i++){
                sum1+=i;
            }
            System.out.println("P1: 1 + 2 + ... + n = "+sum1);
        }
    }
    private static class P2 extends Thread{
        private long count=100_0001;

        @Override
        public void run() {
            long sum2=0;
            for(int i=1;i<=count;i+=2){
                sum2+=i;
            }
            System.out.println("P2: 1 + 3 + ... + n = "+sum2);
        }
    }

    private static class P3 extends Thread{
        private long count=10_0000;

        @Override
        public void run() {
            long sum3=0;
            for(int i=1;i<=count;i++){
                sum3+=i*i;
            }
            System.out.println("P3:1^2 + 2^2 + ... + n^2 = "+sum3);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread thread1=new P1();
        Thread thread2=new P2();
        Thread thread3=new P3();
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        long end=System.currentTimeMillis();
        double s=(end-begin)*1.0/1000;
        System.out.println("共耗时："+s);
    }
}
