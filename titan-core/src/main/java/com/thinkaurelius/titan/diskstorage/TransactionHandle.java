package com.thinkaurelius.titan.diskstorage;

/**
 * Represents a transaction for a particular storage backend.
 *
 * @author Matthias Broecheler (me@matthiasb.com)
 */

public interface TransactionHandle {

    /**
     * Commits the transaction and persists all modifications to the backend.
     * 
     * Call either this method or {@link #rollback()} at most once per instance.
     *
     * @throws StorageException
     */
    public void commit() throws StorageException;

    /**
     * Aborts (or rolls back) the transaction.
     * 
     * Call either this method or {@link #commit()} at most once per instance.
     *
     * @throws StorageException
     */
    public void rollback() throws StorageException;

}
