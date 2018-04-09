package uk.ac.ucl.umobile.ui.playlist;

import org.schabi.newpipe.extractor.stream.StreamInfo;

import java.util.Collections;

public final class SinglePlayQueue extends PlayQueue {
    public SinglePlayQueue(final StreamInfo info) {
        super(0, Collections.singletonList(new PlayQueueItem(info)));
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public void fetch() {}
}
