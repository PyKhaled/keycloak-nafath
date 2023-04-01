package org.keycloak.social.nafath;

import org.keycloak.broker.oidc.OIDCIdentityProviderConfig;
import org.keycloak.models.IdentityProviderModel;

public class NafathIdentityProviderConfig extends OIDCIdentityProviderConfig {

    public NafathIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }

    public NafathIdentityProviderConfig() {

    }

 	// public boolean production() {
	// 	return getConfig().get("production");
    // }

}
