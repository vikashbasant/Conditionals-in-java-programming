package in.co.decimal.condi.pojo;

public class AssignmentRunner {

	public static void main(String[] args) {
		determineNameOfMonth(10);
		System.out.println(determineNameOfDay(4));
		System.out.println(isWeekDay(5));
	}

	private static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		default:
			return false;
		case 1:

		case 2:

		case 3:

		case 4:

		case 5:
			return true;

		}


	}

	private static String determineNameOfDay(int noOfDay) {
		switch (noOfDay) {
		case 0:
			return "sunday";
		case 1:
			return "monday";
		case 2:
			return "tuesday";
		case 3:
			return "wednesday";
		case 4:
			return "thursday";
		case 5:
			return "friday";
		case 6:
			return "saturday";
		default:
			return "Invaild No Of Day";

		}

	}

	private static void determineNameOfMonth(int noOfMonth) {
		switch (noOfMonth) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("Invaild noOfMonth");
			break;
		}

	}
}
