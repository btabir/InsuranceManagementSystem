package Addressess;

public class HomeAdress extends AddressId implements Address<HomeAdress>{

    private int addressId;
    private String cityName;
    private String districtName;
    private String streetName;
    private String adressDetails;

    public HomeAdress( String cityName, String districtName, String streetName, String adressDetails) {
        addressId = AddressId.id;
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
        this.adressDetails = adressDetails;
    }

    @Override
    public void showAddressInfo(){
        System.out.println();
        System.out.println("Home adress ");
        System.out.println();
        System.out.println("Users adressId : " + this.getAddressId());
        System.out.println("Users city : " + this.getCityName());
        System.out.println("Users district : " + this.getDistrictName());
        System.out.println("Users street : " + this.getStreetName());
        System.out.println("Detailed adress : " +this.getAdressDetails());
    }
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int adressId) {
        this.addressId = adressId;
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
