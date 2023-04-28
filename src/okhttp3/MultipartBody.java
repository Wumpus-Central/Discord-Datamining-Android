package okhttp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003#\r\u0007B'\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u001e¨\u0006$"}, m15073d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/BufferedSink;", "sink", "", "countBytes", "", "b", "Lokhttp3/MediaType;", "contentType", "contentLength", "", "writeTo", "a", "Lokhttp3/MediaType;", "J", "Lokio/ByteString;", "c", "Lokio/ByteString;", "boundaryByteString", "d", "type", "()Lokhttp3/MediaType;", "", "Lokhttp3/MultipartBody$b;", "e", "Ljava/util/List;", "parts", "()Ljava/util/List;", "", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "n", "Builder", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: f */
    public static final MediaType f25407f;

    /* renamed from: g */
    public static final MediaType f25408g;

    /* renamed from: h */
    public static final MediaType f25409h;

    /* renamed from: i */
    public static final MediaType f25410i;

    /* renamed from: j */
    public static final MediaType f25411j;

    /* renamed from: m */
    private static final byte[] f25414m;

    /* renamed from: a */
    private final MediaType f25416a;

    /* renamed from: b */
    private long f25417b = -1;

    /* renamed from: c */
    private final ByteString f25418c;

    /* renamed from: d */
    private final MediaType f25419d;

    /* renamed from: e */
    private final List<C11424b> f25420e;

    /* renamed from: n */
    public static final C11423a f25415n = new C11423a(null);

    /* renamed from: k */
    private static final byte[] f25412k = {(byte) 58, (byte) 32};

    /* renamed from: l */
    private static final byte[] f25413l = {(byte) 13, (byte) 10};

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m15073d2 = {"Lokhttp3/MultipartBody$a;", "", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.MultipartBody$a */
    /* loaded from: classes8.dex */
    public static final class C11423a {
        private C11423a() {
        }

        public /* synthetic */ C11423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u001b\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, m15073d2 = {"Lokhttp3/MultipartBody$b;", "", "Lokhttp3/Headers;", "a", "Lokhttp3/Headers;", "b", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "body", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.MultipartBody$b */
    /* loaded from: classes8.dex */
    public static final class C11424b {

        /* renamed from: c */
        public static final C11425a f25424c = new C11425a(null);

        /* renamed from: a */
        private final Headers f25425a;

        /* renamed from: b */
        private final RequestBody f25426b;

        @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m15073d2 = {"Lokhttp3/MultipartBody$b$a;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "Lokhttp3/MultipartBody$b;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: okhttp3.MultipartBody$b$a */
        /* loaded from: classes8.dex */
        public static final class C11425a {
            private C11425a() {
            }

            public /* synthetic */ C11425a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C11424b m9970a(Headers headers, RequestBody body) {
                String str;
                boolean z;
                String str2;
                C9971q.m14633g(body, "body");
                if (headers != null) {
                    str = headers.m10072a("Content-Type");
                } else {
                    str = null;
                }
                boolean z2 = true;
                if (str == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (headers != null) {
                        str2 = headers.m10072a("Content-Length");
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        z2 = false;
                    }
                    if (z2) {
                        return new C11424b(headers, body, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
        }

        private C11424b(Headers headers, RequestBody requestBody) {
            this.f25425a = headers;
            this.f25426b = requestBody;
        }

        /* renamed from: a */
        public final RequestBody m9972a() {
            return this.f25426b;
        }

        /* renamed from: b */
        public final Headers m9971b() {
            return this.f25425a;
        }

        public /* synthetic */ C11424b(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }
    }

    static {
        MediaType.C11422a aVar = MediaType.f25402g;
        f25407f = aVar.m9980a("multipart/mixed");
        f25408g = aVar.m9980a("multipart/alternative");
        f25409h = aVar.m9980a("multipart/digest");
        f25410i = aVar.m9980a("multipart/parallel");
        f25411j = aVar.m9980a("multipart/form-data");
        byte b = (byte) 45;
        f25414m = new byte[]{b, b};
    }

    public MultipartBody(ByteString boundaryByteString, MediaType type, List<C11424b> parts) {
        C9971q.m14633g(boundaryByteString, "boundaryByteString");
        C9971q.m14633g(type, "type");
        C9971q.m14633g(parts, "parts");
        this.f25418c = boundaryByteString;
        this.f25419d = type;
        this.f25420e = parts;
        MediaType.C11422a aVar = MediaType.f25402g;
        this.f25416a = aVar.m9980a(type + "; boundary=" + m9978a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m9977b(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f25420e.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C11424b bVar = this.f25420e.get(i);
            Headers b = bVar.m9971b();
            RequestBody a = bVar.m9972a();
            C9971q.m14636d(bufferedSink);
            bufferedSink.write(f25414m);
            bufferedSink.mo9743u0(this.f25418c);
            bufferedSink.write(f25413l);
            if (b != null) {
                int size2 = b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.mo9750J(b.m10071b(i2)).write(f25412k).mo9750J(b.m10067j(i2)).write(f25413l);
                }
            }
            MediaType contentType = a.contentType();
            if (contentType != null) {
                bufferedSink.mo9750J("Content-Type: ").mo9750J(contentType.toString()).write(f25413l);
            }
            long contentLength = a.contentLength();
            if (contentLength != -1) {
                bufferedSink.mo9750J("Content-Length: ").mo9746c0(contentLength).write(f25413l);
            } else if (z) {
                C9971q.m14636d(buffer);
                buffer.m9765h();
                return -1L;
            }
            byte[] bArr = f25413l;
            bufferedSink.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                a.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        C9971q.m14636d(bufferedSink);
        byte[] bArr2 = f25414m;
        bufferedSink.write(bArr2);
        bufferedSink.mo9743u0(this.f25418c);
        bufferedSink.write(bArr2);
        bufferedSink.write(f25413l);
        if (!z) {
            return j;
        }
        C9971q.m14636d(buffer);
        long size3 = j + buffer.size();
        buffer.m9765h();
        return size3;
    }

    /* renamed from: a */
    public final String m9978a() {
        return this.f25418c.m9721B();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.f25417b;
        if (j != -1) {
            return j;
        }
        long b = m9977b(null, true);
        this.f25417b = b;
        return b;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f25416a;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        C9971q.m14633g(sink, "sink");
        m9977b(sink, false);
    }

    @Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, m15073d2 = {"Lokhttp3/MultipartBody$Builder;", "", "Lokhttp3/MediaType;", "type", "d", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "a", "Lokhttp3/MultipartBody$b;", "part", "b", "Lokhttp3/MultipartBody;", "c", "Lokio/ByteString;", "Lokio/ByteString;", "boundary", "Lokhttp3/MediaType;", "", "Ljava/util/List;", "parts", "", "<init>", "(Ljava/lang/String;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private final ByteString f25421a;

        /* renamed from: b */
        private MediaType f25422b;

        /* renamed from: c */
        private final List<C11424b> f25423c;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String boundary) {
            C9971q.m14633g(boundary, "boundary");
            this.f25421a = ByteString.f25542o.m9690d(boundary);
            this.f25422b = MultipartBody.f25407f;
            this.f25423c = new ArrayList();
        }

        /* renamed from: a */
        public final Builder m9976a(Headers headers, RequestBody body) {
            C9971q.m14633g(body, "body");
            m9975b(C11424b.f25424c.m9970a(headers, body));
            return this;
        }

        /* renamed from: b */
        public final Builder m9975b(C11424b part) {
            C9971q.m14633g(part, "part");
            this.f25423c.add(part);
            return this;
        }

        /* renamed from: c */
        public final MultipartBody m9974c() {
            if (!this.f25423c.isEmpty()) {
                return new MultipartBody(this.f25421a, this.f25422b, C12729c.m5625R(this.f25423c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final Builder m9973d(MediaType type) {
            C9971q.m14633g(type, "type");
            if (C9971q.m14638b(type.m9981g(), "multipart")) {
                this.f25422b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.C9971q.m14634f(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
