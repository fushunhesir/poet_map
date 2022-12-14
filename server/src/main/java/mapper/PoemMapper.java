package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Poem;
import pojo.PoemExample;

public interface PoemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    long countByExample(PoemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int deleteByExample(PoemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int insert(Poem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int insertSelective(Poem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    List<Poem> selectByExample(PoemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    Poem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int updateByExampleSelective(@Param("row") Poem row, @Param("example") PoemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int updateByExample(@Param("row") Poem row, @Param("example") PoemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(Poem row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem
     *
     * @mbg.generated Tue Nov 01 09:47:27 GMT+08:00 2022
     */
    int updateByPrimaryKey(Poem row);
}