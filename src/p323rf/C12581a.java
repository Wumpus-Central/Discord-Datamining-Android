package p323rf;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000e"}, m15073d2 = {"", ViewProps.START, "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "", "block", "Ljava/lang/Thread;", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: rf.a */
/* loaded from: classes8.dex */
public final class C12581a {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"rf/a$a", "Ljava/lang/Thread;", "", "run", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: rf.a$a */
    /* loaded from: classes8.dex */
    public static final class C0401a extends Thread {

        /* renamed from: k */
        final /* synthetic */ Function0<Unit> f28280k;

        C0401a(Function0<Unit> function0) {
            this.f28280k = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f28280k.invoke();
        }
    }

    /* renamed from: a */
    public static final Thread m6477a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0<Unit> block) {
        C9971q.m14633g(block, "block");
        C0401a aVar = new C0401a(block);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m6476b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m6477a(z, z2, classLoader2, str2, i, function0);
    }
}
