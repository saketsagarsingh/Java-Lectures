public class Constructor {
    int a;
    char e;
    String d;
    Constructor(){
        System.out.println("No-args constructor called");
    }
    Constructor(int a, char e, String d){
        this.a = a;
        this.e = e;
        this.d = d;
    }

    Constructor(int a, char e){
        this.a = a;
        this.e = e;
    }
    
    @Override
    public String toString() {
        return "Constructor [a=" + a + ", e=" + e + ", d=" + d + "]";
    }
    public static void main(String[] args) {
        Constructor con = new Constructor();
        Constructor con1 = new Constructor(10, 'c', "saket");
        System.out.println(con1.toString());
        Constructor con2 = new Constructor(10,'g');
        System.out.println(con2.toString());
    }
}
