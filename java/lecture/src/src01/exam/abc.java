import java.util.Scanner;



public class 관리시스템 {

	public static void main(String[] args) {

// TODO Auto-generated method åstub



		관리시스템 sy = new 관리시스템();



		sy.start();



	}



	구단[] m_team = new 구단[100];

	int count = 0;



	private void start() {

		do {

			int menu;

			System.out.println("<축구구단 관리 프로그램>");

			System.out.println("1. 구단 추가");

			System.out.println("2. 구단 편집");

			System.out.println("3. 구단 삭제");

			System.out.println("4. 구단 보기");

			System.out.println("5. 프로그램 종료");



			System.out.println("입력: ");

			Scanner sc = new Scanner(System.in);

			menu = sc.nextInt();



			switch (menu) {

			case 1:

				teamAdd();

				break;

			case 2:

				teamEdit();

				break;

			case 3: // break;

			case 4:

				teamShow();

				break;

			case 5:

				System.out.println("프로그램이 종료되었습니다.");

				return;

			}

		} while (true);

	}



	private int teamAdd() {

		Scanner sc = new Scanner(System.in);

		System.out.println("<<구단추가>>");

		System.out.println("구단이름 입력: ");

		String tn = sc.next();

		m_team[count] = new 구단(tn);

		System.out.println(">구단이 생성되었습니다." + m_team[count].getTeamName());

		count++;

		return count;

	}



	private void teamEdit() {

		int editNum;

		System.out.println("<<구단 편집>>");

		Scanner sc = new Scanner(System.in);



		int i = 0;

		for (i = 0; i < count; i++) {

			System.out.println(i + 1 + ". " + m_team[i].getTeamName());

		}

		int end = i + 1;

		System.out.println(end + ". 나가기");

		System.out.println("편집할 구단 입력: ");

		editNum = sc.nextInt();

		m_team[editNum - 1].edit();



		return;

	}



	private void teamShow() {

		Scanner sc = new Scanner(System.in);

		System.out.println("<<구단 보기>>");

		int teamShowNum;

		int i = 0;

		for (i = 0; i < count; i++) {

			System.out.println(i + 1 + ". " + m_team[i].getTeamName());

		}

		System.out.println(i + 1 + " 나가기");

		System.out.println("구단 자세히보기: ");

		teamShowNum = sc.nextInt();

		m_team[teamShowNum - 1].teamShow();

		return;

	}

}



class 구단 {

	private String teamName;

	private String coach;

	private 선수[] player = new 선수[11];

	private int playerCount = 0;



	public 구단(String teamName) {

// TODO Auto-generated method stub

		this.teamName = teamName;

	}



	public String getTeamName() {

		return teamName;

	}



	public String getCoach() {

		return coach;

	}



	public void edit() {

		Scanner sc = new Scanner(System.in);

		System.out.println("<<" + getTeamName() + ">>을 편집합니다. ");

		int editMenu;

		do {

			System.out.println("1. 코치추가");

			System.out.println("2. 선수추가");

			System.out.println("3. 코치삭제");

			System.out.println("4. 선수삭제");

			System.out.println("5. 나가기");



			System.out.println("입력: ");



			editMenu = sc.nextInt();



			switch (editMenu) {

			case 1:

				coachAdd();

				break;

			case 2:

				playerAdd();

				break;

			case 3:

				coachDel();

				break;

			case 4:

				playerDel();

				break;

			case 5:

				System.out.println("프로그램이 종료되었습니다.");

				return;

			}

		} while (true);

	}



	public void coachAdd() {

		Scanner sc = new Scanner(System.in);

		System.out.println("코치이름을 입력해주세요 : ");

		coach = sc.next();

		System.out.println("> " + coach + "가 추가되었습니다.");

	}



	public void coachDel() {

		System.out.println("> " + getCoach() + "코치삭제");

	}



	public int playerAdd() {

		System.out.println("<<선수를 추가합니다.>>>");

		Scanner sc = new Scanner(System.in);

		System.out.println("선수이름: ");

		String playerName = sc.next();

		System.out.println("선수연봉(만원): ");

		int playerPay = sc.nextInt();



		player[playerCount] = new 선수(playerName, playerPay);

		System.out.println("> " + playerName + "가 추가되었습니다.");

		playerCount++;



		return playerCount;

	}



	public void playerDel() {

		System.out.println("> 선수삭제");

		return;

	}



	public void teamShow() {

		Scanner sc = new Scanner(System.in);

		System.out.println(getTeamName() + " 구단자세히");

		for (int i = 0; i < playerCount; i++) {

			System.out.println("선수: " + player[i].getPlayerName());

		}

		System.out.println();

	}

}



class 선수 {

	private String name;

	private int pay;



	public 선수(String name, int pay) {

		this.name = name;

		this.pay = pay;

	}



	public String getPlayerName() {

		return name;

	}



	public int getPlayerPay() {

		return pay;

	}

}