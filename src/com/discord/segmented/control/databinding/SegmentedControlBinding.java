package com.discord.segmented.control.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.discord.segmented.control.C4713R;
import p412x1.C13922a;

/* loaded from: classes6.dex */
public final class SegmentedControlBinding {
    public final CardView rootCardView;
    private final CardView rootView;
    public final LinearLayout segmentContainer;
    public final CardView selectedSegmentBg;

    private SegmentedControlBinding(CardView cardView, CardView cardView2, LinearLayout linearLayout, CardView cardView3) {
        this.rootView = cardView;
        this.rootCardView = cardView2;
        this.segmentContainer = linearLayout;
        this.selectedSegmentBg = cardView3;
    }

    public static SegmentedControlBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = C4713R.C4715id.segmentContainer;
        LinearLayout linearLayout = (LinearLayout) C13922a.m2313a(view, i);
        if (linearLayout != null) {
            i = C4713R.C4715id.selectedSegmentBg;
            CardView cardView2 = (CardView) C13922a.m2313a(view, i);
            if (cardView2 != null) {
                return new SegmentedControlBinding(cardView, cardView, linearLayout, cardView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4713R.layout.segmented_control, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
