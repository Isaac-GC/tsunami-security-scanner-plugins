package com.google.tsunami.plugins.detectors.cves;

import com.google.common.flogger.GoogleLogger;
import com.google.tsunami.plugin.PluginType;
import com.google.tsunami.plugin.VulnDetector;
import com.google.tsunami.plugin.annotations.PluginInfo;

@PluginInfo(
    type = PluginType.VULN_DETECTION,
    name = "ConcreteCMSCVE202328473AuthBypass",
    version = "1.0",
    description =
            "",
    author = "Isaac-GC",
    bootstrapModule = CVE202328473DetectorBootstrapModule.class
)
public final class CVE202328473VulnDetector implements VulnDetector {

    private static final GoogleLogger logger = GoogleLogger.forEnclosingClass();
}
