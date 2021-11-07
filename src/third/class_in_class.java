package third;

public class class_in_class {


    private boolean ready = false;
    class Zazhiganie {
        public void Start() {
            ready = true;
            System.out.println(ready);
        }

        public void Shutdown() {
            ready = false;
            System.out.println(ready);
        }
    }

    class Motor {
        public void Start() {
            ready = true;
            System.out.println(ready);
        }

        public void Shutdown() {
            ready = false;
            System.out.println(ready);
        }
    }
    Zazhiganie bnw = new Zazhiganie();
    Motor bbk = new Motor();
}
