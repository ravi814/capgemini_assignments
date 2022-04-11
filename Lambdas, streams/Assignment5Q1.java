package first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q1 {

	public static List<String> reverseSort(ArrayList<Fruit> fruits) {
		List<Fruit> fruitList = new ArrayList<>();
		List<String> reverseList = new ArrayList<String>();

		fruitList = fruits.stream().filter(i -> i.getCalories() < 100)
				.sorted((f1, f2) -> f2.getCalories() - f1.getCalories()).collect(Collectors.toList());
		fruitList.stream().sorted();

		fruitList.stream().forEach(i -> {
			reverseList.add(i.getName());
		});
		return reverseList;
	}

	public static ArrayList<Fruit> sort(ArrayList<Fruit> fruit) {

		List<Fruit> sortfruits = new ArrayList<>();

		sortfruits = fruit.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor()))
				.collect(Collectors.toList());

		return (ArrayList<Fruit>) sortfruits;
	}

	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) {
		List<Fruit> tf = fruits.stream().filter(i -> i.getColor().equalsIgnoreCase("Red"))
				.sorted((f1, f2) -> f1.getPrice() - f2.getPrice()).collect(Collectors.toList());
//		ArrayList<Fruit> redFruits = new ArrayList<>(tf);
		return (ArrayList<Fruit>) tf;
	}

	public static void main(String[] args) {
	}

}