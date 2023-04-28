package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.x */
/* loaded from: classes.dex */
public class C2760x {

    /* renamed from: a */
    private final Runnable f3666a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<AbstractC2667m0> f3667b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<AbstractC2667m0, Object> f3668c = new HashMap();

    public C2760x(Runnable runnable) {
        this.f3666a = runnable;
    }

    /* renamed from: a */
    public void m36829a(Menu menu, MenuInflater menuInflater) {
        Iterator<AbstractC2667m0> it = this.f3667b.iterator();
        while (it.hasNext()) {
            it.next().m37179b(menu, menuInflater);
        }
    }

    /* renamed from: b */
    public boolean m36828b(MenuItem menuItem) {
        Iterator<AbstractC2667m0> it = this.f3667b.iterator();
        while (it.hasNext()) {
            if (it.next().m37180a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
