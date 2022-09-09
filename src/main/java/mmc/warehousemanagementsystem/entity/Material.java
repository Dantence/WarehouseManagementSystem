package mmc.warehousemanagementsystem.entity;

public class Material {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.id
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.name
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.quantity
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.warehouse
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Long warehouse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.gmt_created
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Long gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.gmt_modified
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.price
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    private Integer price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.id
     *
     * @return the value of material.id
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.id
     *
     * @param id the value for material.id
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.name
     *
     * @return the value of material.name
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.name
     *
     * @param name the value for material.name
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.quantity
     *
     * @return the value of material.quantity
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.quantity
     *
     * @param quantity the value for material.quantity
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.warehouse
     *
     * @return the value of material.warehouse
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Long getWarehouse() {
        return warehouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.warehouse
     *
     * @param warehouse the value for material.warehouse
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.gmt_created
     *
     * @return the value of material.gmt_created
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Long getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.gmt_created
     *
     * @param gmtCreated the value for material.gmt_created
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.gmt_modified
     *
     * @return the value of material.gmt_modified
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.gmt_modified
     *
     * @param gmtModified the value for material.gmt_modified
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.price
     *
     * @return the value of material.price
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.price
     *
     * @param price the value for material.price
     *
     * @mbg.generated Fri Sep 09 10:55:55 CST 2022
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}