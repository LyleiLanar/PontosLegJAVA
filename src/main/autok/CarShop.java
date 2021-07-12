package main.autok;

public class CarShop {

    //region fields
    private Car[] cars;
    private int maxPlace;
    //endregion

    //region set,get

    //    public Car[] getCars() {
//        Car[] clone = cars.clone();
//        return clone;
//    }
//
//    public void setCars(Car[] cars) {
//        this.cars = cars;
//    }

    public int getMaxPlace() {
        return maxPlace;
    }

    private void setMaxPlace(int maxPlace) {
        if (maxPlace < 5) {
            maxPlace = 5;
        }
        this.maxPlace = maxPlace;
    }
    //endregion


}
