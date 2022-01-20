import java.util.Timer;
import java.util.TimerTask;

public class Demo {
    public static void main(String[] args) {
       QueueCustomer<Customer> queueList = new QueueCustomer();

       Customer cst1 = new Customer("patrick");
        Customer cst2 = new Customer("jane");
        Customer cst3 = new Customer("john");
        Customer cst4 = new Customer("paul");

        queueList.offer(cst1);
        queueList.offer(cst2);
        queueList.offer(cst3);
        queueList.offer(cst4);


            System.out.println("Customer on the Queue: [" + queueList +"]");
        System.out.println("");


    Timer timer = new Timer();

    timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {

            System.out.println("serving: "+ queueList.poll() + "\n");

            System.out.println("Remain on the Queue: [" + queueList +" ]");
            if(queueList.getSize() == 0){
             timer.cancel();
            }

        }
    },1*50*50, 1*50*50);

    }

}
