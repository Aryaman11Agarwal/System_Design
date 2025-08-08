class Car{


    private  String engine;
    private String color;
    private boolean sunroof;

    Car(CarBuilder builder){
        this.color=builder.color;
        this.engine=builder.engine;
        this.sunroof=builder.sunroof;
    }

    @Override
    public String toString(){
        return "Engine: "+engine+ " Color: "+ color+ " has_sunroof: " + (sunroof? "Yes": "No");
    }

    public static class CarBuilder{

        private  String engine;
        private String color;
        private boolean sunroof=false;
        public CarBuilder setEngine(String engine){
            this.engine=engine;
            return this;
        }
        public CarBuilder setColor(String color){
            this.color=color;
            return this;
        }
        public CarBuilder setSunroof(boolean sunroof){
            this.sunroof=sunroof;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }




};



public class Main {
    public static void main(String[] args) {

        Car.CarBuilder builder=new Car.CarBuilder();

        Car car=builder.setColor("Pink")
                .setEngine("V8")
                .setSunroof(true)
                .build();

        System.out.println(car);



    }
}