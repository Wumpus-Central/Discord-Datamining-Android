package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2549a;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.C5072R;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;

/* loaded from: classes7.dex */
public class ReactScrollViewAccessibilityDelegate extends C2549a {
    private final String TAG = ReactScrollViewAccessibilityDelegate.class.getSimpleName();

    private void onInitializeAccessibilityEventInternal(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_collection);
        if (readableMap2 != null) {
            accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
            if (view instanceof ViewGroup) {
                View childAt2 = ((ViewGroup) view).getChildAt(0);
                if (childAt2 instanceof ViewGroup) {
                    Integer num = null;
                    int i = 0;
                    Integer num2 = null;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt2;
                        if (i < viewGroup.getChildCount()) {
                            View childAt3 = viewGroup.getChildAt(i);
                            if (view instanceof ReactScrollView) {
                                z = ((ReactScrollView) view).isPartiallyScrolledInView(childAt3);
                            } else if (view instanceof ReactHorizontalScrollView) {
                                z = ((ReactHorizontalScrollView) view).isPartiallyScrolledInView(childAt3);
                            } else {
                                return;
                            }
                            int i2 = C5072R.C5074id.accessibility_collection_item;
                            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(i2);
                            if (childAt3 instanceof ViewGroup) {
                                ViewGroup viewGroup2 = (ViewGroup) childAt3;
                                if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(i2)) != null) {
                                    readableMap3 = readableMap;
                                }
                                if (z && readableMap3 != null) {
                                    if (num == null) {
                                        num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                    }
                                    num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                }
                                if (!(num == null || num2 == null)) {
                                    accessibilityEvent.setFromIndex(num.intValue());
                                    accessibilityEvent.setToIndex(num2.intValue());
                                }
                                i++;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    private void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ReactAccessibilityDelegate.AccessibilityRole accessibilityRole = (ReactAccessibilityDelegate.AccessibilityRole) view.getTag(C5072R.C5074id.accessibility_role);
        if (accessibilityRole != null) {
            ReactAccessibilityDelegate.setRole(accessibilityNodeInfoCompat, accessibilityRole, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_collection);
        if (readableMap != null) {
            accessibilityNodeInfoCompat.m37385c0(AccessibilityNodeInfoCompat.C2557b.m37334a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof ReactScrollView) {
            accessibilityNodeInfoCompat.m37343x0(((ReactScrollView) view).getScrollEnabled());
        } else if (view instanceof ReactHorizontalScrollView) {
            accessibilityNodeInfoCompat.m37343x0(((ReactHorizontalScrollView) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.C2549a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof ReactScrollView) || (view instanceof ReactHorizontalScrollView)) {
            onInitializeAccessibilityEventInternal(view, accessibilityEvent);
            return;
        }
        String str = this.TAG;
        ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.C2549a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if ((view instanceof ReactScrollView) || (view instanceof ReactHorizontalScrollView)) {
            onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfoCompat);
            return;
        }
        String str = this.TAG;
        ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }
}
