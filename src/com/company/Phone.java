package com.company;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number,model);
        this.weight=weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void Show(){
        System.out.println("Number: "+number+" Model "+model+" Weight "+weight);
    }
    public void receiveCall(String name){
        System.out.println("Calling: "+name);
    }

    public String getNumber() {
        return number;
    }
    public void receiveCall(String name,String number){
        System.out.println("Calling: "+name+", number: "+number);
    }

    public void sendMassage(String ... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
