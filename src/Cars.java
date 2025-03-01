public record Cars(String brand, String model, int productionYear, String engineDisplacement) implements Comparable {

    public int compareTo(Cars cars) {
        if (this.productionYear > cars.productionYear) {
            return 1;
        } else if (this.productionYear < cars.productionYear) {
            return -1;
        } else {
            return 0;
        }

    }
}
