package com.google.tsunami.plugins.detectors.cves;

import com.google.tsunami.plugin.PluginBootstrapModule;

public class CVE202328473DetectorBootstrapModule extends PluginBootstrapModule {

    @Override
    protected void configurePlugin() {
        registerPlugin(CVE202328473VulnDetector.class);
    }
}
