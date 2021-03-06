package net.pocrd.product.dao.mapper;

import java.util.List;
import java.util.Map;
import net.pocrd.product.dao.entity.Sku;
import net.pocrd.product.dao.entity.SkuExample.Criteria;
import net.pocrd.product.dao.entity.SkuExample.Criterion;
import net.pocrd.product.dao.entity.SkuExample;
import org.apache.ibatis.jdbc.SQL;

public class SkuSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String countByExample(SkuExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mt_product_sku");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String deleteByExample(SkuExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mt_product_sku");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String insertSelective(Sku record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mt_product_sku");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getSpuId() != null) {
            sql.VALUES("spu_id", "#{spuId,jdbcType=INTEGER}");
        }
        
        if (record.getCateBackId() != null) {
            sql.VALUES("cate_back_id", "#{cateBackId,jdbcType=INTEGER}");
        }
        
        if (record.getCateFront() != null) {
            sql.VALUES("cate_front", "#{cateFront,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getSubtitle() != null) {
            sql.VALUES("subtitle", "#{subtitle,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDescId() != null) {
            sql.VALUES("product_desc_id", "#{productDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecsDescId() != null) {
            sql.VALUES("specs_desc_id", "#{specsDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSupportDescId() != null) {
            sql.VALUES("support_desc_id", "#{supportDescId,jdbcType=INTEGER}");
        }
        
        if (record.getMainImageId() != null) {
            sql.VALUES("main_image_id", "#{mainImageId,jdbcType=INTEGER}");
        }
        
        if (record.getResource() != null) {
            sql.VALUES("resource", "#{resource,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifiedAt() != null) {
            sql.VALUES("modified_at", "#{modifiedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String selectByExample(SkuExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("spu_id");
        sql.SELECT("cate_back_id");
        sql.SELECT("cate_front");
        sql.SELECT("brand_id");
        sql.SELECT("type");
        sql.SELECT("title");
        sql.SELECT("subtitle");
        sql.SELECT("product_desc_id");
        sql.SELECT("specs_desc_id");
        sql.SELECT("support_desc_id");
        sql.SELECT("main_image_id");
        sql.SELECT("resource");
        sql.SELECT("status");
        sql.SELECT("created_at");
        sql.SELECT("modified_at");
        sql.SELECT("is_deleted");
        sql.FROM("mt_product_sku");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        if(example.getOffset() > -1 && example.getRows() > 0) {
            return sql.toString() + " limit " + example.getOffset()+ "," + example.getRows();
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sku record = (Sku) parameter.get("record");
        SkuExample example = (SkuExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mt_product_sku");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getSpuId() != null) {
            sql.SET("spu_id = #{record.spuId,jdbcType=INTEGER}");
        }
        
        if (record.getCateBackId() != null) {
            sql.SET("cate_back_id = #{record.cateBackId,jdbcType=INTEGER}");
        }
        
        if (record.getCateFront() != null) {
            sql.SET("cate_front = #{record.cateFront,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getSubtitle() != null) {
            sql.SET("subtitle = #{record.subtitle,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDescId() != null) {
            sql.SET("product_desc_id = #{record.productDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecsDescId() != null) {
            sql.SET("specs_desc_id = #{record.specsDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSupportDescId() != null) {
            sql.SET("support_desc_id = #{record.supportDescId,jdbcType=INTEGER}");
        }
        
        if (record.getMainImageId() != null) {
            sql.SET("main_image_id = #{record.mainImageId,jdbcType=INTEGER}");
        }
        
        if (record.getResource() != null) {
            sql.SET("resource = #{record.resource,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifiedAt() != null) {
            sql.SET("modified_at = #{record.modifiedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("mt_product_sku");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("spu_id = #{record.spuId,jdbcType=INTEGER}");
        sql.SET("cate_back_id = #{record.cateBackId,jdbcType=INTEGER}");
        sql.SET("cate_front = #{record.cateFront,jdbcType=VARCHAR}");
        sql.SET("brand_id = #{record.brandId,jdbcType=INTEGER}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("subtitle = #{record.subtitle,jdbcType=VARCHAR}");
        sql.SET("product_desc_id = #{record.productDescId,jdbcType=INTEGER}");
        sql.SET("specs_desc_id = #{record.specsDescId,jdbcType=INTEGER}");
        sql.SET("support_desc_id = #{record.supportDescId,jdbcType=INTEGER}");
        sql.SET("main_image_id = #{record.mainImageId,jdbcType=INTEGER}");
        sql.SET("resource = #{record.resource,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("modified_at = #{record.modifiedAt,jdbcType=TIMESTAMP}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=TINYINT}");
        
        SkuExample example = (SkuExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Sku record) {
        SQL sql = new SQL();
        sql.UPDATE("mt_product_sku");
        
        if (record.getSpuId() != null) {
            sql.SET("spu_id = #{spuId,jdbcType=INTEGER}");
        }
        
        if (record.getCateBackId() != null) {
            sql.SET("cate_back_id = #{cateBackId,jdbcType=INTEGER}");
        }
        
        if (record.getCateFront() != null) {
            sql.SET("cate_front = #{cateFront,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getSubtitle() != null) {
            sql.SET("subtitle = #{subtitle,jdbcType=VARCHAR}");
        }
        
        if (record.getProductDescId() != null) {
            sql.SET("product_desc_id = #{productDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecsDescId() != null) {
            sql.SET("specs_desc_id = #{specsDescId,jdbcType=INTEGER}");
        }
        
        if (record.getSupportDescId() != null) {
            sql.SET("support_desc_id = #{supportDescId,jdbcType=INTEGER}");
        }
        
        if (record.getMainImageId() != null) {
            sql.SET("main_image_id = #{mainImageId,jdbcType=INTEGER}");
        }
        
        if (record.getResource() != null) {
            sql.SET("resource = #{resource,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifiedAt() != null) {
            sql.SET("modified_at = #{modifiedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=TINYINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_product_sku
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, SkuExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}