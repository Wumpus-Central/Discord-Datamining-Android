package io.sentry;

import io.sentry.clientreport.C8823b;
import io.sentry.protocol.C9015w;
import java.util.Locale;

/* renamed from: io.sentry.m3 */
/* loaded from: classes8.dex */
public enum EnumC8935m3 implements AbstractC8806b1 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    Unknown("__unknown__");
    
    private final String itemType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.m3$a */
    /* loaded from: classes8.dex */
    public static final class C8936a implements AbstractC9030r0<EnumC8935m3> {
        /* renamed from: b */
        public EnumC8935m3 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            return EnumC8935m3.valueOfLabel(x0Var.m16941f0().toLowerCase(Locale.ROOT));
        }
    }

    EnumC8935m3(String str) {
        this.itemType = str;
    }

    public static EnumC8935m3 resolve(Object obj) {
        if (obj instanceof C8908j3) {
            return Event;
        }
        if (obj instanceof C9015w) {
            return Transaction;
        }
        if (obj instanceof C9157y3) {
            return Session;
        }
        if (obj instanceof C8823b) {
            return ClientReport;
        }
        return Attachment;
    }

    public static EnumC8935m3 valueOfLabel(String str) {
        EnumC8935m3[] values;
        for (EnumC8935m3 m3Var : values()) {
            if (m3Var.itemType.equals(str)) {
                return m3Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16918f0(this.itemType);
    }
}
