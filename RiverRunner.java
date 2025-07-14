class RiverRunner {

    public static void main(String river[]) {
        System.out.println("Main Started");

        String name = River.getName();
        System.out.println("River Name: " + name);

        String origin = River.getOrigin();
        System.out.println("Origin: " + origin);

        int length = River.getLength();
        System.out.println("Length: " + length + " km");

        String flow = River.getFlowsThrough();
        System.out.println("Flows Through: " + flow);

        boolean polluted = River.getIsPolluted();
        System.out.println("Is Polluted: " + polluted);

        double depth = River.getDepth();
        System.out.println("Depth: " + depth + " meters");

        System.out.println("Main Ended");
    }
}
