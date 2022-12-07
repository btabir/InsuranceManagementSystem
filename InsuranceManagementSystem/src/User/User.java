package User;

import Addressess.Address;
import Insurances.Insurance;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surname;
    private String eMail;
    private String password;
    private String job;
    private int age;
    private Date lastEntry;
    private Address addresses;
    private Insurance insurances;
    private String membershipType;

    private ArrayList<Insurance> insuranceList = new ArrayList<>();
    private ArrayList<Address> addressList = new ArrayList<>();

    public User(String name, String surname, String eMail, String password, String job, int age,Address addresses,String membershipType) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addresses = addresses;
        this.addressList.add(addresses);
        this.membershipType = membershipType;
        this.lastEntry = new Date(System.currentTimeMillis());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(Date lastEntry) {
        this.lastEntry = lastEntry;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }

    public Insurance getInsurances() {
        return insurances;
    }

    public void setInsurances(Insurance insurances) {
        this.insurances = insurances;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insuranceList) {
        this.insuranceList.add(insuranceList);
    }

    public ArrayList<Address> getAdressList() {
        return addressList;
    }

    public void setAdressList(Address adressList) {
        this.addressList.add(adressList);
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
