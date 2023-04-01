package org.keycloak.social.nafath;

import org.keycloak.broker.oidc.OIDCIdentityProvider;
import org.keycloak.broker.oidc.OIDCIdentityProviderConfig;
import org.keycloak.broker.provider.AuthenticationRequest;
import org.keycloak.broker.provider.BrokeredIdentityContext;
import org.keycloak.broker.provider.IdentityBrokerException;
import org.keycloak.broker.social.SocialIdentityProvider;
import org.keycloak.common.ClientConnection;
import org.keycloak.common.util.KeycloakUriBuilder;
import org.keycloak.events.EventBuilder;
import org.keycloak.models.KeycloakSession;
import org.keycloak.representations.JsonWebToken;

import java.util.Arrays;

public class NafathIdentityProvider extends OIDCIdentityProvider implements SocialIdentityProvider<OIDCIdentityProviderConfig> {

    // private static final Logger log = Logger.getLogger(NafathIdentityProvider.class);

    public static final String NAFATH_URL_PRODUCTION = "https://www.iam.gov.sa/nafath/";
    public static final String NAFATH_URL_STAGING = "https://www.iam.sa/nafath/";

    public static final String AUTH_URL = "https://discord.com/oauth2/authorize";
    public static final String TOKEN_URL = "https://discord.com/api/oauth2/token";
    public static final String PROFILE_URL = "https://discord.com/api/users/@me";
    public static final String GROUP_URL = "https://discord.com/api/users/@me/guilds";
    public static final String DEFAULT_SCOPE = "identify email";
    public static final String GUILDS_SCOPE = "guilds";

    public NafathIdentityProvider(KeycloakSession session, NafathIdentityProviderConfig config) {
        super(session, config);
    }















}
