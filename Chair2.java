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
        ArrayList <Chair> myType = new ArrayList<>();

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

        int set = myType.size();
        int choose = amount;
        int maximum = 4*amount;
        if (set < maximum)
            maximum = set;
            
        ArrayList<Chair> temporary = new ArrayList<>();
        recursion (temporary, new String[choose], 0, maximum - 1, 0);
        for (A combo: combinations)
        ArrayList<Chair> combinations.add(combo); ///maybe a for each loop might be more efficient here 
    }
    // arr = myType Chair ArrayList, int set = end, int choose = size of combo, int maximum = end, int index = where to start from
    public ArrayList<Chair> recursion (ArrayList<Chair> combinations, String data[], int set, int choose, int maximum, int index) {
        int amount = maximum/4;
        int legs = 0;
        int arms = 0;
        int seat = 0;
        int cushion = 0;
        if (choose <= maximum && choose <= set) {
        ArrayList<Chair> outgoing = new ArrayList<>();
        ArrayList<Chair> temporary = new ArrayList<>();
       /* if (index == choose)
        {
            for (int j = 0; j < choose; j++)
                return temporary;
        } */

        private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

        for (int i = 0, i<temporary.size(); i++)
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

        if (legs >= amount && arms >=amount && seat >= amount && cushion >= amount)
            outgoing.add(temporary);
        
        
        recursion (set, choose + 1, maximum);
        }
    }

}
