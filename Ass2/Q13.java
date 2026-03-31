package Ass2;
import java.util.Scanner;
class Bank{
	String bankName;
	int depositAmount;
	static double totalAmount = 0;
	void setBankName(String bankName){
		this.bankName = bankName;
		
	}
	void setAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	void showData() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("DepositAmount: " + depositAmount);
		System.out.println("Total Amount: " + calculateCost());
		
	}
	double calculateCost() {
	     
	     totalAmount += depositAmount;
	     return totalAmount;
	}
	static String LeastAmount(Bank arr[]) {
		int least = 999999;
		String k="";
            for (Bank arr1 : arr) {
                if (arr1.depositAmount < least) {
                    least = arr1.depositAmount;
                    k = arr1.bankName;
                    System.out.println(k);
                }
            }
		return k;
	}
}
public class Q13 {
	public static void main(String[] args) {
		Bank [] banks = new Bank[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < banks.length;i++) {
			banks[i] = new Bank();
			System.out.println("Enter a Bank name: ");
			String a = sc.next();
			banks[i].setBankName(a);
			System.out.println("Enter amount: ");
			int b = sc.nextInt();
			banks[i].setAmount(b);
		}
		//banks[0] = new Bank();
		//banks[0].setBankName("SBI");
		//banks[0].setAmount(10000);
		
		//banks[1] = new Bank();
//		banks[1].setBankName("ICICI");
//		banks[1].setAmount(10001);

//		banks[2] = new Bank();
//		banks[2].setBankName("HDFC");
//		banks[2].setAmount(15000);

//		banks[3] = new Bank();
//		banks[3].setBankName("Axis");
//		banks[3].setAmount(12000);

//		banks[4] = new Bank();
//		banks[4].setBankName("PNB");
//		banks[4].setAmount(20000);
		
		for(int i = 0; i < banks.length; i++) {
			System.out.println("\nDetails of Bank " + (i + 1) + ":");
			banks[i].showData();
		}
		System.out.println("Least Amount Deposited in Bank:");
		Bank.LeastAmount(banks);
	}
}

