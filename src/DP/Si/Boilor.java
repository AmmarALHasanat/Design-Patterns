package DP.Si;

public class Boilor {
    private boolean isEmpty;
    private boolean isBoild;

    private static Boilor instance;

    private Boilor(){
        isBoild=false;
        isEmpty=true;
    }

    public static Boilor getInstance(){
        if (instance==null){
            instance=new Boilor();
        }
        return instance;
    }

    public void fill(){
        if (isEmpty){
            isEmpty=false;
        }
    }
    public void boil(){
        if (!isEmpty&&!isBoild){
            isBoild=true;
        }
    }

    public void drain(){
        if (isBoild&&!isEmpty){
            isEmpty=true;
            isBoild=false;
        }
    }
    @Override
    public String toString() {
        return super.toString() +" Boilor{" +
                "isEmpty=" + isEmpty +
                ", isBoild=" + isBoild +
                '}';
    }

}
