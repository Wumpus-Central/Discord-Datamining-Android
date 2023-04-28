package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Lifecycle {

    /* renamed from: a */
    AtomicReference<Object> f4359a = new AtomicReference<>();

    /* loaded from: classes.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m35851a(State state) {
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.Lifecycle$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C3009a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4366a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4367b;

        static {
            int[] iArr = new int[EnumC3010b.values().length];
            f4367b = iArr;
            try {
                iArr[EnumC3010b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4367b[EnumC3010b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4367b[EnumC3010b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4367b[EnumC3010b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4367b[EnumC3010b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4367b[EnumC3010b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4367b[EnumC3010b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[State.values().length];
            f4366a = iArr2;
            try {
                iArr2[State.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4366a[State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4366a[State.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4366a[State.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4366a[State.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: androidx.lifecycle.Lifecycle$b */
    /* loaded from: classes.dex */
    public enum EnumC3010b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: a */
        public static EnumC3010b m35850a(State state) {
            int i = C3009a.f4366a[state.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        /* renamed from: c */
        public static EnumC3010b m35848c(State state) {
            int i = C3009a.f4366a[state.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        /* renamed from: d */
        public static EnumC3010b m35847d(State state) {
            int i = C3009a.f4366a[state.ordinal()];
            if (i == 1) {
                return ON_CREATE;
            }
            if (i == 2) {
                return ON_START;
            }
            if (i != 3) {
                return null;
            }
            return ON_RESUME;
        }

        /* renamed from: b */
        public State m35849b() {
            switch (C3009a.f4367b[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo35844a(AbstractC3040l lVar);

    /* renamed from: b */
    public abstract State mo35843b();

    /* renamed from: c */
    public abstract void mo35842c(AbstractC3040l lVar);
}
