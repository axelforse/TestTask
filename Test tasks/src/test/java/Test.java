import org.junit.Before;

public class Test extends Hypothesis {

    @Before
    public void setRollsParameter() {
        setCount(1);
        setRolls(5000);
    }

    @org.junit.Test
public void Percentage(){
        checkDeviationPercentage();
    }
}
