package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Kaiwa;
import com.fois.Back_end_fois_smile.entity.KaiwaExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface KaiwaMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    long countByExample(KaiwaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int deleteByExample(KaiwaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int deleteByPrimaryKey(String maht);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int insert(Kaiwa record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int insertSelective(Kaiwa record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    List<Kaiwa> selectByExample(KaiwaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    Kaiwa selectByPrimaryKey(String maht);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Kaiwa record, @Param("example") KaiwaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int updateByExample(@Param("record") Kaiwa record, @Param("example") KaiwaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int updateByPrimaryKeySelective(Kaiwa record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kaiwa
     * @mbg.generated  Fri Jun 11 14:22:16 ICT 2021
     */
    int updateByPrimaryKey(Kaiwa record);

    @Select("select * from schema01.kaiwa ORDER BY maht")
    public ArrayList<Kaiwa> getAllKaiwa();
}