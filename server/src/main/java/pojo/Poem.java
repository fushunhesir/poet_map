package pojo;

import java.math.BigDecimal;

public class Poem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.id
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.name
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.year
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String year;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.poet
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String poet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.oldcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String oldcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.newcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String newcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.type
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.content
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.description
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.location
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.longitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private BigDecimal longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poem.altitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    private BigDecimal altitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.id
     *
     * @return the value of poem.id
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.id
     *
     * @param id the value for poem.id
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.name
     *
     * @return the value of poem.name
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.name
     *
     * @param name the value for poem.name
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.year
     *
     * @return the value of poem.year
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.year
     *
     * @param year the value for poem.year
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.poet
     *
     * @return the value of poem.poet
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getPoet() {
        return poet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.poet
     *
     * @param poet the value for poem.poet
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setPoet(String poet) {
        this.poet = poet == null ? null : poet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.oldcity
     *
     * @return the value of poem.oldcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getOldcity() {
        return oldcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.oldcity
     *
     * @param oldcity the value for poem.oldcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setOldcity(String oldcity) {
        this.oldcity = oldcity == null ? null : oldcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.newcity
     *
     * @return the value of poem.newcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getNewcity() {
        return newcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.newcity
     *
     * @param newcity the value for poem.newcity
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setNewcity(String newcity) {
        this.newcity = newcity == null ? null : newcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.type
     *
     * @return the value of poem.type
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.type
     *
     * @param type the value for poem.type
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.content
     *
     * @return the value of poem.content
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.content
     *
     * @param content the value for poem.content
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.description
     *
     * @return the value of poem.description
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.description
     *
     * @param description the value for poem.description
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.location
     *
     * @return the value of poem.location
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.location
     *
     * @param location the value for poem.location
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.longitude
     *
     * @return the value of poem.longitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.longitude
     *
     * @param longitude the value for poem.longitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poem.altitude
     *
     * @return the value of poem.altitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poem.altitude
     *
     * @param altitude the value for poem.altitude
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }
}