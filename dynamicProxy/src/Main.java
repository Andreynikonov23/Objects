import java.io.Reader;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        SomeInterfaceWithMethod original = new InterfaceImpl();
        ClassLoader classLoader = original.getClass().getClassLoader();
        Class<?>[] interfaces = original.getClass().getInterfaces();
        CustomInvocationHandler customInvocationHandler = new CustomInvocationHandler(original);
        SomeInterfaceWithMethod inter = (SomeInterfaceWithMethod) Proxy.newProxyInstance(classLoader, interfaces, customInvocationHandler);
        inter.printMassage();
    }
}