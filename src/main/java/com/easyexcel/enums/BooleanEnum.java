package com.easyexcel.enums;

/**
 * Default values cannot be used for annotations.
 * So an additional an enumeration to determine whether the user has added the enumeration.
 *
 * @author Jiaju Zhuang
 */
public enum BooleanEnum {
    /**
     * NULL
     */
    DEFAULT(null),
    /**
     * TRUE
     */
    TRUE(Boolean.TRUE),
    /**
     * FALSE
     */
    FALSE(Boolean.FALSE),
    ;

    final Boolean booleanValue;

    BooleanEnum(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean getValue() {
        return booleanValue;
    }

}
