package ru.mirea.task16.opt4;
public class RouteA implements InterfRoute {
    //получить routeName

    static int code; //0 - direct fly; 1 - reverse fly;
    String route = null;

    public RouteA (int code) {
        this.code = code;
        //System.out.println ("\nIni RouteA: code = " + this.code);
        if (code==0)
            this.route = "MyTown - TownA";
        else
            this.route = "TownA - MyTown";
        //System.out.println ("Ini RouteA: route = " + this.route);
    }

    public static void setCode (int code0) {
        code = code0;
    }
    public int getCode () {
        return code;
    }

    @Override
    public String getRouteName () {
        return this.route;
    }

    @Override
    public String toString () {
        return route;
    }

}