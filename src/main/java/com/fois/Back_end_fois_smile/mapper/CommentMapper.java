package com.fois.Back_end_fois_smile.mapper;

import com.fois.Back_end_fois_smile.entity.Comment;
import com.fois.Back_end_fois_smile.entity.CommentExample;
import com.fois.Back_end_fois_smile.form.CommentForm;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int deleteByPrimaryKey(Integer mabl);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    Comment selectByPrimaryKey(Integer mabl);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Sat Jun 12 16:57:50 ICT 2021
     */
    int updateByPrimaryKey(Comment record);

    @Select("insert into schema01.comment (ndbl, thoigian, matk, mabh) values (#{ndbl}, #{thoigian}, #{matk}, #{mabh})")
    public void addComment(String ndbl, Date thoigian, int matk, String mabh);
    
    @Select("select a.hoten, c.mabl, c.ndbl, c.thoigian from schema01.comment c INNER JOIN schema01.account_information a ON c.matk=a.matk WHERE mabh=#{mabh} ORDER BY mabl DESC")
    public ArrayList<CommentForm> selectByMabh(String mabh);
}