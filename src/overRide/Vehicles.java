package overRide;

class vehicles {
    void run() {
        System.out.println("Runnning");
    }

    class Bike extends vehicles {
        void run() {
            System.out.println("child running");
        }
    }

    public static void main(String[] args) {
        vehicles vehicles = new vehicles();
//        vehicles.run();
//        Bike bike = new Bike();

    }
}


