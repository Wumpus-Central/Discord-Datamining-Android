package p327rj;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.util.JSStackTrace;
import eg.C6884j;
import fk.C7369p;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import nf.C11067f;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import p163j$.util.DesugarTimeZone;
import p267of.AbstractC11283p;
import p267of.C11289v;
import p307qj.AbstractC12237n;
import p326ri.C12694d;
import p326ri.C12718u;
import p326ri.C12719v;
import p426xf.C14082c;
import p450yj.C14451c;
import p470zj.AbstractC14668a;

@Metadata(m15074d1 = {"\u0000\u0096\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0012\u00102\u001a\u000200*\u00020/2\u0006\u00101\u001a\u000200\u001a \u00106\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104\u001a\n\u00107\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010;\u001a\u00020:*\b\u0012\u0004\u0012\u00020908\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020908*\u00020:\u001a\u0012\u0010=\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010@\u001a\u00020?*\u00020>\u001a\u0015\u0010C\u001a\u00020\u0018*\u00020A2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010E\u001a\u00020\u0018*\u00020D2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010F\u001a\u00020\u0000*\u00020\u00182\u0006\u0010B\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010I\u001a\u00020\u0004*\u00020G2\u0006\u0010H\u001a\u00020\u0018\u001a\n\u0010J\u001a\u00020\u0018*\u00020/\u001a\u001a\u0010M\u001a\u00020\b*\u00020K2\u0006\u00103\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u001a\u0010O\u001a\u00020\b*\u00020K2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u0012\u0010R\u001a\u00020\b*\u00020P2\u0006\u0010Q\u001a\u00020/\u001a\u0012\u0010T\u001a\u00020\u0018*\u00020S2\u0006\u0010C\u001a\u00020A\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y*\b\u0012\u0004\u0012\u00028\u000008\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y2\u0012\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b]\u0010^\u001a.\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010!*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\u001a\n\u0010b\u001a\u00020\u0004*\u00020a\u001a\n\u0010c\u001a\u00020\u0004*\u00020P\u001a\u0012\u0010g\u001a\u00020\b*\u00020d2\u0006\u0010f\u001a\u00020e\u001a\n\u0010h\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010i\u001a\u00020\u0006*\u00020\u0018\u001a'\u0010l\u001a\u00020\u0004\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u00028\u00000j2\u0006\u0010k\u001a\u00028\u0000H\u0000¢\u0006\u0004\bl\u0010m\u001a \u0010r\u001a\u00020q*\u00060nj\u0002`o2\u0010\u0010p\u001a\f\u0012\b\u0012\u00060nj\u0002`o08\"\u0014\u0010u\u001a\u00020s8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010t\"\u0014\u0010w\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010v\"\u0014\u0010z\u001a\u00020x8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010y\"\u0014\u0010}\u001a\u00020{8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010|\"\u0015\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u007f\"\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0082\u0001\"\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010\u0085\u0001\"\u0016\u0010\u0088\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0087\u0001\"\u0016\u0010\u008a\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0089\u0001¨\u0006\u008b\u0001"}, m15073d2 = {"", "arrayLength", "offset", "count", "", "i", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "K", "", "other", "Ljava/util/Comparator;", "comparator", "B", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "r", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "P", "value", "", "u", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "l", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "w", "y", "V", "delimiters", "n", "", "delimiter", "m", "v", "f", "E", "format", "", "args", "q", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "G", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "F", "", "Lyj/c;", "Lokhttp3/Headers;", "M", "L", "g", "Lqj/n;", "Lqj/n$c;", "e", "", "mask", "b", "", "c", "d", "Lokio/BufferedSink;", "medium", "Y", "H", "Lokio/Source;", "timeUnit", "J", "timeout", "p", "Ljava/net/Socket;", "source", "D", "Lokio/Buffer;", "I", "A", "Lokhttp3/Response;", "s", "defaultValue", "T", "U", "R", "elements", "t", "([Ljava/lang/Object;)Ljava/util/List;", "", "S", "Ljava/io/Closeable;", "j", "k", "Lzj/a;", "Ljava/io/File;", JSStackTrace.FILE_KEY, "C", "O", "N", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "X", "", "[B", "EMPTY_BYTE_ARRAY", "Lokhttp3/Headers;", "EMPTY_HEADERS", "Lokhttp3/ResponseBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lfk/p;", "Lfk/p;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: rj.c */
/* loaded from: classes8.dex */
public final class C12729c {

    /* renamed from: a */
    public static final byte[] f28582a;

    /* renamed from: c */
    public static final ResponseBody f28584c;

    /* renamed from: d */
    public static final RequestBody f28585d;

    /* renamed from: e */
    private static final C7369p f28586e;

    /* renamed from: f */
    public static final TimeZone f28587f;

    /* renamed from: i */
    public static final String f28590i;

    /* renamed from: b */
    public static final Headers f28583b = Headers.f25376l.m10050h(new String[0]);

    /* renamed from: g */
    private static final Regex f28588g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h */
    public static final boolean f28589h = false;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lokhttp3/Call;", "it", "Lqj/n;", "a", "(Lokhttp3/Call;)Lqj/n;"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: rj.c$a */
    /* loaded from: classes8.dex */
    static final class C12730a implements AbstractC12237n.AbstractC12240c {

        /* renamed from: a */
        final /* synthetic */ AbstractC12237n f28591a;

        C12730a(AbstractC12237n nVar) {
            this.f28591a = nVar;
        }

        @Override // p307qj.AbstractC12237n.AbstractC12240c
        /* renamed from: a */
        public final AbstractC12237n mo5591a(Call it) {
            C9971q.m14633g(it, "it");
            return this.f28591a;
        }
    }

    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, m15072k = 3, m15071mv = {1, 4, 0})
    /* renamed from: rj.c$b */
    /* loaded from: classes8.dex */
    static final class ThreadFactoryC12731b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f28592a;

        /* renamed from: b */
        final /* synthetic */ boolean f28593b;

        ThreadFactoryC12731b(String str, boolean z) {
            this.f28592a = str;
            this.f28593b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f28592a);
            thread.setDaemon(this.f28593b);
            return thread;
        }
    }

    static {
        String p0;
        String q0;
        byte[] bArr = new byte[0];
        f28582a = bArr;
        f28584c = ResponseBody.Companion.m9805i(ResponseBody.Companion, bArr, null, 1, null);
        f28585d = RequestBody.Companion.m9854j(RequestBody.Companion, bArr, null, 0, 0, 7, null);
        C7369p.C7370a aVar = C7369p.f15866n;
        ByteString.C11437a aVar2 = ByteString.f25542o;
        f28586e = aVar.m22786d(aVar2.m9692b("efbbbf"), aVar2.m9692b("feff"), aVar2.m9692b("fffe"), aVar2.m9692b("0000ffff"), aVar2.m9692b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        C9971q.m14636d(timeZone);
        f28587f = timeZone;
        String name = OkHttpClient.class.getName();
        C9971q.m14634f(name, "OkHttpClient::class.java.name");
        p0 = C12719v.m5670p0(name, "okhttp3.");
        q0 = C12719v.m5669q0(p0, "Client");
        f28590i = q0;
    }

    /* renamed from: A */
    public static final int m5642A(String indexOfNonWhitespace, int i) {
        C9971q.m14633g(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i < length) {
            char charAt = indexOfNonWhitespace.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return indexOfNonWhitespace.length();
    }

    /* renamed from: B */
    public static final String[] m5641B(String[] intersect, String[] other, Comparator<? super String> comparator) {
        C9971q.m14633g(intersect, "$this$intersect");
        C9971q.m14633g(other, "other");
        C9971q.m14633g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: C */
    public static final boolean m5640C(AbstractC14668a isCivilized, File file) {
        C9971q.m14633g(isCivilized, "$this$isCivilized");
        C9971q.m14633g(file, "file");
        Sink f = isCivilized.mo2f(file);
        try {
            try {
                isCivilized.mo0h(file);
                C14082c.m1713a(f, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.f22042a;
                C14082c.m1713a(f, null);
                isCivilized.mo0h(file);
                return false;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C14082c.m1713a(f, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: D */
    public static final boolean m5639D(Socket isHealthy, BufferedSource source) {
        C9971q.m14633g(isHealthy, "$this$isHealthy");
        C9971q.m14633g(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z = !source.mo9731h0();
                isHealthy.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th2) {
                isHealthy.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: E */
    public static final boolean m5638E(String name) {
        boolean t;
        boolean t2;
        boolean t3;
        boolean t4;
        C9971q.m14633g(name, "name");
        t = C12718u.m5732t(name, "Authorization", true);
        if (t) {
            return true;
        }
        t2 = C12718u.m5732t(name, "Cookie", true);
        if (t2) {
            return true;
        }
        t3 = C12718u.m5732t(name, "Proxy-Authorization", true);
        if (t3) {
            return true;
        }
        t4 = C12718u.m5732t(name, "Set-Cookie", true);
        if (t4) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static final int m5637F(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: G */
    public static final Charset m5636G(BufferedSource readBomAsCharset, Charset charset) {
        C9971q.m14633g(readBomAsCharset, "$this$readBomAsCharset");
        C9971q.m14633g(charset, "default");
        int t0 = readBomAsCharset.mo9725t0(f28586e);
        if (t0 == -1) {
            return charset;
        }
        if (t0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            C9971q.m14634f(UTF_8, "UTF_8");
            return UTF_8;
        } else if (t0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            C9971q.m14634f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        } else if (t0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            C9971q.m14634f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        } else if (t0 == 3) {
            return C12694d.f28535a.m5852a();
        } else {
            if (t0 == 4) {
                return C12694d.f28535a.m5851b();
            }
            throw new AssertionError();
        }
    }

    /* renamed from: H */
    public static final int m5635H(BufferedSource readMedium) {
        C9971q.m14633g(readMedium, "$this$readMedium");
        return m5616b(readMedium.readByte(), 255) | (m5616b(readMedium.readByte(), 255) << 16) | (m5616b(readMedium.readByte(), 255) << 8);
    }

    /* renamed from: I */
    public static final int m5634I(Buffer skipAll, byte b) {
        C9971q.m14633g(skipAll, "$this$skipAll");
        int i = 0;
        while (!skipAll.mo9731h0() && skipAll.m9792C(0L) == b) {
            i++;
            skipAll.readByte();
        }
        return i;
    }

    /* renamed from: J */
    public static final boolean m5633J(Source skipAll, int i, TimeUnit timeUnit) {
        long j;
        C9971q.m14633g(skipAll, "$this$skipAll");
        C9971q.m14633g(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (skipAll.timeout().mo9683e()) {
            j = skipAll.timeout().mo9684c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        skipAll.timeout().mo9681d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.m9765h();
            }
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo9686a();
            } else {
                skipAll.timeout().mo9681d(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo9686a();
            } else {
                skipAll.timeout().mo9681d(nanoTime + j);
            }
            return false;
        } catch (Throwable th2) {
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo9686a();
            } else {
                skipAll.timeout().mo9681d(nanoTime + j);
            }
            throw th2;
        }
    }

    /* renamed from: K */
    public static final ThreadFactory m5632K(String name, boolean z) {
        C9971q.m14633g(name, "name");
        return new ThreadFactoryC12731b(name, z);
    }

    /* renamed from: L */
    public static final List<C14451c> m5631L(Headers toHeaderList) {
        IntRange q;
        int t;
        C9971q.m14633g(toHeaderList, "$this$toHeaderList");
        q = C6884j.m23947q(0, toHeaderList.size());
        t = C9907k.m14809t(q, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11283p) it).nextInt();
            arrayList.add(new C14451c(toHeaderList.m10071b(nextInt), toHeaderList.m10067j(nextInt)));
        }
        return arrayList;
    }

    /* renamed from: M */
    public static final Headers m5630M(List<C14451c> toHeaders) {
        C9971q.m14633g(toHeaders, "$this$toHeaders");
        Headers.C11418a aVar = new Headers.C11418a();
        for (C14451c cVar : toHeaders) {
            aVar.m10063c(cVar.m574a().m9721B(), cVar.m573b().m9721B());
        }
        return aVar.m10062d();
    }

    /* renamed from: N */
    public static final String m5629N(int i) {
        String hexString = Integer.toHexString(i);
        C9971q.m14634f(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* renamed from: O */
    public static final String m5628O(long j) {
        String hexString = Long.toHexString(j);
        C9971q.m14634f(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    /* renamed from: P */
    public static final String m5627P(HttpUrl toHostHeader, boolean z) {
        boolean M;
        String str;
        C9971q.m14633g(toHostHeader, "$this$toHostHeader");
        M = C12719v.m5709M(toHostHeader.m10042h(), ":", false, 2, null);
        if (M) {
            str = '[' + toHostHeader.m10042h() + ']';
        } else {
            str = toHostHeader.m10042h();
        }
        if (!z && toHostHeader.m10037m() == HttpUrl.f25380l.m9998c(toHostHeader.m10033q())) {
            return str;
        }
        return str + ':' + toHostHeader.m10037m();
    }

    /* renamed from: Q */
    public static /* synthetic */ String m5626Q(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m5627P(httpUrl, z);
    }

    /* renamed from: R */
    public static final <T> List<T> m5625R(List<? extends T> toImmutableList) {
        List F0;
        C9971q.m14633g(toImmutableList, "$this$toImmutableList");
        F0 = C9914r.m14788F0(toImmutableList);
        List<T> unmodifiableList = Collections.unmodifiableList(F0);
        C9971q.m14634f(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: S */
    public static final <K, V> Map<K, V> m5624S(Map<K, ? extends V> toImmutableMap) {
        Map<K, V> h;
        C9971q.m14633g(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            h = C11289v.m10251h();
            return h;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        C9971q.m14634f(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    /* renamed from: T */
    public static final long m5623T(String toLongOrDefault, long j) {
        C9971q.m14633g(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: U */
    public static final int m5622U(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: V */
    public static final String m5621V(String trimSubstring, int i, int i2) {
        C9971q.m14633g(trimSubstring, "$this$trimSubstring");
        int w = m5595w(trimSubstring, i, i2);
        String substring = trimSubstring.substring(w, m5593y(trimSubstring, w, i2));
        C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: W */
    public static /* synthetic */ String m5620W(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m5621V(str, i, i2);
    }

    /* renamed from: X */
    public static final Throwable m5619X(Exception withSuppressed, List<? extends Exception> suppressed) {
        C9971q.m14633g(withSuppressed, "$this$withSuppressed");
        C9971q.m14633g(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        for (Exception exc : suppressed) {
            C11067f.m10981a(withSuppressed, exc);
        }
        return withSuppressed;
    }

    /* renamed from: Y */
    public static final void m5618Y(BufferedSink writeMedium, int i) {
        C9971q.m14633g(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i >>> 16) & 255);
        writeMedium.writeByte((i >>> 8) & 255);
        writeMedium.writeByte(i & 255);
    }

    /* renamed from: a */
    public static final <E> void m5617a(List<E> addIfAbsent, E e) {
        C9971q.m14633g(addIfAbsent, "$this$addIfAbsent");
        if (!addIfAbsent.contains(e)) {
            addIfAbsent.add(e);
        }
    }

    /* renamed from: b */
    public static final int m5616b(byte b, int i) {
        return b & i;
    }

    /* renamed from: c */
    public static final int m5615c(short s, int i) {
        return s & i;
    }

    /* renamed from: d */
    public static final long m5614d(int i, long j) {
        return i & j;
    }

    /* renamed from: e */
    public static final AbstractC12237n.AbstractC12240c m5613e(AbstractC12237n asFactory) {
        C9971q.m14633g(asFactory, "$this$asFactory");
        return new C12730a(asFactory);
    }

    /* renamed from: f */
    public static final boolean m5612f(String canParseAsIpAddress) {
        C9971q.m14633g(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return f28588g.m14583g(canParseAsIpAddress);
    }

    /* renamed from: g */
    public static final boolean m5611g(HttpUrl canReuseConnectionFor, HttpUrl other) {
        C9971q.m14633g(canReuseConnectionFor, "$this$canReuseConnectionFor");
        C9971q.m14633g(other, "other");
        if (!C9971q.m14638b(canReuseConnectionFor.m10042h(), other.m10042h()) || canReuseConnectionFor.m10037m() != other.m10037m() || !C9971q.m14638b(canReuseConnectionFor.m10033q(), other.m10033q())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final int m5610h(String name, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        C9971q.m14633g(name, "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((name + " too small.").toString());
                }
                throw new IllegalArgumentException((name + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((name + " < 0").toString());
    }

    /* renamed from: i */
    public static final void m5609i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public static final void m5608j(Closeable closeQuietly) {
        C9971q.m14633g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static final void m5607k(Socket closeQuietly) {
        C9971q.m14633g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C9971q.m14638b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static final String[] m5606l(String[] concat, String value) {
        int I;
        C9971q.m14633g(concat, "$this$concat");
        C9971q.m14633g(value, "value");
        Object[] copyOf = Arrays.copyOf(concat, concat.length + 1);
        C9971q.m14634f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) copyOf;
        I = C9899f.m14956I(strArr);
        strArr[I] = value;
        return strArr;
    }

    /* renamed from: m */
    public static final int m5605m(String delimiterOffset, char c, int i, int i2) {
        C9971q.m14633g(delimiterOffset, "$this$delimiterOffset");
        while (i < i2) {
            if (delimiterOffset.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static final int m5604n(String delimiterOffset, String delimiters, int i, int i2) {
        boolean L;
        C9971q.m14633g(delimiterOffset, "$this$delimiterOffset");
        C9971q.m14633g(delimiters, "delimiters");
        while (i < i2) {
            L = C12719v.m5711L(delimiters, delimiterOffset.charAt(i), false, 2, null);
            if (L) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static /* synthetic */ int m5603o(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m5605m(str, c, i, i2);
    }

    /* renamed from: p */
    public static final boolean m5602p(Source discard, int i, TimeUnit timeUnit) {
        C9971q.m14633g(discard, "$this$discard");
        C9971q.m14633g(timeUnit, "timeUnit");
        try {
            return m5633J(discard, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static final String m5601q(String format, Object... args) {
        C9971q.m14633g(format, "format");
        C9971q.m14633g(args, "args");
        C9962k0 k0Var = C9962k0.f22091a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        C9971q.m14634f(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    /* renamed from: r */
    public static final boolean m5600r(String[] hasIntersection, String[] strArr, Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        C9971q.m14633g(hasIntersection, "$this$hasIntersection");
        C9971q.m14633g(comparator, "comparator");
        if (hasIntersection.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr != null) {
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final long m5599s(Response headersContentLength) {
        C9971q.m14633g(headersContentLength, "$this$headersContentLength");
        String a = headersContentLength.m9833z().m10072a("Content-Length");
        if (a != null) {
            return m5623T(a, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    /* renamed from: t */
    public static final <T> List<T> m5598t(T... elements) {
        List l;
        C9971q.m14633g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        l = C9906j.m14817l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(l);
        C9971q.m14634f(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: u */
    public static final int m5597u(String[] indexOf, String value, Comparator<String> comparator) {
        boolean z;
        C9971q.m14633g(indexOf, "$this$indexOf");
        C9971q.m14633g(value, "value");
        C9971q.m14633g(comparator, "comparator");
        int length = indexOf.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(indexOf[i], value) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static final int m5596v(String indexOfControlOrNonAscii) {
        C9971q.m14633g(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i = 0; i < length; i++) {
            char charAt = indexOfControlOrNonAscii.charAt(i);
            if (C9971q.m14631i(charAt, 31) <= 0 || C9971q.m14631i(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static final int m5595w(String indexOfFirstNonAsciiWhitespace, int i, int i2) {
        C9971q.m14633g(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: x */
    public static /* synthetic */ int m5594x(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m5595w(str, i, i2);
    }

    /* renamed from: y */
    public static final int m5593y(String indexOfLastNonAsciiWhitespace, int i, int i2) {
        C9971q.m14633g(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i3);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: z */
    public static /* synthetic */ int m5592z(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m5593y(str, i, i2);
    }
}
