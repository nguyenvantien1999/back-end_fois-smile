package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Listening;
import com.fois.Back_end_fois_smile.entity.ListeningExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ListeningMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    long countByExample(ListeningExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByExample(ListeningExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByPrimaryKey(String mabainghe);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insert(Listening record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insertSelective(Listening record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    List<Listening> selectByExample(ListeningExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    Listening selectByPrimaryKey(String mabainghe);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Listening record, @Param("example") ListeningExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExample(@Param("record") Listening record, @Param("example") ListeningExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKeySelective(Listening record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.listening
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKey(Listening record);

    @Select("select * from schema01.listening l where l.mabh = #{mabh} ORDER BY mabainghe")
    public ArrayList<Listening> getAllListening(String mabh);
}