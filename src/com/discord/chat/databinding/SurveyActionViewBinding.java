package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.discord.chat.C3147R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes4.dex */
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
        int i = C3147R.C3149id.chat_list_adapter_item_text_feedback;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C13836a.m2313a(view, i);
        if (simpleDraweeSpanTextView != null) {
            i = C3147R.C3149id.chat_list_feedback_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                i = C3147R.C3149id.survey_background;
                LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
                if (linearLayout != null) {
                    i = C3147R.C3149id.survey_card;
                    CardView cardView = (CardView) C13836a.m2313a(view, i);
                    if (cardView != null) {
                        return new SurveyActionViewBinding(view, simpleDraweeSpanTextView, simpleDraweeView, linearLayout, cardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SurveyActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3147R.layout.survey_action_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
