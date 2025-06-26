import java.util.Scanner;

class Bankacc{
    private double balance;

    public Bankacc(double balance) {
        if(balance>0) {
            this.balance = balance;
        }
        else{
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depo){
        balance=balance+depo;
        System.out.println("Your depo of "+depo+" has been done to your account. ");
        //Now your total balance is "+balance
    }

    public void withdrawal(double wdr){
        balance=balance-wdr;
        System.out.println(" Your withdrawal of "+wdr+" has been done successfully. ");
    }

}
class ATMmachine{
    private Bankacc balance;

    public ATMmachine(Bankacc balance) {
        this.balance = balance;
    }

    public Bankacc getBalance() {
        return balance;
    }

    public void display(){
        Scanner dis = new Scanner(System.in);
        boolean b=true;

        while(b) {
            System.out.println("\n\t\t ATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println(" Choose the option (1-4) : ");
            int a = dis.nextInt();

            switch (a){
                case 1:
                    System.out.println("Your balance is Rs"+balance.getBalance());
                    break;
                case 2:
                    System.out.println("Enter ammount to deposit : Rs");
                    double depoamount=dis.nextDouble();
                    balance.deposit(depoamount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: Rs");
                    double withdrawAmount = dis.nextDouble();
                    balance.withdrawal(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    b=false;
                    break;


                default:
                    System.out.println("Invalid option : choose valid option - ");
            }
        }
    }
}
public class ATMinterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial Balance : ");
        double ball=sc.nextDouble();
        Bankacc num = new Bankacc(ball);

        ATMmachine mac = new ATMmachine(num);
        mac.display();

    }
}
