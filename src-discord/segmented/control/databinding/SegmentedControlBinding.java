package com.discord.segmented.control.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.discord.segmented.control.R;
import x1.a;

/* loaded from: classes7.dex */
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
        int i10 = R.id.segmentContainer;
        LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
        if (linearLayout != null) {
            i10 = R.id.selectedSegmentBg;
            CardView cardView2 = (CardView) a.a(view, i10);
            if (cardView2 != null) {
                return new SegmentedControlBinding(cardView, cardView, linearLayout, cardView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SegmentedControlBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.segmented_control, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
