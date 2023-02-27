package OOP_HomeWork1;

import java.util.ArrayList;

public class Search {
    ArrayList<String> res = new ArrayList<>();
    ArrayList<RelatedRelationship> rel;

    public Search(Relations relat){
        rel = relat.getName();
    }
    public ArrayList<String> spend (Person one, Relations o){
        for(RelatedRelationship x: rel){
            if(x.second.name == one.name && x.o == o){
                res add(x.second.name);
            }
        }
        return res;
}}
