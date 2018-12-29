import java.util.ArrayList;

/**
 * Problem -->
 * This class represents a problem that contains all methods to create
 * all required aspects for this problem like initial state function,
 * acts, results, objective function and path cost.
 *
 * This class is going to be used by several algorithms in their specified
 * classes.
 *
 * @author hafez
 */
public class Problem {
    private Node initialState;

    private Node goalState;

    private ArrayList<Node> stateSpace;

    /**
     * Constructor
     */
    public Problem(Node initialState, Node goalState,
                   ArrayList<Node> stateSpace){
        this.initialState = initialState;
        this.goalState = goalState;
        this.stateSpace = stateSpace;
    }

    /**
     * getInitialState
     * @return initialState
     */
    public Node getInitialState() {
        return initialState;
    }

    /**
     * getGoalState
     * @return goalState
     */
    public Node getGoalState() {
        return goalState;
    }

    /**
     * getStateSpace
     * @return stateSpace
     */
    public ArrayList<Node> getStateSpace() {
        return stateSpace;
    }
}
