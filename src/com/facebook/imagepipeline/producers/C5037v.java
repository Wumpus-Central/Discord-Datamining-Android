package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.views.image.ReactImageView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p057d4.AbstractC6395b;
import p076e4.C6706f;
import p380v5.C13434e;
import p394w3.C13736i;

/* renamed from: com.facebook.imagepipeline.producers.v */
/* loaded from: classes7.dex */
public class C5037v extends AbstractC4959c<C5040c> {

    /* renamed from: a */
    private int f8633a;

    /* renamed from: b */
    private String f8634b;

    /* renamed from: c */
    private final Map<String, String> f8635c;

    /* renamed from: d */
    private final ExecutorService f8636d;

    /* renamed from: e */
    private final AbstractC6395b f8637e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    /* loaded from: classes7.dex */
    public class RunnableC5038a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C5040c f8638k;

        /* renamed from: l */
        final /* synthetic */ NetworkFetcher.Callback f8639l;

        RunnableC5038a(C5040c cVar, NetworkFetcher.Callback callback) {
            this.f8638k = cVar;
            this.f8639l = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5037v.this.m30951e(this.f8638k, this.f8639l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    /* loaded from: classes7.dex */
    public class C5039b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ Future f8641a;

        /* renamed from: b */
        final /* synthetic */ NetworkFetcher.Callback f8642b;

        C5039b(Future future, NetworkFetcher.Callback callback) {
            this.f8641a = future;
            this.f8642b = callback;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            if (this.f8641a.cancel(false)) {
                this.f8642b.mo31084a();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$c */
    /* loaded from: classes7.dex */
    public static class C5040c extends FetchState {

        /* renamed from: f */
        private long f8644f;

        /* renamed from: g */
        private long f8645g;

        /* renamed from: h */
        private long f8646h;

        public C5040c(Consumer<C13434e> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    public C5037v(int i) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f8633a = i;
    }

    /* renamed from: b */
    private HttpURLConnection m30954b(Uri uri, int i) {
        Uri uri2;
        String str;
        HttpURLConnection j = m30946j(uri);
        String str2 = this.f8634b;
        if (str2 != null) {
            j.setRequestProperty("User-Agent", str2);
        }
        Map<String, String> map = this.f8635c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                j.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        j.setConnectTimeout(this.f8633a);
        int responseCode = j.getResponseCode();
        if (m30948h(responseCode)) {
            return j;
        }
        if (m30949g(responseCode)) {
            String headerField = j.getHeaderField("Location");
            j.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (!(i <= 0 || uri2 == null || C13736i.m2848a(uri2.getScheme(), scheme))) {
                return m30954b(uri2, i - 1);
            }
            if (i == 0) {
                str = m30953c("URL %s follows too many redirects", uri.toString());
            } else {
                str = m30953c("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(str);
        }
        j.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    /* renamed from: c */
    private static String m30953c(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: g */
    private static boolean m30949g(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: h */
    private static boolean m30948h(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    static HttpURLConnection m30946j(Uri uri) {
        return (HttpURLConnection) C6706f.m24594p(uri).openConnection();
    }

    /* renamed from: a */
    public C5040c createFetchState(Consumer<C13434e> consumer, ProducerContext producerContext) {
        return new C5040c(consumer, producerContext);
    }

    /* renamed from: d */
    public void fetch(C5040c cVar, NetworkFetcher.Callback callback) {
        cVar.f8644f = this.f8637e.now();
        cVar.m31224b().mo31168c(new C5039b(this.f8636d.submit(new RunnableC5038a(cVar, callback)), callback));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m30951e(com.facebook.imagepipeline.producers.C5037v.C5040c r5, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.m31219g()     // Catch: all -> 0x0027, IOException -> 0x002a
            r2 = 5
            java.net.HttpURLConnection r1 = r4.m30954b(r1, r2)     // Catch: all -> 0x0027, IOException -> 0x002a
            d4.b r2 = r4.f8637e     // Catch: IOException -> 0x0025, all -> 0x003a
            long r2 = r2.now()     // Catch: IOException -> 0x0025, all -> 0x003a
            com.facebook.imagepipeline.producers.C5037v.C5040c.m30941n(r5, r2)     // Catch: IOException -> 0x0025, all -> 0x003a
            if (r1 == 0) goto L_0x001d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: IOException -> 0x0025, all -> 0x003a
            r5 = -1
            r6.mo31083b(r0, r5)     // Catch: IOException -> 0x0025, all -> 0x003a
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.close()     // Catch: IOException -> 0x0022
        L_0x0022:
            if (r1 == 0) goto L_0x0039
            goto L_0x0036
        L_0x0025:
            r5 = move-exception
            goto L_0x002c
        L_0x0027:
            r5 = move-exception
            r1 = r0
            goto L_0x003b
        L_0x002a:
            r5 = move-exception
            r1 = r0
        L_0x002c:
            r6.onFailure(r5)     // Catch: all -> 0x003a
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch: IOException -> 0x0034
        L_0x0034:
            if (r1 == 0) goto L_0x0039
        L_0x0036:
            r1.disconnect()
        L_0x0039:
            return
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch: IOException -> 0x0040
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.disconnect()
        L_0x0045:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C5037v.m30951e(com.facebook.imagepipeline.producers.v$c, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    /* renamed from: f */
    public Map<String, String> getExtraMap(C5040c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f8645g - cVar.f8644f));
        hashMap.put("fetch_time", Long.toString(cVar.f8646h - cVar.f8645g));
        hashMap.put("total_time", Long.toString(cVar.f8646h - cVar.f8644f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* renamed from: i */
    public void onFetchCompletion(C5040c cVar, int i) {
        cVar.f8646h = this.f8637e.now();
    }

    C5037v(String str, Map<String, String> map, AbstractC6395b bVar) {
        this.f8636d = Executors.newFixedThreadPool(3);
        this.f8637e = bVar;
        this.f8635c = map;
        this.f8634b = str;
    }
}
