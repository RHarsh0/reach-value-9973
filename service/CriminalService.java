package service;

import java.util.Map;
import Entity.Criminal;
import exception.CriminalException;

public interface CriminalService {

	public String addCriminal(Map<Integer,Criminal> storage, Criminal guilty);
	
	public String deleteCriminal(Map<Integer,Criminal> storage, Criminal guilty, int id) throws CriminalException;
	
	public String updateCriminal(Map<Integer,Criminal> storage, Criminal guilty, int id) throws CriminalException;
	
	public void viewAllCriminals(Map<Integer,Criminal> storage, Criminal guilty) throws CriminalException;
}
