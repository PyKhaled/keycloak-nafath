package org.keycloak.social.nafath;

import org.keycloak.models.IdentityProviderModel;

public class NafathIdentityProviderConfig extends IdentityProviderModel {
    private static final String BASE_URL = "baseUrl";

    public NafathIdentityProviderConfig(IdentityProviderModel identityProviderModel) {

    }

    public String getBaseUrl() {
        return getConfig().get(BASE_URL);
    }

    public void setBaseUrl(String baseUrl) {
        getConfig().put(BASE_URL, trimTrailingSlash(baseUrl));
    }

    private String trimTrailingSlash(String baseUrl) {
        if (baseUrl != null && baseUrl.endsWith("/")) {
            baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
        }
        return baseUrl;
    }
}