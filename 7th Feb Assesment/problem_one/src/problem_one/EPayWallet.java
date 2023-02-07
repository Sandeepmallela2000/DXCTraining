package problem_one;
 class User {
    private int id;
    private String username;
    private String email;
    private double walletBalance;

    public User(int id, String username, String email, double walletBalance) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if (this.walletBalance < billAmount) {
            return false;
        }
        this.walletBalance -= billAmount;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}

class KYCUser extends User {
    private double rewardPoints;

    public KYCUser(int id, String username, String email, double walletBalance) {
        super(id, username, email, walletBalance);
        this.rewardPoints = 0;
    }

    @Override
    public boolean makePayment(double billAmount) {
        boolean paymentSuccess = super.makePayment(billAmount);
        if (paymentSuccess) {
            this.rewardPoints += billAmount * 0.1;
        }
        return paymentSuccess;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}


public class EPayWallet {
    public static void main(String[] args) {
       
		
		User user = new User( 101,"jack","jack@dxc.com",1000);
        double billAmount = 700.0;
        processPaymentByUser(user, billAmount);
    }
    public static void processPaymentByUser(User user, double billAmount) {
        boolean paymentSuccess = user.makePayment(billAmount);
        String message = "";
        if (paymentSuccess) {
            message = "Congratulations " + user.getUsername() + ", payment of " + billAmount + " was successful";
        } else {
            message = "Sorry " + user.getUsername() + ", not enough balance to make payment";
        }
        message += "\nYour wallet balance is " + user.getWalletBalance();
        if (user instanceof KYCUser) {
            KYCUser kycUser = (KYCUser) user;
            message += "\nYou have " + kycUser.getRewardPoints() + " reward points";
        }
        System.out.println(message);
    }
}





