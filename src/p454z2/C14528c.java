package p454z2;

import com.brentvatne.exoplayer.AbstractC4147e;
import com.brentvatne.exoplayer.C4143c;
import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* renamed from: z2.c */
/* loaded from: classes.dex */
public class C14528c implements ReactPackage {

    /* renamed from: a */
    private AbstractC4147e f32953a;

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (this.f32953a == null) {
            this.f32953a = new C4143c(reactApplicationContext);
        }
        return Collections.singletonList(new ReactExoplayerViewManager(this.f32953a));
    }
}
