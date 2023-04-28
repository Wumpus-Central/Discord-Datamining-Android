package io.sentry;

import io.sentry.util.C9109i;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.y0 */
/* loaded from: classes8.dex */
public final class C9154y0 {

    /* renamed from: a */
    public final C8691a1 f20098a;

    public C9154y0(int i) {
        this.f20098a = new C8691a1(i);
    }

    /* renamed from: b */
    private void m16777b(C9161z0 z0Var, AbstractC8869g0 g0Var, Collection<?> collection) {
        z0Var.m16916h();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m16778a(z0Var, g0Var, it.next());
        }
        z0Var.m16912n();
    }

    /* renamed from: c */
    private void m16776c(C9161z0 z0Var, AbstractC8869g0 g0Var, Date date) {
        try {
            z0Var.m16918f0(C8875h.m17842f(date));
        } catch (Exception e) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Error when serializing Date", e);
            z0Var.m16908t();
        }
    }

    /* renamed from: d */
    private void m16775d(C9161z0 z0Var, AbstractC8869g0 g0Var, Map<?, ?> map) {
        z0Var.m16915i();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                z0Var.m16753z0((String) obj);
                m16778a(z0Var, g0Var, map.get(obj));
            }
        }
        z0Var.m16911p();
    }

    /* renamed from: e */
    private void m16774e(C9161z0 z0Var, AbstractC8869g0 g0Var, TimeZone timeZone) {
        try {
            z0Var.m16918f0(timeZone.getID());
        } catch (Exception e) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Error when serializing TimeZone", e);
            z0Var.m16908t();
        }
    }

    /* renamed from: a */
    public void m16778a(C9161z0 z0Var, AbstractC8869g0 g0Var, Object obj) {
        if (obj == null) {
            z0Var.m16908t();
        } else if (obj instanceof Character) {
            z0Var.m16918f0(Character.toString(((Character) obj).charValue()));
        } else if (obj instanceof String) {
            z0Var.m16918f0((String) obj);
        } else if (obj instanceof Boolean) {
            z0Var.m16914j0(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            z0Var.m16919b0((Number) obj);
        } else if (obj instanceof Date) {
            m16776c(z0Var, g0Var, (Date) obj);
        } else if (obj instanceof TimeZone) {
            m16774e(z0Var, g0Var, (TimeZone) obj);
        } else if (obj instanceof AbstractC8806b1) {
            ((AbstractC8806b1) obj).serialize(z0Var, g0Var);
        } else if (obj instanceof Collection) {
            m16777b(z0Var, g0Var, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            m16777b(z0Var, g0Var, Arrays.asList((Object[]) obj));
        } else if (obj instanceof Map) {
            m16775d(z0Var, g0Var, (Map) obj);
        } else if (obj instanceof Locale) {
            z0Var.m16918f0(obj.toString());
        } else if (obj instanceof AtomicIntegerArray) {
            m16777b(z0Var, g0Var, C9109i.m16998a((AtomicIntegerArray) obj));
        } else if (obj instanceof AtomicBoolean) {
            z0Var.m16914j0(((AtomicBoolean) obj).get());
        } else if (obj instanceof URI) {
            z0Var.m16918f0(obj.toString());
        } else if (obj instanceof InetAddress) {
            z0Var.m16918f0(obj.toString());
        } else if (obj instanceof UUID) {
            z0Var.m16918f0(obj.toString());
        } else if (obj instanceof Currency) {
            z0Var.m16918f0(obj.toString());
        } else if (obj instanceof Calendar) {
            m16775d(z0Var, g0Var, C9109i.m16997b((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            z0Var.m16918f0(obj.toString());
        } else {
            try {
                m16778a(z0Var, g0Var, this.f20098a.m18350d(obj, g0Var));
            } catch (Exception e) {
                g0Var.mo17723b(EnumC8942n3.ERROR, "Failed serializing unknown object.", e);
                z0Var.m16918f0("[OBJECT]");
            }
        }
    }
}
