package lesson5.hw;


import java.util.*;
import java.util.Map.Entry;
public class first {
    public static void addNewNumber(Map<String, ArrayList> pg){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Input a name: ");
        String name = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc2.nextInt();
        ArrayList<Integer> numberarr = new ArrayList<>();
        if(!pg.containsKey(name)){
            if(!pg.containsValue(number)){
                numberarr.add(number);
                pg.put(name, numberarr);
                System.out.println("The person has been added successfully");
            }
            else System.out.println("Error: This number is already been added to phone guide!!!");
        }
        else{
            numberarr = pg.get(name);
            pg.remove(name);
            numberarr.add(number);
            numberarr.sort(null);;
            pg.put(name, numberarr);
            System.out.println("New number has been added successfully");
        }
    }

    public static void printNumbers(Map<String, ArrayList> phoneGuide){
        for (Entry<String, ArrayList> entry : phoneGuide.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            value.sort(null);
            System.out.println("Name: " + key + ", Number: " + value);
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        Map<String, ArrayList> phoneGuide= new HashMap<>(); /* {
        // Оставлю данные с которыми работал(чтоб не записывать по новой каждый раз), может вам понадобятся) 
            {
                put("1", new ArrayList<Integer>() {
                    {
                        add(938209);
                        add(811178);
                        add(909099);
                    }
                });
                put("2", new ArrayList<Integer>() {
                    {
                        add(871206);
                    }
                });
                put("3", new ArrayList<Integer>() {
                    {
                        add(774433);
                        add(282822);

                    }
                });
                put("4", new ArrayList<Integer>() {
                    {
                        add(836709);
                        add(502862);
                        add(134340);
                        add(866449);
                    }
                });
            }
        }; */
        while(flag){
            System.out.println("\nMenu: \n1)Add new number. \n2)View the phone giude. \n9)Exit");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number: ");
            Integer name = scan.nextInt();
            switch(name){
                case(1):
                    addNewNumber(phoneGuide);
                    break;
                case(2):
                    printNumbers(phoneGuide);
                    break;
                case(9):
                    flag = false;
                    break;
                default:
                    System.out.println("Error: Wrong number!");
                    break;
            }
        }
    }
}
