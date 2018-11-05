import mturchyn.rpaentr.ExampleEntity;
import mturchyn.rpaentr.ExampleUtils;

import org.junit.Test;

public class TestExample {

    @Test
    public void test1(){

        ExampleEntity entity = new ExampleEntity();
        entity.setExampleStringProperty("hello!");

        System.out.println("Entity: " + entity);
        System.out.println("Result: " + ExampleUtils.multiply(5, 10));
    }
}
