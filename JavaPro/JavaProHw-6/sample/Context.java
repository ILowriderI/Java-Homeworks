package sample;


import java.util.Hashtable;
import java.util.List;


public class Context {


    public Hashtable getBean() {

        String value = Main.class.getAnnotation(ComponentScan.class).value();

        Hashtable result = new Hashtable<>();
        List<Class<?>> classes = ClassFinder.find(value);

        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).isAnnotation()) {
                result.put(i, classes.get(i));
            }
        }

        return result;

    }
}
/*
Class<ComponentScan> componentScanClass = ComponentScan.class;
        Class<?> scanClass = componentScanClass.getSuperclass();
        Annotation [] arrayAnnotation = scanClass.getAnnotations();
        Hashtable result = new Hashtable<>();
        for (int i =0;i < arrayAnnotation.length;i++){
            result.put(i,arrayAnnotation[i]);
        }
        return result;
 */