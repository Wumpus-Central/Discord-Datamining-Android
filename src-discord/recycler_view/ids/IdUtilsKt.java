package com.discord.recycler_view.ids;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0010\r\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"convertToId", "", "", "recycler_view_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdUtilsKt {
    public static final long convertToId(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            j10 = (j10 ^ charSequence.charAt(i10)) * 1099511628211L;
        }
        return j10;
    }
}
