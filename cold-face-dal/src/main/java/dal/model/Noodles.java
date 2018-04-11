package dal.model;

import java.math.BigDecimal;

public class Noodles {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String noodlesName;

    /**
     * 所属分类
     */
    private String typeCode;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取自增主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     * @return noodles_name
     */
    public String getNoodlesName() {
        return noodlesName;
    }

    /**
     * 设置名称
     * @param noodlesName
     */
    public void setNoodlesName(String noodlesName) {
        this.noodlesName = noodlesName == null ? null : noodlesName.trim();
    }

    /**
     * 获取所属分类
     * @return type_code
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 设置所属分类
     * @param typeCode
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 获取价格
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}