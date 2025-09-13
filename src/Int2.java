public class Int2 implements Cloneable{
    private int i;

    Int2(int i){
        this.i = i;
    }
    public int getI(){
        return i;
    }
    public void increment(){
        i++;
    }
    public String toString(){
        return Integer.toString(i);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
