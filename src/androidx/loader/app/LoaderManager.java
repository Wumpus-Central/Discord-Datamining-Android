package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3056x;
import androidx.lifecycle.LifecycleOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p290q1.C11962b;

/* loaded from: classes.dex */
public abstract class LoaderManager {

    /* renamed from: androidx.loader.app.LoaderManager$a */
    /* loaded from: classes.dex */
    public interface AbstractC3059a<D> {
        /* renamed from: a */
        void mo29121a(C11962b<D> bVar, D d);

        /* renamed from: b */
        void mo29120b(C11962b<D> bVar);

        /* renamed from: c */
        C11962b<D> mo29119c(int i, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends LifecycleOwner & AbstractC3056x> LoaderManager m35734b(T t) {
        return new C3060a(t, t.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo35733a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C11962b<D> mo35732c(int i, Bundle bundle, AbstractC3059a<D> aVar);

    /* renamed from: d */
    public abstract void mo35731d();
}
