package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Account;
import com.fois.Back_end_fois_smile.entity.AccountExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int deleteByPrimaryKey(Integer matk);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    Account selectByPrimaryKey(Integer matk);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.account
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByPrimaryKey(Account record);

    @Select("UPDATE schema01.account SET remove=true WHERE matk=#{matk}")
    public void removeAccHV(int matk);
    
    @Select("select * from schema01.account a where a.loaitk = 3 and a.remove = false ORDER BY thoigiandn DESC")
    public ArrayList<Account> getAllAccHV(); 

    @Select("select * from schema01.account a where a.username = #{username} and a.password = #{password} and a.remove = false")
    public Account getAccount(String username, String password);
    
    @Select("select * from schema01.account a where a.username = #{username} and a.password = #{password} and a.loaitk != 3 and a.remove = false")
    public Account getAccAdmin(String username, String password);
    
    @Select("select * from schema01.account a where a.username = #{username} and a.remove = false")
    public Account getAccByMail(String username);
    
    @Select("insert into schema01.account (username, password, loaitk) values (#{username}, #{password}, 3)")
    public void registration(String username, String password);
}