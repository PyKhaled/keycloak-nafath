package org.keycloak.social.nafath;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.provider.IdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;

import java.util.List;


public class NafathIdentityProviderFactory extends AbstractIdentityProviderFactory<NafathIdentityProvider> implements SocialIdentityProviderFactory<NafathIdentityProvider> {

    public static final String PROVIDER_ID = "nafath";
    public static final String NAME = "Nafath";

    @Override
    public String getId() {
		return "nafath";
	}

    @Override
    public String getName() {
		return "Nafath";
	}

	@Override
    public NafathIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new NafathIdentityProvider(session, new NafathIdentityProviderConfig(model));
    }

    @Override
    public NafathIdentityProviderConfig createConfig() {
        return new NafathIdentityProviderConfig();
    }

    public List<ProviderConfigProperty> getConfigProperties() {
		return List.of(
			new ProviderConfigProperty("production", "Production", "Using Nafath production environment", ProviderConfigProperty.BOOLEAN_TYPE, false),
			new ProviderConfigProperty("sender_id", "SenderId", "The sender ID is displayed as the message sender on the receiving device.", ProviderConfigProperty.STRING_TYPE, "Keycloak")
		);
    }
}
