class River {

    static String name;
    static String origin;
    static int length; 
    static String flowsThrough;
    static boolean isPolluted;
    static double depth; 

    public static String getName() {
        name = "Ganga";
        return name;
    }

    public static String getOrigin() {
        origin = "Gangotri Glacier";
        return origin;
    }

    public static int getLength() {
        length = 2525;
        return length;
    }

    public static String getFlowsThrough() {
        flowsThrough = "India and Bangladesh";
        return flowsThrough;
    }

    public static boolean getIsPolluted() {
        isPolluted = true;
        return isPolluted;
    }

    public static double getDepth() {
        depth = 30.5;
        return depth;
    }
}
