package p044ce;

import android.view.View;
import com.henninghall.date_picker.C5897k;
import de.C6448a;
import de.C6449b;
import de.C6450c;
import de.C6451d;
import de.C6452e;
import de.C6455h;
import de.C6456i;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: ce.d */
/* loaded from: classes6.dex */
public class C3991d {

    /* renamed from: a */
    private final C5897k f6551a;

    /* renamed from: b */
    private final View f6552b;

    /* renamed from: c */
    private C3995h f6553c;

    /* renamed from: d */
    private C3989b f6554d;

    /* renamed from: e */
    private C3994g f6555e = new C3994g();

    public C3991d(C5897k kVar, View view) {
        this.f6551a = kVar;
        this.f6552b = view;
        this.f6553c = new C3995h(kVar, view);
        m33179a();
    }

    /* renamed from: a */
    private void m33179a() {
        this.f6553c.m33145j(new C6448a(new C3993f(this.f6553c, this.f6551a, this, this.f6552b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m33178b(Calendar calendar) {
        this.f6553c.m33144k(new C6452e(calendar));
        this.f6553c.m33143l(new C6449b(calendar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public SimpleDateFormat m33177c() {
        return new SimpleDateFormat(this.f6553c.m33134u(), this.f6551a.m26931u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m33176d() {
        return this.f6553c.m33135t();
    }

    /* renamed from: e */
    public void m33175e(int i, int i2) {
        this.f6555e.m33159a(this.f6553c.m33130y(this.f6551a.f11745p.m26986b().get(i)), i2);
    }

    /* renamed from: f */
    public void m33174f() {
        this.f6553c.m33145j(new C6452e(this.f6551a.m26938n()));
    }

    /* renamed from: g */
    public void m33173g() {
        this.f6553c.m33145j(new C6451d());
    }

    /* renamed from: h */
    public void m33172h() {
        this.f6553c.m33157B();
    }

    /* renamed from: i */
    public void m33171i() {
        if (!this.f6551a.f11745p.m26981g()) {
            C3989b bVar = new C3989b(this.f6551a, this.f6552b);
            this.f6554d = bVar;
            bVar.m33183a();
        }
    }

    /* renamed from: j */
    public void m33170j() {
        this.f6553c.m33156C();
    }

    /* renamed from: k */
    public void m33169k(Calendar calendar) {
        this.f6551a.m26953E(calendar);
    }

    /* renamed from: l */
    public void m33168l() {
        this.f6553c.m33145j(new C6455h(this.f6551a.m26956B()));
    }

    /* renamed from: m */
    public void m33167m() {
        this.f6553c.m33155D();
    }

    /* renamed from: n */
    public void m33166n() {
        this.f6553c.m33143l(new C6450c());
    }

    /* renamed from: o */
    public void m33165o() {
        this.f6553c.m33145j(new C6456i());
    }
}
