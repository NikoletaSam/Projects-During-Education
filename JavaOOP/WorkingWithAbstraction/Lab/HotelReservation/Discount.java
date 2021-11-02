package WorkingWithAbstraction.Lab.HotelReservation;

public enum Discount {
    VIP(0.2), SecondVisit(0.1), None(0);
    private double discountValue;

    Discount(double discountValue){
        this.discountValue = discountValue;
    }

    public double getDiscountValue(){
        return this.discountValue;
    }
}
