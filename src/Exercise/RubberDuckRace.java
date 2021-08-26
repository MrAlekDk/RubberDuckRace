package Exercise;

import java.util.*;


public class RubberDuckRace {

    private List<Queue<RubberDuck>> allQueues;
    private Random r = new Random();

    public RubberDuckRace(){
        allQueues = new ArrayList<>();
    }

    public int runSimulation(int n){
        generateQueues(n);
        createRubberDucks(n);
        return runTimelines(n);
    }

    public void generateQueues(int n){
        for (int i = 0; i < n; i++) {
            allQueues.add(new Queue<RubberDuck>(n));
        }
    }

    public int runTimelines(int n){
        int counter = n;

        while(counter>1){
            List<Queue<RubberDuck>> newQueues = new ArrayList<Queue<RubberDuck>>();
            for (int i = 0; i < counter-1; i++) {
                newQueues.add(new Queue<RubberDuck>(n-1));
            }

            for (int i = 0; i < newQueues.size(); i++) {
                while(!newQueues.get(i).isFull()){

                    RubberDuck tmp = allQueues.get(r.nextInt(allQueues.size())).popElement();
                    if(tmp!=null){
                        newQueues.get(i).addElementToQueue(tmp);
                    }
                }
            }

            counter--;
            allQueues = newQueues;
        }

        RubberDuck theWinner = allQueues.get(0).popElement();
        return theWinner.getNumber();
    }

    public void createRubberDucks(int n){
        Set<RubberDuck> tmpSet = new HashSet<RubberDuck>();

        int numberOfDucks = n*n;
        while(tmpSet.size()<numberOfDucks){
            RubberDuck tmpDuck = new RubberDuck(r.nextInt(n*n)+1);
            tmpSet.add(tmpDuck);
        }
        int ranNumber =0;
        Iterator it = tmpSet.iterator();
            while(it.hasNext()){
                allQueues.get(r.nextInt(n)).addElementToQueue((RubberDuck) it.next());
            }
        }


}
