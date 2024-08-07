class My {
    static int s;
    int y=10;
    static{
        System.out.println("Block");
        s=10;
        System.out.println(10);
        //Inside the static block we can access only static method and static members
        //System.out.println(y);

    }
    static{
        System.out.println("Block2");
        System.out.println(s);
    }

}
public class StacticBlock {
    public static void main(String[] args) {
        My m = new My();
        System.out.println("Nutan");
    }
}
