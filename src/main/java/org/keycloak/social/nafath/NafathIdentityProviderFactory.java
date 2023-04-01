package org.keycloak.social.nafath;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.provider.IdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

public class NafathIdentityProviderFactory extends AbstractIdentityProviderFactory<NafathIdentityProvider> implements IdentityProviderFactory<NafathIdentityProvider> {
    public static final String PROVIDER_ID = "nafath";
    public static final String NAME = "Nafath";

    @Override
    public NafathIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new NafathIdentityProvider(session, new NafathIdentityProviderConfig(model));
    }

    @Override
    public IdentityProviderModel createConfig() {
        return null;
    }

    @Override
    public String getId() { return PROVIDER_ID; }

    @Override
    public String getName() { return NAME; }

}
