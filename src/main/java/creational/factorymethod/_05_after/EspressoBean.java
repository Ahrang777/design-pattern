package creational.factorymethod._05_after;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.logging.log4j.util.Strings;

@Getter
@ToString
@EqualsAndHashCode
public class EspressoBean {
    private String beanName;
    private final int amount;

    public EspressoBean(String beanName, int amount) {
        this.beanName = beanName;
        this.amount = amount;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public boolean isValid() {
        return Strings.isBlank(beanName) || amount < 1;
    }
}
