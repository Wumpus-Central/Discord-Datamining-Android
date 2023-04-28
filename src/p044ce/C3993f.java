package p044ce;

import android.view.View;
import com.henninghall.date_picker.C5885d;
import com.henninghall.date_picker.C5897k;
import ee.AbstractC6825g;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: ce.f */
/* loaded from: classes6.dex */
public class C3993f implements AbstractC3992e {

    /* renamed from: a */
    private final C3995h f6556a;

    /* renamed from: b */
    private final C5897k f6557b;

    /* renamed from: c */
    private final C3991d f6558c;

    /* renamed from: d */
    private final View f6559d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3993f(C3995h hVar, C5897k kVar, C3991d dVar, View view) {
        this.f6556a = hVar;
        this.f6558c = dVar;
        this.f6557b = kVar;
        this.f6559d = view;
    }

    /* renamed from: b */
    private boolean m33163b() {
        SimpleDateFormat d = m33161d();
        String r = this.f6556a.m33137r();
        try {
            d.setLenient(false);
            d.parse(r);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private Calendar m33162c() {
        SimpleDateFormat d = m33161d();
        d.setLenient(false);
        for (int i = 0; i < 10; i++) {
            try {
                String s = this.f6556a.m33136s(i);
                Calendar instance = Calendar.getInstance(this.f6557b.m26955C());
                instance.setTime(d.parse(s));
                return instance;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private SimpleDateFormat m33161d() {
        TimeZone C = this.f6557b.m26955C();
        SimpleDateFormat c = this.f6558c.m33177c();
        c.setTimeZone(C);
        return c;
    }

    /* renamed from: e */
    private Calendar m33160e() {
        SimpleDateFormat d = m33161d();
        String r = this.f6556a.m33137r();
        Calendar instance = Calendar.getInstance(this.f6557b.m26955C());
        try {
            d.setLenient(true);
            instance.setTime(d.parse(r));
            return instance;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p044ce.AbstractC3992e
    /* renamed from: a */
    public void mo33164a(AbstractC6825g gVar) {
        if (!this.f6556a.m33158A()) {
            if (!m33163b()) {
                Calendar c = m33162c();
                if (c != null) {
                    this.f6558c.m33178b(c);
                    return;
                }
                return;
            }
            Calendar e = m33160e();
            if (e != null) {
                Calendar x = this.f6557b.m26928x();
                if (x == null || !e.before(x)) {
                    Calendar w = this.f6557b.m26929w();
                    if (w == null || !e.after(w)) {
                        String d = this.f6558c.m33176d();
                        this.f6558c.m33169k(e);
                        C5885d.m26977b(e, d, this.f6559d);
                        return;
                    }
                    this.f6558c.m33178b(w);
                    return;
                }
                this.f6558c.m33178b(x);
            }
        }
    }
}
