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
            List<String> list = new List <String>();
            for (String id : myType.getID()) //can be replaced with for loop of I did this wrong
                list.add(id);

            String[] passID = list.toArray(String[]::new);
            int set = myType.size();
            int maxmimum = 4*amount;
            if (set<maximum)
                maximum = set;
            powerSet(passID, maximum);
        }
    }
    public void powerSet(String []set, int setSize)
    {
         
        
        long pow_setSize =(long)Math.pow(2, setSize);
        int counter, j;
        String add = "";
     
        /*Run from counter 000..0 to
        111..1*/
        for(counter = 0; counter < pow_setSize; counter++)
        {
            for(j = 0; j < setSize; j++)
            {
                /* Check if jth bit in the
                counter is set If set then
                print jth element from set */
                if((counter & (1 << j)) > 0)
                    System.out.print(set[j]);
            }
             
            System.out.println();
        }
    }
            }

}
