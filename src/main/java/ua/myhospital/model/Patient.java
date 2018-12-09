package ua.myhospital.model;

public class Patient {

    private long ssn;
    private String name;
    private String address;
    private String phone;


    private long insuranceId;
    private long pcp;

    public Patient(long ssn) {
        this.ssn = ssn;
    }

    public Patient() {
    }

    ;

    public Patient(String name, String address, String phone, long insuranceId, long pcp) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.insuranceId = insuranceId;
        this.pcp = pcp;
    }

    public Patient(long ssn, String name, String address, String phone, long insuranceId, long pcp) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.insuranceId = insuranceId;
        this.pcp = pcp;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(long insuranceId) {
        this.insuranceId = insuranceId;
    }


    public long getPcp() {
        return pcp;
    }

    public void setPcp(long pcp) {
        this.pcp = pcp;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ssn=" + ssn +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", insuranceId=" + insuranceId +
                ", pcp=" + pcp +
                '}';
    }

}
