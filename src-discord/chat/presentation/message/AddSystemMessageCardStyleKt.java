package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.presentation.message.view.GetEmbedBackgroundColorKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"addSystemMessageCardStyle", "", "Landroid/view/View;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddSystemMessageCardStyleKt {
    public static final void addSystemMessageCardStyle(View view) {
        q.g(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), SizeUtilsKt.getDpToPx(8), view.getPaddingEnd(), SizeUtilsKt.getDpToPx(8));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(view, ColorUtilsKt.getColorCompat(view, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
    }
}
