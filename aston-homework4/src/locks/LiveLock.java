package locks;

public class LiveLock {
    static class Human{
        private String name;
        private boolean lineIsActive = true;

        public Human(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void call(Human otherHuman){
            if (lineIsActive) {
                System.out.println(this.getName() + " звонит " + otherHuman.getName() + "...");
                lineIsActive = false;
                otherHuman.call(this);
            }
            System.out.println(this.getName() + " дозвонился");
        }
    }



    public static void main(String[] args) {
        Human oleg = new Human("Oleg");
        Human anton = new Human("Anton");

        new Thread(() -> oleg.call(anton)).start();
        anton.call(oleg);

    }
}
