package ru.mirea.task16.opt4;
public class MyFlyFactory {

    int code; //0 - direct fly; 1 - reverse fly;
    public InterfRoute routeToReturn = null;

    public void setCode (int code) {
        this.code = code;
    }

    public int getCode () {
        return code;
    }


    public InterfRoute outputRouteName (String town) throws Exception {
        //public String [] getRouteName (String town) throws Exception {
        //простая фабрика

        //TownA ("TownA"), TownB ("TownB"), TownC ("TownC"),
        //TownD ("TownD"), TownE ("TownE");

        InterfRoute routeToReturn; // = null;
        //String [] routeToReturn;

        switch (town) {
            case "TownA":
                RouteA.setCode (code);
                routeToReturn = new RouteA (code);
                //System.out.println ("\nRouteA.getCode (code) = " + this.routeToReturn);
                return routeToReturn;

            case "TownB":
                RouteB.setCode (code);
                return new RouteB (code);

            case "TownC":
                RouteC.setCode (code);
                return new RouteC (code);

            case "TownD":
                RouteD.setCode (code);
                return new RouteD (code);

            default:
                throw new Exception ("Я не могу найти пункт прилета!");
        }

        //return routeToReturn;
    }

    //@Override
    //public String toString () {
    //   return route;
    //}
}