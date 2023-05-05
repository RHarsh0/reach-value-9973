package service;

import java.util.Map;
import java.util.Map.Entry;
import exception.CriminalException;
import Entity.Criminal;

public class CriminalServiceImplementation implements CriminalService{

	@Override
	public String addCriminal(Map<Integer, Criminal> storage, Criminal guilty) {
		
		storage.put(guilty.getCriminal_id(),guilty);
		return "Criminal has been added";
	}

	@Override
	public String deleteCriminal(Map<Integer, Criminal> storage, Criminal guilty, int id) throws CriminalException{
		
		if(storage!=null&&storage.size()!=0) {
			if(storage.containsKey(id)) {
				storage.remove(id);
				return "The innocent one Hmmm..... The criminal is deleted from the database";
			}
			else {
				throw new CriminalException("The guilty pleaded not guilty. He's no more in the database.");
			}
		}
		else {
			
		       throw new CriminalException("Wow! city used to be clean but now we need the Dark Knight. No database found.");
		}
	}

	@Override
	public String updateCriminal(Map<Integer, Criminal> storage, Criminal guilty, int id) throws CriminalException{
		
		if(storage!=null&&storage.size()!=0) {
			if(storage.containsKey(id)) {
				storage.put(id,guilty);
				return "Is he a shape shifter or what he needs so much updating. Updated...";
			}
			else {
				throw new CriminalException("The guilty pleaded not guilty. He's no more in the database.");
			}
		}
		else {
			
			throw new CriminalException("Wow! city used to be clean but now we need the Dark Knight. No database found.");
		}
	}

	@Override
	public void viewAllCriminals(Map<Integer, Criminal> storage, Criminal guilty) throws CriminalException{
		if(storage!=null&&storage.size()!=0) {
			for(Map.Entry<Integer,Criminal> entr: storage.entrySet()) {
				System.out.println(entr.getValue());
			}
		}
		else {
			throw new CriminalException("Wow! city is crime free. Hope we don't need the Batman. No database found.");
		}
		
	}
	

}
