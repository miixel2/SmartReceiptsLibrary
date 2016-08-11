package co.smartreceipts.android.sync.model;

import android.os.Parcelable;
import android.support.annotation.NonNull;

import java.sql.Date;

import co.smartreceipts.android.sync.SyncProvider;

public interface SyncState extends Parcelable {

    /**
     * Gets the unique id associated with the "cloud" version of this object
     *
     * @param provider the {@link SyncProvider} for this identifier
     * @return the {@link Identifier} instance
     */
    @NonNull
    Identifier getSyncId(@NonNull SyncProvider provider);

    /**
     * Checks if this item has been marked for deletion
     *
     * @param provider the {@link SyncProvider} for to check for
     * @return {@code true} if this item is marked for remote deletion
     */
    boolean isMarkedForDeletion(@NonNull SyncProvider provider);

    /**
     * Gets the last time (in UTC) that this item was modified locally
     *
     * @return the last {@link Date} time this item was modified
     */
    @NonNull
    Date getLastLocalModificationTime();


}
