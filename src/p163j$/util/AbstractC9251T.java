package p163j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: j$.util.T */
/* loaded from: classes2.dex */
abstract class AbstractC9251T {

    /* renamed from: a */
    static final boolean f20302a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.S
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16583a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
