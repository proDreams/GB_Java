//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
//Можно записать в текстовом виде, не обязательно реализовывать в java.
//====
//Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
// Создайте несколько экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        CatVet barsik = new CatVet("Nikita", "+1 123 456 1212", "Barsik", 1, 6, true);
        CatVet bublik = new CatVet("Nikita", "+1 123 456 1212", "Barsik", 1, 6, true);
        CatVet korjik = new CatVet("Kristina", "+7 098 765 1212", "Korjik", 2, 3, false);
        HashSet<CatVet> setCats = new HashSet<>();
        setCats.add(barsik);
        setCats.add(bublik);
        setCats.add(korjik);
        System.out.println(setCats);
    }
}
