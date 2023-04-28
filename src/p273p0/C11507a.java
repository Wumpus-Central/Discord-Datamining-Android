package p273p0;

import android.media.MediaCodec;
import android.os.SystemClock;
import androidx.camera.core.C1915r1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public class C11507a {

    /* renamed from: a */
    private AtomicBoolean f25642a = null;

    /* renamed from: a */
    public void m9541a(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        if (this.f25642a == null) {
            if (bufferInfo.size > 0 && bufferInfo.presentationTimeUs > 0 && (bufferInfo.flags & 2) == 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (Math.abs(bufferInfo.presentationTimeUs - timeUnit.toMicros(SystemClock.elapsedRealtime())) < Math.abs(bufferInfo.presentationTimeUs - timeUnit.toMicros(SystemClock.uptimeMillis()))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1915r1.m39517k("CorrectVideoTimeByTimebase", "Detected video buffer timestamp is close to real time.");
                }
                this.f25642a = new AtomicBoolean(z);
            } else {
                return;
            }
        }
        if (this.f25642a.get()) {
            bufferInfo.presentationTimeUs -= TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - SystemClock.uptimeMillis());
        }
    }
}
