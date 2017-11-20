package com.example.manish.recycleviewexample.Utils;

import com.example.manish.recycleviewexample.R;
import com.example.manish.recycleviewexample.model.President;

import java.util.ArrayList;

/**
 * Created by Manish on 11/18/2017.
 */

public class DataSource {
    public static ArrayList<President> getPresidentData()
    {
        String [] president_names = {"Rajendra Prasad","Sarvepalli Radhakrishnan",
                "Zakir Husain","Varahagiri Venkata Giri",
                "Fakhruddin Ali Ahmed","Neelam Sanjiva Reddy",
                "Giani Zail Singh","Ramaswamy Venkataraman",
                "Shankar Dayal Sharma","Kocheril Raman Narayanan",
                "Avul Pakir Jainulabdeen Abdul Kalam", "Pratibha Patil",
                "Pranab Mukherjee","Ram Nath Kovind"};

        Integer[] images={R.drawable.president_1,R.drawable.president_2,R.drawable.president_3,R.drawable.president_4,R.drawable.president_5,
                R.drawable.president_6,R.drawable.president_7,R.drawable.president_8,R.drawable.president_9,R.drawable.president_10,R.drawable.president_11,
                R.drawable.president_12,R.drawable.president_13,R.drawable.president_14};

        String number_of_president[]= {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th"};

        String wiki_links[] = {"https://en.wikipedia.org/wiki/Rajendra_Prasad","https://en.wikipedia.org/wiki/Sarvepalli_Radhakrishnan",
                "https://en.wikipedia.org/wiki/Zakir_Husain_(politician)","https://en.wikipedia.org/wiki/V._V._Giri",
                "https://en.wikipedia.org/wiki/Fakhruddin_Ali_Ahmed ",  "https://en.wikipedia.org/wiki/Neelam_Sanjiva_Reddy",
                "https://en.wikipedia.org/wiki/Zail_Singh", "https://en.wikipedia.org/wiki/R._Venkataraman",
                "https://en.wikipedia.org/wiki/Shankar_Dayal_Sharma", "https://en.wikipedia.org/wiki/K._R._Narayanan",
                "https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam", "https://en.wikipedia.org/wiki/Pratibha_Patil",
                "https://en.wikipedia.org/wiki/Pranab_Mukherjee","https://en.wikipedia.org/wiki/Ram_Nath_Kovind"};

        String [] duration={"26 January 1950 – 14 May 1962","14 May 1962 – 13 May 1967",
                "13 May 1967 – 3 May 1969","24 August 1969 – 24 August 1974",
                "24 August 1974 – 11 February 1977","25 July 1977 – 25 July 1982",
                "25 July 1982 – 25 July 1987","25 July 1987 – 25 July 1992",
                "25 July 1992 – 25 July 1997","25 July 1997 – 25 July 2002",
                "25 July 2002 – 25 July 2007","25 July 2007 – 25 July 2012",
                "25 July 2012 – 25 July 2017","Current"};

        ArrayList<President> presidentArrayList = new ArrayList<>();

        for(int i=number_of_president.length-1;i>0;i--)
        {
            President temp_president= new President(president_names[i],duration[i],wiki_links[i],images[i],number_of_president[i]);
            presidentArrayList.add(temp_president);
        }

        return presidentArrayList;
    }
}
