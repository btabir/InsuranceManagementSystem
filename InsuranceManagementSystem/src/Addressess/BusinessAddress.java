package Addressess;

public class BusinessAddress extends AddressId implements Address<BusinessAddress> {

    private int addressId;
    private String cityName;
    private String districtName;
    private String streetName;
    private String adressDetails;

    public BusinessAddress(String cityName, String districtName, String streetName, String adressDetails) {
        addressId = AddressId.id;
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
        this.adressDetails = adressDetails;
    }

    @Override
    public void showAddressInfo() {
        System.out.println();
        System.out.println("Business adress ");
        System.out.println();
        System.out.println("Users adresses Id : " + this.getAdressId());
        System.out.println("Users city : " + this.getCityName());
        System.out.println("Users district : " + this.getDistrictName());
        System.out.println("Users street : " + this.getStreetName());
        System.out.println("Detailed adress : " + this.getAdressDetails());
    }

    public int getAdressId() {
        return addressId;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAdressDetails() {
        return adressDetails;
    }

    public void setAdressDetails(String adressDetails) {
        this.adressDetails = adressDetails;
    }
}
