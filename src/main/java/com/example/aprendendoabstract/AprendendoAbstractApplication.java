package com.example.aprendendoabstract;

import com.example.aprendendoabstract.entities.Account;
import com.example.aprendendoabstract.entities.BusinessAccount;
import com.example.aprendendoabstract.entities.SavingsAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AprendendoAbstractApplication {

	public static void main(String[] args) {

			List<Account> list = new ArrayList<>();
			list.add(new SavingsAccount(1001, "Alex", 500, 0.01));
			list.add(new BusinessAccount(1002,"Maria",1000, 400));
			list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
			list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

			double sum = 0.0;
			for(Account acc : list){
				sum += acc.getBalance();
			}

		System.out.printf("Total balance %.2f%n", sum);

			for(Account acc : list){
				acc.deposit(10.0);
			}

			for (Account acc : list){
				System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
			}
	}

}
