package sunbox.gateway.api.model.system;

import java.io.Serializable;
import java.util.Date;

public class OperatorItemModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer sysOperatorType;
    private String realName;
    private String password;
    private Integer gender;
    private String phone;
    private String mobile;
    private String email;
    private Integer state;
    private Integer creatorId;
    private String creator;
    private Date createTime;
    private Integer modifierId;
    private String modifier;
    private Date modifyTime;
    private String ouCode;
    private String job;
    private String memo;
    private String appType;
    private String appCode;
    private String userName;
    private String ouName;
    private String sysRoleType;
    private String passwordNew;
    private Integer businessLabel;
    private String businessLabels;

    public OperatorItemModel() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysOperatorType() {
        return this.sysOperatorType;
    }

    public void setSysOperatorType(Integer sysOperatorType) {
        this.sysOperatorType = sysOperatorType;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifierId() {
        return this.modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOuCode() {
        return this.ouCode;
    }

    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAppType() {
        return this.appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOuName() {
        return this.ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public String getSysRoleType() {
        return this.sysRoleType;
    }

    public void setSysRoleType(String sysRoleType) {
        this.sysRoleType = sysRoleType;
    }

    public Integer getBusinessLabel() {
        return this.businessLabel;
    }

    public void setBusinessLabel(Integer businessLabel) {
        this.businessLabel = businessLabel;
    }

    public String getBusinessLabels() {
        return this.businessLabels;
    }

    public void setBusinessLabels(String businessLabels) {
        this.businessLabels = businessLabels;
    }

    public String getPasswordNew() {
        return this.passwordNew;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }
}
