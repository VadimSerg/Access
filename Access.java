package com.company;

public class Access {

    public static void main(String[] args) {

        int c;
        Box a = new Box(7, -1);
        System.out.println ("отобраны при сортировке: из 14 элементов массива 7");
        for (int i = 0 ;i < (2 * a.length ) ;i ++)
        {
            a.push(i,i*10);
        }
        System.out.println ();
        System.out.println ("С отчётом по индексу:");
        for  (int i = 0 ;i<(2 *a.length);i++)
        {
            c = a.get(i);
            if(c!=-1)
                System.out.print(c+" ");
        }

        System.out.println ();
        for (int i =0 ;i <(2*a.length); i++)
        {
            if (!a.push (i, i*10)) System.out.println("Индекс вне массива: "+i+".");
        }

        for (int i = 0;i<(2 *a.length);i++)
        { c=a.get(i);
            if (c!=-1){System.out.print(c+" ");}
            else {System.out.println("Индекс вне массива: "+i+".");}
        }

    }
}




