package dxc_Next;

public class Bill {
	    private static int counter = 9001;
	    private String billId;
	    private String paymentMode;

	    static {
	        counter = 9001;
	    }

	    public Bill(String paymentMode){
	        this.paymentMode = paymentMode;
	        billId = "B" + counter;
	        counter++;
	    }

	    public String getBillId() {
	        return billId;
	    }

	    public String getPaymentMode() {
	        return paymentMode;
	    }

	    public void setPaymentMode(String paymentMode) {
	        this.paymentMode = paymentMode;
	    }
	}

	class Bill_Generation {
	    public static void main(String[] args) {
	        Bill bill1 = new Bill("DebitCard");
	        Bill bill2 = new Bill("PayPal");
	        Bill bill3 = new Bill("Gpay");
	        Bill bill4 = new Bill("PhonePe");
	        Bill[] bills = { bill1, bill2, bill3, bill4};

	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	        }
	    }
	}

