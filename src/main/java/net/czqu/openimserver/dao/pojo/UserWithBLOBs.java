package net.czqu.openimserver.dao.pojo;

public class UserWithBLOBs extends User {
    private String fileName;

    private String yamlName;

    private String updateLog;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getYamlName() {
        return yamlName;
    }

    public void setYamlName(String yamlName) {
        this.yamlName = yamlName == null ? null : yamlName.trim();
    }

    public String getUpdateLog() {
        return updateLog;
    }

    public void setUpdateLog(String updateLog) {
        this.updateLog = updateLog == null ? null : updateLog.trim();
    }
}