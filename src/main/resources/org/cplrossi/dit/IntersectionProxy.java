/* mini-runtime environment to handle intersection casts */
package org.cplrossi.dit;

import java.lang.reflect.*;
import java.util.Arrays;

public class IntersectionProxy implements InvocationHandler {
  private Object target;

  public static Object newInstance(Object target, Class<?>[] interfaces) {
    return Proxy.newProxyInstance(
      target.getClass().getClassLoader(),
      interfaces,
      new IntersectionProxy(target)
    );
  }

  private IntersectionProxy(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Class<?>[] argClasses = null;

    if (args != null) {
      argClasses = (Class<?>[]) Arrays.asList(args)
                            .stream()
                            .map(a -> a.getClass())
                            .toArray();
    }

    return target.getClass()
      .getMethod(method.getName(), argClasses)
      .invoke(target, args);
  }
}
