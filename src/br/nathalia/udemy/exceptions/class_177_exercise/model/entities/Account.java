package br.nathalia.udemy.exceptions.class_177_exercise.model.entities;

import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.AmountExceededWithdrawLimitException;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.AmountGreaterThanBalanceException;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.AmountNotValidException;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.BalanceIsEmptyException;

import java.util.concurrent.ThreadLocalRandom;

public class Account {
    private Long id;
    private Holder holder;
    private Double initialBalance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Holder holder, Double initialBalance, Double withdrawLimit) {
        id = ThreadLocalRandom.current().nextLong(0, 999);
        this.holder = holder;
        this.initialBalance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws AmountNotValidException {
        if (amount <= 0.0) {
            throw new AmountNotValidException();
        }
        this.initialBalance += amount;
    }

    public void withdraw(Double amount) throws BalanceIsEmptyException, AmountExceededWithdrawLimitException, AmountGreaterThanBalanceException {
        if (this.initialBalance == 0.0) {
            throw new BalanceIsEmptyException();
        } else if (amount > this.withdrawLimit) {
            throw new AmountExceededWithdrawLimitException();
        } else if (amount > this.initialBalance) {
            throw new AmountGreaterThanBalanceException();
        }

        this.initialBalance -= amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Double getinitialBalance() {
        return initialBalance;
    }

    public void setinitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", holder=" + holder +
                ", initialBalance=" + initialBalance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
