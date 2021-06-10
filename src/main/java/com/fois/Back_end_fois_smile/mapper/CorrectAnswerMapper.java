package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.CorrectAnswer;
import com.fois.Back_end_fois_smile.entity.CorrectAnswerExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CorrectAnswerMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    long countByExample(CorrectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int deleteByExample(CorrectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int deleteByPrimaryKey(String madadung);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int insert(CorrectAnswer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int insertSelective(CorrectAnswer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    List<CorrectAnswer> selectByExample(CorrectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    CorrectAnswer selectByPrimaryKey(String madadung);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByExampleSelective(@Param("record") CorrectAnswer record, @Param("example") CorrectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByExample(@Param("record") CorrectAnswer record, @Param("example") CorrectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByPrimaryKeySelective(CorrectAnswer record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.correct_answer
     * @mbg.generated  Thu Jun 10 20:38:09 ICT 2021
     */
    int updateByPrimaryKey(CorrectAnswer record);

    @Select("select * from schema01.correct_answer c where c.machc = #{machc} ORDER BY madadung")
    public ArrayList<CorrectAnswer> getAllCorrectAnswer(String machc);
}