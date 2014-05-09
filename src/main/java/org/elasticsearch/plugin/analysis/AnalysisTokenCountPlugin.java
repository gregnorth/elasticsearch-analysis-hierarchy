package org.elasticsearch.plugin.analysis;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.TokenCountAnalysisBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 *
 */
public class AnalysisTokenCountPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "analysis-token-count";
    }

    @Override
    public String description() {
        return "Token count filter support";
    }

    public void onModule(AnalysisModule module) {
       module.addProcessor(new TokenCountAnalysisBinderProcessor());
   }
}