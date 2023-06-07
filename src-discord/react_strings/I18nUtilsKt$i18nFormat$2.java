package com.discord.react_strings;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "argName", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class I18nUtilsKt$i18nFormat$2 extends s implements Function3<String, String, Boolean, CharSequence> {
    final /* synthetic */ RenderContext $messageRenderContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I18nUtilsKt$i18nFormat$2(RenderContext renderContext) {
        super(3);
        this.$messageRenderContext = renderContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ CharSequence invoke(String str, String str2, Boolean bool) {
        return invoke(str, str2, bool.booleanValue());
    }

    public final CharSequence invoke(String argName, String str, boolean z10) {
        q.g(argName, "argName");
        String str2 = this.$messageRenderContext.getArgs().get(argName);
        return str2 != null ? str2 : argName;
    }
}
