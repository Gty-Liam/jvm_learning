//package pers.liam.oom;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class MetaspaceDemo {
//    static class Test{ }
//
//    public static void main(String[] args) {
//        int count = 0;
//        try {
//            while (true){
//                count++;
//                Enhancer enhancer = new Enhancer();
//                enhancer.setSuperclass(Test.class);
//                enhancer.setUseCache(false);
//                enhancer.setCallback(new MethodInterceptor() {
//                    @Override
//                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                        return methodProxy.invokeSuper(o, args);
//                    }
//                });
//                enhancer.create();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("一共创建了" + count + "类模板");
//        }
//    }
//}
