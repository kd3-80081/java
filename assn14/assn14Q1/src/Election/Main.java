package Election;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add a Candidate");
		System.out.println("2. Update Candidate Details");
		System.out.println("3. Get PartyWise Total Votes");
		System.out.println("4. Display all Party Votes.");
//		System.out.println("5. Display all Books");
//		System.out.println("6. Display all DVDs");
//		System.out.println("Enter the Choice");

		choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		List<PartyVotes> list = new ArrayList<>();

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				try (CandidateDAO cDao = new CandidateDAO()) {
					System.out.println("Enter the Name");
					String name = sc.next();
					System.out.println("Enter the Party");
					String party = sc.next();
					System.out.println("Enter the Vote");
					int vote = sc.nextInt();
					Candidate cnd = new Candidate(name, party, vote);

					int cnt = cDao.save(cnd);
					System.out.println("Rows Inserted " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;

			case 2: {
				try (CandidateDAO cDao = new CandidateDAO()) {
					System.out.println("Enter the ID of the Candidate to update details");
					int id = sc.nextInt();

					System.out.println("Enter the Updated Name");
					String name = sc.next();
					System.out.println("Enter the Updated Party");
					String party = sc.next();

					Candidate cnd = new Candidate(id, name, party);

					int cnt = cDao.update(cnd);
					System.out.println("Rows Updated " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;

			case 3: {
				try (CandidateDAO cDao = new CandidateDAO()) {
					
					
					cDao.getPartyWiseVote().forEach(c->System.out.println(c));
					
					System.out.println("PartyWise Votes object added in the list");
//					for (PartyVotes p2 : list) {
//						System.out.println(p2);
//					}
					System.out.println();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}break;
			
			case 4 :{
				for (PartyVotes p1 : list) {
					System.out.println(p1);
				}
				System.out.println();
			}
			default:
				System.out.println("Wrong Choice Entered");
			}
		}
	}

}
