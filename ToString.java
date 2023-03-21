
public class ToString {

    private int id;
    private String name;
    private String location;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id=id;
    }


    ToString(int id,String name,String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }


    public static void main(String[] args) {
        ToString t1=new ToString(1, "Raju", "Banglore");

        System.out.println(t1);

    }


    @Override
    public String toString(){
        return id+""+name+""+location;
    }
}
