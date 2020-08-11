package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class sortbyid1 {

	ArrayList<Employee> jobCandidate = new ArrayList<>();

	public void JobCandidateSorter(ArrayList<Employee> jobCandidate) {
		this.jobCandidate = jobCandidate;
	}

	public ArrayList<Employee> getSortedJobCandidateByAge() {
		//Collections.sort(jobCandidate);
		return jobCandidate;
	}
}
