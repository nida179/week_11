public class Int3 extends Int2{
    private int j;

    Int3(int jj){
        super(jj);
        this.j = jj;
    }
    public String toString(){
        return "the vaue is: "+j;
    }
    public int getJ(){
        return j;
    }
    // No need to write the clone method as it is already extended through inheritance
}