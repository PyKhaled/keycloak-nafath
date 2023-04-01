package org.keycloak.social.nafath;

import org.keycloak.broker.provider.AbstractIdentityProvider;
import org.keycloak.broker.provider.IdentityProvider;
import org.keycloak.models.FederatedIdentityModel;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

public class NafathIdentityProvider extends AbstractIdentityProvider implements IdentityProvider {

    public NafathIdentityProvider(KeycloakSession session, IdentityProviderModel config) {
        super(session, config);
    }

    @Override
    public javax.ws.rs.core.Response retrieveToken(KeycloakSession session, FederatedIdentityModel identity) {
        return null;
    }

}