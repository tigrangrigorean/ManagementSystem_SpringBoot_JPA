package com.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private long id;
    @Column(name = "passenger_name")
    private String name;
    @Column(name = "passenger_phone")
    private String phone;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    /**
     * Default Constructor
     */
    public Passenger() {

    }

    /**
     * @param name
     * @param phone
     * @param address
     */
    public Passenger(String name, String phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Passenger [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]\n";
    }



}
