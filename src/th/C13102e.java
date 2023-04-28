package th;

import fi.AbstractC7304o0;
import java.util.Arrays;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;

/* renamed from: th.e */
/* loaded from: classes8.dex */
public final class C13102e extends AbstractC13120o<Character> {
    public C13102e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: c */
    private final String m4604c(char c) {
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (m4602e(c)) {
            return String.valueOf(c);
        }
        return "?";
    }

    /* renamed from: e */
    private final boolean m4602e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    /* renamed from: d */
    public AbstractC7304o0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC7304o0 u = module.mo6136n().m13363u();
        C9971q.m14634f(u, "module.builtIns.charType");
        return u;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo4590b().charValue()), m4604c(mo4590b().charValue())}, 2));
        C9971q.m14634f(format, "format(this, *args)");
        return format;
    }
}
