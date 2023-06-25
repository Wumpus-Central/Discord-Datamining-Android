package com.discord.emoji;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.discord.emoji.RenderableEmoji;
import com.facebook.drawee.controller.a;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import m3.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aP\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001aH\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001aZ\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¨\u0006\u0014"}, d2 = {"Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "builder", "Lcom/discord/emoji/RenderableEmoji;", "emoji", "Landroid/content/Context;", "context", "", "sizePx", "", "allowAnimation", "verticalAlignment", "Lkotlin/Function1;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "", "additionalBuilderActions", "renderEmojiInto", "renderEmoji", "", "src", "contentDescription", "emoji_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RenderableEmojiKt {
    public static final DraweeSpanStringBuilder renderEmoji(RenderableEmoji emoji, Context context, int i10, boolean z10, int i11, Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        q.g(emoji, "emoji");
        q.g(context, "context");
        q.g(additionalBuilderActions, "additionalBuilderActions");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        renderEmojiInto(draweeSpanStringBuilder, emoji, context, i10, z10, i11, additionalBuilderActions);
        return draweeSpanStringBuilder;
    }

    public static /* synthetic */ DraweeSpanStringBuilder renderEmoji$default(RenderableEmoji renderableEmoji, Context context, int i10, boolean z10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 2;
        }
        if ((i12 & 32) != 0) {
            function1 = RenderableEmojiKt$renderEmoji$1.INSTANCE;
        }
        return renderEmoji(renderableEmoji, context, i10, z10, i11, function1);
    }

    public static final void renderEmojiInto(DraweeSpanStringBuilder builder, RenderableEmoji emoji, Context context, int i10, boolean z10, int i11, Function1<? super GenericDraweeHierarchyBuilder, Unit> additionalBuilderActions) {
        String exception;
        q.g(builder, "builder");
        q.g(emoji, "emoji");
        q.g(context, "context");
        q.g(additionalBuilderActions, "additionalBuilderActions");
        SpannableStringBuilder spannableStringBuilder = null;
        RenderableEmoji.Unicode unicode = emoji instanceof RenderableEmoji.Unicode ? (RenderableEmoji.Unicode) emoji : null;
        if (!(unicode == null || (exception = unicode.getException()) == null)) {
            spannableStringBuilder = builder.append((CharSequence) exception);
        }
        if (spannableStringBuilder == null) {
            renderEmojiInto(builder, emoji.getUrl(z10, i10), emoji.getContentDescription(), context, i10, z10, i11, additionalBuilderActions);
        }
    }

    public static /* synthetic */ void renderEmojiInto$default(DraweeSpanStringBuilder draweeSpanStringBuilder, RenderableEmoji renderableEmoji, Context context, int i10, boolean z10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = 2;
        }
        if ((i12 & 64) != 0) {
            function1 = RenderableEmojiKt$renderEmojiInto$1.INSTANCE;
        }
        renderEmojiInto(draweeSpanStringBuilder, renderableEmoji, context, i10, z10, i11, function1);
    }

    public static final void renderEmojiInto(DraweeSpanStringBuilder draweeSpanStringBuilder, String str, String str2, Context context, int i10, boolean z10, int i11, Function1<? super GenericDraweeHierarchyBuilder, Unit> function1) {
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        a c10 = c.g().z(z10).D(ImageRequestBuilder.s(Uri.parse(str)).E(new ResizeOptions(i10, i10)).z(ImageRequest.RequestLevel.FULL_FETCH).a()).B(str2).build();
        GenericDraweeHierarchyBuilder w10 = GenericDraweeHierarchyBuilder.u(context.getResources()).w(ScalingUtils.ScaleType.f7799e);
        function1.invoke(w10);
        draweeSpanStringBuilder.j(context, w10.a(), c10, length, i10, i10, false, i11);
    }
}
