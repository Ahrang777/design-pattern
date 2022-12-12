package creational.factorymethod._05_after;

public class AmericanoFactory implements CoffeeMachine {
    @Override
    public Coffee createCoffee(EspressoBean bean, int water) {
        EspressoBean grindBean = grindBean(bean);
        return new Americano(grindBean, 10);
    }

    private EspressoBean grindBean(EspressoBean espressoBean) {
        espressoBean.setBeanName("갈린 " + espressoBean.getBeanName());
        return espressoBean;
    }
}
