package pers.liam.jvm_learning;

import com.sun.deploy.util.UpdateCheck;

import javax.swing.ButtonGroup;

public class T01_MyObject {
    public static void main(String[] args) {
        Object o = new Object();
        //得到对象的类，再得到类的加载器，Bootstrap加载器返回的是null
        System.out.println(o.getClass().getClassLoader());  //null

        ButtonGroup buttonGroup = new ButtonGroup();
        System.out.println(buttonGroup.getClass().getClassLoader());  //也是启动类加载器加载，在rt.jar下，import javax.swing.ButtonGroup

        UpdateCheck updateCheck = new UpdateCheck();
        System.out.println(updateCheck.getClass().getClassLoader());  // 由应用程序类加载器加载，虽然也在JAVA_HOME/lib/下

        T01_MyObject object = new T01_MyObject();
        System.out.println(object.getClass().getClassLoader());  // 由应用程序类加载器加载
    }
}
