import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethod someInterfaceWithMethod;

    public CustomInvocationHandler(SomeInterfaceWithMethod someInterfaceWithMethod){
        this.someInterfaceWithMethod = someInterfaceWithMethod;
    }
    public CustomInvocationHandler(){}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("printMassage")){
            System.out.println("This is proxy");
        }
        return method.invoke(someInterfaceWithMethod, args);
    }
}
