package com.kosta.test;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTest mt =new MemberTest();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ������");
			System.out.println("3. ȸ������");
			System.out.println("4. ȸ����ȸ");
			System.out.println("5. ��ü����");
			System.out.println("6. ����");
			System.out.println("��� ����?");
			String choice = sc.next();
			switch (choice) {
			case "1":
				mt.join();
				break;
			case "2":
				mt.modi();
				break;
			case "3":
				mt.del();
				break;
			case "4":
				mt.search();
				break;
			case "5":
				mt.searchall();
				break;
			case "6":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�ڵ带 �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
	}

}
}