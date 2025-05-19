package org.example.behavioural.iteratorStrategy;

public class Address {
    private long lat;
    private long lon;
    private int houseNum;
    private int streetNum;

    public Address(AddressBuilder addressBuilder) {
        this.lat = addressBuilder.lat;
        this.lon = addressBuilder.lon;
        this.houseNum = addressBuilder.houseNum;
        this.streetNum = addressBuilder.streetNum;
    }


    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    static class AddressBuilder{
        private long lat;
        private long lon;
        private int houseNum;
        private int streetNum;

        public AddressBuilder setLat(long lat){
             this.lat = lat;
             return this;
        }

        public AddressBuilder setLon(long lon) {
            this.lon = lon;
            return this;
        }

        public AddressBuilder setHouseNum(int houseNum) {
            this.houseNum = houseNum;
            return this;
        }

        public AddressBuilder setStreetNum(int streetNum) {
            this.streetNum = streetNum;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", houseNum=" + houseNum +
                ", streetNum=" + streetNum +
                '}';
    }
}
