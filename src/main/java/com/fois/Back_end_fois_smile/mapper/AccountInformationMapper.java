package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.AccountInformation;
import com.fois.Back_end_fois_smile.entity.AccountInformationExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountInformationMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    long countByExample(AccountInformationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByExample(AccountInformationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByPrimaryKey(Integer matt);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insert(AccountInformation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insertSelective(AccountInformation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    List<AccountInformation> selectByExample(AccountInformationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    AccountInformation selectByPrimaryKey(Integer matt);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") AccountInformation record,
            @Param("example") AccountInformationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExample(@Param("record") AccountInformation record,
            @Param("example") AccountInformationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKeySelective(AccountInformation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account_information
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKey(AccountInformation record);

    @Select("select * from schema01.account_information a where a.matk = #{matk}")
    public AccountInformation getAccountInformation(int matk);
    
    @Select("SELECT * FROM schema01.account_information i INNER JOIN schema01.account a ON i.matk = a.matk where a.loaitk = 3 and remove=false;")
    public ArrayList<AccountInformation> getAllHVInformation();
    
    @Select("insert into schema01.account_information (hoten, matk, gioitinh) values (#{hoten}, #{matk}, -1)")
    public void registration(String hoten, int matk);
    
    @Select("UPDATE schema01.account_information SET hoten=#{hoten}, ngaysinh=#{ngaysinh}, gioitinh=#{gioitinh}, diachi=#{diachi} WHERE matt=#{matt}")
    public void updateAccountInfo(AccountInformation accountInformation);
}