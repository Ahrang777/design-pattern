package creational.factorymethod._05_after;

public interface CoffeeMachine {
    default Coffee orderCoffee(EspressoBean bean, int water, String orderName) {
        validateBean(bean);
        validateWaterAmount(water);
        Coffee coffee = createCoffee(bean, water);
        servingTo(orderName, coffee);
        return coffee;
    }

    Coffee createCoffee(EspressoBean bean, int water);

    private void validateBean(EspressoBean bean) {
        if (bean.isValid()) {
            throw new IllegalArgumentException("원두가 부족합니다.");
        }
    }

    private void validateWaterAmount(int water) {
        if (water < 1) {
            throw new IllegalArgumentException("물이 부족합니다.");
        }
    }

    private void prepareFor(String espressoBean) {
        System.out.println("커피 제조중...");
        System.out.println("사용한 원두는 " + espressoBean + " 입니다.");
    }

    private void servingTo(String name, Coffee coffee) {
        System.out.println(name + " 님 주문하신 " + coffee.getName() + " 나왔습니다.");
    }
}
