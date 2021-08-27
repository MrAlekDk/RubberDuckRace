package Exercise;
//*Auther Alexander Soerensen
public class Main {

    public static void main(String[] args) {

        RubberDuckRace rdr = new RubberDuckRace();
        Statistics s = new Statistics();
        for (int i = 0; i < 10000; i++) {
            s.addNumber(rdr.runSimulation(2));
        }
        s.printStatistics();
    }
}
