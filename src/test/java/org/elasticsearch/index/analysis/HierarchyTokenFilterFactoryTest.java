/** * 
 */
package org.elasticsearch.index.analysis;

import java.io.StringReader;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.path.PathHierarchyTokenizer;
import org.elasticsearch.common.settings.ImmutableSettings.Builder;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author si
 *
 */
public class HierarchyTokenFilterFactoryTest {
	
	@Test
	public void factoryMethod () {
		Index index = new Index("test");
		Settings settings = Builder.EMPTY_SETTINGS;
        HierarchyTokenFilterFactory tokenCountFilterFactory = new HierarchyTokenFilterFactory(index, settings, "tokenCountFilterFactory", settings);
		PathHierarchyTokenizer pathHierarchyTokenizer = new PathHierarchyTokenizer(new StringReader("test"));
		TokenStream tokenStream = tokenCountFilterFactory.create(pathHierarchyTokenizer);
		assertEquals(TokenCountFilter.class, tokenStream.getClass());
	}
}