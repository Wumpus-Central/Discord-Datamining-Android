package io.sentry;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.Locale;

/* renamed from: io.sentry.f4 */
/* loaded from: classes8.dex */
public enum EnumC8866f4 implements AbstractC8806b1 {
    OK(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(TypefaceStyle.NORMAL),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(TypefaceStyle.NORMAL),
    ABORTED(409),
    OUT_OF_RANGE(TypefaceStyle.NORMAL),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* renamed from: io.sentry.f4$a */
    /* loaded from: classes8.dex */
    public static final class C8867a implements AbstractC9030r0<EnumC8866f4> {
        /* renamed from: b */
        public EnumC8866f4 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            return EnumC8866f4.valueOf(x0Var.m16941f0().toUpperCase(Locale.ROOT));
        }
    }

    EnumC8866f4(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static EnumC8866f4 fromHttpStatusCode(int i) {
        EnumC8866f4[] values;
        for (EnumC8866f4 f4Var : values()) {
            if (f4Var.matches(i)) {
                return f4Var;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16918f0(name().toLowerCase(Locale.ROOT));
    }

    public static EnumC8866f4 fromHttpStatusCode(Integer num, EnumC8866f4 f4Var) {
        EnumC8866f4 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : f4Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : f4Var;
    }

    EnumC8866f4(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
