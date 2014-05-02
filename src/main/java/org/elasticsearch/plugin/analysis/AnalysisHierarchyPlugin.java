package org.elasticsearch.plugin.analysis;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.HierarchyAnalysisBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 *
 */
public class AnalysisHierarchyPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "analysis-hierarchy";
    }

    @Override
    public String description() {
        return "Hierarchical token count support";
    }

    public void onModule(AnalysisModule module) {
        module.addProcessor(new PhoneticAnalysisBinderProcessor());
    }
}