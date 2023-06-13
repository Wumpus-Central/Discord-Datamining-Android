package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

/* loaded from: classes8.dex */
public final class SurveyActionViewBinding {
    public final SimpleDraweeSpanTextView chatListAdapterItemTextFeedback;
    public final SimpleDraweeView chatListFeedbackIcon;
    private final View rootView;
    public final LinearLayout surveyBackground;
    public final CardView surveyCard;

    private SurveyActionViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, CardView cardView) {
        this.rootView = view;
        this.chatListAdapterItemTextFeedback = simpleDraweeSpanTextView;
        this.chatListFeedbackIcon = simpleDraweeView;
        this.surveyBackground = linearLayout;
        this.surveyCard = cardView;
    }

    public static SurveyActionViewBinding bind(View view) {
        int i10 = R.id.chat_list_adapter_item_text_feedback;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.a(view, i10);
        if (simpleDraweeSpanTextView != null) {
            i10 = R.id.chat_list_feedback_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                i10 = R.id.survey_background;
                LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.survey_card;
                    CardView cardView = (CardView) a.a(view, i10);
                    if (cardView != null) {
                        return new SurveyActionViewBinding(view, simpleDraweeSpanTextView, simpleDraweeView, linearLayout, cardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SurveyActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.survey_action_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
