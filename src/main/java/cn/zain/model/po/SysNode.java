package cn.zain.model.po;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Copyright (c) 2016 www.yongzhian.cn. All Rights Reserved.
 * @author Zain
 */
public class SysNode {
    private Long id;
    private String nodeCode;
    private String nodeName;
    private String icon;
    private String url;
    private Timestamp createDate;
    private String isValid;
    private Integer orderNo;
    private SysNode parentNode;
    private Set<SysRole> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SysNode sysNode = (SysNode) o;

        if (id != null ? !id.equals(sysNode.id) : sysNode.id != null) {
            return false;
        }
        if (nodeCode != null ? !nodeCode.equals(sysNode.nodeCode) : sysNode.nodeCode != null) {
            return false;
        }
        if (nodeName != null ? !nodeName.equals(sysNode.nodeName) : sysNode.nodeName != null) {
            return false;
        }
        if (icon != null ? !icon.equals(sysNode.icon) : sysNode.icon != null) {
            return false;
        }
        if (url != null ? !url.equals(sysNode.url) : sysNode.url != null) return false;
        if (createDate != null ? !createDate.equals(sysNode.createDate) : sysNode.createDate != null) {
            return false;
        }
        if (isValid != null ? !isValid.equals(sysNode.isValid) : sysNode.isValid != null) {
            return false;
        }
        if (orderNo != null ? !orderNo.equals(sysNode.orderNo) : sysNode.orderNo != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nodeCode != null ? nodeCode.hashCode() : 0);
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (isValid != null ? isValid.hashCode() : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        return result;
    }

    public SysNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(SysNode parentNode) {
        this.parentNode = parentNode;
    }

    public Set<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SysRole> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "SysNode{" +
                "id=" + id +
                ", nodeCode='" + nodeCode + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", createDate=" + createDate +
                ", isValid='" + isValid + '\'' +
                ", orderNo=" + orderNo +
                ", parentNode=" + parentNode +
                ", roles=" + (roles == null ? "null" : roles.size()) +
                '}';
    }
}
