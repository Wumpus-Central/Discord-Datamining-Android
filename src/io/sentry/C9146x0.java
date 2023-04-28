package io.sentry;

import io.sentry.vendor.gson.stream.C9124a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p163j$.util.DesugarTimeZone;

/* renamed from: io.sentry.x0 */
/* loaded from: classes8.dex */
public final class C9146x0 extends C9124a {
    public C9146x0(Reader reader) {
        super(reader);
    }

    /* renamed from: O0 */
    public Boolean m16812O0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return Boolean.valueOf(m16959C());
        }
        m16944Y();
        return null;
    }

    /* renamed from: P0 */
    public Date m16811P0(AbstractC8869g0 g0Var) {
        if (m16930w0() == EnumC9125b.NULL) {
            m16944Y();
            return null;
        }
        String f0 = m16941f0();
        try {
            return C8875h.m17844d(f0);
        } catch (Exception e) {
            g0Var.mo17723b(EnumC8942n3.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", e);
            try {
                return C8875h.m17843e(f0);
            } catch (Exception e2) {
                g0Var.mo17723b(EnumC8942n3.ERROR, "Error when deserializing millis timestamp format.", e2);
                return null;
            }
        }
    }

    /* renamed from: Q0 */
    public Double m16810Q0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return Double.valueOf(m16956H());
        }
        m16944Y();
        return null;
    }

    /* renamed from: R0 */
    public Float m16809R0() {
        return Float.valueOf((float) m16956H());
    }

    /* renamed from: S0 */
    public Float m16808S0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return m16809R0();
        }
        m16944Y();
        return null;
    }

    /* renamed from: T0 */
    public Integer m16807T0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return Integer.valueOf(m16948Q());
        }
        m16944Y();
        return null;
    }

    /* renamed from: U0 */
    public <T> List<T> m16806U0(AbstractC8869g0 g0Var, AbstractC9030r0<T> r0Var) {
        if (m16930w0() == EnumC9125b.NULL) {
            m16944Y();
            return null;
        }
        m16943b();
        ArrayList arrayList = new ArrayList();
        do {
            try {
                arrayList.add(r0Var.mo16758a(this, g0Var));
            } catch (Exception e) {
                g0Var.mo17723b(EnumC8942n3.ERROR, "Failed to deserialize object in list.", e);
            }
        } while (m16930w0() == EnumC9125b.BEGIN_OBJECT);
        m16935n();
        return arrayList;
    }

    /* renamed from: V0 */
    public Long m16805V0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return Long.valueOf(m16947R());
        }
        m16944Y();
        return null;
    }

    /* renamed from: W0 */
    public <T> Map<String, T> m16804W0(AbstractC8869g0 g0Var, AbstractC9030r0<T> r0Var) {
        if (m16930w0() == EnumC9125b.NULL) {
            m16944Y();
            return null;
        }
        m16940g();
        HashMap hashMap = new HashMap();
        while (true) {
            try {
                hashMap.put(m16946S(), r0Var.mo16758a(this, g0Var));
            } catch (Exception e) {
                g0Var.mo17723b(EnumC8942n3.ERROR, "Failed to deserialize object in map.", e);
            }
            if (m16930w0() != EnumC9125b.BEGIN_OBJECT && m16930w0() != EnumC9125b.NAME) {
                m16934p();
                return hashMap;
            }
        }
    }

    /* renamed from: X0 */
    public Object m16803X0() {
        return new C9129w0().m16903c(this);
    }

    /* renamed from: Y0 */
    public <T> T m16802Y0(AbstractC8869g0 g0Var, AbstractC9030r0<T> r0Var) {
        if (m16930w0() != EnumC9125b.NULL) {
            return r0Var.mo16758a(this, g0Var);
        }
        m16944Y();
        return null;
    }

    /* renamed from: Z0 */
    public String m16801Z0() {
        if (m16930w0() != EnumC9125b.NULL) {
            return m16941f0();
        }
        m16944Y();
        return null;
    }

    /* renamed from: a1 */
    public TimeZone m16800a1(AbstractC8869g0 g0Var) {
        if (m16930w0() == EnumC9125b.NULL) {
            m16944Y();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(m16941f0());
        } catch (Exception e) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    /* renamed from: b1 */
    public void m16799b1(AbstractC8869g0 g0Var, Map<String, Object> map, String str) {
        try {
            map.put(str, m16803X0());
        } catch (Exception e) {
            g0Var.mo17724a(EnumC8942n3.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }
}
