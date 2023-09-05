package gb.dzhumaev.autotester;

import java.time.Duration;

public class Configuration {
    public static final String BROWSER_NAME = "firefox";
    public static final Duration EXPLICIT_TIMEOUT = Duration.ofSeconds(5);
    public static final Duration TIMEOUT_AFTER_LOAD_PAGE = Duration.ofSeconds(2);
}
