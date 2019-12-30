
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApt) {
        return this.squareMeters > otherApt.squareMeters;
    }

    public int priceDifference(Apartment otherApt) {
        int price1 = this.pricePerSquareMeter * this.squareMeters;
        int price2 = otherApt.pricePerSquareMeter * otherApt.squareMeters;
        int priceDiff = price1 - price2;
        if (priceDiff < 0) {
            return -1 * priceDiff;
        }
        return priceDiff;
    }

    public boolean moreExpensiveThan(Apartment otherApt) {
        int priceSelf = this.pricePerSquareMeter * this.squareMeters;
        int priceOther = otherApt.pricePerSquareMeter * otherApt.squareMeters;

        return priceSelf > priceOther;
    }
}
