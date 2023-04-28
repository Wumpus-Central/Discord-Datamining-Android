package androidx.lifecycle;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends AbstractC3032e {
    @Override // androidx.lifecycle.AbstractC3032e
    void onCreate(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.AbstractC3032e
    void onDestroy(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.AbstractC3032e
    void onPause(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.AbstractC3032e
    void onResume(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.AbstractC3032e
    void onStart(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.AbstractC3032e
    void onStop(LifecycleOwner lifecycleOwner);
}
