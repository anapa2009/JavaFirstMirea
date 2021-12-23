package ru.mirea.task16.opt4;
public class RouteD implements InterfRoute {
    //получить routeName

    static int code; //0 - direct fly; 1 - reverse fly;
    String route = null;

    public RouteD (int code) {
        this.code = code;
        if (code==0)
            this.route = "MyTown - TownD";
        else
            this.route = "TownD - MyTown";
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