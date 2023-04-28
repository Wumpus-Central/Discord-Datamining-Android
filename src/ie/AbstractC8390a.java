package ie;

import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: ie.a */
/* loaded from: classes6.dex */
public interface AbstractC8390a {
    /* renamed from: a */
    void mo19868a(C8392c cVar);

    /* renamed from: b */
    C8392c mo19867b(int i);

    /* renamed from: c */
    int mo19866c(long j);

    /* renamed from: e */
    int mo19864e(long j);

    /* renamed from: f */
    C8392c mo19863f(int i);

    /* renamed from: g */
    void mo19862g(MediaFormat mediaFormat, Surface surface);

    String getName();

    MediaFormat getOutputFormat();

    /* renamed from: h */
    void mo19861h(int i, boolean z);

    boolean isRunning();

    void release();

    void start();

    void stop();
}
