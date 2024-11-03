public class Account {
    private String id;
    private String name;
    private int balance =0;

    Account(){

    }
    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public String credit(int amount){
        this.balance =balance +amount;
        return "A deposit "+amount+" has been successfully";
    }
    public String debit(int amount){
        if (balance < amount){
            return "There are not enough funds to debit "+amount;
        }else{
            balance = balance-amount;
            return "The deduction "+amount+" was successful.";
        }
    }

    public String transferTo(Account another, int amount){
        if (this.getBalance() >= amount ) {
            another.setBalance(another.getBalance() + amount);
            this.setBalance(balance - amount);
            return "The transfer " +amount+" was successful";
        }else{
            return "You need more money to complete this transaction";
        }
    }

    public String toString(){
        return "Name : "+getName()+"\nID : "+getId()+"\n" +
                "Your balance : "+getBalance()+"\n&***************************************************&\"";
    }
}
