package com.discord.react.utilities;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH\u0004¢\u0006\u0002\u0010\nJ\u001f\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\fJ1\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0002\u0010\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "T", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "()V", "delegatedInitialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/ViewGroup;", "initialProps", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)Landroid/view/ViewGroup;", "reactTag", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "(ILcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Landroid/view/ViewGroup;", "react_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class InitialPropsViewGroupManager<T extends ViewGroup> extends ViewGroupManager<T> {
    private ReactStylesDiffMap delegatedInitialProps;

    public abstract T createViewInstance(ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap);

    
    @Override 
    public final T createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        return createViewInstance(reactContext, this.delegatedInitialProps);
    }

    
    @Override 
    public final T createViewInstance(int i10, ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        q.h(reactContext, "reactContext");
        this.delegatedInitialProps = reactStylesDiffMap;
        View createViewInstance = super.createViewInstance(i10, reactContext, reactStylesDiffMap, stateWrapper);
        q.g(createViewInstance, "super.createViewInstance…itialProps, stateWrapper)");
        return (T) ((ViewGroup) createViewInstance);
    }
}
