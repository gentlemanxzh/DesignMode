package com.gentleman.design.singleton;

/**
 * 枚举类
 */
public enum SingleTonDemo6 {
    INSTANCE;

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
