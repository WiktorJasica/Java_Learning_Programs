package pl.codefights.interview_practice.data_structures.hash_tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * You have a list of dishes. Each dish is associated with a list of ingredients used to prepare it. 
 * You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all 
 * the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list with the first element equal to the name of the 
ingredient and all of the other elements equal to the names of dishes that contain this ingredient. 
The dishes inside each list should be sorted lexicographically. 
The result array should be sorted lexicographically by the names of the ingredients in its elements.

Example

For
  dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
            ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
            ["Quesadilla", "Chicken", "Cheese", "Sauce"],
            ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]
the output should be

  groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                            ["Salad", "Salad", "Sandwich"],
                            ["Sauce", "Pizza", "Quesadilla", "Salad"],
                            ["Tomato", "Pizza", "Salad", "Sandwich"]]
For
  dishes = [["Pasta", "Tomato Sauce", "Onions", "Garlic"],
            ["Chicken Curry", "Chicken", "Curry Sauce"],
            ["Fried Rice", "Rice", "Onions", "Nuts"],
            ["Salad", "Spinach", "Nuts"],
            ["Sandwich", "Cheese", "Bread"],
            ["Quesadilla", "Chicken", "Cheese"]]
the output should be

 groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                            ["Chicken", "Chicken Curry", "Quesadilla"],
                            ["Nuts", "Fried Rice", "Salad"],
                            ["Onions", "Fried Rice", "Pasta"]]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.string dishes

An array of dishes. dishes[i] for each valid i contains information about the ith dish: 
the first element of dishes[i] is the name of the dish and the following elements are the ingredients
of that dish. Both the dish name and the ingredient names consist of English letters and spaces. 
It is guaranteed that all dish names are different.
It is also guaranteed that ingredient names for one dish are also pairwise different.

Guaranteed constraints:
1 ≤ dishes.length ≤ 500,
2 ≤ dishes[i].length ≤ 10,
1 ≤ dishes[i][j].length ≤ 50.

[output] array.array.string

The array containing the grouped dishes.
 */
public class GroupingDishes {

	public static void main(String[] args) {

		String[][] dishes = { { "Salad", "Tomato", "Cucumber", "Salad", "Sauce" },
				{ "Pizza", "Tomato", "Sausage", "Sauce", "Dough" }, { "Quesadilla", "Chicken", "Cheese", "Sauce" },
				{ "Sandwich", "Salad", "Bread", "Tomato", "Cheese" } };

		String result[][] = groupingDishes(dishes);

		for (String[] sTab : result) {
			for (String s : sTab) {
				System.out.print(s + ", ");
			}
			System.out.println();
		}

	}

	public static String[][] groupingDishes(String[][] dishes) {

		HashMap<String, ArrayList<String>> ingredientMap = new HashMap<>();
		
		for (String[] meal : dishes) {
			for (int i = 1; i < meal.length; i++) {
				if (ingredientMap.containsKey(meal[i])) {
					ArrayList<String> foods = ingredientMap.get(meal[i]);
					foods.add(meal[0]);
					ingredientMap.put(meal[i], foods);
				} 
				else {
					ArrayList<String> foods = new ArrayList<>();
					foods.add(meal[0]);
					ingredientMap.put(meal[i], foods);
				}
			}
		}

		ArrayList<String[]> sortedList = new ArrayList<>();
		
		for (String ingred : ingredientMap.keySet()) {
			ArrayList<String> foods = ingredientMap.get(ingred);
			if (foods.size() > 1) {
				Collections.sort(foods);
				String[] resultString = new String[foods.size() + 1];
				resultString[0] = ingred;
				for (int i = 0; i < foods.size(); i++)
					resultString[i + 1] = foods.get(i);
				sortedList.add(resultString);
			}
		}

		Collections.sort(sortedList, (a, b) -> a[0].compareTo(b[0]));
		return sortedList.toArray(new String[0][]);

	}
}
