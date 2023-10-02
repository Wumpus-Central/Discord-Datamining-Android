package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/view/SurveyIndicationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "surveyIndication", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "setSurveyIndication-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lkotlin/jvm/functions/Function2;)V", "setSurveyIndication", "Lcom/discord/chat/databinding/SurveyActionViewBinding;", "binding", "Lcom/discord/chat/databinding/SurveyActionViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class SurveyIndicationView extends ConstraintLayout {
    private SurveyActionViewBinding binding;

    
    public SurveyIndicationView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public SurveyIndicationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  SurveyIndicationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public final void m354setSurveyIndicationu7_MRrM(String messageId, SurveyIndication surveyIndication, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        q.h(messageId, "messageId");
        q.h(surveyIndication, "surveyIndication");
        q.h(onLinkClicked, "onLinkClicked");
        SimpleDraweeView simpleDraweeView = this.binding.chatListFeedbackIcon;
        q.g(simpleDraweeView, "binding.chatListFeedbackIcon");
        ReactAssetUtilsKt.setReactImageUrl(simpleDraweeView, surveyIndication.getFeedbackIconUrl());
        SimpleDraweeSpanTextView setSurveyIndication_u7_MRrM$lambda$2 = this.binding.chatListAdapterItemTextFeedback;
        q.g(setSurveyIndication_u7_MRrM$lambda$2, "setSurveyIndication_u7_MRrM$lambda$2");
        StructurableText content = surveyIndication.getContent();
        Context context = setSurveyIndication_u7_MRrM$lambda$2.getContext();
        Paint.FontMetrics fontMetrics = setSurveyIndication_u7_MRrM$lambda$2.getPaint().getFontMetrics();
        q.g(fontMetrics, "paint.fontMetrics");
        float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
        TextPaint paint = this.binding.chatListAdapterItemTextFeedback.getPaint();
        q.g(context, "context");
        q.g(paint, "paint");
        DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(content, context, messageId, false, false, false, paint, new SurveyIndicationView$setSurveyIndication$1$1(onLinkClicked, messageId), null, null, null, null, null, null, null, null, null, null, false, null, baselineHeight, 524160, null);
        SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(setSurveyIndication_u7_MRrM$lambda$2));
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setSurveyIndication_u7_MRrM$lambda$2, spannable$default);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setSurveyIndication_u7_MRrM$lambda$2, false, 1, null);
    }

    
    public SurveyIndicationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        SurveyActionViewBinding inflate = SurveyActionViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.surveyCard.setCardBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.white_500, R.color.primary_800));
        SimpleDraweeView simpleDraweeView = this.binding.chatListFeedbackIcon;
        q.g(simpleDraweeView, "binding.chatListFeedbackIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        SimpleDraweeSpanTextView _init_$lambda$0 = this.binding.chatListAdapterItemTextFeedback;
        q.g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
