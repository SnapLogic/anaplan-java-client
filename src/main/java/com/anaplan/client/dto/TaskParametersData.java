package com.anaplan.client.dto;

import java.util.List;

/**
 * Created by Spondon Saha
 * User: spondonsaha
 * Date: 6/21/17
 * Time: 3:34 PM
 */
public class TaskParametersData {

    public String localeName;
    public List<ConnectorParameterData> connectorParameters;
    public List<MappingParameterData> mappingParameters;

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    public List<ConnectorParameterData> getConnectorParameters() {
        return connectorParameters;
    }

    public void setConnectorParameters(List<ConnectorParameterData> connectorParameters) {
        this.connectorParameters = connectorParameters;
    }

    public List<MappingParameterData> getMappingParameters() {
        return mappingParameters;
    }

    public void setMappingParameters(List<MappingParameterData> mappingParameters) {
        this.mappingParameters = mappingParameters;
    }
}
