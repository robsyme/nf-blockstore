package nextflow.blockstore

import groovy.transform.CompileStatic
import nextflow.Session
import nextflow.trace.TraceObserver
import nextflow.trace.TraceObserverFactory

/**
 * Implements the blockstore observer factory
 *
 * @author Rob Syme <rob.syme@gmail.com>
 */
@CompileStatic
class BlockstoreFactory implements TraceObserverFactory {
    @Override
    Collection<TraceObserver> create(Session session) {
        final result = new ArrayList()
        result.add(new BlockstoreObserver())
        return result
    }
} 