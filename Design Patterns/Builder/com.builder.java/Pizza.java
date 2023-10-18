import java.util.*;

import static java.util.Arrays.stream;

public class Pizza {

    private final Size size;
    private final Dought dought;
    private final Sauce sauce;
    private final Set<Topping> toppings;
    private boolean olive;

    public static class PizzaBuilder {
        private final Size size;
        private final Dought dought;
        private Sauce sauce;
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        private boolean olive;

        public PizzaBuilder(Size size, Dought dought) {
            this.size = size;
            this.dought = dought;
        }

        public PizzaBuilder withTopping(Topping... topping) {
            toppings.addAll(stream(topping).toList());
            return this;
        }

        public PizzaBuilder withSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder withOlive() {
            this.olive = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }


    }
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.dought = builder.dought;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
        this.olive = builder.olive;
    }
}