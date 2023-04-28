package p266oe;

import android.media.MediaFormat;
import com.linkedin.android.litr.p050io.MediaRange;
import java.nio.ByteBuffer;

/* renamed from: oe.c */
/* loaded from: classes6.dex */
public interface AbstractC11261c {
    void advance();

    int getOrientationHint();

    int getSampleFlags();

    long getSampleTime();

    int getSampleTrackIndex();

    MediaRange getSelection();

    long getSize();

    int getTrackCount();

    MediaFormat getTrackFormat(int i);

    int readSampleData(ByteBuffer byteBuffer, int i);

    void release();

    void seekTo(long j, int i);

    void selectTrack(int i);
}
