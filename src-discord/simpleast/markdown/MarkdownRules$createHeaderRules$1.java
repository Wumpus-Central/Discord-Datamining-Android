package com.discord.simpleast.markdown;

import android.content.Context;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"spanProvider", "Landroid/text/style/CharacterStyle;", "R", "S", "header", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class MarkdownRules$createHeaderRules$1 extends s implements Function1<Integer, CharacterStyle> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List $headerStyles;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownRules$createHeaderRules$1(Context context, List list) {
        super(1);
        this.$context = context;
        this.$headerStyles = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharacterStyle invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final CharacterStyle invoke(int i10) {
        if (i10 == 0) {
            return new TextAppearanceSpan(this.$context, ((Number) this.$headerStyles.get(0)).intValue());
        }
        return (1 <= i10 && this.$headerStyles.size() >= i10) ? new TextAppearanceSpan(this.$context, ((Number) this.$headerStyles.get(i10 - 1)).intValue()) : new StyleSpan(3);
    }
}
