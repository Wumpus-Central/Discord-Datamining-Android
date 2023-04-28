package p266oe;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.linkedin.android.litr.p050io.MediaRange;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import je.C9563b;
import re.C12580h;

/* renamed from: oe.a */
/* loaded from: classes6.dex */
public class C11258a implements AbstractC11261c {
    private final MediaExtractor mediaExtractor;
    private final MediaRange mediaRange;
    private int orientationHint;
    private long size;

    public C11258a(Context context, Uri uri) {
        this(context, uri, new MediaRange(0L, Long.MAX_VALUE));
    }

    @Override // p266oe.AbstractC11261c
    public void advance() {
        this.mediaExtractor.advance();
    }

    @Override // p266oe.AbstractC11261c
    public int getOrientationHint() {
        return this.orientationHint;
    }

    @Override // p266oe.AbstractC11261c
    public int getSampleFlags() {
        return this.mediaExtractor.getSampleFlags();
    }

    @Override // p266oe.AbstractC11261c
    public long getSampleTime() {
        return this.mediaExtractor.getSampleTime();
    }

    @Override // p266oe.AbstractC11261c
    public int getSampleTrackIndex() {
        return this.mediaExtractor.getSampleTrackIndex();
    }

    @Override // p266oe.AbstractC11261c
    public MediaRange getSelection() {
        return this.mediaRange;
    }

    @Override // p266oe.AbstractC11261c
    public long getSize() {
        return this.size;
    }

    @Override // p266oe.AbstractC11261c
    public int getTrackCount() {
        return this.mediaExtractor.getTrackCount();
    }

    @Override // p266oe.AbstractC11261c
    public MediaFormat getTrackFormat(int i) {
        return this.mediaExtractor.getTrackFormat(i);
    }

    @Override // p266oe.AbstractC11261c
    public int readSampleData(ByteBuffer byteBuffer, int i) {
        return this.mediaExtractor.readSampleData(byteBuffer, i);
    }

    @Override // p266oe.AbstractC11261c
    public void release() {
        this.mediaExtractor.release();
    }

    @Override // p266oe.AbstractC11261c
    public void seekTo(long j, int i) {
        this.mediaExtractor.seekTo(j, i);
    }

    @Override // p266oe.AbstractC11261c
    public void selectTrack(int i) {
        this.mediaExtractor.selectTrack(i);
    }

    public C11258a(Context context, Uri uri, MediaRange mediaRange) {
        this.mediaRange = mediaRange;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.mediaExtractor = mediaExtractor;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
            mediaMetadataRetriever.setDataSource(context, uri);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata != null) {
                this.orientationHint = Integer.parseInt(extractMetadata);
            }
            this.size = C12580h.m6478f(context, uri);
            mediaMetadataRetriever.release();
        } catch (IOException e) {
            mediaMetadataRetriever.release();
            throw new C9563b(C9563b.EnumC9564a.DATA_SOURCE, uri, e);
        }
    }
}
