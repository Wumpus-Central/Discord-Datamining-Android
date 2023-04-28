package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.AbstractC1917s;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1921t;
import androidx.camera.core.impl.utils.C1849j;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.C2114c;
import p072e0.AbstractC6537j;
import p072e0.AbstractC6548o;
import p072e0.C6549p;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;
import p431y.C14186f;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: c */
    private static final Object f2080c = new Object();

    /* renamed from: d */
    private static AbstractFutureC7576b<ExtensionsManager> f2081d;

    /* renamed from: e */
    private static AbstractFutureC7576b<Void> f2082e;

    /* renamed from: f */
    private static ExtensionsManager f2083f;

    /* renamed from: a */
    private final ExtensionsAvailability f2084a;

    /* renamed from: b */
    private final C1970d f2085b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2 */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ C2114c.C2115a val$completer;

        AnonymousClass2(C2114c.C2115a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i) {
            this.val$completer.m38958f(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.m38961c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, AbstractC1917s sVar) {
        this.f2084a = extensionsAvailability;
        this.f2085b = new C1970d(sVar);
    }

    /* renamed from: c */
    public static AbstractFutureC7576b<ExtensionsManager> m39398c(Context context, AbstractC1917s sVar) {
        return m39397d(context, sVar, C6549p.m25326a());
    }

    /* renamed from: d */
    static AbstractFutureC7576b<ExtensionsManager> m39397d(final Context context, final AbstractC1917s sVar, final C6549p pVar) {
        synchronized (f2080c) {
            AbstractFutureC7576b<Void> bVar = f2082e;
            if (bVar != null && !bVar.isDone()) {
                throw new IllegalStateException("Not yet done deinitializing extensions");
            }
            f2082e = null;
            if (AbstractC6537j.m25351b() == null) {
                return C14186f.m1421h(m39396e(ExtensionsAvailability.NONE, sVar));
            } else if (AbstractC6537j.m25351b().compareTo(AbstractC6548o.f13720l) < 0) {
                return C14186f.m1421h(m39396e(ExtensionsAvailability.LIBRARY_AVAILABLE, sVar));
            } else {
                if (f2081d == null) {
                    f2081d = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.extensions.e
                        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                        /* renamed from: a */
                        public final Object mo1403a(C2114c.C2115a aVar) {
                            Object g;
                            g = ExtensionsManager.m39394g(C6549p.this, context, sVar, aVar);
                            return g;
                        }
                    });
                }
                return f2081d;
            }
        }
    }

    /* renamed from: e */
    static ExtensionsManager m39396e(ExtensionsAvailability extensionsAvailability, AbstractC1917s sVar) {
        synchronized (f2080c) {
            ExtensionsManager extensionsManager = f2083f;
            if (extensionsManager != null) {
                return extensionsManager;
            }
            ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, sVar);
            f2083f = extensionsManager2;
            return extensionsManager2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m39394g(C6549p pVar, Context context, final AbstractC1917s sVar, final C2114c.C2115a aVar) {
        Object e;
        try {
            InitializerImpl.init(pVar.m25324c(), C1849j.m39678a(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i) {
                    C1915r1.m39525c("ExtensionsManager", "Failed to initialize extensions");
                    C2114c.C2115a.this.m38961c(ExtensionsManager.m39396e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, sVar));
                }

                public void onSuccess() {
                    C1915r1.m39527a("ExtensionsManager", "Successfully initialized extensions");
                    C2114c.C2115a.this.m38961c(ExtensionsManager.m39396e(ExtensionsAvailability.LIBRARY_AVAILABLE, sVar));
                }
            }, C13905a.m2339a());
            return "Initialize extensions";
        } catch (AbstractMethodError e2) {
            e = e2;
            C1915r1.m39525c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.m38961c(m39396e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, sVar));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e3) {
            e = e3;
            C1915r1.m39525c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.m38961c(m39396e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, sVar));
            return "Initialize extensions";
        } catch (NoSuchMethodError e4) {
            e = e4;
            C1915r1.m39525c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.m38961c(m39396e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, sVar));
            return "Initialize extensions";
        } catch (RuntimeException e5) {
            C1915r1.m39525c("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e5);
            aVar.m38961c(m39396e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, sVar));
            return "Initialize extensions";
        }
    }

    /* renamed from: b */
    public C1921t m39399b(C1921t tVar, int i) {
        if (i == 0) {
            return tVar;
        }
        if (this.f2084a == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f2085b.m39385c(tVar, i);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* renamed from: f */
    public boolean m39395f(C1921t tVar, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f2084a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f2085b.m39380h(tVar, i);
    }
}
