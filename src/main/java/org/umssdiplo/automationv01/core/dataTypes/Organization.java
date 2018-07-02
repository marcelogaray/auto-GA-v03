package org.umssdiplo.automationv01.core.dataTypes;


public class Organization {

    private int organizationKey;
    private int hierarchicalLevelKey;
    private int idPadre;
    private String name;
    private String description;
    private String code;
    private String start;
    private String end;
    private String status;
    private String gestion;

    public int getOrganizationKey() {
        return organizationKey;
    }

    public void setOrganizationKey(int organizationKey) {
        this.organizationKey = organizationKey;
    }

    public int getHierarchicalLevelKey() {
        return hierarchicalLevelKey;
    }

    public void setHierarchicalLevelKey(int hierarchicalLevelKey) {
        this.hierarchicalLevelKey = hierarchicalLevelKey;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }
}
