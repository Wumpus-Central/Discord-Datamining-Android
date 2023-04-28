package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements AbstractC3038j {

    /* renamed from: k */
    private final AbstractC3032e f4356k;

    /* renamed from: l */
    private final AbstractC3038j f4357l;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C3008a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4358a;

        static {
            int[] iArr = new int[Lifecycle.EnumC3010b.values().length];
            f4358a = iArr;
            try {
                iArr[Lifecycle.EnumC3010b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4358a[Lifecycle.EnumC3010b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(AbstractC3032e eVar, AbstractC3038j jVar) {
        this.f4356k = eVar;
        this.f4357l = jVar;
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        switch (C3008a.f4358a[bVar.ordinal()]) {
            case 1:
                this.f4356k.onCreate(lifecycleOwner);
                break;
            case 2:
                this.f4356k.onStart(lifecycleOwner);
                break;
            case 3:
                this.f4356k.onResume(lifecycleOwner);
                break;
            case 4:
                this.f4356k.onPause(lifecycleOwner);
                break;
            case 5:
                this.f4356k.onStop(lifecycleOwner);
                break;
            case 6:
                this.f4356k.onDestroy(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        AbstractC3038j jVar = this.f4357l;
        if (jVar != null) {
            jVar.mo34707c(lifecycleOwner, bVar);
        }
    }
}
