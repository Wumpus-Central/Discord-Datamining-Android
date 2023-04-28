package p145i0;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.core.impl.utils.C1842f;
import androidx.camera.video.internal.encoder.AbstractC1980a;
import androidx.camera.video.internal.encoder.AbstractC1994b1;
import androidx.camera.video.internal.encoder.AbstractC1999c1;
import androidx.camera.video.internal.encoder.AbstractC2003e;
import androidx.camera.video.internal.encoder.AbstractC2009h;
import androidx.camera.video.internal.encoder.AbstractC2011i;
import androidx.camera.video.internal.encoder.AbstractC2013j;
import androidx.camera.video.internal.encoder.AbstractC2018l;
import androidx.camera.video.internal.encoder.C1981a0;
import androidx.camera.video.internal.encoder.C1990a1;
import androidx.camera.video.internal.encoder.C2001d;
import androidx.camera.video.internal.encoder.C2016k;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.AbstractC2519i;
import androidx.core.util.C2517g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p145i0.AbstractC8139h1;
import p145i0.AbstractC8143i1;
import p145i0.AbstractC8151j1;
import p145i0.AbstractC8183q;
import p145i0.AbstractC8205z0;
import p145i0.C8166o0;
import p186k0.C9699f;
import p186k0.C9708h;
import p186k0.C9715l;
import p204l0.C10306d;
import p221m0.C10459c;
import p221m0.C10460d;
import p221m0.C10462f;
import p236n0.AbstractC10684h;
import p236n0.C10677c;
import p236n0.C10678d;
import p236n0.C10679e;
import p236n0.C10680f;
import p236n0.C10687j;
import p236n0.C10688k;
import p252o0.C11166a;
import p390w.AbstractC13568a2;
import p390w.AbstractC13609j;
import p390w.AbstractC13647o2;
import p390w.C13701y1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* renamed from: i0.o0 */
/* loaded from: classes.dex */
public final class C8166o0 implements AbstractC8139h1 {

    /* renamed from: R */
    public static final C8198w f38546R;

    /* renamed from: S */
    private static final AbstractC8151j1 f38547S;

    /* renamed from: T */
    private static final AbstractC8183q f38548T;

    /* renamed from: a */
    private final C13701y1<AbstractC8205z0> f17644a;

    /* renamed from: b */
    private final Executor f17645b;

    /* renamed from: c */
    private final Executor f17646c;

    /* renamed from: d */
    final Executor f17647d;

    /* renamed from: k */
    private Throwable f17654k;

    /* renamed from: o */
    private boolean f17658o;

    /* renamed from: x */
    final C13701y1<AbstractC8183q> f17667x;

    /* renamed from: P */
    private static final Set<EnumC8177j> f38544P = Collections.unmodifiableSet(EnumSet.of(EnumC8177j.PENDING_RECORDING, EnumC8177j.PENDING_PAUSED));

    /* renamed from: Q */
    private static final Set<EnumC8177j> f38545Q = Collections.unmodifiableSet(EnumSet.of(EnumC8177j.INITIALIZING, EnumC8177j.IDLING, EnumC8177j.RESETTING, EnumC8177j.STOPPING));

    /* renamed from: U */
    private static final Exception f38549U = new RuntimeException("The video frame producer became inactive before any data was received.");

    /* renamed from: e */
    private final Object f17648e = new Object();

    /* renamed from: f */
    private EnumC8177j f17649f = EnumC8177j.INITIALIZING;

    /* renamed from: g */
    private EnumC8177j f17650g = null;

    /* renamed from: h */
    AbstractC8175i f17651h = null;

    /* renamed from: i */
    AbstractC8175i f17652i = null;

    /* renamed from: j */
    private AbstractC8139h1.EnumC8140a f17653j = AbstractC8139h1.EnumC8140a.INACTIVE;

    /* renamed from: l */
    private long f17655l = 0;

    /* renamed from: m */
    private C2114c.C2115a<Void> f17656m = null;

    /* renamed from: n */
    private AbstractC8175i f17657n = null;

    /* renamed from: p */
    boolean f17659p = false;

    /* renamed from: q */
    private C1936v2.AbstractC1943g f17660q = null;

    /* renamed from: r */
    private AbstractC13609j f17661r = null;

    /* renamed from: s */
    final List<AbstractFutureC7576b<Void>> f17662s = new ArrayList();

    /* renamed from: t */
    Integer f17663t = null;

    /* renamed from: u */
    Integer f17664u = null;

    /* renamed from: v */
    Surface f17665v = null;

    /* renamed from: w */
    MediaMuxer f17666w = null;

    /* renamed from: y */
    C9699f f17668y = null;

    /* renamed from: z */
    C1981a0 f17669z = null;

    /* renamed from: A */
    AbstractC1994b1 f38550A = null;

    /* renamed from: B */
    C1981a0 f38551B = null;

    /* renamed from: C */
    AbstractC1994b1 f38552C = null;

    /* renamed from: D */
    EnumC8173g f38553D = EnumC8173g.INITIALIZING;

    /* renamed from: E */
    Uri f38554E = Uri.EMPTY;

    /* renamed from: F */
    long f38555F = 0;

    /* renamed from: G */
    long f38556G = 0;

    /* renamed from: H */
    long f38557H = 0;

    /* renamed from: I */
    long f38558I = 0;

    /* renamed from: J */
    int f38559J = 1;

    /* renamed from: K */
    Throwable f38560K = null;

    /* renamed from: L */
    AbstractC2003e f38561L = null;

    /* renamed from: M */
    AbstractC2003e f38562M = null;

    /* renamed from: N */
    Throwable f38563N = null;

    /* renamed from: O */
    boolean f38564O = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$a */
    /* loaded from: classes.dex */
    public class C8167a implements C9699f.AbstractC9704e {
        C8167a() {
        }

        @Override // p186k0.C9699f.AbstractC9704e
        /* renamed from: a */
        public void mo15555a(boolean z) {
            IllegalStateException illegalStateException;
            C8166o0 o0Var = C8166o0.this;
            if (o0Var.f38564O != z) {
                o0Var.f38564O = z;
                if (z) {
                    illegalStateException = new IllegalStateException("The audio source has been silenced.");
                } else {
                    illegalStateException = null;
                }
                o0Var.f38563N = illegalStateException;
                C8166o0.this.m20485E0();
                return;
            }
            C1915r1.m39517k("Recorder", "Audio source silenced transitions to the same state " + z);
        }

        @Override // p186k0.C9699f.AbstractC9704e
        public void onError(Throwable th2) {
            if (th2 instanceof C9708h) {
                C8166o0.this.m20425r0(EnumC8173g.DISABLED);
                C8166o0.this.m20485E0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$b */
    /* loaded from: classes.dex */
    public class C8168b implements AbstractC2018l {

        /* renamed from: b */
        final /* synthetic */ C2114c.C2115a f17671b;

        /* renamed from: c */
        final /* synthetic */ AbstractC8175i f17672c;

        C8168b(C2114c.C2115a aVar, AbstractC8175i iVar) {
            this.f17671b = aVar;
            this.f17672c = iVar;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: a */
        public void mo20408a(AbstractC1994b1 b1Var) {
            C8166o0.this.f38550A = b1Var;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: b */
        public void mo20407b() {
            this.f17671b.m38961c(null);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: c */
        public void mo20406c(AbstractC2003e eVar) {
            boolean z;
            C8166o0 o0Var = C8166o0.this;
            if (o0Var.f17666w != null) {
                try {
                    o0Var.m20479H0(eVar, this.f17672c);
                    if (eVar != null) {
                        eVar.close();
                    }
                } catch (Throwable th2) {
                    if (eVar != null) {
                        try {
                            eVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } else if (!o0Var.f17659p) {
                AbstractC2003e eVar2 = o0Var.f38561L;
                if (eVar2 != null) {
                    eVar2.close();
                    C8166o0.this.f38561L = null;
                    z = true;
                } else {
                    z = false;
                }
                if (eVar.mo39204G()) {
                    C8166o0 o0Var2 = C8166o0.this;
                    o0Var2.f38561L = eVar;
                    if (!o0Var2.m20486E() || C8166o0.this.f38562M != null) {
                        C1915r1.m39527a("Recorder", "Received video keyframe. Starting muxer...");
                        C8166o0.this.m20421t0(this.f17672c);
                    } else if (z) {
                        C1915r1.m39527a("Recorder", "Replaced cached video keyframe with newer keyframe.");
                    } else {
                        C1915r1.m39527a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                    }
                } else {
                    if (z) {
                        C1915r1.m39527a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    C1915r1.m39527a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    C8166o0.this.f17669z.m39322N();
                    eVar.close();
                }
            } else {
                C1915r1.m39527a("Recorder", "Drop video data since recording is stopping.");
                eVar.close();
            }
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: d */
        public /* synthetic */ void mo20405d() {
            C2016k.m39196a(this);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: e */
        public void mo20404e() {
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: f */
        public void mo20403f(C2001d dVar) {
            this.f17671b.m38958f(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$c */
    /* loaded from: classes.dex */
    public class C8169c implements AbstractC2018l {

        /* renamed from: b */
        final /* synthetic */ C2114c.C2115a f17674b;

        /* renamed from: c */
        final /* synthetic */ AbstractC8175i f17675c;

        C8169c(C2114c.C2115a aVar, AbstractC8175i iVar) {
            this.f17674b = aVar;
            this.f17675c = iVar;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: a */
        public void mo20408a(AbstractC1994b1 b1Var) {
            C8166o0.this.f38552C = b1Var;
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: b */
        public void mo20407b() {
            this.f17674b.m38961c(null);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: c */
        public void mo20406c(AbstractC2003e eVar) {
            boolean z;
            C8166o0 o0Var = C8166o0.this;
            if (o0Var.f38553D == EnumC8173g.DISABLED) {
                throw new AssertionError("Audio is not enabled but audio encoded data is produced.");
            } else if (o0Var.f17666w != null) {
                try {
                    o0Var.m20481G0(eVar, this.f17675c);
                    if (eVar != null) {
                        eVar.close();
                    }
                } catch (Throwable th2) {
                    if (eVar != null) {
                        try {
                            eVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } else if (!o0Var.f17659p) {
                AbstractC2003e eVar2 = o0Var.f38562M;
                if (eVar2 != null) {
                    eVar2.close();
                    C8166o0.this.f38562M = null;
                    z = true;
                } else {
                    z = false;
                }
                C8166o0 o0Var2 = C8166o0.this;
                o0Var2.f38562M = eVar;
                if (o0Var2.f38561L != null) {
                    C1915r1.m39527a("Recorder", "Received audio data. Starting muxer...");
                    C8166o0.this.m20421t0(this.f17675c);
                } else if (z) {
                    C1915r1.m39527a("Recorder", "Replaced cached audio data with newer data.");
                } else {
                    C1915r1.m39527a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                }
            } else {
                C1915r1.m39527a("Recorder", "Drop audio data since recording is stopping.");
                eVar.close();
            }
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: d */
        public /* synthetic */ void mo20405d() {
            C2016k.m39196a(this);
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: e */
        public void mo20404e() {
        }

        @Override // androidx.camera.video.internal.encoder.AbstractC2018l
        /* renamed from: f */
        public void mo20403f(C2001d dVar) {
            C8166o0.this.m20425r0(EnumC8173g.ERROR);
            C8166o0 o0Var = C8166o0.this;
            o0Var.f38563N = dVar;
            o0Var.m20485E0();
            this.f17674b.m38961c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$d */
    /* loaded from: classes.dex */
    public class C8170d implements AbstractC14182c<List<Void>> {
        C8170d() {
        }

        /* renamed from: b */
        public void mo1412a(List<Void> list) {
            C1915r1.m39527a("Recorder", "Encodings end successfully.");
            C8166o0 o0Var = C8166o0.this;
            o0Var.m20418v(o0Var.f38559J, o0Var.f38560K);
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1915r1.m39527a("Recorder", "Encodings end with error: " + th2);
            C8166o0.this.m20418v(6, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$e */
    /* loaded from: classes.dex */
    public class C8171e implements AbstractC14182c<Void> {
        C8171e() {
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
            C8166o0.this.f17669z.m39315U();
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C1915r1.m39526b("Recorder", "The source didn't become non-streaming with error.", th2);
            if (C10460d.m13127a(C10459c.class) != null) {
                C8166o0.this.f17669z.m39315U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$f */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C8172f {

        /* renamed from: a */
        static final /* synthetic */ int[] f17679a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17680b;

        static {
            int[] iArr = new int[EnumC8173g.values().length];
            f17680b = iArr;
            try {
                iArr[EnumC8173g.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17680b[EnumC8173g.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17680b[EnumC8173g.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17680b[EnumC8173g.IDLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17680b[EnumC8173g.INITIALIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC8177j.values().length];
            f17679a = iArr2;
            try {
                iArr2[EnumC8177j.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17679a[EnumC8177j.RESETTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17679a[EnumC8177j.PENDING_RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17679a[EnumC8177j.PENDING_PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17679a[EnumC8177j.INITIALIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17679a[EnumC8177j.IDLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17679a[EnumC8177j.RECORDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17679a[EnumC8177j.PAUSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17679a[EnumC8177j.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$g */
    /* loaded from: classes.dex */
    public enum EnumC8173g {
        INITIALIZING,
        IDLING,
        DISABLED,
        ACTIVE,
        ERROR
    }

    /* renamed from: i0.o0$h */
    /* loaded from: classes.dex */
    public static final class C8174h {

        /* renamed from: b */
        private Executor f17688b = null;

        /* renamed from: a */
        private final AbstractC8183q.AbstractC8184a f17687a = AbstractC8183q.m20364a();

        /* renamed from: b */
        public C8166o0 m20399b() {
            return new C8166o0(this.f17688b, this.f17687a.mo20355a());
        }

        /* renamed from: d */
        public C8174h m20397d(Executor executor) {
            C2517g.m37587h(executor, "The specified executor can't be null.");
            this.f17688b = executor;
            return this;
        }

        /* renamed from: e */
        public C8174h m20396e(final C8198w wVar) {
            C2517g.m37587h(wVar, "The specified quality selector can't be null.");
            this.f17687a.m20354b(new AbstractC2511b() { // from class: i0.p0
                @Override // androidx.core.util.AbstractC2511b
                public final void accept(Object obj) {
                    ((AbstractC8151j1.AbstractC8152a) obj).mo20500e(C8198w.this);
                }
            });
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8175i implements AutoCloseable {

        /* renamed from: k */
        private final C1842f f17689k = C1842f.m39686b();

        /* renamed from: l */
        private final AtomicBoolean f17690l = new AtomicBoolean(false);

        /* renamed from: m */
        private final AtomicReference<AbstractC8176a> f17691m = new AtomicReference<>(null);

        /* renamed from: n */
        private final AtomicReference<AbstractC2511b<Uri>> f17692n = new AtomicReference<>(new AbstractC2511b() { // from class: i0.v0
            @Override // androidx.core.util.AbstractC2511b
            public final void accept(Object obj) {
                C8166o0.AbstractC8175i.m20373w0((Uri) obj);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i0.o0$i$a */
        /* loaded from: classes.dex */
        public interface AbstractC8176a {
            /* renamed from: a */
            MediaMuxer mo20349a(int i, AbstractC2511b<Uri> bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U */
        public static /* synthetic */ MediaMuxer m20388U(AbstractC8188s sVar, ParcelFileDescriptor parcelFileDescriptor, int i, AbstractC2511b bVar) {
            MediaMuxer mediaMuxer;
            MediaMuxer mediaMuxer2;
            Uri uri = Uri.EMPTY;
            if (sVar instanceof C8178p) {
                File b = ((C8178p) sVar).m20370b();
                if (!C11166a.m10622a(b)) {
                    C1915r1.m39517k("Recorder", "Failed to create folder for " + b.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(b.getAbsolutePath(), i);
                uri = Uri.fromFile(b);
            } else if (sVar instanceof C8165o) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaMuxer = C10306d.m13653a(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (sVar instanceof C8186r) {
                C8186r rVar = (C8186r) sVar;
                ContentValues contentValues = new ContentValues(rVar.m20346d());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                Uri insert = rVar.m20347c().insert(rVar.m20348b(), contentValues);
                if (insert != null) {
                    if (i2 < 26) {
                        String b2 = C11166a.m10621b(rVar.m20347c(), insert, "_data");
                        if (b2 != null) {
                            if (!C11166a.m10622a(new File(b2))) {
                                C1915r1.m39517k("Recorder", "Failed to create folder for " + b2);
                            }
                            mediaMuxer2 = new MediaMuxer(b2, i);
                        } else {
                            throw new IOException("Unable to get path from uri " + insert);
                        }
                    } else {
                        ParcelFileDescriptor openFileDescriptor = rVar.m20347c().openFileDescriptor(insert, "rw");
                        mediaMuxer2 = C10306d.m13653a(openFileDescriptor.getFileDescriptor(), i);
                        openFileDescriptor.close();
                    }
                    uri = insert;
                    mediaMuxer = mediaMuxer2;
                } else {
                    throw new IOException("Unable to create MediaStore entry.");
                }
            } else {
                throw new AssertionError("Invalid output options type: " + sVar.getClass().getSimpleName());
            }
            bVar.accept(uri);
            return mediaMuxer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public static /* synthetic */ void m20387Y(C8186r rVar, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", (Integer) 0);
                rVar.m20347c().update(uri, contentValues, null, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public static /* synthetic */ void m20385b0(String str, Uri uri) {
            if (uri == null) {
                C1915r1.m39525c("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                C1915r1.m39527a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public static /* synthetic */ void m20384f0(C8186r rVar, Context context, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                String b = C11166a.m10621b(rVar.m20347c(), uri, "_data");
                if (b != null) {
                    MediaScannerConnection.scanFile(context, new String[]{b}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: i0.w0
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str, Uri uri2) {
                            C8166o0.AbstractC8175i.m20385b0(str, uri2);
                        }
                    });
                    return;
                }
                C1915r1.m39527a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public static /* synthetic */ void m20380j0(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                C1915r1.m39524d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        /* renamed from: s */
        private void m20375s(AbstractC2511b<Uri> bVar, Uri uri) {
            if (bVar != null) {
                this.f17689k.m39687a();
                bVar.accept(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }

        /* renamed from: t */
        static AbstractC8175i m20374t(C8192u uVar, long j) {
            return new C8149j(uVar.m20339d(), uVar.m20340c(), uVar.m20341b(), uVar.m20337f(), j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0 */
        public static /* synthetic */ void m20373w0(Uri uri) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z0 */
        public /* synthetic */ void m20371z0(AbstractC8143i1 i1Var) {
            mo20395C().accept(i1Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C */
        public abstract AbstractC2511b<AbstractC8143i1> mo20395C();

        /* renamed from: F0 */
        MediaMuxer m20394F0(int i, AbstractC2511b<Uri> bVar) {
            if (this.f17690l.get()) {
                AbstractC8176a andSet = this.f17691m.getAndSet(null);
                if (andSet != null) {
                    return andSet.mo20349a(i, bVar);
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }

        /* renamed from: G0 */
        void m20393G0(final AbstractC8143i1 i1Var) {
            boolean equals = Objects.equals(i1Var.m20520c(), mo20392H());
            C2517g.m37585j(equals, "Attempted to update event listener with event from incorrect recording [Recording: " + i1Var.m20520c() + ", Expected: " + mo20392H() + "]");
            if (mo20372z() != null && mo20395C() != null) {
                try {
                    C1915r1.m39527a("Recorder", "Sent VideoRecordEvent " + i1Var.getClass());
                    mo20372z().execute(new Runnable() { // from class: i0.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8166o0.AbstractC8175i.this.m20371z0(i1Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C1915r1.m39524d("Recorder", "The callback executor is invalid.", e);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H */
        public abstract AbstractC8188s mo20392H();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q */
        public abstract long mo20391Q();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: R */
        public abstract boolean mo20390R();

        /* renamed from: S */
        void m20389S(final Context context) {
            final ParcelFileDescriptor parcelFileDescriptor;
            if (!this.f17690l.getAndSet(true)) {
                final AbstractC8188s H = mo20392H();
                boolean z = H instanceof C8165o;
                AbstractC2511b<Uri> bVar = null;
                if (z) {
                    parcelFileDescriptor = ((C8165o) H).m20495b().dup();
                } else {
                    parcelFileDescriptor = null;
                }
                this.f17689k.m39685c("finalizeRecording");
                this.f17691m.set(new AbstractC8176a() { // from class: i0.q0
                    @Override // p145i0.C8166o0.AbstractC8175i.AbstractC8176a
                    /* renamed from: a */
                    public final MediaMuxer mo20349a(int i, AbstractC2511b bVar2) {
                        MediaMuxer U;
                        U = C8166o0.AbstractC8175i.m20388U(AbstractC8188s.this, parcelFileDescriptor, i, bVar2);
                        return U;
                    }
                });
                if (H instanceof C8186r) {
                    final C8186r rVar = (C8186r) H;
                    if (Build.VERSION.SDK_INT >= 29) {
                        bVar = new AbstractC2511b() { // from class: i0.r0
                            @Override // androidx.core.util.AbstractC2511b
                            public final void accept(Object obj) {
                                C8166o0.AbstractC8175i.m20387Y(C8186r.this, (Uri) obj);
                            }
                        };
                    } else {
                        bVar = new AbstractC2511b() { // from class: i0.s0
                            @Override // androidx.core.util.AbstractC2511b
                            public final void accept(Object obj) {
                                C8166o0.AbstractC8175i.m20384f0(C8186r.this, context, (Uri) obj);
                            }
                        };
                    }
                } else if (z) {
                    bVar = new AbstractC2511b() { // from class: i0.t0
                        @Override // androidx.core.util.AbstractC2511b
                        public final void accept(Object obj) {
                            C8166o0.AbstractC8175i.m20380j0(parcelFileDescriptor, (Uri) obj);
                        }
                    };
                }
                if (bVar != null) {
                    this.f17692n.set(bVar);
                    return;
                }
                return;
            }
            throw new AssertionError("Recording " + this + " has already been initialized");
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            m20376r(Uri.EMPTY);
        }

        protected void finalize() {
            try {
                this.f17689k.m39684d();
                AbstractC2511b<Uri> andSet = this.f17692n.getAndSet(null);
                if (andSet != null) {
                    m20375s(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: r */
        void m20376r(Uri uri) {
            if (this.f17690l.get()) {
                m20375s(this.f17692n.getAndSet(null), uri);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public abstract Executor mo20372z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.o0$j */
    /* loaded from: classes.dex */
    public enum EnumC8177j {
        INITIALIZING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C8194v vVar = C8194v.f17723c;
        C8198w f = C8198w.m20324f(Arrays.asList(vVar, C8194v.f17722b, C8194v.f17721a), C8161n.m20499a(vVar));
        f38546R = f;
        AbstractC8151j1 a = AbstractC8151j1.m20510a().mo20500e(f).mo20503b(1).mo20504a();
        f38547S = a;
        f38548T = AbstractC8183q.m20364a().mo20351e(-1).mo20350f(a).mo20355a();
    }

    C8166o0(Executor executor, AbstractC8183q qVar) {
        this.f17645b = executor;
        executor = executor == null ? C13905a.m2337c() : executor;
        this.f17646c = executor;
        this.f17647d = C13905a.m2333g(executor);
        this.f17667x = C13701y1.m2995i(m20420u(qVar));
        this.f17644a = C13701y1.m2995i(AbstractC8205z0.m20307c(m20414x(), m20488D(this.f17649f)));
    }

    /* renamed from: A */
    private void m20494A(final AbstractC8175i iVar) {
        this.f17662s.add(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: i0.h0
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object J;
                J = C8166o0.this.m20477J(iVar, aVar);
                return J;
            }
        }));
        if (m20486E()) {
            this.f17662s.add(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: i0.i0
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object I;
                    I = C8166o0.this.m20478I(iVar, aVar);
                    return I;
                }
            }));
        }
        C14186f.m1427b(C14186f.m1426c(this.f17662s), new C8170d(), C13905a.m2339a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m20474M(C1936v2 v2Var) {
        Surface surface = this.f17665v;
        if (surface != null) {
            v2Var.m39460v(surface, this.f17647d, new C8109b0(this));
            m20459a0();
            return;
        }
        v2Var.m39459w(this.f17647d, new C1936v2.AbstractC1944h() { // from class: i0.c0
            @Override // androidx.camera.core.C1936v2.AbstractC1944h
            /* renamed from: a */
            public final void mo20571a(C1936v2.AbstractC1943g gVar) {
                C8166o0.this.m20476K(gVar);
            }
        });
        Size l = v2Var.m39470l();
        C8107a1 c = C8107a1.m20587c(v2Var.m39472j().mo330a());
        C8194v b = c.m20588b(l);
        C1915r1.m39527a("Recorder", "Using supported quality of " + b + " for surface size " + l);
        if (b != C8194v.f17727g) {
            AbstractC13609j d = c.m20586d(b);
            this.f17661r = d;
            if (d == null) {
                throw new AssertionError("Camera advertised available quality but did not produce CamcorderProfile for advertised quality.");
            }
        }
        m20415w0(v2Var);
    }

    /* renamed from: C */
    private int m20490C(EnumC8173g gVar) {
        int i = C8172f.f17680b[gVar.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i == 3 || i == 5) {
                return 1;
            }
            throw new AssertionError("Invalid internal audio state: " + gVar);
        } else if (this.f38564O) {
            return 2;
        } else {
            return 0;
        }
    }

    /* renamed from: C0 */
    private static int m20489C0(AbstractC13609j jVar, int i) {
        if (jVar != null) {
            int h = jVar.mo3240h();
            if (h != 1) {
                if (h == 2) {
                    return 0;
                }
                if (h == 9) {
                    return 1;
                }
            } else if (Build.VERSION.SDK_INT < 26) {
                return 0;
            } else {
                return 2;
            }
        }
        return i;
    }

    /* renamed from: D */
    private AbstractC8205z0.EnumC8206a m20488D(EnumC8177j jVar) {
        C10459c cVar = (C10459c) C10460d.m13127a(C10459c.class);
        if (jVar == EnumC8177j.RECORDING || (jVar == EnumC8177j.STOPPING && cVar == null)) {
            return AbstractC8205z0.EnumC8206a.ACTIVE;
        }
        return AbstractC8205z0.EnumC8206a.INACTIVE;
    }

    /* renamed from: F0 */
    private void m20483F0(EnumC8177j jVar) {
        if (!f38544P.contains(this.f17649f)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f17649f);
        } else if (!f38545Q.contains(jVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + jVar);
        } else if (this.f17650g != jVar) {
            this.f17650g = jVar;
            this.f17644a.m2996h(AbstractC8205z0.m20307c(m20414x(), m20488D(jVar)));
        }
    }

    /* renamed from: G */
    private static boolean m20482G(C8201x0 x0Var, AbstractC8175i iVar) {
        return iVar != null && x0Var.m20317i() == iVar.mo20391Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ void m20480H(AbstractC8151j1.AbstractC8152a aVar) {
        aVar.mo20503b(f38547S.mo20509b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ Object m20478I(AbstractC8175i iVar, C2114c.C2115a aVar) {
        this.f38551B.m39319Q(new C8169c(aVar, iVar), this.f17647d);
        return "audioEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ Object m20477J(AbstractC8175i iVar, C2114c.C2115a aVar) {
        this.f17669z.m39319Q(new C8168b(aVar, iVar), this.f17647d);
        return "videoEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m20476K(C1936v2.AbstractC1943g gVar) {
        this.f17660q = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m20475L(AbstractC8175i iVar) {
        m20491B0(iVar, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m20471P(Uri uri) {
        this.f38554E = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m20470Q(C1936v2 v2Var, Surface surface) {
        C1915r1.m39527a("Recorder", "Encoder surface updated: " + surface.hashCode() + ", Current surface: " + m20414x());
        synchronized (this.f17648e) {
            switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    m20462Y(surface, v2Var);
                    break;
                case 7:
                case 8:
                    throw new AssertionError("Unexpected state on update of encoder surface " + this.f17649f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m20469R(AbstractC8175i iVar) {
        m20491B0(iVar, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ Object m20468S(AtomicReference atomicReference, C2114c.C2115a aVar) {
        synchronized (this.f17648e) {
            atomicReference.set(aVar);
            this.f17656m = aVar;
        }
        return "sourceInactive";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m20467T(C2114c.C2115a aVar) {
        aVar.m38958f(new TimeoutException("The source didn't become non-streaming."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m20466U(final C2114c.C2115a aVar) {
        this.f17647d.execute(new Runnable() { // from class: i0.a0
            @Override // java.lang.Runnable
            public final void run() {
                C8166o0.m20467T(C2114c.C2115a.this);
            }
        });
    }

    /* renamed from: W */
    private AbstractC8175i m20464W(EnumC8177j jVar) {
        boolean z;
        if (jVar == EnumC8177j.PENDING_PAUSED) {
            z = true;
        } else if (jVar == EnumC8177j.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.f17651h == null) {
            AbstractC8175i iVar = this.f17652i;
            if (iVar != null) {
                this.f17651h = iVar;
                this.f17652i = null;
                if (z) {
                    m20423s0(EnumC8177j.PAUSED);
                } else {
                    m20423s0(EnumC8177j.RECORDING);
                }
                return iVar;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    /* renamed from: X */
    private void m20463X(Throwable th2) {
        AbstractC8175i iVar;
        synchronized (this.f17648e) {
            iVar = null;
            switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                case 1:
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f17649f + ": " + th2);
                case 3:
                case 4:
                    AbstractC8175i iVar2 = this.f17652i;
                    this.f17652i = null;
                    iVar = iVar2;
                case 5:
                    m20423s0(EnumC8177j.ERROR);
                    this.f17654k = th2;
                    break;
            }
        }
        if (iVar != null) {
            m20416w(iVar, 7, th2);
        }
    }

    /* renamed from: Y */
    private void m20462Y(Surface surface, C1936v2 v2Var) {
        Surface surface2 = this.f17665v;
        if (surface2 != surface) {
            this.f17665v = surface;
            if (surface2 == null) {
                v2Var.m39460v(surface, this.f17647d, new C8109b0(this));
                m20459a0();
                return;
            }
            synchronized (this.f17648e) {
                this.f17644a.m2996h(AbstractC8205z0.m20307c(m20414x(), m20488D(this.f17649f)));
            }
            return;
        }
        C1915r1.m39527a("Recorder", "Video encoder provides the same surface.");
    }

    /* renamed from: a0 */
    private void m20459a0() {
        boolean z;
        AbstractC8175i iVar;
        synchronized (this.f17648e) {
            z = false;
            switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                case 1:
                    if (this.f17658o) {
                        this.f17658o = false;
                        iVar = null;
                        break;
                    } else {
                        throw new AssertionError("Unexpectedly invoke onInitialized() in a STOPPING state when it's not waiting for a new surface.");
                    }
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Incorrectly invoke onInitialized() in state " + this.f17649f);
                case 4:
                    z = true;
                case 3:
                    iVar = m20464W(this.f17649f);
                    break;
                case 5:
                    m20423s0(EnumC8177j.IDLING);
                    iVar = null;
                    break;
                case 9:
                    C1915r1.m39525c("Recorder", "onInitialized() was invoked when the Recorder had encountered error " + this.f17654k);
                    iVar = null;
                    break;
                default:
                    iVar = null;
                    break;
            }
        }
        if (iVar != null) {
            m20409z0(iVar, z);
        }
    }

    /* renamed from: b0 */
    private void m20457b0(AbstractC8175i iVar) {
        AbstractC8175i iVar2;
        boolean z;
        boolean z2;
        synchronized (this.f17648e) {
            if (this.f17651h == iVar) {
                iVar2 = null;
                this.f17651h = null;
                z = true;
                z2 = false;
                switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                    case 1:
                    case 7:
                    case 8:
                        if (this.f17658o) {
                            m20423s0(EnumC8177j.INITIALIZING);
                        } else {
                            m20423s0(EnumC8177j.IDLING);
                        }
                        z = false;
                        break;
                    case 2:
                        m20423s0(EnumC8177j.INITIALIZING);
                        break;
                    case 3:
                        z = false;
                    case 4:
                        if (this.f17658o) {
                            C1915r1.m39527a("Recorder", "Waiting for a new surface to start the pending recording.");
                        } else {
                            iVar2 = m20464W(this.f17649f);
                        }
                        z2 = z;
                        z = false;
                        break;
                    case 5:
                    case 6:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f17649f);
                    default:
                        z = false;
                        break;
                }
            } else {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
        }
        if (z) {
            m20443i0();
        } else if (iVar2 == null) {
        } else {
            if (!this.f17658o) {
                m20409z0(iVar2, z2);
                return;
            }
            throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20455c0(C1936v2.AbstractC1942f fVar) {
        C1915r1.m39527a("Recorder", "Surface closed: " + fVar.mo39452b().hashCode() + ", Current surface: " + m20414x());
        Surface b = fVar.mo39452b();
        if (this.f17665v != b) {
            b.release();
            return;
        }
        m20445h0();
        this.f17665v = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m20473N(AbstractC8175i iVar) {
        if (this.f17657n == iVar && !this.f17659p) {
            if (m20486E()) {
                this.f38551B.m39325K();
            }
            this.f17669z.m39325K();
            AbstractC8175i iVar2 = this.f17657n;
            iVar2.m20393G0(AbstractC8143i1.m20518e(iVar2.mo20392H(), m20412y()));
        }
    }

    /* renamed from: g0 */
    private C8192u m20447g0(Context context, AbstractC8188s sVar) {
        C2517g.m37587h(sVar, "The OutputOptions cannot be null.");
        return new C8192u(context, this, sVar);
    }

    /* renamed from: i0 */
    private void m20443i0() {
        C1981a0 a0Var = this.f38551B;
        if (a0Var != null) {
            a0Var.m39324L();
            this.f38551B = null;
            this.f38552C = null;
        }
        C1981a0 a0Var2 = this.f17669z;
        if (a0Var2 != null) {
            a0Var2.m39324L();
            this.f17669z = null;
            this.f38550A = null;
        }
        C9699f fVar = this.f17668y;
        if (fVar != null) {
            fVar.m15569p();
            this.f17668y = null;
        }
        m20425r0(EnumC8173g.INITIALIZING);
    }

    /* renamed from: j0 */
    private static AbstractC1980a m20441j0(AbstractC10684h hVar, C9699f.AbstractC9705g gVar, AbstractC8105a aVar) {
        AbstractC2519i iVar;
        if (hVar.mo12646b() != null) {
            iVar = new C10677c(hVar.mo12645c(), hVar.mo12644d(), aVar, gVar, hVar.mo12646b());
        } else {
            iVar = new C10678d(hVar.mo12645c(), hVar.mo12644d(), aVar, gVar);
        }
        return (AbstractC1980a) iVar.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p236n0.AbstractC10684h m20439k0(p145i0.AbstractC8183q r10) {
        /*
            r9 = this;
            int r0 = r10.mo20362c()
            java.lang.String r0 = p145i0.AbstractC8183q.m20360e(r0)
            int r1 = r10.mo20362c()
            int r1 = p145i0.AbstractC8183q.m20359f(r1)
            w.j r2 = r9.f17661r
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r2.m3243e()
            w.j r3 = r9.f17661r
            int r3 = r3.m3238j()
            java.lang.String r4 = ")]"
            java.lang.String r5 = "Recorder"
            java.lang.String r6 = "(profile: "
            if (r2 != 0) goto L_0x0045
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "CamcorderProfile contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r10.append(r2)
            r10.append(r0)
            r10.append(r6)
            r10.append(r1)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C1915r1.m39527a(r5, r10)
            goto L_0x00be
        L_0x0045:
            int r10 = r10.mo20362c()
            r7 = -1
            r8 = 1
            if (r10 != r7) goto L_0x006d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive AUDIO settings [mime type: "
            r10.append(r0)
            r10.append(r2)
            r10.append(r6)
            r10.append(r3)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C1915r1.m39527a(r5, r10)
        L_0x006a:
            r0 = r2
            r1 = r3
            goto L_0x00bf
        L_0x006d:
            boolean r10 = java.util.Objects.equals(r0, r2)
            if (r10 == 0) goto L_0x0093
            if (r1 != r3) goto L_0x0093
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches CamcorderProfile. Using CamcorderProfile to derive AUDIO settings [mime type: "
            r10.append(r0)
            r10.append(r2)
            r10.append(r6)
            r10.append(r3)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C1915r1.m39527a(r5, r10)
            goto L_0x006a
        L_0x0093:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = "MediaSpec audio mime or profile does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive AUDIO settings [CamcorderProfile mime type: "
            r10.append(r7)
            r10.append(r2)
            r10.append(r6)
            r10.append(r3)
            java.lang.String r2 = "), chosen mime type: "
            r10.append(r2)
            r10.append(r0)
            r10.append(r6)
            r10.append(r1)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.C1915r1.m39527a(r5, r10)
        L_0x00be:
            r8 = 0
        L_0x00bf:
            n0.h$a r10 = p236n0.AbstractC10684h.m12647a(r0)
            n0.h$a r10 = r10.mo12641c(r1)
            if (r8 == 0) goto L_0x00ce
            w.j r0 = r9.f17661r
            r10.mo12642b(r0)
        L_0x00ce:
            n0.h r10 = r10.mo12643a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p145i0.C8166o0.m20439k0(i0.q):n0.h");
    }

    /* renamed from: l0 */
    private static C9699f.AbstractC9705g m20437l0(AbstractC10684h hVar, AbstractC8105a aVar) {
        AbstractC2519i iVar;
        if (hVar.mo12646b() != null) {
            iVar = new C10679e(aVar, hVar.mo12646b());
        } else {
            iVar = new C10680f(aVar);
        }
        return (C9699f.AbstractC9705g) iVar.get();
    }

    /* renamed from: m0 */
    private static AbstractC1999c1 m20435m0(AbstractC10684h hVar, AbstractC8151j1 j1Var, Size size) {
        AbstractC2519i iVar;
        if (hVar.mo12646b() != null) {
            iVar = new C10687j(hVar.mo12645c(), j1Var, size, hVar.mo12646b());
        } else {
            iVar = new C10688k(hVar.mo12645c(), j1Var, size);
        }
        return (AbstractC1999c1) iVar.get();
    }

    /* renamed from: n0 */
    private AbstractC10684h m20433n0(AbstractC8183q qVar) {
        String h = AbstractC8183q.m20357h(qVar.mo20362c());
        AbstractC13609j jVar = this.f17661r;
        boolean z = false;
        if (jVar != null) {
            String m = jVar.m3235m();
            if (m == null) {
                C1915r1.m39527a("Recorder", "CamcorderProfile contains undefined VIDEO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + h + "]");
            } else {
                if (qVar.mo20362c() == -1) {
                    C1915r1.m39527a("Recorder", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + m + "]");
                } else if (Objects.equals(h, m)) {
                    C1915r1.m39527a("Recorder", "MediaSpec video mime matches CamcorderProfile. Using CamcorderProfile to derive VIDEO settings [mime type: " + m + "]");
                } else {
                    C1915r1.m39527a("Recorder", "MediaSpec video mime does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive VIDEO settings [CamcorderProfile mime type: " + m + ", chosen mime type: " + h + "]");
                }
                h = m;
                z = true;
            }
        } else {
            C1915r1.m39527a("Recorder", "No CamcorderProfile present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h + "]");
        }
        AbstractC10684h.AbstractC10685a a = AbstractC10684h.m12647a(h);
        if (z) {
            a.mo12642b(this.f17661r);
        }
        return a.mo12643a();
    }

    /* renamed from: o0 */
    private void m20431o0() {
        if (f38544P.contains(this.f17649f)) {
            m20423s0(this.f17650g);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f17649f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public void m20472O(AbstractC8175i iVar) {
        if (this.f17657n == iVar && !this.f17659p) {
            if (m20486E()) {
                this.f38551B.m39314V();
            }
            this.f17669z.m39314V();
            AbstractC8175i iVar2 = this.f17657n;
            iVar2.m20393G0(AbstractC8143i1.m20517f(iVar2.mo20392H(), m20412y()));
        }
    }

    /* renamed from: u */
    private AbstractC8183q m20420u(AbstractC8183q qVar) {
        AbstractC8183q.AbstractC8184a i = qVar.mo20356i();
        if (qVar.mo20361d().mo20509b() == -1) {
            i.m20354b(new AbstractC2511b() { // from class: i0.n0
                @Override // androidx.core.util.AbstractC2511b
                public final void accept(Object obj) {
                    C8166o0.m20480H((AbstractC8151j1.AbstractC8152a) obj);
                }
            });
        }
        return i.mo20355a();
    }

    /* renamed from: u0 */
    private void m20419u0() {
        AbstractC8183q qVar = (AbstractC8183q) m20410z(this.f17667x);
        AbstractC10684h k0 = m20439k0(qVar);
        C9699f.AbstractC9705g l0 = m20437l0(k0, qVar.mo20363b());
        try {
            this.f17668y = m20417v0(l0);
            try {
                C1981a0 a0Var = new C1981a0(this.f17646c, m20441j0(k0, l0, qVar.mo20363b()));
                this.f38551B = a0Var;
                AbstractC2011i p = a0Var.m39295p();
                if (p instanceof AbstractC2009h) {
                    this.f17668y.m15565t((AbstractC2009h) p);
                    return;
                }
                throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
            } catch (C1990a1 e) {
                throw new C9715l(e);
            }
        } catch (C9708h e2) {
            throw new C9715l(e2);
        }
    }

    /* renamed from: v0 */
    private C9699f m20417v0(C9699f.AbstractC9705g gVar) {
        C9699f fVar = new C9699f(gVar, C13905a.m2337c());
        fVar.m15566s(this.f17647d, new C8167a());
        return fVar;
    }

    /* renamed from: w */
    private void m20416w(AbstractC8175i iVar, int i, Throwable th2) {
        iVar.m20376r(Uri.EMPTY);
        iVar.m20393G0(AbstractC8143i1.m20521b(iVar.mo20392H(), AbstractC8203y0.m20310d(0L, 0L, AbstractC8108b.m20583c(1, this.f38563N)), AbstractC8190t.m20343b(Uri.EMPTY), i, th2));
    }

    /* renamed from: w0 */
    private void m20415w0(final C1936v2 v2Var) {
        AbstractC8183q qVar = (AbstractC8183q) m20410z(this.f17667x);
        try {
            C1981a0 a0Var = new C1981a0(this.f17646c, m20435m0(m20433n0(qVar), qVar.mo20361d(), v2Var.m39470l()));
            this.f17669z = a0Var;
            AbstractC2011i p = a0Var.m39295p();
            if (p instanceof AbstractC2013j) {
                ((AbstractC2013j) p).mo39197a(this.f17647d, new AbstractC2013j.AbstractC2014a() { // from class: i0.e0
                    @Override // androidx.camera.video.internal.encoder.AbstractC2013j.AbstractC2014a
                    /* renamed from: a */
                    public final void mo20527a(Surface surface) {
                        C8166o0.this.m20470Q(v2Var, surface);
                    }
                });
                return;
            }
            throw new AssertionError("The EncoderInput of video isn't a SurfaceInput.");
        } catch (C1990a1 e) {
            v2Var.m39457y();
            C1915r1.m39524d("Recorder", "Unable to initialize video encoder.", e);
            m20463X(new C9715l(e));
        }
    }

    /* renamed from: x */
    private Integer m20414x() {
        Surface surface = this.f17665v;
        return Integer.valueOf(surface == null ? AbstractC8205z0.f17742a.intValue() : surface.hashCode());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: y0 */
    private void m20411y0(AbstractC8175i iVar) {
        EnumC8173g gVar;
        if (this.f17657n == null) {
            if (iVar.mo20392H().mo20345a() > 0) {
                this.f38558I = Math.round(iVar.mo20392H().mo20345a() * 0.95d);
                C1915r1.m39527a("Recorder", "File size limit in bytes: " + this.f38558I);
            } else {
                this.f38558I = 0L;
            }
            this.f17657n = iVar;
            int i = C8172f.f17680b[this.f38553D.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f38553D);
            }
            if (i == 4) {
                if (iVar.mo20390R()) {
                    gVar = EnumC8173g.ACTIVE;
                } else {
                    gVar = EnumC8173g.DISABLED;
                }
                m20425r0(gVar);
            } else if (i == 5 && iVar.mo20390R()) {
                if (m20484F()) {
                    try {
                        m20419u0();
                        m20425r0(EnumC8173g.ACTIVE);
                    } catch (C9715l e) {
                        C1915r1.m39524d("Recorder", "Unable to create audio resource with error: ", e);
                        m20425r0(EnumC8173g.ERROR);
                        this.f38563N = e;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            m20494A(iVar);
            if (m20486E()) {
                this.f17668y.m15563v();
                this.f38551B.m39314V();
            }
            this.f17669z.m39314V();
            AbstractC8175i iVar2 = this.f17657n;
            iVar2.m20393G0(AbstractC8143i1.m20516g(iVar2.mo20392H(), m20412y()));
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    /* renamed from: z0 */
    private void m20409z0(AbstractC8175i iVar, boolean z) {
        m20411y0(iVar);
        if (z) {
            m20473N(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void m20493A0(C8201x0 x0Var) {
        synchronized (this.f17648e) {
            if (m20482G(x0Var, this.f17652i) || m20482G(x0Var, this.f17651h)) {
                AbstractC8175i iVar = null;
                switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                    case 1:
                    case 2:
                        C2517g.m37586i(m20482G(x0Var, this.f17651h));
                        break;
                    case 3:
                    case 4:
                        C2517g.m37586i(m20482G(x0Var, this.f17652i));
                        AbstractC8175i iVar2 = this.f17652i;
                        this.f17652i = null;
                        m20431o0();
                        iVar = iVar2;
                        break;
                    case 5:
                    case 6:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 7:
                    case 8:
                        m20423s0(EnumC8177j.STOPPING);
                        final AbstractC8175i iVar3 = this.f17651h;
                        this.f17647d.execute(new Runnable() { // from class: i0.j0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8166o0.this.m20469R(iVar3);
                            }
                        });
                        break;
                }
                if (iVar != null) {
                    m20416w(iVar, 8, new RuntimeException("Recording was stopped before any data could be produced."));
                    return;
                }
                return;
            }
            C1915r1.m39527a("Recorder", "stop() called on a recording that is no longer active: " + x0Var.m20318h());
        }
    }

    /* renamed from: B0 */
    void m20491B0(AbstractC8175i iVar, int i, Throwable th2) {
        boolean z;
        AbstractFutureC7576b bVar;
        if (this.f17657n == iVar && !this.f17659p) {
            if (C10460d.m13127a(C10462f.class) != null) {
                z = true;
            } else {
                z = false;
            }
            this.f17658o = z;
            this.f17659p = true;
            this.f38559J = i;
            this.f38560K = th2;
            final C2114c.C2115a aVar = null;
            if (m20486E()) {
                AbstractC2003e eVar = this.f38562M;
                if (eVar != null) {
                    eVar.close();
                    this.f38562M = null;
                }
                this.f38551B.m39313W();
            }
            AbstractC2003e eVar2 = this.f38561L;
            if (eVar2 != null) {
                eVar2.close();
                this.f38561L = null;
            }
            synchronized (this.f17648e) {
                if (this.f17653j == AbstractC8139h1.EnumC8140a.ACTIVE_STREAMING) {
                    final AtomicReference atomicReference = new AtomicReference();
                    bVar = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: i0.k0
                        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                        /* renamed from: a */
                        public final Object mo1403a(C2114c.C2115a aVar2) {
                            Object S;
                            S = C8166o0.this.m20468S(atomicReference, aVar2);
                            return S;
                        }
                    });
                    aVar = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference.get());
                } else {
                    bVar = C14186f.m1421h(null);
                }
            }
            if (aVar != null) {
                final ScheduledFuture<?> schedule = C13905a.m2336d().schedule(new Runnable() { // from class: i0.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8166o0.this.m20466U(aVar);
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
                bVar.mo1409a(new Runnable() { // from class: i0.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        schedule.cancel(true);
                    }
                }, this.f17647d);
            }
            this.f17669z.m39313W();
            C14186f.m1427b(bVar, new C8171e(), this.f17647d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void m20487D0() {
        boolean z;
        AbstractC8175i iVar;
        synchronized (this.f17648e) {
            int i = C8172f.f17679a[this.f17649f.ordinal()];
            z = false;
            iVar = null;
            if (i != 3) {
                if (i == 4) {
                    z = true;
                }
            }
            if (this.f17651h == null) {
                iVar = m20464W(this.f17649f);
            }
        }
        if (iVar != null) {
            m20409z0(iVar, z);
        }
    }

    /* renamed from: E */
    boolean m20486E() {
        return this.f38553D == EnumC8173g.ACTIVE;
    }

    /* renamed from: E0 */
    void m20485E0() {
        AbstractC8175i iVar = this.f17657n;
        if (iVar != null) {
            iVar.m20393G0(AbstractC8143i1.m20515h(iVar.mo20392H(), m20412y()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m20484F() {
        return ((AbstractC8183q) m20410z(this.f17667x)).mo20363b().mo20581c() != 0;
    }

    /* renamed from: G0 */
    void m20481G0(AbstractC2003e eVar, AbstractC8175i iVar) {
        long size = this.f38555F + eVar.size();
        long j = this.f38558I;
        if (j == 0 || size <= j) {
            this.f17666w.writeSampleData(this.f17663t.intValue(), eVar.mo39202a(), eVar.mo39205D());
            this.f38555F = size;
            return;
        }
        C1915r1.m39527a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f38558I)));
        m20461Z(iVar, 2, null);
    }

    /* renamed from: H0 */
    void m20479H0(AbstractC2003e eVar, AbstractC8175i iVar) {
        if (this.f17664u != null) {
            long size = this.f38555F + eVar.size();
            long j = this.f38558I;
            if (j == 0 || size <= j) {
                this.f17666w.writeSampleData(this.f17664u.intValue(), eVar.mo39202a(), eVar.mo39205D());
                this.f38555F = size;
                if (this.f38557H == 0) {
                    this.f38557H = eVar.mo39203W();
                }
                this.f38556G = TimeUnit.MICROSECONDS.toNanos(eVar.mo39203W() - this.f38557H);
                m20485E0();
                return;
            }
            C1915r1.m39527a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f38558I)));
            m20461Z(iVar, 2, null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:6:0x0007, B:7:0x0012, B:9:0x0016, B:10:0x001e, B:11:0x0036, B:12:0x0037, B:15:0x003c, B:16:0x0043, B:17:0x0044), top: B:26:0x0007 }] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m20461Z(p145i0.C8166o0.AbstractC8175i r4, int r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            i0.o0$i r0 = r3.f17657n
            if (r4 != r0) goto L_0x004e
            java.lang.Object r0 = r3.f17648e
            monitor-enter(r0)
            int[] r1 = p145i0.C8166o0.C8172f.f17679a     // Catch: all -> 0x004b
            i0.o0$j r2 = r3.f17649f     // Catch: all -> 0x004b
            int r2 = r2.ordinal()     // Catch: all -> 0x004b
            r1 = r1[r2]     // Catch: all -> 0x004b
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0037;
                case 2: goto L_0x0037;
                case 3: goto L_0x0037;
                case 4: goto L_0x0037;
                case 5: goto L_0x001e;
                case 6: goto L_0x001e;
                case 7: goto L_0x0016;
                case 8: goto L_0x0016;
                case 9: goto L_0x001e;
                default: goto L_0x0015;
            }     // Catch: all -> 0x004b
        L_0x0015:
            goto L_0x0044
        L_0x0016:
            i0.o0$j r1 = p145i0.C8166o0.EnumC8177j.STOPPING     // Catch: all -> 0x004b
            r3.m20423s0(r1)     // Catch: all -> 0x004b
            r1 = 1
            r2 = r1
            goto L_0x0037
        L_0x001e:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: all -> 0x004b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x004b
            r5.<init>()     // Catch: all -> 0x004b
            java.lang.String r6 = "In-progress recording error occurred while in unexpected state: "
            r5.append(r6)     // Catch: all -> 0x004b
            i0.o0$j r6 = r3.f17649f     // Catch: all -> 0x004b
            r5.append(r6)     // Catch: all -> 0x004b
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x004b
            r4.<init>(r5)     // Catch: all -> 0x004b
            throw r4     // Catch: all -> 0x004b
        L_0x0037:
            i0.o0$i r1 = r3.f17651h     // Catch: all -> 0x004b
            if (r4 != r1) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: all -> 0x004b
            java.lang.String r5 = "Internal error occurred for recording but it is not the active recording."
            r4.<init>(r5)     // Catch: all -> 0x004b
            throw r4     // Catch: all -> 0x004b
        L_0x0044:
            monitor-exit(r0)     // Catch: all -> 0x004b
            if (r2 == 0) goto L_0x004a
            r3.m20491B0(r4, r5, r6)
        L_0x004a:
            return
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x004b
            throw r4
        L_0x004e:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Internal error occurred on recording that is not the current in-progress recording."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145i0.C8166o0.m20461Z(i0.o0$i, int, java.lang.Throwable):void");
    }

    @Override // p145i0.AbstractC8139h1
    /* renamed from: a */
    public void mo20460a(final C1936v2 v2Var) {
        synchronized (this.f17648e) {
            C1915r1.m39527a("Recorder", "Surface is requested in state: " + this.f17649f + ", Current surface: " + m20414x());
            switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.f17647d.execute(new Runnable() { // from class: i0.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8166o0.this.m20474M(v2Var);
                        }
                    });
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Surface was requested when the Recorder had been initialized with state " + this.f17649f);
                case 9:
                    throw new IllegalStateException("Surface was requested when the Recorder had encountered error " + this.f17654k);
            }
        }
    }

    @Override // p145i0.AbstractC8139h1
    /* renamed from: b */
    public AbstractC13568a2<AbstractC8183q> mo20458b() {
        return this.f17667x;
    }

    @Override // p145i0.AbstractC8139h1
    /* renamed from: c */
    public AbstractC13568a2<AbstractC8205z0> mo20456c() {
        return this.f17644a;
    }

    @Override // p145i0.AbstractC8139h1
    /* renamed from: d */
    public void mo20454d(AbstractC8139h1.EnumC8140a aVar) {
        synchronized (this.f17648e) {
            AbstractC8139h1.EnumC8140a aVar2 = this.f17653j;
            this.f17653j = aVar;
            if (aVar2 != aVar) {
                C1915r1.m39527a("Recorder", "Video source has transitioned to state: " + aVar);
                AbstractC8175i iVar = null;
                if (aVar2 == AbstractC8139h1.EnumC8140a.ACTIVE_STREAMING) {
                    if (aVar == AbstractC8139h1.EnumC8140a.INACTIVE) {
                        int i = C8172f.f17679a[this.f17649f.ordinal()];
                        if (i == 1 || i == 2) {
                            synchronized (this.f17648e) {
                                C2114c.C2115a<Void> aVar3 = this.f17656m;
                                if (aVar3 != null) {
                                    aVar3.m38961c(null);
                                    this.f17656m = null;
                                }
                            }
                        } else if (i == 3 || i == 4) {
                            AbstractC8175i iVar2 = this.f17652i;
                            this.f17652i = null;
                            m20431o0();
                            iVar = iVar2;
                        } else if (i == 7 || i == 8) {
                            m20423s0(EnumC8177j.STOPPING);
                            final AbstractC8175i iVar3 = this.f17651h;
                            this.f17647d.execute(new Runnable() { // from class: i0.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8166o0.this.m20475L(iVar3);
                                }
                            });
                        }
                    } else if (aVar == AbstractC8139h1.EnumC8140a.ACTIVE_NON_STREAMING) {
                        synchronized (this.f17648e) {
                            C2114c.C2115a<Void> aVar4 = this.f17656m;
                            if (aVar4 != null) {
                                aVar4.m38961c(null);
                                this.f17656m = null;
                            }
                        }
                    }
                }
                if (iVar != null) {
                    m20416w(iVar, 4, f38549U);
                    return;
                }
                return;
            }
            C1915r1.m39527a("Recorder", "Video source transitions to the same state: " + aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m20453d0(C8201x0 x0Var) {
        synchronized (this.f17648e) {
            if (m20482G(x0Var, this.f17652i) || m20482G(x0Var, this.f17651h)) {
                int i = C8172f.f17679a[this.f17649f.ordinal()];
                if (i == 3) {
                    m20423s0(EnumC8177j.PENDING_PAUSED);
                } else if (i == 5 || i == 6) {
                    throw new IllegalStateException("Called pause() from invalid state: " + this.f17649f);
                } else if (i == 7) {
                    m20423s0(EnumC8177j.PAUSED);
                    final AbstractC8175i iVar = this.f17651h;
                    this.f17647d.execute(new Runnable() { // from class: i0.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8166o0.this.m20473N(iVar);
                        }
                    });
                }
                return;
            }
            C1915r1.m39527a("Recorder", "pause() called on a recording that is no longer active: " + x0Var.m20318h());
        }
    }

    /* renamed from: f0 */
    public C8192u m20449f0(Context context, C8178p pVar) {
        return m20447g0(context, pVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: h0 */
    void m20445h0() {
        boolean z;
        boolean z2;
        synchronized (this.f17648e) {
            z = true;
            switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                case 1:
                    m20423s0(EnumC8177j.RESETTING);
                    z2 = false;
                    z = false;
                    break;
                case 2:
                default:
                    z2 = false;
                    z = false;
                    break;
                case 3:
                case 4:
                    m20483F0(EnumC8177j.RESETTING);
                    z2 = false;
                    break;
                case 5:
                    z2 = false;
                    break;
                case 6:
                case 9:
                    m20423s0(EnumC8177j.INITIALIZING);
                    z2 = false;
                    break;
                case 7:
                case 8:
                    if (this.f17651h == this.f17657n) {
                        m20423s0(EnumC8177j.RESETTING);
                        z2 = true;
                        z = false;
                        break;
                    } else {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
            }
        }
        if (z) {
            m20443i0();
        } else if (z2) {
            m20491B0(this.f17657n, 0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void m20429p0(C8201x0 x0Var) {
        synchronized (this.f17648e) {
            if (m20482G(x0Var, this.f17652i) || m20482G(x0Var, this.f17651h)) {
                int i = C8172f.f17679a[this.f17649f.ordinal()];
                if (i == 4) {
                    m20423s0(EnumC8177j.PENDING_RECORDING);
                } else if (i == 5 || i == 6) {
                    throw new IllegalStateException("Called resume() from invalid state: " + this.f17649f);
                } else if (i == 8) {
                    m20423s0(EnumC8177j.RECORDING);
                    final AbstractC8175i iVar = this.f17651h;
                    this.f17647d.execute(new Runnable() { // from class: i0.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8166o0.this.m20472O(iVar);
                        }
                    });
                }
                return;
            }
            C1915r1.m39527a("Recorder", "resume() called on a recording that is no longer active: " + x0Var.m20318h());
        }
    }

    /* renamed from: r0 */
    void m20425r0(EnumC8173g gVar) {
        C1915r1.m39527a("Recorder", "Transitioning audio state: " + this.f38553D + " --> " + gVar);
        this.f38553D = gVar;
    }

    /* renamed from: s0 */
    void m20423s0(EnumC8177j jVar) {
        if (this.f17649f != jVar) {
            C1915r1.m39527a("Recorder", "Transitioning Recorder internal state: " + this.f17649f + " --> " + jVar);
            Set<EnumC8177j> set = f38544P;
            AbstractC8205z0.EnumC8206a aVar = null;
            if (set.contains(jVar)) {
                if (!set.contains(this.f17649f)) {
                    if (f38545Q.contains(this.f17649f)) {
                        EnumC8177j jVar2 = this.f17649f;
                        this.f17650g = jVar2;
                        aVar = m20488D(jVar2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f17649f);
                    }
                }
            } else if (this.f17650g != null) {
                this.f17650g = null;
            }
            this.f17649f = jVar;
            if (aVar == null) {
                aVar = m20488D(jVar);
            }
            this.f17644a.m2996h(AbstractC8205z0.m20307c(m20414x(), aVar));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + jVar + ", but Recorder is already in state " + jVar);
    }

    /* renamed from: t0 */
    void m20421t0(AbstractC8175i iVar) {
        int i;
        if (this.f17666w != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        } else if (!m20486E() || this.f38562M != null) {
            AbstractC2003e eVar = this.f38561L;
            if (eVar != null) {
                try {
                    AbstractC2003e eVar2 = this.f38562M;
                    this.f38561L = null;
                    this.f38562M = null;
                    long size = eVar.size();
                    if (eVar2 != null) {
                        size += eVar2.size();
                    }
                    long j = this.f38558I;
                    if (j == 0 || size <= j) {
                        try {
                            AbstractC8183q qVar = (AbstractC8183q) m20410z(this.f17667x);
                            if (qVar.mo20362c() == -1) {
                                i = m20489C0(this.f17661r, AbstractC8183q.m20358g(f38548T.mo20362c()));
                            } else {
                                i = AbstractC8183q.m20358g(qVar.mo20362c());
                            }
                            MediaMuxer F0 = iVar.m20394F0(i, new AbstractC2511b() { // from class: i0.d0
                                @Override // androidx.core.util.AbstractC2511b
                                public final void accept(Object obj) {
                                    C8166o0.this.m20471P((Uri) obj);
                                }
                            });
                            this.f17666w = F0;
                            C1936v2.AbstractC1943g gVar = this.f17660q;
                            if (gVar != null) {
                                F0.setOrientationHint(gVar.mo39449b());
                            }
                            this.f17664u = Integer.valueOf(this.f17666w.addTrack(this.f38550A.mo39194a()));
                            if (m20486E()) {
                                this.f17663t = Integer.valueOf(this.f17666w.addTrack(this.f38552C.mo39194a()));
                            }
                            this.f17666w.start();
                            m20479H0(eVar, iVar);
                            if (eVar2 != null) {
                                m20481G0(eVar2, iVar);
                            }
                            if (eVar2 != null) {
                                eVar2.close();
                            }
                            eVar.close();
                        } catch (IOException e) {
                            m20461Z(iVar, 5, e);
                            if (eVar2 != null) {
                                eVar2.close();
                            }
                            eVar.close();
                        }
                    } else {
                        C1915r1.m39527a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f38558I)));
                        m20461Z(iVar, 2, null);
                        if (eVar2 != null) {
                            eVar2.close();
                        }
                        eVar.close();
                    }
                } catch (Throwable th2) {
                    if (eVar != null) {
                        try {
                            eVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } else {
                throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
            }
        } else {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
    }

    /* renamed from: v */
    void m20418v(int i, Throwable th2) {
        AbstractC8143i1.C8144a aVar;
        if (this.f17657n != null) {
            MediaMuxer mediaMuxer = this.f17666w;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.f17666w.release();
                } catch (IllegalStateException e) {
                    C1915r1.m39525c("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                    if (i == 0) {
                        i = 1;
                    }
                }
                this.f17666w = null;
            } else if (i == 0) {
                i = 8;
            }
            this.f17657n.m20376r(this.f38554E);
            AbstractC8188s H = this.f17657n.mo20392H();
            AbstractC8203y0 y = m20412y();
            AbstractC8190t b = AbstractC8190t.m20343b(this.f38554E);
            AbstractC8175i iVar = this.f17657n;
            if (i == 0) {
                aVar = AbstractC8143i1.m20522a(H, y, b);
            } else {
                aVar = AbstractC8143i1.m20521b(H, y, b, i, th2);
            }
            iVar.m20393G0(aVar);
            AbstractC8175i iVar2 = this.f17657n;
            this.f17657n = null;
            this.f17659p = false;
            this.f17663t = null;
            this.f17664u = null;
            this.f17662s.clear();
            this.f38554E = Uri.EMPTY;
            this.f38555F = 0L;
            this.f38556G = 0L;
            this.f38557H = 0L;
            this.f38559J = 1;
            this.f38560K = null;
            this.f38563N = null;
            int i2 = C8172f.f17680b[this.f38553D.ordinal()];
            if (i2 == 1) {
                m20425r0(EnumC8173g.INITIALIZING);
            } else if (i2 == 2 || i2 == 3) {
                m20425r0(EnumC8173g.IDLING);
            } else if (i2 == 4) {
                throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
            }
            m20457b0(iVar2);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C8201x0 m20413x0(C8192u uVar) {
        long j;
        AbstractC8175i iVar;
        int i;
        Throwable e;
        boolean z;
        AbstractC8175i iVar2;
        C2517g.m37587h(uVar, "The given PendingRecording cannot be null.");
        synchronized (this.f17648e) {
            j = this.f17655l + 1;
            this.f17655l = j;
            iVar = null;
            if (this.f17653j != AbstractC8139h1.EnumC8140a.INACTIVE) {
                i = 0;
                switch (C8172f.f17679a[this.f17649f.ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                        EnumC8177j jVar = this.f17649f;
                        EnumC8177j jVar2 = EnumC8177j.IDLING;
                        if (jVar == jVar2) {
                            if (this.f17651h == null && this.f17652i == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C2517g.m37585j(z, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            AbstractC8175i t = AbstractC8175i.m20374t(uVar, j);
                            t.m20389S(uVar.m20342a());
                            this.f17652i = t;
                            if (this.f17649f == jVar2) {
                                m20423s0(EnumC8177j.PENDING_RECORDING);
                                this.f17647d.execute(new Runnable() { // from class: i0.x
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C8166o0.this.m20487D0();
                                    }
                                });
                            } else {
                                m20423s0(EnumC8177j.PENDING_RECORDING);
                            }
                            e = null;
                            break;
                        } catch (IOException e2) {
                            e = e2;
                            i = 5;
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                        iVar2 = (AbstractC8175i) C2517g.m37588g(this.f17652i);
                        iVar = iVar2;
                        e = null;
                        break;
                    case 7:
                    case 8:
                        iVar2 = this.f17651h;
                        iVar = iVar2;
                        e = null;
                        break;
                    case 9:
                        e = this.f17654k;
                        i = 7;
                        break;
                    default:
                        e = null;
                        break;
                }
            } else {
                e = f38549U;
                i = 4;
            }
        }
        if (iVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        } else if (i == 0) {
            return C8201x0.m20319g(uVar, j);
        } else {
            C1915r1.m39525c("Recorder", "Recording was started when the Recorder had encountered error " + e);
            m20416w(AbstractC8175i.m20374t(uVar, j), i, e);
            return C8201x0.m20320b(uVar, j);
        }
    }

    /* renamed from: y */
    AbstractC8203y0 m20412y() {
        return AbstractC8203y0.m20310d(this.f38556G, this.f38555F, AbstractC8108b.m20583c(m20490C(this.f38553D), this.f38563N));
    }

    /* renamed from: z */
    <T> T m20410z(AbstractC13647o2<T> o2Var) {
        try {
            return o2Var.mo3077c().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
