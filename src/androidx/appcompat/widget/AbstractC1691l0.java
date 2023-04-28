package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.AbstractC1584j;
import androidx.appcompat.view.menu.C1575e;
import androidx.core.view.C2674n2;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public interface AbstractC1691l0 {
    /* renamed from: a */
    boolean mo40090a();

    /* renamed from: b */
    boolean mo40089b();

    /* renamed from: c */
    boolean mo40088c();

    void collapseActionView();

    /* renamed from: d */
    void mo40087d(Menu menu, AbstractC1584j.AbstractC1585a aVar);

    /* renamed from: e */
    boolean mo40086e();

    /* renamed from: f */
    void mo40085f();

    /* renamed from: g */
    boolean mo40084g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo40083h();

    /* renamed from: i */
    void mo40082i(int i);

    /* renamed from: j */
    Menu mo40081j();

    /* renamed from: k */
    int mo40080k();

    /* renamed from: l */
    C2674n2 mo40079l(int i, long j);

    /* renamed from: m */
    ViewGroup mo40078m();

    /* renamed from: n */
    void mo40077n(boolean z);

    /* renamed from: o */
    void mo40076o();

    /* renamed from: p */
    void mo40075p(boolean z);

    /* renamed from: q */
    void mo40074q();

    /* renamed from: r */
    void mo40073r(C1671g1 g1Var);

    /* renamed from: s */
    void mo40072s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo40071t(AbstractC1584j.AbstractC1585a aVar, C1575e.AbstractC1576a aVar2);

    /* renamed from: u */
    int mo40070u();

    /* renamed from: v */
    void mo40069v();

    /* renamed from: w */
    void mo40068w(Drawable drawable);
}
