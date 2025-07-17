package locks;

public class DeadLock {

    static class Human {
        private String name;

        public Human(String name){
            this.name = name;
        }

        public synchronized void welcome(Human human){
            System.out.println(this.getName() + " поприветствовал " + human.getName());
            human.welcomeBack(this);
        }

        public synchronized void welcomeBack(Human human){
            System.out.println(this.getName() + " поприветствовал в ответ");
        }

        public String getName() {
            return name;
        }
    }


    public static void main(String[] args) {
        Human thomas = new Human("Thomas");
        Human arthur = new Human("Arthur");

        new Thread(() -> thomas.welcome(arthur)).start();
        arthur.welcome(thomas);
    }
}
