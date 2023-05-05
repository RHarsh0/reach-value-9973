package service;

import java.util.Map;
import Entity.Crime;
import exception.CrimeException;

public interface CrimeService {

	public String addCrime(Map<Integer,Crime> storage,Crime crime);
	
	public String updateCrime(Map<Integer,Crime> storage,int id,Crime crime) throws CrimeException;
	
	public String deleteCrime(Map<Integer,Crime> storage,int id,Crime crime) throws CrimeException ;
	
	public void viewAllCrime(Map<Integer,Crime> storage, Crime crime) throws CrimeException;
}
