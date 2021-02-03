package com.jiang.insert;


import java.util.*;

public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> cards;
    private Set<String> game;
    private Properties info;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getBooks() {
        return books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public Set<String> getGame() {
        return game;
    }

    public Properties getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", cards=" + cards +
                ", game=" + game +
                ", info=" + info +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
