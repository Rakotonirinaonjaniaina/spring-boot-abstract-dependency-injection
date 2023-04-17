package Component;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1 {
    public void execute() {
        System.out.println("ConcreteClass2 execute called");
        concreteDependance1.method1();
        concreteDependance2.method2();
    }
}

