public class SynchronizationWaitNotfy {
    public static void main(String args[]) {
        Account_1 ac= new Account_1();

        new Thread(new Withdraw01(ac,"A")).start();
        new Thread(new Withdraw01(ac,"B")).start();
        new Thread(new Deposit01(ac)).start();

    }
}

class Account_1 {
    static final int BALANCE = 700;
    public static int balance = 2000;

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money,String name){
        while (balance <= money){
            System.out.println("Withdraw Waiting");
            try {
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
        while (true){
            if(balance >= 0){
                try { Thread.sleep(1000);} catch(InterruptedException e) {}
                balance -= money;
                System.out.println(name + " Withdraw : "+ money);
                System.out.println(getBalance());
                notify();
            }
        }

    }
    public void deposit(int money){
        while(balance <= BALANCE){
            try {
                wait();
                Thread.sleep(500);
            }catch (InterruptedException e){}
            System.out.println("Wait a Minute");
        }
        try { Thread.sleep(500);} catch(InterruptedException e) {}
        balance += money;
        notify();
        System.out.println("Deposit : "+ money);
    }
}



class Withdraw01 implements Runnable {
    private Account_1 ac;
    private String name;
    Withdraw01(Account_1 ac , String name){
        this.ac = ac;
        this.name=name;
    }
    public void run(){
        while (true){
            try { Thread.sleep(100);} catch(InterruptedException e) {}
            int money = (int)(Math.random() * 3 + 1) * 100;
            ac.withdraw(money,name);
            System.out.println(ac.getBalance());
        }
    }
}
class Deposit01 implements Runnable {
    private Account_1 ac;
    Deposit01(Account_1 ac){
        this.ac = ac;
    }
    public void run() {
        while (true){
            int money = (int)(Math.random() * 3 + 1) * 100;
            ac.deposit(money);
            System.out.println(ac.getBalance());
            try { Thread.sleep(10);} catch(InterruptedException e) {}

        }

    }
}

