/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCare;

/**
 *
 * @author pavan
 */
public class Community {
    private String communityName;
    private City city;

    @Override
    public String toString() {
        return "Community{" + "communityName=" + communityName + ", city=" + city + '}';
    }
   

    public Community(String communityName, City city) {
        this.communityName = communityName;
        this.city = city;
       
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
}
