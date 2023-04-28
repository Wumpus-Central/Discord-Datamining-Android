package p372ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, m15073d2 = {"E", "", "capacity", "Lui/e;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Lui/f;", "a", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: ui.h */
/* loaded from: classes8.dex */
public final class C13341h {
    /* renamed from: a */
    public static final <E> AbstractC13338f<E> m3910a(int i, EnumC13337e eVar, Function1<? super E, Unit> function1) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == EnumC13337e.SUSPEND) {
                i2 = AbstractC13338f.f29901i.m3914a();
            }
            return new C13335d(i2, eVar, function1);
        } else if (i == -1) {
            if (eVar != EnumC13337e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C13351o(function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C13352p(function1);
            }
            if (i == 1 && eVar == EnumC13337e.DROP_OLDEST) {
                return new C13351o(function1);
            }
            return new C13335d(i, eVar, function1);
        } else if (eVar == EnumC13337e.SUSPEND) {
            return new C13360v(function1);
        } else {
            return new C13335d(1, eVar, function1);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC13338f m3909b(int i, EnumC13337e eVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = EnumC13337e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return m3910a(i, eVar, function1);
    }
}
