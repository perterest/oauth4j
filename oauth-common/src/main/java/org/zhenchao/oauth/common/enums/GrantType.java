package org.zhenchao.oauth.common.enums;

/**
 * grant type
 *
 * @author zhenchao.wang 2017-02-14 18:11
 * @version 1.0.0
 */
public enum GrantType {

    AUTHORIZATION_CODE("authorization_code"),

    PASSWORD_CREDENTIALS("password"),

    CLIENT_CREDENTIALS("client_credentials"),

    REFRESH_TOKEN("refresh_token");

    private String type;

    GrantType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * tell whether {@param grantType} is valid
     *
     * @param grantType
     * @return
     */
    public static boolean isValid(String grantType) {
        return AUTHORIZATION_CODE.getType().equals(grantType) ||
                PASSWORD_CREDENTIALS.getType().equals(grantType) || CLIENT_CREDENTIALS.getType().equals(grantType);
    }

    /**
     * resolve string param to {@code GrantType} object
     *
     * @param grantType
     * @return
     */
    public static GrantType resolve(String grantType) {
        for (final GrantType type : GrantType.values()) {
            if (type.getType().equalsIgnoreCase(grantType)) {
                return type;
            }
        }
        return null;
    }
}
