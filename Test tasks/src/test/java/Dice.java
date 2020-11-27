import io.restassured.RestAssured;
import io.restassured.response.Response;
import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.util.Arrays;
import java.util.stream.Stream;

public class Dice {

    public static int rolls;
    public static int count;
    public static int deviationPercentage = 5;

    public static int getCount() {
        return count;
    }

    public static int getRolls() {
        return rolls;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void setRolls(int rolls) {
        this.rolls = rolls;
    }

// Convert response body to int array
    public static final int[] middle() {
        rolls = getRolls();
        count = getCount();

        Response response = RestAssured.get("https://www.random.org/integers/?num=" + rolls + "&min=1&max=6&col=" + count + "&base=10&format=plain&rnd=new");

        String str = response.getBody().asString();
        int[] arr = Arrays.stream(str.split("\\n"))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
        }

    }