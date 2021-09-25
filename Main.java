import java.util.ArrayList;

class Main {
    static Double price = 0.0;
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(wedding());
        System.out.println(sumOfAllTheMultiples(1000));

    }

    //Challenge #1
    public static ArrayList<Integer> wedding(){
        // a list of all the possible result
        ArrayList<Integer> BurgerListCount = new ArrayList<>();

        // 200 is the max. number of drinks we can buy (should buy at least a single item from every single item on the menu)
        for(int drink = 1; drink <= 200; drink++){
            // 100 is 200 / 2 ==> 2 is the price od the donut
            for(int Donut = 1; Donut <= 100; Donut++){
                // 20 is 200 / 10 ==> 10 is the price od the Burger
                for(int Burger = 1; Burger <= 20; Burger++){
                    price = (0.2 * drink) + (2 * Donut) + (10 * Burger);
                    count = drink + Donut + Burger;
                    // if the total price and the item count are 200 add the number of burger to the list
                    if(price.equals(200.0) && count == 200){
                        BurgerListCount.add(Burger);
                    }
                }
            }
        }
        return BurgerListCount;
    }

    //Challenge #2
    public static int sumOfAllTheMultiples(int num){
        int sum = 0;
        for(int i = 0; i < num; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }
        return sum;
    }
}
