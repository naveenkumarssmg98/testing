package com.abstraction;

interface ATM {
	void deposite(long depositeAmount);
    long checkbalance();
    void withdrawal(long withdrawalAmount);
}