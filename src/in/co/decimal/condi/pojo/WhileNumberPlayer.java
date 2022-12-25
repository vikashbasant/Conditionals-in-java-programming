package in.co.decimal.condi.pojo;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer() {
		// default constructor:
	}

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLi1mit() {
//		for (int i = 1; i <= this.limit; i++) {
//			System.out.print(i * i + " ");
//		}
		int i = 1;
		while (i * i <= this.limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubeUptoLimit() {
//		for (int i = 1; i <= this.limit; i++) {
//			System.out.print(i * i * i + " ");
//		}

		int i = 1;
		while (i * i * i <= this.limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();

	}

}
