package net.adamcin.recap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class hosting several important Recap API constants
 * @author madamcin
 * @version $Id: RecapConstants.java$
 */
public class RecapConstants {

    private RecapConstants() {
        // prevent instantiation
    }

    /**
     * This scheme is used to map a RepositoryAddress to a local ResourceResolver
     */
    public static final String SCHEME = "recap";

    /**
     * Paths to the core Recap servlets
     */
    public static final String SERVLET_COPY_PATH = "/bin/recap/copy";
    public static final String SERVLET_LIST_PATH = "/bin/recap/list";
    public static final String SERVLET_STRATEGIES_PATH = "/bin/recap/strategies";

    /**
     * ComponentFactory interface
     */
    public static final String STRATEGY_FACTORY = "net.adamcin.recap.RecapStrategy";
    public static final String DEFAULT_STRATEGY = "single";

    public static final int DEFAULT_DEFAULT_REMOTE_PORT = 4502;
    public static final String DEFAULT_DEFAULT_REMOTE_USER = "recap";
    public static final String DEFAULT_DEFAULT_REMOTE_PASS = "recap";

    public static final String RP_REMOTE_HOST = ":host";
    public static final String RP_REMOTE_PORT = ":port";
    public static final String RP_REMOTE_USER = ":user";
    public static final String RP_REMOTE_PASS = ":pass";
    public static final String RP_REMOTE_STRATEGY = ":strategy";
    public static final String RP_INTERRUPT = ":interrupt";
    public static final String RP_UPDATE = ":update";
    public static final String RP_ONLYNEWER = ":onlyNewer";
    public static final String RP_SELECTORS = ":selectors";
    public static final String RP_SUFFIX = ":suffix";
    public static final String RP_BATCH_SIZE = ":batchSize";
    public static final String RP_THROTTLE = ":throttle";

    public static final Set<String> RESERVED_PARAMS = Collections.unmodifiableSet(
            new HashSet<String>(
                    Arrays.asList(
                            RP_INTERRUPT,
                            RP_REMOTE_STRATEGY,
                            RP_REMOTE_USER,
                            RP_REMOTE_PASS,
                            RP_REMOTE_HOST,
                            RP_REMOTE_PORT
                    )
            )
    );

}
