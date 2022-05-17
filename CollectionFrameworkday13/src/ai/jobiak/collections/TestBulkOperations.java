package ai.jobiak.collections;
import java.util.*;

public class TestBulkOperations {

	public static void main(String[] args) {
		ArrayList<String> companies= new ArrayList<>();
		//List<String> companiesList=new List<>();
		//Collection<String> companiesCollection= new ArrayList<>();
		
		companies.add("Google");
		companies.add("Cognizant");
		companies.add("Accenture");
		companies.add("Franklin Templeton");
		companies.add("Goldmen Sachs");
		companies.add("Jobiak");
		companies.add("Apple");
		
		HashSet setOfTelecomCompanies=new HashSet();
		
		setOfTelecomCompanies.add("Reliance");
		setOfTelecomCompanies.add("Airtel");
		setOfTelecomCompanies.add("Idea Celluar");
		setOfTelecomCompanies.add("BSNL");
		
		//bulk
		setOfTelecomCompanies.add(companies);
		setOfTelecomCompanies.add(companies);
		System.out.println(setOfTelecomCompanies.containsAll(setOfTelecomCompanies));
		
		
		companies.addAll(setOfTelecomCompanies);

	}

}
