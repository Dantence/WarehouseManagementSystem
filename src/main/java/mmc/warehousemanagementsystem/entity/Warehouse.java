package mmc.warehousemanagementsystem.entity;

public class Warehouse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.id
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.creator
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Long creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.status
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.capacity
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Integer capacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.occupy
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Integer occupy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.gmt_created
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Long gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column warehouse.gmt_modified
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    private Long gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.id
     *
     * @return the value of warehouse.id
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.id
     *
     * @param id the value for warehouse.id
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.creator
     *
     * @return the value of warehouse.creator
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.creator
     *
     * @param creator the value for warehouse.creator
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.status
     *
     * @return the value of warehouse.status
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.status
     *
     * @param status the value for warehouse.status
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.capacity
     *
     * @return the value of warehouse.capacity
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.capacity
     *
     * @param capacity the value for warehouse.capacity
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.occupy
     *
     * @return the value of warehouse.occupy
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Integer getOccupy() {
        return occupy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.occupy
     *
     * @param occupy the value for warehouse.occupy
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setOccupy(Integer occupy) {
        this.occupy = occupy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.gmt_created
     *
     * @return the value of warehouse.gmt_created
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Long getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.gmt_created
     *
     * @param gmtCreated the value for warehouse.gmt_created
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column warehouse.gmt_modified
     *
     * @return the value of warehouse.gmt_modified
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column warehouse.gmt_modified
     *
     * @param gmtModified the value for warehouse.gmt_modified
     *
     * @mbg.generated Thu Sep 08 04:27:07 CST 2022
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}