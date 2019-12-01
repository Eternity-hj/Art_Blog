package com.luotf.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BlackIp implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer vid;
    
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blackip.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blackip.browserType
     *
     * @mbg.generated
     */
    private String browsertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blackip.platformType
     *
     * @mbg.generated
     */
    private String platformtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_blackip.time
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.id
     *
     * @return the value of t_blackip.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.id
     *
     * @param id the value for t_blackip.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.ip
     *
     * @return the value of t_blackip.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.ip
     *
     * @param ip the value for t_blackip.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.city
     *
     * @return the value of t_blackip.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.city
     *
     * @param city the value for t_blackip.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.browserType
     *
     * @return the value of t_blackip.browserType
     *
     * @mbg.generated
     */
    public String getBrowsertype() {
        return browsertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.browserType
     *
     * @param browsertype the value for t_blackip.browserType
     *
     * @mbg.generated
     */
    public void setBrowsertype(String browsertype) {
        this.browsertype = browsertype == null ? null : browsertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.platformType
     *
     * @return the value of t_blackip.platformType
     *
     * @mbg.generated
     */
    public String getPlatformtype() {
        return platformtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.platformType
     *
     * @param platformtype the value for t_blackip.platformType
     *
     * @mbg.generated
     */
    public void setPlatformtype(String platformtype) {
        this.platformtype = platformtype == null ? null : platformtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_blackip.time
     *
     * @return the value of t_blackip.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_blackip.time
     *
     * @param time the value for t_blackip.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }
}