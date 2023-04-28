package p277p4;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: p4.c */
/* loaded from: classes7.dex */
public class C11531c {

    /* renamed from: b */
    private static final C11531c f25725b = new C11531c();

    /* renamed from: c */
    private static boolean f25726c = true;

    /* renamed from: a */
    private final Queue<EnumC11532a> f25727a = new ArrayBlockingQueue(20);

    /* renamed from: p4.c$a */
    /* loaded from: classes7.dex */
    public enum EnumC11532a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C11531c() {
    }

    /* renamed from: a */
    public static C11531c m9442a() {
        return f25726c ? new C11531c() : f25725b;
    }

    /* renamed from: b */
    public void m9441b(EnumC11532a aVar) {
        if (f25726c) {
            if (this.f25727a.size() + 1 > 20) {
                this.f25727a.poll();
            }
            this.f25727a.add(aVar);
        }
    }

    public String toString() {
        return this.f25727a.toString();
    }
}
