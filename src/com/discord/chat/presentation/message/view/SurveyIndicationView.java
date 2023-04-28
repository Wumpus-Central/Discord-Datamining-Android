package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C3147R;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.SurveyActionViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/SurveyIndicationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "surveyIndication", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "setSurveyIndication-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lkotlin/jvm/functions/Function2;)V", "setSurveyIndication", "Lcom/discord/chat/databinding/SurveyActionViewBinding;", "binding", "Lcom/discord/chat/databinding/SurveyActionViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SurveyIndicationView extends ConstraintLayout {
    private SurveyActionViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurveyIndicationView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurveyIndicationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ SurveyIndicationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: setSurveyIndication-u7_MRrM  reason: not valid java name */
    public final void m41867setSurveyIndicationu7_MRrM(String messageId, SurveyIndication surveyIndication, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(surveyIndication, "surveyIndication");
        C9677q.m14633g(onLinkClicked, "onLinkClicked");
        SimpleDraweeView simpleDraweeView = this.binding.chatListFeedbackIcon;
        C9677q.m14634f(simpleDraweeView, "binding.chatListFeedbackIcon");
        ReactAssetUtilsKt.setReactImageUrl(simpleDraweeView, surveyIndication.getFeedbackIconUrl());
        SimpleDraweeSpanTextView setSurveyIndication_u7_MRrM$lambda$2 = this.binding.chatListAdapterItemTextFeedback;
        C9677q.m14634f(setSurveyIndication_u7_MRrM$lambda$2, "setSurveyIndication_u7_MRrM$lambda$2");
        StructurableText content = surveyIndication.getContent();
        Context context = setSurveyIndication_u7_MRrM$lambda$2.getContext();
        C9677q.m14634f(context, "context");
        SurveyIndicationView$setSurveyIndication$1$1 surveyIndicationView$setSurveyIndication$1$1 = new SurveyIndicationView$setSurveyIndication$1$1(onLinkClicked, messageId);
        Paint.FontMetrics fontMetrics = setSurveyIndication_u7_MRrM$lambda$2.getPaint().getFontMetrics();
        C9677q.m14634f(fontMetrics, "paint.fontMetrics");
        DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(content, context, messageId, false, false, false, surveyIndicationView$setSurveyIndication$1$1, null, null, null, null, null, null, null, null, null, null, false, null, TextUtilsKt.getBaselineHeight(fontMetrics), 262080, null);
        SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(setSurveyIndication_u7_MRrM$lambda$2));
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setSurveyIndication_u7_MRrM$lambda$2, spannable$default);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setSurveyIndication_u7_MRrM$lambda$2, false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyIndicationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9677q.m14633g(context, "context");
        SurveyActionViewBinding inflate = SurveyActionViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.surveyCard.setCardBackgroundColor(ColorUtilsKt.getThemeColor(context, C3147R.color.white_500, C3147R.color.primary_800));
        SimpleDraweeView simpleDraweeView = this.binding.chatListFeedbackIcon;
        C9677q.m14634f(simpleDraweeView, "binding.chatListFeedbackIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        SimpleDraweeSpanTextView _init_$lambda$0 = this.binding.chatListAdapterItemTextFeedback;
        C9677q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
