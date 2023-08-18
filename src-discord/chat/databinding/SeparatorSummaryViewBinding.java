package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


public final class SeparatorSummaryViewBinding {
    public final Guideline bottomGuideline;
    public final FrameLayout buttonWrapper;
    public final SimpleDraweeView icon;
    public final SimpleDraweeView indicatorBottom;
    public final Barrier indicatorEndBarrier;
    public final SimpleDraweeView indicatorTop;
    public final SimpleDraweeView jumpButton;
    public final TextView middleText;
    public final SimpleDraweeView moreButton;
    public final View rightBar;
    private final View rootView;
    public final Guideline topGuideline;

    private SeparatorSummaryViewBinding(View view, Guideline guideline, FrameLayout frameLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, Barrier barrier, SimpleDraweeView simpleDraweeView3, SimpleDraweeView simpleDraweeView4, TextView textView, SimpleDraweeView simpleDraweeView5, View view2, Guideline guideline2) {
        this.rootView = view;
        this.bottomGuideline = guideline;
        this.buttonWrapper = frameLayout;
        this.icon = simpleDraweeView;
        this.indicatorBottom = simpleDraweeView2;
        this.indicatorEndBarrier = barrier;
        this.indicatorTop = simpleDraweeView3;
        this.jumpButton = simpleDraweeView4;
        this.middleText = textView;
        this.moreButton = simpleDraweeView5;
        this.rightBar = view2;
        this.topGuideline = guideline2;
    }

    public static SeparatorSummaryViewBinding bind(View view) {
        View a10;
        int i10 = R.id.bottom_guideline;
        Guideline guideline = (Guideline) a.a(view, i10);
        if (guideline != null) {
            i10 = R.id.button_wrapper;
            FrameLayout frameLayout = (FrameLayout) a.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
                if (simpleDraweeView != null) {
                    i10 = R.id.indicator_bottom;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                    if (simpleDraweeView2 != null) {
                        i10 = R.id.indicator_end_barrier;
                        Barrier barrier = (Barrier) a.a(view, i10);
                        if (barrier != null) {
                            i10 = R.id.indicator_top;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                            if (simpleDraweeView3 != null) {
                                i10 = R.id.jump_button;
                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                if (simpleDraweeView4 != null) {
                                    i10 = R.id.middle_text;
                                    TextView textView = (TextView) a.a(view, i10);
                                    if (textView != null) {
                                        i10 = R.id.more_button;
                                        SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) a.a(view, i10);
                                        if (!(simpleDraweeView5 == null || (a10 = a.a(view, (i10 = R.id.right_bar))) == null)) {
                                            i10 = R.id.top_guideline;
                                            Guideline guideline2 = (Guideline) a.a(view, i10);
                                            if (guideline2 != null) {
                                                return new SeparatorSummaryViewBinding(view, guideline, frameLayout, simpleDraweeView, simpleDraweeView2, barrier, simpleDraweeView3, simpleDraweeView4, textView, simpleDraweeView5, a10, guideline2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SeparatorSummaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.separator_summary_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
