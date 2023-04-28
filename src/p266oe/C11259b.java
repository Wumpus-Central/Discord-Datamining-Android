package p266oe;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import je.C9565c;

/* renamed from: oe.b */
/* loaded from: classes6.dex */
public class C11259b implements AbstractC11262d {

    /* renamed from: i */
    private static final String f25170i = "b";

    /* renamed from: a */
    LinkedList<C0359b> f25171a;

    /* renamed from: b */
    boolean f25172b;

    /* renamed from: c */
    MediaMuxer f25173c;

    /* renamed from: d */
    private MediaFormat[] f25174d;

    /* renamed from: e */
    private ParcelFileDescriptor f25175e;

    /* renamed from: f */
    private String f25176f;

    /* renamed from: g */
    private int f25177g;

    /* renamed from: h */
    private int f25178h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oe.b$b */
    /* loaded from: classes6.dex */
    public class C0359b {

        /* renamed from: a */
        private int f25179a;

        /* renamed from: b */
        private ByteBuffer f25180b;

        /* renamed from: c */
        private MediaCodec.BufferInfo f25181c;

        private C0359b(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f25179a = i;
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.f25181c = bufferInfo2;
            bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.f25180b = allocate;
            allocate.put(byteBuffer);
            this.f25180b.flip();
        }
    }

    public C11259b(Context context, Uri uri, int i, int i2, int i3) {
        MediaMuxer mediaMuxer;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rwt");
                this.f25175e = openFileDescriptor;
                if (openFileDescriptor != null) {
                    mediaMuxer = new MediaMuxer(this.f25175e.getFileDescriptor(), i3);
                } else {
                    throw new IOException("Inaccessible URI " + uri);
                }
            } else if (!JSStackTrace.FILE_KEY.equalsIgnoreCase(uri.getScheme()) || uri.getPath() == null) {
                throw new C9565c(C9565c.EnumC9566a.UNSUPPORTED_URI_TYPE, uri, i3, new Throwable());
            } else {
                mediaMuxer = new MediaMuxer(uri.getPath(), i3);
            }
            m10317d(mediaMuxer, i, i2);
        } catch (IOException e) {
            m10316e();
            throw new C9565c(C9565c.EnumC9566a.IO_FAILUE, uri, i3, e);
        } catch (IllegalArgumentException e2) {
            throw new C9565c(C9565c.EnumC9566a.INVALID_PARAMS, uri, i3, e2);
        }
    }

    /* renamed from: d */
    private void m10317d(MediaMuxer mediaMuxer, int i, int i2) {
        this.f25178h = i;
        this.f25173c = mediaMuxer;
        mediaMuxer.setOrientationHint(i2);
        this.f25177g = 0;
        this.f25172b = false;
        this.f25171a = new LinkedList<>();
        this.f25174d = new MediaFormat[i];
    }

    /* renamed from: e */
    private void m10316e() {
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.f25175e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                this.f25175e = null;
            }
        } catch (IOException unused) {
        }
    }

    @Override // p266oe.AbstractC11262d
    /* renamed from: a */
    public String mo10312a() {
        String str = this.f25176f;
        return str != null ? str : "";
    }

    @Override // p266oe.AbstractC11262d
    /* renamed from: b */
    public void mo10311b(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f25172b) {
            this.f25171a.addLast(new C0359b(i, byteBuffer, bufferInfo));
        } else if (byteBuffer == null) {
            Log.e(f25170i, "Trying to write a null buffer, skipping");
        } else {
            this.f25173c.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }

    @Override // p266oe.AbstractC11262d
    /* renamed from: c */
    public int mo10310c(MediaFormat mediaFormat, int i) {
        this.f25174d[i] = mediaFormat;
        int i2 = this.f25177g + 1;
        this.f25177g = i2;
        if (i2 == this.f25178h) {
            Log.d(f25170i, "All tracks added, starting MediaMuxer, writing out " + this.f25171a.size() + " queued samples");
            for (MediaFormat mediaFormat2 : this.f25174d) {
                this.f25173c.addTrack(mediaFormat2);
            }
            this.f25173c.start();
            this.f25172b = true;
            while (!this.f25171a.isEmpty()) {
                C0359b removeFirst = this.f25171a.removeFirst();
                this.f25173c.writeSampleData(removeFirst.f25179a, removeFirst.f25180b, removeFirst.f25181c);
            }
        }
        return i;
    }

    @Override // p266oe.AbstractC11262d
    public void release() {
        this.f25173c.release();
        m10316e();
    }
}
