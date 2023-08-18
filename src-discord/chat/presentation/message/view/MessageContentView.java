package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.span.utilities.spannable.BoldSpan;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.QuoteSpan;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import jf.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB'\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010C\u001a\u00020\u0007¢\u0006\u0004\bD\u0010EJI\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u008d\u0003\u00103\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\f0\u001f2*\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\f0!2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0'2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020,0\u000b2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00100\u001a\u00020/ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0012\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0016J\u0011\u00107\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b7\u00108R\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00109R\u001b\u0010>\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/discord/chat/presentation/message/view/MessageContentView;", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/truncation/Truncation;", "truncation", "", "constrainedWidth", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "spannableStringBuilder", "Lkotlin/Function1;", "", "onTapSeeMore", "truncate-pPZZVto", "(Ljava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;ILcom/facebook/drawee/span/DraweeSpanStringBuilder;Lkotlin/jvm/functions/Function1;)V", "truncate", "Landroid/text/SpannableStringBuilder;", "", "editedLabel", "appendEditedLabel", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageContent", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyleProvider", "bottomSpacingPx", "Lcom/discord/theme/DiscordTheme;", "theme", "setMessageContent-2i9KL1s", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V", "setMessageContent", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "spacingPxOverride", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "shadowView$delegate", "Lkotlin/Lazy;", "getShadowView", "()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "shadowView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageContentView extends SimpleDraweeSpanTextView implements VerticalSpacingItemDecoration.SpacingProviderView {
    public static final Companion Companion = new Companion(null);
    private static final float LINE_SPACING_ADD = 0.0f;
    private static final float LINE_SPACING_MULT = 1.05f;
    private Integer bottomSpacingPx;
    private final Lazy shadowView$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;", "", "()V", "LINE_SPACING_ADD", "", "LINE_SPACING_MULT", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public MessageContentView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public MessageContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  MessageContentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void appendEditedLabel(SpannableStringBuilder spannableStringBuilder, String str) {
        Object E;
        Object[] spans = spannableStringBuilder.getSpans(spannableStringBuilder.length(), spannableStringBuilder.length(), QuoteSpan.class);
        q.g(spans, "spannableStringBuilder.g…an::class.java,\n        )");
        E = f.E(spans);
        QuoteSpan quoteSpan = (QuoteSpan) E;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (" (" + str + ")"));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextMuted()), length, spannableStringBuilder.length(), 33);
        if (quoteSpan != null) {
            spannableStringBuilder.setSpan(quoteSpan, spannableStringBuilder.getSpanStart(quoteSpan), spannableStringBuilder.length(), spannableStringBuilder.getSpanFlags(quoteSpan));
        }
    }

    private final SimpleDraweeSpanTextView getShadowView() {
        return (SimpleDraweeSpanTextView) this.shadowView$delegate.getValue();
    }

    
    public static  void m323setMessageContent2i9KL1s$default(MessageContentView messageContentView, StructurableText structurableText, String str, boolean z10, boolean z11, boolean z12, Function2 function2, Function1 function1, Function3 function3, Function4 function4, Function2 function22, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i10, int i11, String str2, Truncation truncation, DiscordTheme discordTheme, int i12, Object obj) {
        messageContentView.m325setMessageContent2i9KL1s(structurableText, str, z10, z11, z12, function2, function1, function3, function4, function22, function12, function13, function0, function14, function15, function16, (i12 & 65536) != 0 ? MessageContentView$setMessageContent$1.INSTANCE : function17, i10, i11, (i12 & 524288) != 0 ? null : str2, (i12 & 1048576) != 0 ? null : truncation, (i12 & 2097152) != 0 ? ThemeManagerKt.getTheme() : discordTheme);
    }

    
    private final void m324truncatepPZZVto(String str, Truncation truncation, int i10, DraweeSpanStringBuilder draweeSpanStringBuilder, Function1<? super MessageId, Unit> function1) {
        int i11;
        int i12;
        boolean c10 = q.c(truncation.getForceShow(), Boolean.TRUE);
        int numberOfLines = truncation.getNumberOfLines();
        String seeMoreLabel = truncation.getSeeMoreLabel();
        Integer seeMoreLabelColor = truncation.getSeeMoreLabelColor();
        int width = MessageAccessoriesView.Companion.getWidth(i10);
        getShadowView().setTypeface(getTypeface());
        getShadowView().setTextSize(0, getTextSize());
        getShadowView().setLineSpacing(LINE_SPACING_ADD, LINE_SPACING_MULT);
        getShadowView().setDraweeSpanStringBuilder(draweeSpanStringBuilder);
        getShadowView().measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        getShadowView().layout(0, 0, getShadowView().getMeasuredWidth(), getShadowView().getMeasuredHeight());
        Layout layout = getShadowView().getLayout();
        int lineCount = getShadowView().getLineCount();
        if (lineCount > numberOfLines || c10) {
            if (c10) {
                i11 = lineCount - 1;
            } else {
                i11 = numberOfLines - 1;
            }
            int lineVisibleEnd = layout.getLineVisibleEnd(i11);
            draweeSpanStringBuilder.replace(lineVisibleEnd, draweeSpanStringBuilder.length(), (CharSequence) (ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + seeMoreLabel));
            NestedClickableSpan.TouchPriority touchPriority = NestedClickableSpan.TouchPriority.HIGH;
            if (seeMoreLabelColor != null) {
                i12 = seeMoreLabelColor.intValue();
            } else {
                i12 = ThemeManagerKt.getTheme().getTextLink();
            }
            draweeSpanStringBuilder.setSpan(new ClickableSpan(touchPriority, Integer.valueOf(i12), null, new MessageContentView$truncate$1(function1, str), 4, null), lineVisibleEnd, draweeSpanStringBuilder.length(), 33);
            draweeSpanStringBuilder.setSpan(new BoldSpan(), lineVisibleEnd, draweeSpanStringBuilder.length(), 33);
        }
    }

    
    
    
    
    
    public final void m325setMessageContent2i9KL1s(com.discord.chat.bridge.structurabletext.StructurableText r25, java.lang.String r26, boolean r27, boolean r28, boolean r29, kotlin.jvm.functions.Function2<? super com.discord.primitives.MessageId, ? super com.discord.chat.bridge.contentnode.LinkContentNode, kotlin.Unit> r30, kotlin.jvm.functions.Function1<? super com.discord.chat.bridge.contentnode.LinkContentNode, kotlin.Unit> r31, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r32, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r34, kotlin.jvm.functions.Function1<? super com.discord.chat.bridge.contentnode.CommandMentionContentNode, kotlin.Unit> r35, kotlin.jvm.functions.Function1<? super com.discord.chat.bridge.contentnode.CommandMentionContentNode, kotlin.Unit> r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super com.discord.chat.bridge.contentnode.EmojiContentNode, kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super com.discord.primitives.MessageId, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super com.discord.chat.bridge.contentnode.LinkContentNode, com.discord.chat.presentation.textutils.LinkStyle> r41, int r42, int r43, java.lang.String r44, com.discord.chat.bridge.truncation.Truncation r45, com.discord.theme.DiscordTheme r46) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.MessageContentView.m325setMessageContent2i9KL1s(com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, int, java.lang.String, com.discord.chat.bridge.truncation.Truncation, com.discord.theme.DiscordTheme):void");
    }

    @Override 
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("MessageContentView uses custom touch handling. click listeners are not supported");
    }

    @Override 
    public Integer spacingPxOverride() {
        return this.bottomSpacingPx;
    }

    
    public MessageContentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Lazy b10;
        q.h(context, "context");
        b10 = n.b(new MessageContentView$shadowView$2(this));
        this.shadowView$delegate = b10;
        setLineSpacing(LINE_SPACING_ADD, LINE_SPACING_MULT);
        setImportantForAccessibility(4);
    }
}
