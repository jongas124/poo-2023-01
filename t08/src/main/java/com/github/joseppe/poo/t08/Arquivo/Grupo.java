package com.github.joseppe.t08.Arquivo;
import java.util.List;
import java.util.ArrayList;
public class Grupo {
    private String groupName;
    private List<String> users;
public Grupo(String name){
    this.groupName = name;
    this.users = new ArrayList<>(null);
}
    public String getName() {
        return groupName;
    }

    public List<String> getUsers() {
        return users;
    }

}
