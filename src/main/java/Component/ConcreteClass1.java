package Component;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1 {
    public void execute() {
        System.out.println("ConcreteClass1 execute called");
        concreteDependance1.method1();
        concreteDependance2.method2();
    }
}
