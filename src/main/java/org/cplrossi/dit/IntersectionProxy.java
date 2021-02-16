/* mini-runtime environment to handle intersection casts */
package org.cplrossi.dit;

import java.lang.reflect.*;

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
    return target.getClass()
      .getMethod(method.getName())
      .invoke(target, args);
  }
}
