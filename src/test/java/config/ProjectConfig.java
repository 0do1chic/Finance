package config;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:application.conf")
public interface ProjectConfig extends Config {

    @Key("base_url")
    String baseUrl();
    @Key("login")
    String user_login();
    @Key("password")
    String user_password();
}