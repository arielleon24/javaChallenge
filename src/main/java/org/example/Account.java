package org.example;

public class Account {
    private Integer account;
    private Float balance;
    private String email;
    private String phone;

    public Float getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(Float newBalance) {
        this.balance = newBalance;
    }

    public Integer getAccount() {
        return account;
    }

    // Setter
    public void setAccount(Integer newAccount) {
        this.account = newAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

}
