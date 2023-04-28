package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.AbstractC1493b;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C1494c;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.C2198b;
import androidx.core.app.C2212d;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.AbstractC3056x;
import androidx.lifecycle.C3054v;
import androidx.lifecycle.C3057y;
import androidx.lifecycle.C3058z;
import androidx.lifecycle.FragmentC3049t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.savedstate.AbstractC3156b;
import androidx.savedstate.C3157c;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import java.util.concurrent.atomic.AtomicInteger;
import p376v1.C13389b;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements AbstractC3056x, AbstractC3156b, AbstractC1487c, AbstractC1493b {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private final LifecycleRegistry mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    class RunnableC1478a implements Runnable {
        RunnableC1478a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    class C1479b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        class RunnableC1480a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ int f596k;

            /* renamed from: l */
            final /* synthetic */ ActivityResultContract.C1497a f597l;

            RunnableC1480a(int i, ActivityResultContract.C1497a aVar) {
                this.f596k = i;
                this.f597l = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1479b.this.m40991c(this.f596k, this.f597l.m40965a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class RunnableC0011b implements Runnable {

            /* renamed from: k */
            final /* synthetic */ int f599k;

            /* renamed from: l */
            final /* synthetic */ IntentSender.SendIntentException f600l;

            RunnableC0011b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f599k = i;
                this.f600l = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1479b.this.m40992b(this.f599k, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f600l));
            }
        }

        C1479b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo40988f(int i, ActivityResultContract<I, O> activityResultContract, I i2, C2212d dVar) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.C1497a<O> b = activityResultContract.mo40964b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1480a(i, b));
                return;
            }
            Intent a = activityResultContract.mo33700a(componentActivity, i2);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                if (dVar != null) {
                    bundle2 = dVar.mo38301b();
                } else {
                    bundle2 = null;
                }
                bundle = bundle2;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C2198b.m38330s(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                C1494c cVar = (C1494c) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C2198b.m38325x(componentActivity, cVar.m40971f(), i, cVar.m40974a(), cVar.m40973b(), cVar.m40972e(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0011b(i, e));
                }
            } else {
                C2198b.m38326w(componentActivity, a, i, bundle);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    class C1481c implements SavedStateRegistry.AbstractC3154b {
        C1481c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.AbstractC3154b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public Bundle mo35053a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.mActivityResultRegistry.m40986h(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    class C1482d implements OnContextAvailableListener {
        C1482d() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo36251a(Context context) {
            Bundle a = ComponentActivity.this.getSavedStateRegistry().m35059a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (a != null) {
                ComponentActivity.this.mActivityResultRegistry.m40987g(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public static final class C1483e {

        /* renamed from: a */
        Object f604a;

        /* renamed from: b */
        ViewModelStore f605b;

        C1483e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.m35052a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC1478a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C1479b();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo35844a(new AbstractC3038j() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
                    View view;
                    if (bVar == Lifecycle.EnumC3010b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().mo35844a(new AbstractC3038j() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
                    if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.m40998b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().m35792a();
                        }
                    }
                }
            });
            getLifecycle().mo35844a(new AbstractC3038j() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.AbstractC3038j
                /* renamed from: c */
                public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo35842c(this);
                }
            });
            if (i <= 23) {
                getLifecycle().mo35844a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().m35056d(ACTIVITY_RESULT_TAG, new C1481c());
            addOnContextAvailableListener(new C1482d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        C3057y.m35736a(getWindow().getDecorView(), this);
        C3058z.m35735a(getWindow().getDecorView(), this);
        C3157c.m35048a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.m40999a(onContextAvailableListener);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C1483e eVar = (C1483e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f605b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.AbstractC1493b
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                Application application = getApplication();
                if (getIntent() != null) {
                    bundle = getIntent().getExtras();
                } else {
                    bundle = null;
                }
                this.mDefaultFactory = new C3054v(application, this, bundle);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C1483e eVar = (C1483e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f604a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.AbstractC1487c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.AbstractC3156b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m35051b();
    }

    @Override // androidx.lifecycle.AbstractC3056x
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.m40992b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m41005c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m35050c(bundle);
        this.mContextAwareHelper.m40997c(this);
        super.onCreate(bundle);
        FragmentC3049t.m35752g(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.m40992b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1483e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (eVar = (C1483e) getLastNonConfigurationInstance()) != null) {
            viewModelStore = eVar.f605b;
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C1483e eVar2 = new C1483e();
        eVar2.f604a = onRetainCustomNonConfigurationInstance;
        eVar2.f605b = viewModelStore;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).m35830o(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m35049d(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m40996d();
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.m40984j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.m40995e(onContextAvailableListener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C13389b.m3771d()) {
                C13389b.m3774a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            C13389b.m3773b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
