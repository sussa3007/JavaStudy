interface Information {
     void info ();
}
class Motor implements Information { // private => protected
    private String body;
    private int tire;
    private String brake;
    Motor (String body, String brake, int tire) { setBody(body); setBrake(brake); setTire(tire); }
    public void setBody(String body) {
        this.body = body;
    }
    public void setBrake(String brake) {
        this.brake = brake;
    }
    public void setTire(int tire) {
        this.tire = getTire(tire);
    }
    public  String getBody() {return body;}
    public  String getBrake() {return brake;}
    public  int getTire() {return tire;}
    public void info () {
        getInfo(tire);
    }
    protected int getTire (int tire){
        if (tire > 0  && tire%2 == 0) {
            return tire;
        } else{
            System.out.println("타이어의 개수는 홀수 또는 음수가 될수 없습니다");
            return 0;
        }
    }
    private void getInfo (int tire) {
        if(tire == 0) {
            System.out.println("Set 오류");
        }else {
            System.out.println("======= Bike 정보 =======");
            System.out.println(this.body + "타입 바디");
            System.out.println(this.brake + "타입 브레이크");
            System.out.println(this.tire + "개의 타이어");
            System.out.println("=========================");
        }
    }
}
class MotorBike extends Motor implements Information {
    private int muffler;
    MotorBike(String body, String brake, int tire, int muffler) {
        super(body, brake, tire);
        setMuffler(muffler);
    }
    public void setMuffler(int muffler) {
        this.muffler = getMuffler(muffler);
    }
    public void info () {
        getInfo(super.getTire(),this.muffler);
    }
    private void getInfo (int tire, int muffler) {
        if(tire == 0 || muffler == 0) {
            System.out.println("Set 오류");
        }else {
            System.out.println("======= Bike 정보 =======");
            System.out.println(super.getBody() + "타입 바디");
            System.out.println(super.getBrake() + "타입 브레이크");
            System.out.println(super.getTire() + "개의 타이어");
            System.out.println(this.muffler + "개의 머플러");
            System.out.println("=========================");
        }
    }
    protected int getMuffler(int muffler){
        if (muffler <= 4) {
            return muffler;
        } else {
            System.out.println("머플러는 최대 4개입니다!!");
            return 0;
        }
    }
}
class Motorsmart extends Motor implements Information {
    private String smartkey;
    Motorsmart(String body, String brake, int tire, String smartkey) {
        super(body, brake, tire);
        setSmartKey(smartkey);
    }
    public void setSmartKey(String smartkey) {
        this.smartkey = smartkey;
    }
    public void info () { getInfo(); }
    private void getInfo( ) {
        System.out.println("======= Bike 정보 =======");
        System.out.println(super.getBody() + "타입 바디");
        System.out.println(super.getBrake() + "타입 브레이크");
        System.out.println(super.getTire() + "개의 타이어");
        System.out.println(this.smartkey + " 타입의 부트");
        System.out.println("=========================");
    }

}
class PrintInfo {
    void printinfo(Information motortype) {
        motortype.info();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Motor gi = new Motor("x","y",2);
        Motor gt = new MotorBike("a","b",8,4);
        Motor gt2 = new Motorsmart("a2","b2",2,"Key");

        PrintInfo print = new PrintInfo();
        print.printinfo(gi);
        print.printinfo(gt);
        print.printinfo(gt2);
        // Exception in thread "main" java.lang.NoClassDefFoundError
        // 왜 파일의 코드만 복사해서 파일을 지웠다가 다시 만들어 복사하니 실행되는가?
        // 왜 에러가 발생한 브레이크 포인트 클래스 이름은 Motorcycle Wrong neme :MotorCycle 이렇게 뜨는거지?
        // 이름이 문제였나?
    }
}
