package Component;

import org.springframework.stereotype.Component;

@Component
public class ConcreteDependance1 {
    public void method1() {
        System.out.println("ConcreteDependance1 method1 called");
    }
}