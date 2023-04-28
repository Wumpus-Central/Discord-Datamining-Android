package com.discord.recycler_view.ids;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0010\r\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m15073d2 = {"convertToId", "", "", "recycler_view_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class IdUtilsKt {
    public static final long convertToId(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long j = -3750763034362895579L;
        for (int i = 0; i < charSequence.length(); i++) {
            j = (j ^ charSequence.charAt(i)) * 1099511628211L;
        }
        return j;
    }
}
