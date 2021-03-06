package cz.project.c3.web.dto;

import cz.project.c3.domain.person.SexType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    // --------------------------- PERSON INFO
    @NotNull
    @Size(min = 1, max = 30)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 30)
    private String lastName;
    @NotNull
    private SexType sex;

    // --------------------------- ADDRESS INFO
    @NotNull
    @Size(min = 1, max = 30)
    private String country;
    @NotNull
    @Size(min = 1, max = 30)
    private String city;


    // --------------------------- UNIVERSITY INFO
    @Size(min = 1, max = 200)
    private String universityName;

    // --------------------------- COMPANY NAME
    @Size(min = 1, max = 200)
    private String companyName;

    public UserDTO() {
        super();
    }

    public UserDTO(String firstName, String lastName, SexType sex, String country, String city) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.country = country;
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the sex
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(SexType sex) {
        this.sex = sex;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

}
