package com.driver;

public class Pizza {



    private int price;

    private boolean isTakeAway;
    private boolean isCheese;
    private boolean isTopping;

    String base;
    String cheese;
    String topping;
    String bag;




    private boolean isVeg;



    private String bill;

    public Pizza(Boolean isVeg){
      this.isVeg=isVeg;
      if(isVeg) {
          this.price+=300;
          base="Base Price Of The Pizza: 300\n";
      } else {
          this.price+=400;
          base="Base Price Of The Pizza: 400\n";
      }


        // your code goes here
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(this.isCheese)
           return;

        this.isCheese=true;
        this.cheese="Extra Cheese Added: 80\n";
        this.price+=80;

    }

    public void addExtraToppings(){
        // your code goes here
     if(this.isTopping)
         return;
        this.isTopping=true;
        if(this.isVeg) {
            this.topping = "Extra Toppings Added: 70\n";
            this.price+=70;
        }
        else {
            this.topping="Extra Toppings Added: 120\n";
            this.price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
       if(this.isTakeAway)
           return;
        this.isTakeAway=true;
        this.bag="Paperbag Added: 20\n";
        this.price+=20;
    }

    public void setBill() {


        this.bill=base+cheese+topping+bag+"Total Price: "+this.price+"\n";



    }
    public String getBill(){
        // your code goes here
        this.setBill();
        return this.bill;
    }
}
