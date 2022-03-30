package com.academy.pizza;
public class Pizza {

    private PizzaSize size;
    private String sauce, cheese, base;
    private boolean hasPepperoni, hasMushrooms, hasPineapple;

    protected Pizza(PizzaBuilder builder) {
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.base = builder.base;
        this.size = builder.size;
        this.hasMushrooms = builder.hasMushrooms;
        this.hasPepperoni = builder.hasPepperoni;
        this.hasPineapple = builder.hasPineapple;
    }
    
    public PizzaSize getSize() {
        return size;
    }

    public String getBase() {
        return base;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public boolean getHasPineapple() {
        return hasPineapple;
    }

    public boolean getHasMushrooms() {
        return hasMushrooms;
    }

    public boolean getHasPepperoni() {
        return hasPepperoni;
    }

    public static class PizzaBuilder implements PizzaTrait
	{
		private final String sauce, cheese, base;
        private final PizzaSize size;
        private boolean hasPepperoni, hasMushrooms, hasPineapple;
		
		public PizzaBuilder(String sauce, String cheese, String base, PizzaSize size) {
			this.sauce = sauce;
			this.cheese = cheese;
            this.base = base;
            this.size = size;
		}

        @Override
		public PizzaBuilder setPepperoni(boolean hasPepperoni) {
			this.hasPepperoni = hasPepperoni;
			return this;
		}

        @Override
		public PizzaBuilder setMushrooms(boolean hasMushrooms) {
			this.hasMushrooms = hasMushrooms;
			return this;
		}

        @Override 
        public PizzaBuilder setPineapple(boolean hasPineapple) {
			this.hasPineapple = hasPineapple;
			return this;
		}
		
        @Override
		public Pizza build() {
			Pizza pizza =  new Pizza(this);
			return pizza;
		}

	}

    @Override
    public String toString() {
        return "Pizza [base=" + base + ", cheese=" + cheese + ", hasMushrooms=" + hasMushrooms + ", hasPepperoni="
                + hasPepperoni + ", hasPineapple=" + hasPineapple + ", sauce=" + sauce + ", size=" + size + "]";
    }
    
}
