interface Information1 {
    void info();
}
class Motor1 implements Information1{
    private String body; // 변수
    private int tire;
    private String brake;
    private int muffler;
    private String smartkey;
    Motor1 (String body, String brake, int tire){ // 생성자
        setBody(body);
        setBrake(brake);
        setTire(tire);
    }
    Motor1 (String body, String brake, int tire,int muffler){
        setBody(body);
        setBrake(brake);
        setTire(tire);
        setMuffler(muffler);
    }
    Motor1 (String body, String brake, int tire,int muffler,String smartkey){
        setBody(body);
        setBrake(brake);
        setTire(tire);
        setMuffler(muffler);
        setSmartkey(smartkey);
    }

    private void getInfo() { //출력값 정의
        System.out.println("======= Bike 정보 =======");
        System.out.println(getBody() + " 타입 바디");
        System.out.println(getBrake() + " 타입 브레이크");
        System.out.println(getTire() + " 개의 타이어");
        System.out.println("=========================");
    }
    private void setBody(String body) {
        this.body = body;
    } // 변수 정의
    private void setBrake(String brake) {
        this.brake = brake;
    }
    private void setTire(int tire) {
        this.tire = tire;
    }
    private void setMuffler(int muffler) { this.muffler = muffler; }
    private void setSmartkey(String smartkey) {
        this.smartkey = smartkey;
    }
    public  String getBody() {return body;} // 변수값 반환
    public  String getBrake() {return brake;}
    public  int getTire() {return tire;}
    public  int getMuffler() {return muffler;}
    public  String getSmartkey() {return smartkey;}
    public  void info() {getInfo();}  //출력
}

class MotorBike1 extends Motor1  {
    MotorBike1 (String body, String brake, int tire,int muffler){ //생성자
        super(body,brake,tire,muffler);
    }
    public void info() {getInfo();} // 정보출력
    private void getInfo(){ //출력값 정의
        System.out.println("======= Bike 정보 =======");
        System.out.println(getBody() + " 타입 바디");
        System.out.println(getBrake() + " 타입 브레이크");
        System.out.println(getTire() + " 개의 타이어");
        System.out.println(getMuffler() + " 개의 머플러");
        System.out.println("=========================");
    }

}
class MotorBike2 extends Motor1 {
    MotorBike2 (String body, String brake, int tire,int muffler,String smartkey){ //생성자
        super(body,brake,tire,muffler,smartkey);
    }
    public void info() {getInfo();}//정보출력
    private void getInfo() {  //출력값 정의
        System.out.println("======= Bike 정보 =======");
        System.out.println(getBody() + " 타입 바디");
        System.out.println(getBrake() + " 타입 브레이크");
        System.out.println(getTire() + " 개의 타이어");
        System.out.println(getSmartkey() + " 타입의 부트");
        System.out.println(getMuffler() + " 개의 머플러");
        System.out.println("=========================");
    }

}
class PrintInfo1 { //별도의 출력 클래스 생성
    void print (Information1 motor){motor.info();}
}

public class PolymorphismSimple {
    public static void main(String[] args) {
        Information1 gt = new MotorBike2("a","b",1,2,"c");
        Information1 gt1 = new MotorBike1("a1", "b1", 2,4);
        Information1 gt2 = new Motor1("a2","b2",2);

        PrintInfo1 p = new PrintInfo1();
        p.print(gt);
        p.print(gt1);
        p.print(gt2);
    }
}
