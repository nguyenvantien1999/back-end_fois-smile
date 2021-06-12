package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Grammar;
import com.fois.Back_end_fois_smile.entity.GrammarExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GrammarMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    long countByExample(GrammarExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByExample(GrammarExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByPrimaryKey(String manp);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insert(Grammar record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insertSelective(Grammar record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    List<Grammar> selectByExample(GrammarExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    Grammar selectByPrimaryKey(String manp);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Grammar record, @Param("example") GrammarExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExample(@Param("record") Grammar record, @Param("example") GrammarExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKeySelective(Grammar record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.grammar
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKey(Grammar record);

    @Select("select * from schema01.grammar g where g.mabh = #{mabh} ORDER BY manp")
    public ArrayList<Grammar> getAllGrammar(String mabh);
}