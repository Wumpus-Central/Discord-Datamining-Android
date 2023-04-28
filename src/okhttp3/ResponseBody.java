package okhttp3;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p326ri.C12694d;
import p327rj.C12729c;
import p426xf.C14082c;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m15073d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lokio/BufferedSource;", "consumer", "", "sizeMapper", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/ByteString;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, m15073d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "", "h", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "g", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/BufferedSource;", "", "contentLength", "f", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "content", "c", "e", "d", "b", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class Companion {

        @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, m15073d2 = {"okhttp3/ResponseBody$Companion$a", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.ResponseBody$Companion$a */
        /* loaded from: classes8.dex */
        public static final class C11431a extends ResponseBody {

            /* renamed from: k */
            final /* synthetic */ BufferedSource f25515k;

            /* renamed from: l */
            final /* synthetic */ MediaType f25516l;

            /* renamed from: m */
            final /* synthetic */ long f25517m;

            C11431a(BufferedSource bufferedSource, MediaType mediaType, long j) {
                this.f25515k = bufferedSource;
                this.f25516l = mediaType;
                this.f25517m = j;
            }

            @Override // okhttp3.ResponseBody
            public long contentLength() {
                return this.f25517m;
            }

            @Override // okhttp3.ResponseBody
            public MediaType contentType() {
                return this.f25516l;
            }

            @Override // okhttp3.ResponseBody
            public BufferedSource source() {
                return this.f25515k;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ ResponseBody m9805i(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.m9806h(bArr, mediaType);
        }

        /* renamed from: a */
        public final ResponseBody m9813a(String toResponseBody, MediaType mediaType) {
            C9971q.m14633g(toResponseBody, "$this$toResponseBody");
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
            Buffer T0 = new Buffer().m9773T0(toResponseBody, charset);
            return m9808f(T0, mediaType, T0.size());
        }

        /* renamed from: b */
        public final ResponseBody m9812b(MediaType mediaType, long j, BufferedSource content) {
            C9971q.m14633g(content, "content");
            return m9808f(content, mediaType, j);
        }

        /* renamed from: c */
        public final ResponseBody m9811c(MediaType mediaType, String content) {
            C9971q.m14633g(content, "content");
            return m9813a(content, mediaType);
        }

        /* renamed from: d */
        public final ResponseBody m9810d(MediaType mediaType, ByteString content) {
            C9971q.m14633g(content, "content");
            return m9807g(content, mediaType);
        }

        /* renamed from: e */
        public final ResponseBody m9809e(MediaType mediaType, byte[] content) {
            C9971q.m14633g(content, "content");
            return m9806h(content, mediaType);
        }

        /* renamed from: f */
        public final ResponseBody m9808f(BufferedSource asResponseBody, MediaType mediaType, long j) {
            C9971q.m14633g(asResponseBody, "$this$asResponseBody");
            return new C11431a(asResponseBody, mediaType, j);
        }

        /* renamed from: g */
        public final ResponseBody m9807g(ByteString toResponseBody, MediaType mediaType) {
            C9971q.m14633g(toResponseBody, "$this$toResponseBody");
            return m9808f(new Buffer().mo9743u0(toResponseBody), mediaType, toResponseBody.m9697v());
        }

        /* renamed from: h */
        public final ResponseBody m9806h(byte[] toResponseBody, MediaType mediaType) {
            C9971q.m14633g(toResponseBody, "$this$toResponseBody");
            return m9808f(new Buffer().write(toResponseBody), mediaType, toResponseBody.length);
        }
    }

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lokhttp3/ResponseBody$a;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "", "close", "", "k", "Z", "closed", "l", "Ljava/io/Reader;", "delegate", "Lokio/BufferedSource;", "m", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", "n", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.ResponseBody$a */
    /* loaded from: classes8.dex */
    public static final class C11432a extends Reader {

        /* renamed from: k */
        private boolean f25518k;

        /* renamed from: l */
        private Reader f25519l;

        /* renamed from: m */
        private final BufferedSource f25520m;

        /* renamed from: n */
        private final Charset f25521n;

        public C11432a(BufferedSource source, Charset charset) {
            C9971q.m14633g(source, "source");
            C9971q.m14633g(charset, "charset");
            this.f25520m = source;
            this.f25521n = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f25518k = true;
            Reader reader = this.f25519l;
            if (reader != null) {
                reader.close();
            } else {
                this.f25520m.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i, int i2) {
            C9971q.m14633g(cbuf, "cbuf");
            if (!this.f25518k) {
                Reader reader = this.f25519l;
                if (reader == null) {
                    reader = new InputStreamReader(this.f25520m.mo9739E0(), C12729c.m5636G(this.f25520m, this.f25521n));
                    this.f25519l = reader;
                }
                return reader.read(cbuf, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private final Charset charset() {
        Charset c;
        MediaType contentType = contentType();
        return (contentType == null || (c = contentType.m9985c(C12694d.f28536b)) == null) ? C12694d.f28536b : c;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T consumeSource(kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> r6, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r7) {
        /*
            r5 = this;
            long r0 = r5.contentLength()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0067
            okio.BufferedSource r2 = r5.source()
            r3 = 1
            java.lang.Object r6 = r6.invoke(r2)     // Catch: all -> 0x005a
            kotlin.jvm.internal.C9969o.m14640b(r3)
            r4 = 0
            p426xf.C14082c.m1713a(r2, r4)
            kotlin.jvm.internal.C9969o.m14641a(r3)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            long r2 = (long) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0035
            goto L_0x0059
        L_0x0035:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Length ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") and stream length ("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = ") disagree"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.<init>(r7)
            throw r6
        L_0x0059:
            return r6
        L_0x005a:
            r6 = move-exception
            throw r6     // Catch: all -> 0x005c
        L_0x005c:
            r7 = move-exception
            kotlin.jvm.internal.C9969o.m14640b(r3)
            p426xf.C14082c.m1713a(r2, r6)
            kotlin.jvm.internal.C9969o.m14641a(r3)
            throw r7
        L_0x0067:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Cannot buffer entire body for content length: "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.m9813a(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        return Companion.m9812b(mediaType, j, bufferedSource);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.m9811c(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m9810d(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m9809e(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j) {
        return Companion.m9808f(bufferedSource, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m9807g(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m9806h(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo9739E0();
    }

    /* JADX WARN: Finally extract failed */
    public final ByteString byteString() {
        long contentLength = contentLength();
        if (contentLength <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            BufferedSource source = source();
            try {
                ByteString o0 = source.mo9727o0();
                C14082c.m1713a(source, null);
                int v = o0.m9697v();
                if (contentLength == -1 || contentLength == v) {
                    return o0;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + v + ") disagree");
            } finally {
                try {
                    throw th;
                } catch (Throwable th2) {
                }
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
            BufferedSource source = source();
            try {
                byte[] g0 = source.mo9732g0();
                C14082c.m1713a(source, null);
                int length = g0.length;
                if (contentLength == -1 || contentLength == length) {
                    return g0;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
            } finally {
                try {
                    throw th;
                } catch (Throwable th2) {
                }
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        C11432a aVar = new C11432a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12729c.m5608j(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() {
        BufferedSource source = source();
        try {
            th = null;
            return source.mo9729l0(C12729c.m5636G(source, charset()));
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
