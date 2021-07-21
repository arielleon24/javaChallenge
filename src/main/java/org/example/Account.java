package org.example;

public class Account {
    private Integer account;
    private Double balance;
    private String email;
    private String phone;

    public Double getBalance() {

        return balance;
    }

    public void setBalance(Double newBalance) {

        this.balance = newBalance;
    }

    public Integer getAccount() {

        return account;
    }

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
