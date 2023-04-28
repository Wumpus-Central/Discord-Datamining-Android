package ie;

import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: ie.b */
/* loaded from: classes6.dex */
public interface AbstractC8391b {
    /* renamed from: a */
    void mo19860a(C8392c cVar);

    /* renamed from: b */
    C8392c mo19859b(int i);

    /* renamed from: c */
    int mo19858c(long j);

    Surface createInputSurface();

    /* renamed from: d */
    void mo19857d(MediaFormat mediaFormat);

    /* renamed from: e */
    int mo19856e(long j);

    /* renamed from: f */
    C8392c mo19855f(int i);

    /* renamed from: g */
    void mo19854g();

    String getName();

    MediaFormat getOutputFormat();

    /* renamed from: h */
    void mo19853h(int i);

    boolean isRunning();

    void release();

    void start();

    void stop();
}
