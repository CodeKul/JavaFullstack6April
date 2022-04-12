package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        ObjectWays obj = new ObjectWays();

        ObjectWays obj1 = ObjectWays.class.newInstance();

        Constructor<ObjectWays> obj2 = ObjectWays.class.getConstructor();
        ObjectWays obj3 = obj2.newInstance();


    }
}
