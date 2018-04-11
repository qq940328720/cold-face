package dal.model;

public class NoodlesType {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 类型编码
     */
    private String typeCode;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 上级类型编码
     */
    private String parentTypeCode;

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
     * 获取类型编码
     * @return type_code
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 设置类型编码
     * @param typeCode
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 获取类型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类型名称
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取上级类型编码
     * @return parent_type_code
     */
    public String getParentTypeCode() {
        return parentTypeCode;
    }

    /**
     * 设置上级类型编码
     * @param parentTypeCode
     */
    public void setParentTypeCode(String parentTypeCode) {
        this.parentTypeCode = parentTypeCode == null ? null : parentTypeCode.trim();
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