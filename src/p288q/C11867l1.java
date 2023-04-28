package p288q;

import androidx.camera.core.AbstractC1926u;
import androidx.camera.core.C1915r1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.Objects;
import p390w.AbstractC13597g0;
import p390w.C13610j0;

/* renamed from: q.l1 */
/* loaded from: classes.dex */
class C11867l1 {

    /* renamed from: a */
    private final C13610j0 f26497a;

    /* renamed from: b */
    private final MutableLiveData<AbstractC1926u> f26498b;

    /* renamed from: q.l1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11868a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26499a;

        static {
            int[] iArr = new int[AbstractC13597g0.EnumC13598a.values().length];
            f26499a = iArr;
            try {
                iArr[AbstractC13597g0.EnumC13598a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26499a[AbstractC13597g0.EnumC13598a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11867l1(C13610j0 j0Var) {
        this.f26497a = j0Var;
        MutableLiveData<AbstractC1926u> mutableLiveData = new MutableLiveData<>();
        this.f26498b = mutableLiveData;
        mutableLiveData.mo35815m(AbstractC1926u.m39506a(AbstractC1926u.EnumC1928b.CLOSED));
    }

    /* renamed from: b */
    private AbstractC1926u m8424b() {
        if (this.f26497a.m3231a()) {
            return AbstractC1926u.m39506a(AbstractC1926u.EnumC1928b.OPENING);
        }
        return AbstractC1926u.m39506a(AbstractC1926u.EnumC1928b.PENDING_OPEN);
    }

    /* renamed from: a */
    public LiveData<AbstractC1926u> m8425a() {
        return this.f26498b;
    }

    /* renamed from: c */
    public void m8423c(AbstractC13597g0.EnumC13598a aVar, AbstractC1926u.AbstractC1927a aVar2) {
        AbstractC1926u uVar;
        switch (C11868a.f26499a[aVar.ordinal()]) {
            case 1:
                uVar = m8424b();
                break;
            case 2:
                uVar = AbstractC1926u.m39505b(AbstractC1926u.EnumC1928b.OPENING, aVar2);
                break;
            case 3:
                uVar = AbstractC1926u.m39505b(AbstractC1926u.EnumC1928b.OPEN, aVar2);
                break;
            case 4:
            case 5:
                uVar = AbstractC1926u.m39505b(AbstractC1926u.EnumC1928b.CLOSING, aVar2);
                break;
            case 6:
            case 7:
                uVar = AbstractC1926u.m39505b(AbstractC1926u.EnumC1928b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C1915r1.m39527a("CameraStateMachine", "New public camera state " + uVar + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f26498b.mo8408f(), uVar)) {
            C1915r1.m39527a("CameraStateMachine", "Publishing new public camera state " + uVar);
            this.f26498b.mo35815m(uVar);
        }
    }
}
