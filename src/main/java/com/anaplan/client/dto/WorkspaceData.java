package com.anaplan.client.dto;

/**
 * Created by Spondon Saha
 * User: spondonsaha
 * Date: 6/21/17
 * Time: 3:41 PM
 */
public class WorkspaceData {

    private String id;
    private boolean active;
    private String name;
    private Long sizeAllowance;

    public WorkspaceData() {
        this.id = "";
    }

    public WorkspaceData(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSizeAllowance() {
        return sizeAllowance;
    }

    public void setSizeAllowance(Long sizeAllowance) {
        this.sizeAllowance = sizeAllowance;
    }

    public boolean equals(Object other) {
        if (!(other != null && other instanceof WorkspaceData)) {
            return false;
        }
        WorkspaceData data = (WorkspaceData) other;
        return id.equals(data.id) && name.equals(data.name);
    }

    public int hashCode() {
        return id.hashCode() * 31 + name.hashCode();
    }

}
