package no.deichman.services.kohaadapter;

import com.hp.hpl.jena.rdf.model.Model;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

@Ignore // Fails
public class KohaAdapterDefaultIT {

    @Test
    public void should_return_biblio() {
        String manifestationId = "626460";
        KohaAdapterDefault instance = new KohaAdapterDefault();
        Model result = instance.getBiblio(manifestationId);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}
