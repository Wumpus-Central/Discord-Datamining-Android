package okhttp3;

import com.facebook.react.util.JSStackTrace;
import fk.C7366m;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import p326ri.C12694d;
import p327rj.C12729c;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, m15073d2 = {"Lokhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, m15073d2 = {"Lokhttp3/RequestBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "b", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Lokio/ByteString;", "g", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "h", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "content", "d", "e", "f", JSStackTrace.FILE_KEY, "c", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class Companion {

        @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m15073d2 = {"okhttp3/RequestBody$Companion$a", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$a */
        /* loaded from: classes8.dex */
        public static final class C11427a extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ File f25480a;

            /* renamed from: b */
            final /* synthetic */ MediaType f25481b;

            C11427a(File file, MediaType mediaType) {
                this.f25480a = file;
                this.f25481b = mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f25480a.length();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f25481b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                Source k;
                C9971q.m14633g(sink, "sink");
                try {
                    sink.mo9748N(C7366m.m22812k(this.f25480a));
                    th = null;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }

        @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m15073d2 = {"okhttp3/RequestBody$Companion$b", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$b */
        /* loaded from: classes8.dex */
        public static final class C11428b extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ ByteString f25482a;

            /* renamed from: b */
            final /* synthetic */ MediaType f25483b;

            C11428b(ByteString byteString, MediaType mediaType) {
                this.f25482a = byteString;
                this.f25483b = mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f25482a.m9697v();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f25483b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                C9971q.m14633g(sink, "sink");
                sink.mo9743u0(this.f25482a);
            }
        }

        @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m15073d2 = {"okhttp3/RequestBody$Companion$c", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.RequestBody$Companion$c */
        /* loaded from: classes8.dex */
        public static final class C11429c extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ byte[] f25484a;

            /* renamed from: b */
            final /* synthetic */ MediaType f25485b;

            /* renamed from: c */
            final /* synthetic */ int f25486c;

            /* renamed from: d */
            final /* synthetic */ int f25487d;

            C11429c(byte[] bArr, MediaType mediaType, int i, int i2) {
                this.f25484a = bArr;
                this.f25485b = mediaType;
                this.f25486c = i;
                this.f25487d = i2;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f25486c;
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return this.f25485b;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                C9971q.m14633g(sink, "sink");
                sink.write(this.f25484a, this.f25487d, this.f25486c);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ RequestBody m9855i(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.m9858f(mediaType, bArr, i, i2);
        }

        /* renamed from: j */
        public static /* synthetic */ RequestBody m9854j(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.m9856h(bArr, mediaType, i, i2);
        }

        /* renamed from: a */
        public final RequestBody m9863a(File asRequestBody, MediaType mediaType) {
            C9971q.m14633g(asRequestBody, "$this$asRequestBody");
            return new C11427a(asRequestBody, mediaType);
        }

        /* renamed from: b */
        public final RequestBody m9862b(String toRequestBody, MediaType mediaType) {
            C9971q.m14633g(toRequestBody, "$this$toRequestBody");
            Charset charset = C12694d.f28536b;
            if (mediaType != null) {
                Charset d = MediaType.m9984d(mediaType, null, 1, null);
                if (d == null) {
                    MediaType.C11422a aVar = MediaType.f25402g;
                    mediaType = aVar.m9979b(mediaType + "; charset=utf-8");
                } else {
                    charset = d;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            C9971q.m14634f(bytes, "(this as java.lang.String).getBytes(charset)");
            return m9856h(bytes, mediaType, 0, bytes.length);
        }

        /* renamed from: c */
        public final RequestBody m9861c(MediaType mediaType, File file) {
            C9971q.m14633g(file, "file");
            return m9863a(file, mediaType);
        }

        /* renamed from: d */
        public final RequestBody m9860d(MediaType mediaType, String content) {
            C9971q.m14633g(content, "content");
            return m9862b(content, mediaType);
        }

        /* renamed from: e */
        public final RequestBody m9859e(MediaType mediaType, ByteString content) {
            C9971q.m14633g(content, "content");
            return m9857g(content, mediaType);
        }

        /* renamed from: f */
        public final RequestBody m9858f(MediaType mediaType, byte[] content, int i, int i2) {
            C9971q.m14633g(content, "content");
            return m9856h(content, mediaType, i, i2);
        }

        /* renamed from: g */
        public final RequestBody m9857g(ByteString toRequestBody, MediaType mediaType) {
            C9971q.m14633g(toRequestBody, "$this$toRequestBody");
            return new C11428b(toRequestBody, mediaType);
        }

        /* renamed from: h */
        public final RequestBody m9856h(byte[] toRequestBody, MediaType mediaType, int i, int i2) {
            C9971q.m14633g(toRequestBody, "$this$toRequestBody");
            C12729c.m5609i(toRequestBody.length, i, i2);
            return new C11429c(toRequestBody, mediaType, i2, i);
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.m9863a(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.m9862b(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.m9861c(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.m9860d(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m9859e(mediaType, byteString);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m9855i(Companion, mediaType, bArr, 0, 0, 12, null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.m9855i(Companion, mediaType, bArr, i, 0, 8, null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.m9858f(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m9857g(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.m9854j(Companion, bArr, null, 0, 0, 7, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m9854j(Companion, bArr, mediaType, 0, 0, 6, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.m9854j(Companion, bArr, mediaType, i, 0, 4, null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.m9856h(bArr, mediaType, i, i2);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);
}
