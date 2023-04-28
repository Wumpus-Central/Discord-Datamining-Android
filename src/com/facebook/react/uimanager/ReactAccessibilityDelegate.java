package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.react.C5072R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class ReactAccessibilityDelegate extends ExploreByTouchHelper {
    private static final int SEND_EVENT = 1;
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_DISABLED = "disabled";
    private static final String STATE_SELECTED = "selected";
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";
    public static final HashMap<String, Integer> sActionIdMap;
    private static int sCounter = 1056964608;
    View mAccessibilityLabelledBy;
    private final AccessibilityLinks mAccessibilityLinks;
    private final View mView;
    private final HashMap<Integer, String> mAccessibilityActionsMap = new HashMap<>();
    private Handler mHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$3 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole */
        static final /* synthetic */ int[] f37196x27e8253f;

        static {
            int[] iArr = new int[AccessibilityRole.values().length];
            f37196x27e8253f = iArr;
            try {
                iArr[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.IMAGEBUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.KEYBOARDKEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.ADJUSTABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.CHECKBOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.RADIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.SPINBUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.SWITCH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.GRID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.NONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.LINK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.SUMMARY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.HEADER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.ALERT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.COMBOBOX.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.MENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.MENUBAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.MENUITEM.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.PROGRESSBAR.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.RADIOGROUP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.SCROLLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TABLIST.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TIMER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f37196x27e8253f[AccessibilityRole.TOOLBAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class AccessibilityLinks {
        private final List<AccessibleLink> mLinks;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public static class AccessibleLink {
            public String description;
            public int end;

            /* renamed from: id */
            public int f8721id;
            public int start;

            private AccessibleLink() {
            }
        }

        public AccessibilityLinks(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < clickableSpanArr.length; i++) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    AccessibleLink accessibleLink = new AccessibleLink();
                    accessibleLink.description = spannable.subSequence(spanStart, spanEnd).toString();
                    accessibleLink.start = spanStart;
                    accessibleLink.end = spanEnd;
                    accessibleLink.f8721id = (clickableSpanArr.length - 1) - i;
                    arrayList.add(accessibleLink);
                }
            }
            this.mLinks = arrayList;
        }

        public AccessibleLink getLinkById(int i) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.f8721id == i) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public AccessibleLink getLinkBySpanPos(int i, int i2) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.start == i && accessibleLink.end == i2) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public int size() {
            return this.mLinks.size();
        }
    }

    /* loaded from: classes7.dex */
    public enum AccessibilityRole {
        NONE,
        BUTTON,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        TOOLBAR;

        public static AccessibilityRole fromValue(String str) {
            AccessibilityRole[] values;
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (AnonymousClass3.f37196x27e8253f[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.ToggleButton";
                case 3:
                    return "android.widget.EditText";
                case 4:
                    return "android.widget.ImageView";
                case 5:
                    return "android.widget.ImageButon";
                case 6:
                    return "android.inputmethodservice.Keyboard$Key";
                case 7:
                    return "android.widget.TextView";
                case 8:
                    return "android.widget.SeekBar";
                case 9:
                    return "android.widget.CheckBox";
                case 10:
                    return "android.widget.RadioButton";
                case 11:
                    return "android.widget.SpinButton";
                case 12:
                    return "android.widget.Switch";
                case 13:
                    return "android.widget.AbsListView";
                case 14:
                    return "android.widget.GridView";
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        sActionIdMap = hashMap;
        hashMap.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.C2556a.f3561i.m37337b()));
        hashMap.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.C2556a.f3562j.m37337b()));
        hashMap.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.C2556a.f3569q.m37337b()));
        hashMap.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.C2556a.f3570r.m37337b()));
    }

    public ReactAccessibilityDelegate(View view, boolean z, int i) {
        super(view);
        this.mView = view;
        view.setFocusable(z);
        C2733w0.m37064A0(view, i);
        this.mAccessibilityLinks = (AccessibilityLinks) view.getTag(C5072R.C5074id.accessibility_links);
    }

    private Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        float f;
        View view = this.mView;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.mView.getWidth(), this.mView.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        Rect rect = new Rect();
        double d = accessibleLink.end;
        double primaryHorizontal = layout.getPrimaryHorizontal(r4);
        Paint paint = new Paint();
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) getFirstSpan(accessibleLink.start, accessibleLink.end, AbsoluteSizeSpan.class);
        if (absoluteSizeSpan != null) {
            f = absoluteSizeSpan.getSize();
        } else {
            f = textView.getTextSize();
        }
        paint.setTextSize(f);
        int ceil = (int) Math.ceil(paint.measureText(accessibleLink.description));
        int lineForOffset = layout.getLineForOffset(r4);
        if (lineForOffset != layout.getLineForOffset((int) d)) {
            z = true;
        }
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (rect.left + ((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()));
        if (z) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i = rect.left;
        return new Rect(i, rect.top, ceil + i, rect.bottom);
    }

    public static void resetDelegate(View view, boolean z, int i) {
        C2733w0.m36990q0(view, new ReactAccessibilityDelegate(view, z, i));
    }

    private void scheduleAccessibilityEventSender(View view) {
        if (this.mHandler.hasMessages(1, view)) {
            this.mHandler.removeMessages(1, view);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, view), 200L);
    }

    public static void setDelegate(View view, boolean z, int i) {
        if (C2733w0.m37037O(view)) {
            return;
        }
        if (view.getTag(C5072R.C5074id.accessibility_role) != null || view.getTag(C5072R.C5074id.accessibility_state) != null || view.getTag(C5072R.C5074id.accessibility_actions) != null || view.getTag(C5072R.C5074id.react_test_id) != null || view.getTag(C5072R.C5074id.accessibility_collection_item) != null || view.getTag(C5072R.C5074id.accessibility_links) != null) {
            C2733w0.m36990q0(view, new ReactAccessibilityDelegate(view, z, i));
        }
    }

    public static void setRole(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        accessibilityNodeInfoCompat.m37389a0(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.link_description));
        } else if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.image_description));
        } else if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.imagebutton_description));
            accessibilityNodeInfoCompat.m37387b0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.BUTTON)) {
            accessibilityNodeInfoCompat.m37387b0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.TOGGLEBUTTON)) {
            accessibilityNodeInfoCompat.m37387b0(true);
            accessibilityNodeInfoCompat.m37392Y(true);
        } else if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.summary_description));
        } else if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37332a(0, 1, 0, 1, true));
        } else if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.alert_description));
        } else if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.combobox_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.menu_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.menubar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.menuitem_description));
        } else if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.progressbar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.radiogroup_description));
        } else if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.scrollbar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.spinbutton_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.rn_tab_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.tablist_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.timer_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            accessibilityNodeInfoCompat.m37347v0(context.getString(C5072R.string.toolbar_description));
        }
    }

    private static void setState(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        int i;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals(STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.m37341y0(dynamic.asBoolean());
            } else if (nextKey.equals(STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.m37379f0(!dynamic.asBoolean());
            } else if (nextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.m37392Y(true);
                accessibilityNodeInfoCompat.m37391Z(asBoolean);
                if (accessibilityNodeInfoCompat.m37360p().equals(AccessibilityRole.getValue(AccessibilityRole.SWITCH))) {
                    if (asBoolean) {
                        i = C5072R.string.state_on_description;
                    } else {
                        i = C5072R.string.state_off_description;
                    }
                    accessibilityNodeInfoCompat.m37418D0(context.getString(i));
                }
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C2549a
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mAccessibilityLinks != null) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    protected <T> T getFirstSpan(int i, int i2, Class<T> cls) {
        View view = this.mView;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.mView).getText()).getSpans(i, i2, cls);
        if (spans.length > 0) {
            return (T) spans[0];
        }
        return null;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected int getVirtualViewAt(float f, float f2) {
        Layout layout;
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.mView;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        float totalPaddingLeft = f - textView.getTotalPaddingLeft();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - textView.getTotalPaddingTop()) + textView.getScrollY())), totalPaddingLeft + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        AccessibilityLinks.AccessibleLink linkBySpanPos = this.mAccessibilityLinks.getLinkBySpanPos(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        if (linkBySpanPos != null) {
            return linkBySpanPos.f8721id;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void getVisibleVirtualViews(List<Integer> list) {
        if (this.mAccessibilityLinks != null) {
            for (int i = 0; i < this.mAccessibilityLinks.size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C2549a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        accessibilityEvent.setItemCount(asInt3 - asInt);
                        accessibilityEvent.setCurrentItemIndex(asInt2);
                    }
                }
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C2549a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C5072R.C5074id.accessibility_role);
        if (accessibilityRole != null) {
            setRole(accessibilityNodeInfoCompat, accessibilityRole, view.getContext());
        }
        Object tag = view.getTag(C5072R.C5074id.labelled_by);
        if (tag != null) {
            View findView = ReactFindViewUtil.findView(view.getRootView(), (String) tag);
            this.mAccessibilityLabelledBy = findView;
            if (findView != null) {
                accessibilityNodeInfoCompat.m37363n0(findView);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_state);
        if (readableMap != null) {
            setState(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C5072R.C5074id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_collection_item);
        if (readableMap2 != null) {
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37332a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map.hasKey("name")) {
                    int i2 = sCounter;
                    if (map.hasKey("label")) {
                        str = map.getString("label");
                    } else {
                        str = null;
                    }
                    HashMap<String, Integer> hashMap = sActionIdMap;
                    if (hashMap.containsKey(map.getString("name"))) {
                        i2 = hashMap.get(map.getString("name")).intValue();
                    } else {
                        sCounter++;
                    }
                    this.mAccessibilityActionsMap.put(Integer.valueOf(i2), map.getString("name"));
                    accessibilityNodeInfoCompat.m37388b(new AccessibilityNodeInfoCompat.C2556a(i2, str));
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        accessibilityNodeInfoCompat.m37349u0(AccessibilityNodeInfoCompat.C2559d.m37330a(0, asInt, asInt3, asInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(C5072R.C5074id.react_test_id);
        if (str2 != null) {
            accessibilityNodeInfoCompat.m37414F0(str2);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null) {
            accessibilityNodeInfoCompat.m37381e0("");
            accessibilityNodeInfoCompat.m37394W(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(i);
        if (linkById == null) {
            accessibilityNodeInfoCompat.m37381e0("");
            accessibilityNodeInfoCompat.m37394W(new Rect(0, 0, 1, 1));
            return;
        }
        accessibilityNodeInfoCompat.m37381e0(linkById.description);
        accessibilityNodeInfoCompat.m37390a(16);
        accessibilityNodeInfoCompat.m37394W(getBoundsInParent(linkById));
        accessibilityNodeInfoCompat.m37347v0(this.mView.getResources().getString(C5072R.string.link_description));
        accessibilityNodeInfoCompat.m37389a0(AccessibilityRole.getValue(AccessibilityRole.BUTTON));
    }

    @Override // androidx.core.view.C2549a
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!this.mAccessibilityActionsMap.containsKey(Integer.valueOf(i))) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        final WritableMap createMap = Arguments.createMap();
        createMap.putString("actionName", this.mAccessibilityActionsMap.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            UIManager uIManager = UIManagerHelper.getUIManager(reactContext, id2);
            if (uIManager != null) {
                ((EventDispatcher) uIManager.getEventDispatcher()).dispatchEvent(new Event(surfaceId, id2) { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.2
                    @Override // com.facebook.react.uimanager.events.Event
                    protected WritableMap getEventData() {
                        return createMap;
                    }

                    @Override // com.facebook.react.uimanager.events.Event
                    public String getEventName() {
                        return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
                    }
                });
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C5072R.C5074id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(C5072R.C5074id.accessibility_value);
        if (accessibilityRole != AccessibilityRole.ADJUSTABLE) {
            return true;
        }
        if (i != AccessibilityNodeInfoCompat.C2556a.f3569q.m37337b() && i != AccessibilityNodeInfoCompat.C2556a.f3570r.m37337b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            scheduleAccessibilityEventSender(view);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
