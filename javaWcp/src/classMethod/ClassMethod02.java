package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println(yamada.name + yamada.age);

		Human02 sato = new Human02("佐藤", 35);
		System.out.println(sato.name + sato.age);
	}
}
