package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Answer;
import com.fois.Back_end_fois_smile.entity.AnswerExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AnswerMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    long countByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int deleteByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int deleteByPrimaryKey(String mada);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int insert(Answer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int insertSelective(Answer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    List<Answer> selectByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    Answer selectByPrimaryKey(String mada);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Answer record, @Param("example") AnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByPrimaryKeySelective(Answer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.answer
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    int updateByPrimaryKey(Answer record);

    @Select("select * from schema01.answer a where a.machc = #{machc} ORDER BY mada")
    public ArrayList<Answer> getAllAnswer(String machc);
}