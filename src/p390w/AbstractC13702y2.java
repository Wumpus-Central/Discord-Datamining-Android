package p390w;

import android.content.Context;

/* renamed from: w.y2 */
/* loaded from: classes.dex */
public interface AbstractC13702y2 {

    /* renamed from: a */
    public static final AbstractC13702y2 f30596a = new C13703a();

    /* renamed from: w.y2$a */
    /* loaded from: classes.dex */
    class C13703a implements AbstractC13702y2 {
        C13703a() {
        }

        @Override // p390w.AbstractC13702y2
        /* renamed from: a */
        public AbstractC13662r0 mo2994a(EnumC13704b bVar) {
            return null;
        }
    }

    /* renamed from: w.y2$b */
    /* loaded from: classes.dex */
    public enum EnumC13704b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* renamed from: w.y2$c */
    /* loaded from: classes.dex */
    public interface AbstractC13705c {
        /* renamed from: a */
        AbstractC13702y2 mo2993a(Context context);
    }

    /* renamed from: a */
    AbstractC13662r0 mo2994a(EnumC13704b bVar);
}
