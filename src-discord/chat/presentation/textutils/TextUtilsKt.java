package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LeadingMarginSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.StaticChannelMentionType;
import com.discord.chat.bridge.contentnode.TextContentNode;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.PrimitiveStructurableText;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import com.discord.span.utilities.spannable.BulletSpan;
import com.discord.span.utilities.spannable.OrderedListBulletSpan;
import com.discord.span.utilities.spannable.VerticalPaddingSpan;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.controller.a;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.a;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;
import l3.c;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001aò\u0002\u0010)\u001a\u00020(*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2$\b\u0002\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u00142,\b\u0002\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u00162\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u000f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0002\u001a\"\u0010/\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(H\u0002\u001a$\u0010)\u001a\u00020(*\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020(H\u0002\u001a]\u00108\u001a\u00020\u0011*\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u00101\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u0002022\b\b\u0001\u00104\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u0001022\b\b\u0002\u00106\u001a\u00020\u00022\b\b\u0002\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109\u001a*\u0010<\u001a\u00020\u0011*\u00020(2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\u0006\u0010;\u001a\u00020\tH\u0002\u001a\u0012\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u001a\u0010@\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\u0002H\u0002\u001a\u0010\u0010A\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0007H\u0002\u001a\u0018\u0010D\u001a\u00020C2\u0006\u0010-\u001a\u00020,2\u0006\u0010B\u001a\u000202H\u0002\u001a\f\u0010E\u001a\u00020\u0011*\u00020(H\u0002\"\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010G¨\u0006I"}, d2 = {"Landroid/graphics/Paint$FontMetrics;", "fontMetrics", "", "getBaselineHeight", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "Landroid/content/Context;", "context", "", "containerId", "", "animateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "Lkotlin/Function2;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyle", "Lkotlin/Function0;", "onTapSpoiler", "singleLine", "Lcom/discord/theme/DiscordTheme;", "theme", "baselineHeight", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "toSpannable", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/presentation/textutils/RenderContext;", "rc", "existingBuilder", "appendToExistingBuilder", "builder", "imageUrl", "", "width", "height", ViewProps.FOREGROUND_COLOR, "cornerRadius", "iconPadding", "appendImage", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V", "content", "isOrderedList", "appendBulletPoint", "iconType", "", "getIconSizeMultiplier", "getIconSize", "getIconPaddingMultiplier", ViewProps.BACKGROUND_COLOR, "Lcom/discord/span/utilities/spannable/BackgroundSpan;", "makeMentionBackgroundSpan", "simulateInlineNewline", "CHANNEL_PREFIX", "Ljava/lang/String;", "COMMAND_PREFIX", "chat_release"}, k = 2, mv = {1, 8, 0})

public final class TextUtilsKt {
    private static final String CHANNEL_PREFIX = "#";
    private static final String COMMAND_PREFIX = "/";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticChannelMentionType.values().length];
            try {
                iArr[StaticChannelMentionType.Home.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticChannelMentionType.Browse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticChannelMentionType.Customize.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void appendBulletPoint(DraweeSpanStringBuilder draweeSpanStringBuilder, List<? extends ContentNode> list, RenderContext renderContext, boolean z10) {
        Paint.Style style;
        String str;
        List d10;
        long j10;
        long j11;
        List d11;
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        int listNestedLevel = renderContext.getListNestedLevel();
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(SizeUtilsKt.getDpToPx(listNestedLevel * 16));
        int dpToPx2 = SizeUtilsKt.getDpToPx(2);
        VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(dpToPx2);
        if (z10) {
            Long listOrderedIndex = renderContext.getListOrderedIndex();
            if (listOrderedIndex != null) {
                j10 = listOrderedIndex.longValue();
            } else {
                j10 = 1;
            }
            Long listLargestOrderedIndex = renderContext.getListLargestOrderedIndex();
            if (listLargestOrderedIndex != null) {
                j11 = listLargestOrderedIndex.longValue();
            } else {
                j11 = 1;
            }
            if (renderContext.getSingleLine()) {
                d11 = i.d(new TextContentNode(j10 + ".  "));
                appendToExistingBuilder(d11, renderContext, draweeSpanStringBuilder);
                appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
                return;
            }
            Object[] objArr = {standard, new OrderedListBulletSpan(j10, dpToPx, j11, renderContext.getPaint()), verticalPaddingSpan};
            int length = draweeSpanStringBuilder.length();
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            SpannableStringBuilderExtensionsKt.ensureNewline(draweeSpanStringBuilder, new AbsoluteSizeSpan(dpToPx2));
            for (int i10 = 0; i10 < 3; i10++) {
                Object obj = objArr[i10];
                if (obj != null) {
                    draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
                }
            }
        } else if (renderContext.getSingleLine()) {
            if (renderContext.getListNestedLevel() == 0) {
                str = "•  ";
            } else {
                str = "◦  ";
            }
            d10 = i.d(new TextContentNode(str));
            appendToExistingBuilder(d10, renderContext, draweeSpanStringBuilder);
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
        } else {
            int dpToPx3 = SizeUtilsKt.getDpToPx(2);
            int themeColor = ColorUtilsKt.getThemeColor(renderContext.getContext(), R.color.primary_360, R.color.primary_400, renderContext.getTheme());
            if (listNestedLevel > 0) {
                style = Paint.Style.STROKE;
            } else {
                style = Paint.Style.FILL;
            }
            Object[] objArr2 = {standard, new BulletSpan(themeColor, dpToPx, false, dpToPx3, 0.0f, style, 20, null), verticalPaddingSpan};
            int length2 = draweeSpanStringBuilder.length();
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            SpannableStringBuilderExtensionsKt.ensureNewline(draweeSpanStringBuilder, new AbsoluteSizeSpan(dpToPx2));
            for (int i11 = 0; i11 < 3; i11++) {
                Object obj2 = objArr2[i11];
                if (obj2 != null) {
                    draweeSpanStringBuilder.setSpan(obj2, length2, draweeSpanStringBuilder.length(), 33);
                }
            }
        }
    }

    public static final void appendImage(DraweeSpanStringBuilder draweeSpanStringBuilder, Context context, RenderContext rc2, String imageUrl, int i10, int i11, Integer num, float f10, float f11) {
        q.h(draweeSpanStringBuilder, "<this>");
        q.h(context, "context");
        q.h(rc2, "rc");
        q.h(imageUrl, "imageUrl");
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        a c10 = c.g().D(ImageRequestBuilder.s(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(context, imageUrl))).a()).build();
        q.g(c10, "newDraweeControllerBuild…build())\n        .build()");
        GenericDraweeHierarchyBuilder w10 = GenericDraweeHierarchyBuilder.u(context.getResources()).w(ScalingUtils.ScaleType.f7532e);
        com.facebook.drawee.generic.a a10 = com.facebook.drawee.generic.a.a(f10);
        a10.r(f11);
        a10.u(a.EnumC0113a.BITMAP_ONLY);
        w10.K(a10);
        if (rc2.spoilerIsHidden()) {
            w10.v(new PorterDuffColorFilter(rc2.getTheme().getSpoilerHiddenBackground(), PorterDuff.Mode.SRC_IN));
        } else if (num != null) {
            w10.v(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        q.g(w10, "newInstance(context.reso…)\n            }\n        }");
        draweeSpanStringBuilder.j(context, w10.a(), c10, length, i10, i11, false, 2);
    }

    public static  void appendImage$default(DraweeSpanStringBuilder draweeSpanStringBuilder, Context context, RenderContext renderContext, String str, int i10, int i11, Integer num, float f10, float f11, int i12, Object obj) {
        appendImage(draweeSpanStringBuilder, context, renderContext, str, i10, i11, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? 0.0f : f10, (i12 & 128) != 0 ? 0.0f : f11);
    }

    private static final void appendToExistingBuilder(List<? extends ContentNode> list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        toSpannable(list, renderContext, draweeSpanStringBuilder);
    }

    public static final float getBaselineHeight(Paint.FontMetrics fontMetrics) {
        q.h(fontMetrics, "fontMetrics");
        return fontMetrics.descent - fontMetrics.ascent;
    }

    private static final float getIconPaddingMultiplier(String str) {
        boolean z10;
        if (q.c(str, "post")) {
            z10 = true;
        } else {
            z10 = q.c(str, "forum");
        }
        if (z10) {
            return 0.2f;
        }
        return 0.0f;
    }

    private static final int getIconSize(String str, float f10) {
        int dpToPx = SizeUtilsKt.getDpToPx(20);
        if (f10 >= 0.0f) {
            return (int) (f10 * getIconSizeMultiplier(str));
        }
        return dpToPx;
    }

    
    
    private static final double getIconSizeMultiplier(java.lang.String r2) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.textutils.TextUtilsKt.getIconSizeMultiplier(java.lang.String):double");
    }

    private static final BackgroundSpan makeMentionBackgroundSpan(RenderContext renderContext, int i10) {
        int i11;
        if (renderContext.spoilerExists()) {
            i10 = renderContext.getTheme().getSpoilerHiddenBackground();
        }
        if (renderContext.spoilerExists()) {
            i11 = 0;
        } else {
            i11 = 3;
        }
        return new BackgroundSpan(new BackgroundStyle(i10, i11));
    }

    private static final void simulateInlineNewline(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        draweeSpanStringBuilder.append("    ");
    }

    public static final DraweeSpanStringBuilder toSpannable(StructurableText structurableText, Context context, String containerId, boolean z10, boolean z11, boolean z12, Paint paint, Function1<? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function0<Unit> onTapSpoiler, boolean z13, DiscordTheme theme, float f10) {
        q.h(structurableText, "<this>");
        q.h(context, "context");
        q.h(containerId, "containerId");
        q.h(paint, "paint");
        q.h(onLinkClicked, "onLinkClicked");
        q.h(onLongTapLink, "onLongTapLink");
        q.h(onTapChannel, "onTapChannel");
        q.h(onLongPressChannel, "onLongPressChannel");
        q.h(onTapMention, "onTapMention");
        q.h(onTapCommand, "onTapCommand");
        q.h(onLongPressCommand, "onLongPressCommand");
        q.h(onTapTimestamp, "onTapTimestamp");
        q.h(onTapEmoji, "onTapEmoji");
        q.h(linkStyle, "linkStyle");
        q.h(onTapSpoiler, "onTapSpoiler");
        q.h(theme, "theme");
        if (structurableText instanceof AnnotatedStructurableText) {
            return toSpannable$default(((AnnotatedStructurableText) structurableText).getContent(), new RenderContext(context, containerId, onLinkClicked, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, z10, z11, z12, z13, paint, null, 0, null, null, null, theme, f10, null, 41680896, null), null, 2, null);
        }
        if (structurableText instanceof PrimitiveStructurableText) {
            return new DraweeSpanStringBuilder(((PrimitiveStructurableText) structurableText).getContent());
        }
        throw new pf.q();
    }

    public static  DraweeSpanStringBuilder toSpannable$default(StructurableText structurableText, Context context, String str, boolean z10, boolean z11, boolean z12, Paint paint, Function1 function1, Function1 function12, Function3 function3, Function4 function4, Function2 function2, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function0 function0, boolean z13, DiscordTheme discordTheme, float f10, int i10, Object obj) {
        return toSpannable(structurableText, context, str, z10, z11, z12, paint, (i10 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : function1, (i10 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function12, (i10 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (i10 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : function4, (i10 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function2, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : function13, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : function14, (i10 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : function15, (i10 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function16, (32768 & i10) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : function17, (65536 & i10) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & i10) != 0 ? false : z13, (262144 & i10) != 0 ? ThemeManagerKt.getTheme() : discordTheme, (i10 & 524288) != 0 ? -1.0f : f10);
    }

    
    
    
    private static final com.facebook.drawee.span.DraweeSpanStringBuilder toSpannable(java.util.List<? extends com.discord.chat.bridge.contentnode.ContentNode> r85, com.discord.chat.presentation.textutils.RenderContext r86, com.facebook.drawee.span.DraweeSpanStringBuilder r87) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.textutils.TextUtilsKt.toSpannable(java.util.List, com.discord.chat.presentation.textutils.RenderContext, com.facebook.drawee.span.DraweeSpanStringBuilder):com.facebook.drawee.span.DraweeSpanStringBuilder");
    }

    static  DraweeSpanStringBuilder toSpannable$default(List list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        }
        return toSpannable(list, renderContext, draweeSpanStringBuilder);
    }
}
