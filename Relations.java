package OOP_HomeWork1;

import java.util.Objects;

public class Relations {
    static Person purent;
    static Person child;
    static Person vife;
    static Person husbent;
    static Person brother;
    static Person sister;
    static Person grandsons;
}

public class RelatedRelationship{
    public RelatedRelationship(Person one, Person second, Relations o){ //Обозначаю метод для 2 персон и связи между ними
        this.one=one;
        this.second=second;
        this.o=o;
    }
    Person one;
    Person second;
    Relations o;
}
