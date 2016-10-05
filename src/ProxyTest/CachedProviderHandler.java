package ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hughie on 16/10/1.
 */
public class CachedProviderHandler implements InvocationHandler {
    private Map<String, Object> cached =  new HashMap<>();
    private Object target;

    public CachedProviderHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
