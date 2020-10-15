
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Zooclub {

	Map<Person, List<Pet>> map = new HashMap<>();

	public void addMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü ³ìÿ ó÷àñíèêà:");
		String name = scanner.nextLine();
		System.out.println("Ââåä³òü â³ê ó÷àñíèêà:");
		int age = scanner.nextInt();
		map.put(new Person(name, age), new ArrayList<Pet>());
	}

	public void addPet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü ³ìÿ ó÷àñíèêà:");
		String name = scanner.nextLine();
		System.out.println("Ââåä³òü òèï òâàðèíêè:");
		String type = scanner.nextLine();
		System.out.println("Ââåä³òü ³ìÿ òâàðèíêè:");
		String namePet = scanner.nextLine();

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Pet> value = next.getValue();
				value.add(new Pet(type, namePet));
				next.setValue(value);
			}
		}
	}

	public void deletePetFromEnteredMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü ³ìÿ ó÷àñíèêà:");
		String name = scanner.nextLine();
		System.out.println("Ââåä³òü òèï òâàðèíêè:");
		String type = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Pet> value = next.getValue();
				Iterator<Pet> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					Pet next2 = iterator2.next();
					if (next2.getType().equalsIgnoreCase(type)) {
						iterator2.remove();
						isDeleted = true;
					}
				}
			}
		}
		if (!isDeleted) {
			System.out.println("Íà æàëü, òàêî¿ òâàðèíêè íåìàº");
		} else {
			System.out.println("Òâàðèíêà âèäàëåíà");
		}
	}

	public void deleteMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü ³ìÿ ó÷àñíèêà:");
		String name = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
				isDeleted = true;
			}
		}
		if (!isDeleted) {
			System.out.println("Íà æàëü, òàêîãî ó÷àñíèêà êëóáó íåìàº");
		} else {
			System.out.println("Ó÷àñíèê êëóáó âèäàëåíèé");
		}

	}

	public void deletePetFromAllMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü òèï òâàðèíêè:");
		String type = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			List<Pet> value = next.getValue();
			Iterator<Pet> iterator2 = value.iterator();
			while (iterator2.hasNext()) {
				Pet next2 = iterator2.next();
				if (next2.getType().equalsIgnoreCase(type)) {
					iterator2.remove();
					isDeleted = true;
				}
			}
		}
		if (!isDeleted) {
			System.out.println("Íà æàëü, òàêî¿ òâàðèíêè íåìàº");
		} else {
			System.out.println("Òâàðèíêà âèäàëåíà");
		}
	}

	public void printClub() {
		System.out.println(map);
	}

}
