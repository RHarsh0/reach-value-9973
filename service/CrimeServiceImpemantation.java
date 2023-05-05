package service;

import java.util.Map;
import exception.CrimeException;
import Entity.Crime;


public class CrimeServiceImpemantation implements CrimeService {

	@Override
	public String addCrime(Map<Integer, Crime> storage, Crime crime) {
		
		storage.put(crime.getCrimeId(),crime);
		return "New Crime in your area";
	}

	@Override
	public String updateCrime(Map<Integer, Crime> storage, int id, Crime crime) throws CrimeException {
		
		if(storage!=null&&storage.size()!=0) {
			
			if(storage.containsKey(id)) {
				storage.put(id, crime);
			return "How about some changes in the crime in your area";
			}
			else {
				throw new CrimeException("Crime has not been registered! What is going on here?");
			}
		}
		else {
			throw new CrimeException("What man there is no place to report the crime. This town is shit!");
		}
	}

	@Override
	public String deleteCrime(Map<Integer, Crime> storage, int id, Crime crime) throws CrimeException {

		if(storage!=null&&storage.size()!=0) {
			
			if(storage.containsKey(id)) {
				storage.remove(id);
			return "Polss aa gayi pols!";
			}
			else {
				throw new CrimeException("Did you just solved the unreported crime. Great!");
			}
		}
		else {
			throw new CrimeException("What man there is no place to report the crime. This town is shit!");
		}
		
	}

	@Override
	public void viewAllCrime(Map<Integer, Crime> storage, Crime crime) throws CrimeException{
		
     
		if(storage!=null&&storage.size()!=0) {
			
			for(Map.Entry<Integer,Crime> entr:storage.entrySet()) {
				System.out.println(entr.getValue());
			}
		}
		else {
			throw new CrimeException("What man there is no place to report the crime. This town is shit!");
		}
		
	}

	
}
