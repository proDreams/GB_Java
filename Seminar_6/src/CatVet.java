//Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
//Создайте несколько экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.Objects;

public class CatVet {
    String catOwnerName;
    String catOwnerPhone;
    String catName;
    Integer catID;
    double catWeight;
    boolean hasVaccine;

    public CatVet(String catOwnerName, String catOwnerPhone, String catName, Integer catID, double catWeight, boolean hasVaccine) {
        this.catOwnerName = catOwnerName;
        this.catOwnerPhone = catOwnerPhone;
        this.catName = catName;
        this.catID = catID;
        this.catWeight = catWeight;
        this.hasVaccine = hasVaccine;
    }

    public void eatPill() {
        System.out.println("Nope!");
    }

    public double checkWeight() {
        return catWeight;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }


    @Override
    public int hashCode() {
        return (int) (catID + catWeight + catName.length());
    }

    @Override
    public boolean equals(Object obj) {
//        if (obj != this) {
//            return false;
//        }
        if (obj instanceof CatVet) {
            CatVet temp = (CatVet) obj;
            if (temp.hashCode() != this.hashCode()) {
                return false;
            }
            if (!Objects.equals(temp.catOwnerName, this.catOwnerName)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID кота = " + catID + ", " +
                "Имя кота = " + catName + ", " +
                "Масса кота = " + catWeight + ", " +
                "Статус вакцинации = " + hasVaccine + ", " +
                "Имя владельца кота = " + catOwnerName + ", " +
                "Номер телефона владельца кота = " + catOwnerPhone + "\n";
    }
}
