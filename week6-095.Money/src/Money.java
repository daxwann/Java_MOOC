
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int totalCents = this.cents + added.cents();
        int totalEuros = this.euros + added.euros();

        return new Money(totalEuros, totalCents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }

        return false;
    }

    public Money minus(Money decremented) {
        int totalCents = this.cents - decremented.cents();
        int totalEuros = this.euros - decremented.euros();

        if (totalCents < 0) {
            totalEuros += (totalCents / 100 - 1);
            totalCents = totalCents % 100;
        }

        if (totalEuros < 0 || (totalEuros == 0 && totalCents < 0)) {
            totalCents = 0;
            totalEuros = 0;
        } else if (totalCents < 0){
            totalCents = 100 + totalCents;
        }

        return new Money(totalEuros, totalCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
