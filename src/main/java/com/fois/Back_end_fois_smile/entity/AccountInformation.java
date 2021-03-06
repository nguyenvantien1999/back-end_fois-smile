package com.fois.Back_end_fois_smile.entity;

import java.util.Date;
import lombok.Data;

@Data
public class AccountInformation {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.matt
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private Integer matt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.hoten
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private String hoten;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.ngaysinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private Date ngaysinh;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.gioitinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private Integer gioitinh;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.diachi
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private String diachi;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column schema01.account_information.matk
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    private Integer matk;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.matt
     * @return  the value of schema01.account_information.matt
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Integer getMatt() {
        return matt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.matt
     * @param matt  the value for schema01.account_information.matt
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setMatt(Integer matt) {
        this.matt = matt;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.hoten
     * @return  the value of schema01.account_information.hoten
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.hoten
     * @param hoten  the value for schema01.account_information.hoten
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.ngaysinh
     * @return  the value of schema01.account_information.ngaysinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Date getNgaysinh() {
        return ngaysinh;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.ngaysinh
     * @param ngaysinh  the value for schema01.account_information.ngaysinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.gioitinh
     * @return  the value of schema01.account_information.gioitinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Integer getGioitinh() {
        return gioitinh;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.gioitinh
     * @param gioitinh  the value for schema01.account_information.gioitinh
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setGioitinh(Integer gioitinh) {
        this.gioitinh = gioitinh;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.diachi
     * @return  the value of schema01.account_information.diachi
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.diachi
     * @param diachi  the value for schema01.account_information.diachi
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column schema01.account_information.matk
     * @return  the value of schema01.account_information.matk
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public Integer getMatk() {
        return matk;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column schema01.account_information.matk
     * @param matk  the value for schema01.account_information.matk
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    public void setMatk(Integer matk) {
        this.matk = matk;
    }

    public AccountInformation(int matt, String hoten, Date ngaysinh, int gioitinh, String diachi, int matk) {
        this.matt = matt;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.matk = matk;
    }
}