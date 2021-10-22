package Collection;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

public class TicTocToe2
{
    public static void main(String[] args) {
        ArrayList<String> stringArrayList =  new ArrayList<String>(6);
        stringArrayList.add("amit");
        stringArrayList.add("ram");
        stringArrayList.add("raj");
        stringArrayList.add("sahil");
        stringArrayList.add("rahul");
        stringArrayList.add("ram");
        stringArrayList.add("rahul v");

        stringArrayList.stream().forEach(name ->{
            System.out.println(name);
        });



    }
    }

