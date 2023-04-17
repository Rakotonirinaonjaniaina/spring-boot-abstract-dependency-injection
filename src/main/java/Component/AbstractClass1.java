package Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    @Autowired
    protected ConcreteDependance1 concreteDependance1;

    @Autowired
    protected ConcreteDependance2 concreteDependance2;

    public abstract void execute();
}
