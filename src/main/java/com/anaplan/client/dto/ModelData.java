package com.anaplan.client.dto;

import java.util.Objects;

/**
 * Created by Spondon Saha
 * User: spondonsaha
 * Date: 6/21/17
 * Time: 3:28 PM
 */
public class ModelData {
    private String id;
    private String name;
    private String activeState;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Get the active state
     *
     * @return The active state
     *
     * @since 1.4.4
     */
    public String getActiveState() {
        return activeState;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the active state
     *
     * @param activeState The active state
     *
     * @since 1.4.4
     */
    public void setActiveState(String activeState) {
        this.activeState = activeState;
    }

    public boolean equals(Object other) {
        if (!(other != null && other instanceof ModelData)) {
            return false;
        }
        ModelData data = (ModelData) other;
        return id.equals(data.id) && name.equals(data.name) && activeState.equals(data.activeState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, activeState);
    }
}
