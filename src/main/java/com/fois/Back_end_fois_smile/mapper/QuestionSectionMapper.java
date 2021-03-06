package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.QuestionSection;
import com.fois.Back_end_fois_smile.entity.QuestionSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionSectionMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    long countByExample(QuestionSectionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByExample(QuestionSectionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByPrimaryKey(String maphan);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insert(QuestionSection record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insertSelective(QuestionSection record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    List<QuestionSection> selectByExample(QuestionSectionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    QuestionSection selectByPrimaryKey(String maphan);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") QuestionSection record,
            @Param("example") QuestionSectionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExample(@Param("record") QuestionSection record, @Param("example") QuestionSectionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKeySelective(QuestionSection record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.question_section
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKey(QuestionSection record);
}