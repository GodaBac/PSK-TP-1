package mif.vu.lt.psktp1.mybatis.dao;

import java.util.List;

import mif.vu.lt.psktp1.mybatis.model.Author;
import mif.vu.lt.psktp1.mybatis.model.Series;
import org.mybatis.cdi.Mapper;


@Mapper
public interface SeriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SERIES
     *
     * @mbg.generated Mon May 02 21:08:27 EEST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SERIES
     *
     * @mbg.generated Mon May 02 21:08:27 EEST 2022
     */
    int insert(Series record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SERIES
     *
     * @mbg.generated Mon May 02 21:08:27 EEST 2022
     */
    Series selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SERIES
     *
     * @mbg.generated Mon May 02 21:08:27 EEST 2022
     */
    List<Series> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SERIES
     *
     * @mbg.generated Mon May 02 21:08:27 EEST 2022
     */
    int updateByPrimaryKey(Series record);

    Author getSeriesAuthor(Integer id);
}