package p305qh;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12718u;

/* renamed from: qh.m */
/* loaded from: classes8.dex */
public enum EnumC12172m {
    PLAIN { // from class: qh.m.b
        @Override // p305qh.EnumC12172m
        /* renamed from: b */
        public String mo7505b(String string) {
            C9971q.m14633g(string, "string");
            return string;
        }
    },
    HTML { // from class: qh.m.a
        @Override // p305qh.EnumC12172m
        /* renamed from: b */
        public String mo7505b(String string) {
            String D;
            String D2;
            C9971q.m14633g(string, "string");
            D = C12718u.m5740D(string, "<", "&lt;", false, 4, null);
            D2 = C12718u.m5740D(D, ">", "&gt;", false, 4, null);
            return D2;
        }
    };

    /* synthetic */ EnumC12172m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract String mo7505b(String str);
}
