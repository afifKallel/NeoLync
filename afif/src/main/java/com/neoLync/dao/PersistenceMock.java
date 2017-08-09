package com.neoLync.dao;

import java.util.List;

import com.neoLync.model.Account;
import com.neoLync.model.Client;

public class PersistenceMock {
 public static List <Client> clientList;
 public static List <Account> accountList;
 
 public static Account getAccoutByNumAccount(int numAccount){
	 
 for (Account account : accountList) {	 
	 if (account.getNumAccount() == numAccount) {
		 return account;
	 }	  
 }
 	return null;	
 }
 
 public static Client getOwnerById(String idClient){
	 
	 for (Client client : clientList) {	 
		 if (client.getIdClient().equals( idClient) ){
			 return client;
		 }	  
	 }
	 	return null;	
	 }
 
 
}
