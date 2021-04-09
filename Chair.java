package edu.ucalgary.ensf409;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

class Chair
{
	private String id;
    private String type;
    private char legs;
    private char arms;
    private char seat;
    private char cushion;
    private int price;
    private String manuID;
    private ArrayList<Chair> myType = new ArrayList<>();

    public Chair()
    {
    }
    public Chair(String id, String type, int price, String manuID,char legs,char arms,char seat,char cushion){
    	this.ID = id;
        this.type = type;
        this.price = price;
        this.manuID = manuID;
        this.legs = legs;
        this.arms = arms;
        this.seat = seat;
        this.cushion = cushion;
    }
    public char getLegs() {
        return legs;
    }
    public char getArms() {
        return arms;
    }
    public char getSeat() {
        return seat;
    }
    public char getCushion() {
        return cushion;
    }
    public String getType()
    {
        return type;
    }
    public int getPrice()
    {
        return price;
    }
    public String getID()
    {
        return id;
    }
    public String manuID()
    {
        return manuID;
    }

    public ArrayList<Chair> combinations(ArrayList <Chair> item, String type, int amount) {

        //create a new array with only inventory that matches specified type
        for (int i = 0; i < item.size(); i++)
        {
            Chair temp = item.get(i);
            if (temp.getType() == type)
                myType.add(temp);
        }
        int legs = 0;
        int arms = 0;
        int seat = 0;
        int cushion = 0;

        for (int i = 0, i<myType.size(); i++)
        {
            Chair temp = item.get(i);
            if (temp.getLegs() == 'Y')
                legs++;
            if (temp.getArms() == 'Y')
                arms++;
            if (temp.getSeat() == 'Y')
                seat++;
            if (temp.getCushion() == 'Y')
                cushion++;
        }

        if (legs < amount || arms < amount || seat < amount || cushion < amount)
            ///call Manufacturing class

        else {
            list<String> list = new List <String>();
            for (String id : myType.getID()) //can be replaced with for loop of I did this wrong
                list.add(id);

            String[] passID = list.toArray(String[]::new);
            chairPrice(passID);

        }
    }
            public void chairPrice (String[] args) {

                List<List<String>> powerSet = new LinkedList<List<String>>();
        
                for (int i = 1; i <= args.length; i++)
                    powerSet.addAll(combination(Arrays.asList(args), i));
        
                System.out.println(powerSet);
            }
            
            public static <T> List<List<T>> combination(List<T> values, int size) {
        
                if (0 == size) {
                    return Collections.singletonList(Collections.<T> emptyList());
                }
        
                if (values.isEmpty()) {
                    return Collections.emptyList();
                }
        
                List<List<T>> combination = new LinkedList<List<T>>();
        
                T actual = values.iterator().next();
        
                List<T> subSet = new LinkedList<T>(values);
                subSet.remove(actual);
        
                List<List<T>> subSetCombination = combination(subSet, size - 1);
        
                for (List<T> set : subSetCombination) {
                    List<T> newSet = new LinkedList<T>(set);
                    newSet.add(0, actual);
                    //check validity here
                    combination.add(newSet);
                }
        
                combination.addAll(combination(subSet, size));
        
                return combination;
            }

}
