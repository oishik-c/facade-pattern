import com.facadepattern.coffee.CoffeeFacade;

public class CoffeeFacadeTest {
    public static void main(String[] args){
        CoffeeFacade coffeeFacade = new CoffeeFacade(18);

//        Making a Cappuccino using the Facade
        coffeeFacade.create_cappuccino(10);
        System.out.println();

//        Making an Iced Coffee Next
        coffeeFacade.create_iced_coffee();
        System.out.println();

//
        coffeeFacade.create_americano();
    }
}
