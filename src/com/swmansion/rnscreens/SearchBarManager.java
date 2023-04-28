package com.swmansion.rnscreens;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = SearchBarManager.REACT_CLASS)
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0014J!\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J!\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u0014J!\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001f\u0010\u0010J\u0016\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0016¨\u0006'"}, m15073d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/h0;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "onAfterUpdateTransaction", "autoCapitalize", "setAutoCapitalize", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/h0;Ljava/lang/Boolean;)V", "", ViewProps.COLOR, "setTintColor", "(Lcom/swmansion/rnscreens/h0;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "inputType", "setInputType", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class SearchBarManager extends ViewGroupManager<C6297h0> {
    public static final C6280a Companion = new C6280a(null);
    public static final String REACT_CLASS = "RNSSearchBar";

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/swmansion/rnscreens/SearchBarManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.SearchBarManager$a */
    /* loaded from: classes8.dex */
    public static final class C6280a {
        private C6280a() {
        }

        public /* synthetic */ C6280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("onChangeText", MapBuilder.m30831of("registrationName", "onChangeText")).put("onSearchButtonPress", MapBuilder.m30831of("registrationName", "onSearchButtonPress")).put("onFocus", MapBuilder.m30831of("registrationName", "onFocus")).put("onBlur", MapBuilder.m30831of("registrationName", "onBlur")).put("onClose", MapBuilder.m30831of("registrationName", "onClose")).put("onOpen", MapBuilder.m30831of("registrationName", "onOpen")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3.equals(com.facebook.react.uimanager.ViewProps.NONE) != false) goto L_0x0041;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAutoCapitalize(com.swmansion.rnscreens.C6297h0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case 3387192: goto L_0x0030;
                case 113318569: goto L_0x0025;
                case 490141296: goto L_0x001a;
                case 1245424234: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$a r3 = com.swmansion.rnscreens.C6297h0.EnumC6298a.CHARACTERS
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$a r3 = com.swmansion.rnscreens.C6297h0.EnumC6298a.SENTENCES
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$a r3 = com.swmansion.rnscreens.C6297h0.EnumC6298a.WORDS
            goto L_0x0043
        L_0x0030:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.h0$a r3 = com.swmansion.rnscreens.C6297h0.EnumC6298a.NONE
        L_0x0043:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.h0, java.lang.String):void");
    }

    @ReactProp(name = "autoFocus")
    public final void setAutoFocus(C6297h0 view, Boolean bool) {
        boolean z;
        C9971q.m14633g(view, "view");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        view.setAutoFocus(z);
    }

    @ReactProp(name = "disableBackButtonOverride")
    public final void setDisableBackButtonOverride(C6297h0 view, Boolean bool) {
        C9971q.m14633g(view, "view");
        view.setShouldOverrideBackButton(!C9971q.m14638b(bool, Boolean.TRUE));
    }

    @ReactProp(customType = "Color", name = "headerIconColor")
    public final void setHeaderIconColor(C6297h0 view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setHeaderIconColor(num);
    }

    @ReactProp(customType = "Color", name = "hintTextColor")
    public final void setHintTextColor(C6297h0 view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setHintTextColor(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3.equals("text") != false) goto L_0x0041;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInputType(com.swmansion.rnscreens.C6297h0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9971q.m14633g(r2, r0)
            if (r3 == 0) goto L_0x0041
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L_0x002e;
                case 3556653: goto L_0x0025;
                case 96619420: goto L_0x001a;
                case 106642798: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$b r3 = com.swmansion.rnscreens.C6297h0.EnumC6299b.f12782l
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$b r3 = com.swmansion.rnscreens.C6297h0.EnumC6299b.f12784n
            goto L_0x0043
        L_0x0025:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0039
            com.swmansion.rnscreens.h0$b r3 = com.swmansion.rnscreens.C6297h0.EnumC6299b.f12783m
            goto L_0x0043
        L_0x0039:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L_0x0041:
            com.swmansion.rnscreens.h0$b r3 = com.swmansion.rnscreens.C6297h0.EnumC6299b.f12781k
        L_0x0043:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.h0, java.lang.String):void");
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void setPlaceholder(C6297h0 view, String str) {
        C9971q.m14633g(view, "view");
        if (str != null) {
            view.setPlaceholder(str);
        }
    }

    @ReactProp(name = "shouldShowHintSearchIcon")
    public final void setShouldShowHintSearchIcon(C6297h0 view, Boolean bool) {
        boolean z;
        C9971q.m14633g(view, "view");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        view.setShouldShowHintSearchIcon(z);
    }

    @ReactProp(customType = "Color", name = "textColor")
    public final void setTextColor(C6297h0 view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setTextColor(num);
    }

    @ReactProp(customType = "Color", name = "barTintColor")
    public final void setTintColor(C6297h0 view, Integer num) {
        C9971q.m14633g(view, "view");
        view.setTintColor(num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6297h0 createViewInstance(ThemedReactContext context) {
        C9971q.m14633g(context, "context");
        return new C6297h0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C6297h0 view) {
        C9971q.m14633g(view, "view");
        super.onAfterUpdateTransaction((SearchBarManager) view);
        view.m25948o();
    }
}
