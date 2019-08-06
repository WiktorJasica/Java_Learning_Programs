package pl.codefights.core.allthecrossroads;

public class ReachNextLevel {

	public static void main(String[] args) {

		System.out.println(reachNextLevel(100, 150, 60));
	}

	public static boolean reachNextLevel(int xp, int thredhold, int reward) {
		
		int toNextLevel = thredhold - xp;

		if (toNextLevel <= reward) {
			return true;
		} else {
			return false;
		}
	}
}
