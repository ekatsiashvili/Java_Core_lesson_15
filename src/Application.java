
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Zooclub club = new Zooclub();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				club.addMember();
				break;
			}
			case "2": {
				club.addPet();
				break;
			}
			case "3": {
				club.deletePetFromEnteredMember();
				break;
			}
			case "4": {
				club.deleteMember();
				break;
			}
			case "5": {
				club.deletePetFromAllMember();
				break;
			}
			case "6": {
				club.printClub();
				break;
			}
			case "7": {
				System.exit(0);
				break;
			}
			}
		}

	}

	public static void menu() {
		System.out.println("Ââåä³òü 1 ùîá äîäàòè ó÷àñíèêà êëóáó:");
		System.out.println("Ââåä³òü 2 ùîá äîäàòè òâàðèíêó ó÷àñíèêó êëóáó:");
		System.out.println("Ââåä³òü 3 ùîá âèäàëèòè òâàðèíêó â ó÷àñíèêà êëóáó:");
		System.out.println("Ââåä³òü 4 ùîá âèäàëèòè ó÷àñíèêà ç êëóáó:");
		System.out.println("Ââåä³òü 5 ùîá âèäàëèòè êîíêðåòíó òâàðèíêó ó âñ³õ ó÷àñíèê³â:");
		System.out.println("Ââåä³òü 6 ùîá âèâåñòè íà åêðàí çîîêëóá:");
		System.out.println("Ââåä³òü 7 ùîá âèéòè ç ïðîãðàìè:");
	}

}