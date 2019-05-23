package sunbox.gateway.api.model.system;

import java.io.Serializable;
import java.util.Date;

public class OpRoleModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer roleCode;
    private Integer opCode;
    private Integer creatorId;
    private String creator;
    private Date createTime;
    private Integer modifierId;
    private String modifier;
    private Date modifyTime;
    private Integer state;
    private String userName;
    private String realName;
    private String ouCode;
    private String mobile;
    private String roleName;
    private Integer sysRoleType;
    private Integer roleType;

    public OpRoleModel() {
    }

    public Integer getSysRoleType() {
        return this.sysRoleType;
    }

    public void setSysRoleType(Integer sysRoleType) {
        this.sysRoleType = sysRoleType;
    }

    public Integer getRoleType() {
        return this.roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOuCode() {
        return this.ouCode;
    }

    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleCode() {
        return this.roleCode;
    }

    public void setRoleCode(Integer roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getOpCode() {
        return this.opCode;
    }

    public void setOpCode(Integer opCode) {
        this.opCode = opCode;
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
}
