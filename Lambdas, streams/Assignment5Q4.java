package four;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Assignment5Q4 {

	public static List<Transaction> sortTransactions(List<Transaction> transactions) {
		List<Transaction> s1 = new ArrayList<Transaction>();
		List<Transaction> s2 = new ArrayList<Transaction>();
		s1 = transactions.stream().filter(i -> i.getYear() == 2011).collect(Collectors.toList());
		s2 = s1.stream().sorted((t1, t2) -> t1.getValue() - t2.getValue()).collect(Collectors.toList());

		return s2;
	}

	public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
		List<Transaction> tr = new ArrayList<>();
		List<Integer> trDelhi = new ArrayList<>();

		tr = transactions.stream().filter(i -> i.getTrader().getCity().contentEquals("Delhi"))
				.collect(Collectors.toList());
		tr.stream().forEach(i -> trDelhi.add(i.getValue()));
		return trDelhi;
	}

	public static int highestTransaction2(List<Transaction> transactions) {
		Optional<Transaction> trHigh = transactions.stream().max(Comparator.comparing(Transaction::getValue));
		Transaction obj = trHigh.stream().findFirst().get();
		return obj.getValue();

	}

	public static int smallestTransaction1(List<Transaction> transactions) {
		Optional<Transaction> trSmall = transactions.stream().min(Comparator.comparing(Transaction::getValue));
		Transaction obj = trSmall.stream().findFirst().get();
		return obj.getValue();
	}

	public static void main(String[] args) {
	}
}
