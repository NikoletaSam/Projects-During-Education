package WorkingWithAbstraction.Lab.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double getTotalPrice(){
        double priceWithoutDiscount = this.pricePerDay * this.season.getValue() * numberOfDays;
        double currentDiscount = priceWithoutDiscount * this.discountType.getDiscountValue();

        return priceWithoutDiscount - currentDiscount;
    }
}
