package p302qe;

import android.media.MediaFormat;
import com.linkedin.android.litr.p050io.MediaRange;
import ie.AbstractC8390a;
import ie.AbstractC8391b;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;
import pe.AbstractC11647i;

/* renamed from: qe.c */
/* loaded from: classes6.dex */
public abstract class AbstractC12115c {

    /* renamed from: a */
    protected final AbstractC11261c f27186a;

    /* renamed from: b */
    protected final AbstractC11262d f27187b;

    /* renamed from: c */
    protected final AbstractC11647i f27188c;

    /* renamed from: d */
    protected final AbstractC8390a f27189d;

    /* renamed from: e */
    protected final AbstractC8391b f27190e;

    /* renamed from: f */
    protected final MediaRange f27191f;

    /* renamed from: g */
    protected int f27192g;

    /* renamed from: h */
    protected int f27193h;

    /* renamed from: i */
    protected boolean f27194i;

    /* renamed from: j */
    protected MediaFormat f27195j;

    /* renamed from: k */
    protected long f27196k;

    /* renamed from: l */
    protected float f27197l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12115c(AbstractC11261c cVar, int i, AbstractC11262d dVar, int i2, MediaFormat mediaFormat, AbstractC11647i iVar, AbstractC8390a aVar, AbstractC8391b bVar) {
        this.f27196k = -1L;
        this.f27186a = cVar;
        this.f27192g = i;
        this.f27193h = i2;
        this.f27187b = dVar;
        this.f27195j = mediaFormat;
        this.f27188c = iVar;
        this.f27189d = aVar;
        this.f27190e = bVar;
        MediaRange selection = cVar.getSelection();
        this.f27191f = selection;
        MediaFormat trackFormat = cVar.getTrackFormat(i);
        if (trackFormat.containsKey("durationUs")) {
            long j = trackFormat.getLong("durationUs");
            this.f27196k = j;
            if (mediaFormat != null) {
                mediaFormat.setLong("durationUs", j);
            }
        }
        if (selection.m26437a() >= selection.m26436b()) {
            long min = Math.min(this.f27196k, selection.m26437a());
            this.f27196k = min;
            this.f27196k = min - selection.m26436b();
            return;
        }
        throw new IllegalArgumentException("Range end should be greater than range start");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public MediaFormat m7799a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (!mediaFormat2.containsKey("durationUs") && mediaFormat.containsKey("durationUs")) {
            mediaFormat2.setLong("durationUs", mediaFormat.getLong("durationUs"));
        }
        if (!mediaFormat2.containsKey("language") && mediaFormat.containsKey("language")) {
            mediaFormat2.setString("language", mediaFormat.getString("language"));
        }
        return mediaFormat2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m7798b() {
        while (this.f27186a.getSampleTrackIndex() == this.f27192g) {
            this.f27186a.advance();
            if ((this.f27186a.getSampleFlags() & 4) != 0) {
                return 4;
            }
        }
        return 5;
    }

    /* renamed from: c */
    public String mo7797c() {
        return this.f27189d.getName();
    }

    /* renamed from: d */
    public String mo7796d() {
        return this.f27190e.getName();
    }

    /* renamed from: e */
    public float m7795e() {
        return this.f27197l;
    }

    /* renamed from: f */
    public MediaFormat m7794f() {
        return this.f27195j;
    }

    /* renamed from: g */
    public abstract int mo7792g();

    /* renamed from: h */
    public abstract void mo7791h();

    /* renamed from: i */
    public abstract void mo7790i();
}
