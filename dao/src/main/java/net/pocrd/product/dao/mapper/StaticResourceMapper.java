package net.pocrd.product.dao.mapper;

import java.util.List;
import net.pocrd.product.dao.entity.StaticResource;
import net.pocrd.product.dao.entity.StaticResourceExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StaticResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=StaticResourceSqlProvider.class, method="countByExample")
    int countByExample(StaticResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @DeleteProvider(type=StaticResourceSqlProvider.class, method="deleteByExample")
    int deleteByExample(StaticResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @Delete({
        "delete from mt_product_static_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @Insert({
        "insert into mt_product_static_resource (id, description, ",
        "type, meta, uri, ",
        "created_at, modified_at, ",
        "is_deleted)",
        "values (#{id,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{meta,jdbcType=VARCHAR}, #{uri,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{modifiedAt,jdbcType=TIMESTAMP}, ",
        "#{isDeleted,jdbcType=TINYINT})"
    })
    int insert(StaticResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @InsertProvider(type=StaticResourceSqlProvider.class, method="insertSelective")
    int insertSelective(StaticResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=StaticResourceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="meta", property="meta", jdbcType=JdbcType.VARCHAR),
        @Result(column="uri", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    List<StaticResource> selectByExample(StaticResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, description, type, meta, uri, created_at, modified_at, is_deleted",
        "from mt_product_static_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="meta", property="meta", jdbcType=JdbcType.VARCHAR),
        @Result(column="uri", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modified_at", property="modifiedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    StaticResource selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaticResourceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StaticResource record, @Param("example") StaticResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaticResourceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StaticResource record, @Param("example") StaticResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @UpdateProvider(type=StaticResourceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StaticResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_static_resource
     *
     * @mbggenerated
     */
    @Update({
        "update mt_product_static_resource",
        "set description = #{description,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "meta = #{meta,jdbcType=VARCHAR},",
          "uri = #{uri,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "modified_at = #{modifiedAt,jdbcType=TIMESTAMP},",
          "is_deleted = #{isDeleted,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StaticResource record);
}