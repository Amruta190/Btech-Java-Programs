class ternary{
    public static void main(String[] args)
    {
        int x,y,z,t;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        z=Integer.parseInt(args[2]);
        t=(x>y && x>z)?x:((y>z)?y:z);
        System.out.println("The largest no is = "+t);
    }
}