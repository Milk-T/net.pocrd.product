package net.pocrd.product.dao.mapper;

import java.util.List;
import java.util.Map;
import net.pocrd.product.dao.entity.Sku_AttributeValue;
import net.pocrd.product.dao.entity.Sku_AttributeValueExample.Criteria;
import net.pocrd.product.dao.entity.Sku_AttributeValueExample.Criterion;
import net.pocrd.product.dao.entity.Sku_AttributeValueExample;
import org.apache.ibatis.jdbc.SQL;

public class Sku_AttributeValueSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String countByExample(Sku_AttributeValueExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mtr_product_sku_attr_value");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String deleteByExample(Sku_AttributeValueExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mtr_product_sku_attr_value");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String insertSelective(Sku_AttributeValue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mtr_product_sku_attr_value");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRefSpuId() != null) {
            sql.VALUES("ref_spu_id", "#{refSpuId,jdbcType=INTEGER}");
        }
        
        if (record.getSkuId() != null) {
            sql.VALUES("sku_id", "#{skuId,jdbcType=INTEGER}");
        }
        
        if (record.getAttrValueId() != null) {
            sql.VALUES("attr_value_id", "#{attrValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String selectByExample(Sku_AttributeValueExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("ref_spu_id");
        sql.SELECT("sku_id");
        sql.SELECT("attr_value_id");
        sql.SELECT("created_at");
        sql.FROM("mtr_product_sku_attr_value");
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
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sku_AttributeValue record = (Sku_AttributeValue) parameter.get("record");
        Sku_AttributeValueExample example = (Sku_AttributeValueExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mtr_product_sku_attr_value");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getRefSpuId() != null) {
            sql.SET("ref_spu_id = #{record.refSpuId,jdbcType=INTEGER}");
        }
        
        if (record.getSkuId() != null) {
            sql.SET("sku_id = #{record.skuId,jdbcType=INTEGER}");
        }
        
        if (record.getAttrValueId() != null) {
            sql.SET("attr_value_id = #{record.attrValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("mtr_product_sku_attr_value");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("ref_spu_id = #{record.refSpuId,jdbcType=INTEGER}");
        sql.SET("sku_id = #{record.skuId,jdbcType=INTEGER}");
        sql.SET("attr_value_id = #{record.attrValueId,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        Sku_AttributeValueExample example = (Sku_AttributeValueExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Sku_AttributeValue record) {
        SQL sql = new SQL();
        sql.UPDATE("mtr_product_sku_attr_value");
        
        if (record.getRefSpuId() != null) {
            sql.SET("ref_spu_id = #{refSpuId,jdbcType=INTEGER}");
        }
        
        if (record.getSkuId() != null) {
            sql.SET("sku_id = #{skuId,jdbcType=INTEGER}");
        }
        
        if (record.getAttrValueId() != null) {
            sql.SET("attr_value_id = #{attrValueId,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mtr_product_sku_attr_value
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, Sku_AttributeValueExample example, boolean includeExamplePhrase) {
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