package OOP_HomeWork1;

import OOP_Lesson1.Relations;

public class Main {

    public static void main(String[] args) {   //Создаю объекты класса Person
        Person aleksandr = new Person("Александр", 70,);
        Person maria = new Person("Мария", 65,);
        Person aleksey = new Person("Алексей", 45,);
        Person petr = new Person("Петр", 43);
        Person olga = new Person("Ольга", 40);
        Person elena = new Person("Елена", 20);
        Person alena = new Person("Алена", 18);

        Relations var = new Relations();

        var.appendHusbandVife(aleksandr, maria); //Связь муж-жена

        var.appendFatherChild(aleksandr, aleksey); //Связь отец-ребенок
        var.appendFatherChild(aleksandr, petr);
        var.appendFatherChild(aleksandr, olga);

        var.appendMotherChild(maria, aleksey); //Cвязь мать-ребенок
        var.appendMotherChild(maria, petr);
        var.appendMotherChild(maria, olga);
        var.appendMotherChild(olga, alena);
        var.appendMotherChild(petr, elena);

        var.appendBrotherSister(aleksey, petr); //Связь брат-сестра
        var.appendPurentChild(aleksey, olga);
        var.appendPurentChild(petr, olga);

        var.appendGrandmother(maria, elena); //Связь бабушка-внучка
        var.appendGrandmother(maria, alena);

        var.appendGrandfather(aleksandr, elena); //Связь дедушка-внучка
        var.appendGrandfather(aleksandr, alena);

        System.out.println(new Search(var).spend(aleksandr, olga, RelatedRelationship)); //Поиск родственной связи


    }
}
