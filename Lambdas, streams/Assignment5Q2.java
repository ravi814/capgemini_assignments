package second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Assignment5Q2 {

	public static int maxComments(List<News> news) {
		Optional<News> comments = news.stream().max(Comparator.comparing(News::getComment));

		List<Integer> maxC = new ArrayList<>();
		comments.stream().forEach(i -> {
			int id = i.getNewsId();
			maxC.add(id);
		});
		int i = maxC.stream().findFirst().get();
		return i;
	}

	public static int budgetCount(List<News> news) {
		int count = 0;
		List<String> budgetCount = new ArrayList<>();
		news.stream().forEach(i -> budgetCount.add(i.getComment()));

		for (String s : budgetCount) {
			if (s.contains("budget")) {
				count++;
			}
		}

		return count;
	}

	public static String maxCommentsByUser(List<News> news) {

		Optional<News> toSL = news.stream().min(Comparator.comparing(News::getCommentByUser));
																								
		List<String> userNames = new ArrayList<>();
		toSL.stream().forEach(j -> userNames.add(j.getCommentByUser()));
		String finalName = userNames.stream().findFirst().get();
		return finalName;
	}

	
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {

		Map<String, Integer> mp = new TreeMap<>();
		List<String> allUsers = new ArrayList<String>();
		news.stream().forEach(i -> allUsers.add(i.getCommentByUser()));
		for (String userName : allUsers) {
			mp.put(userName, 0);
		}
		for (String userName : allUsers) {
			mp.put(userName, mp.get(userName) + 1);
		}
		Map<String, Integer> mp2 = sortByValues(mp);
		return mp2;

	}

	public static void main(String[] args) {
	}
}
