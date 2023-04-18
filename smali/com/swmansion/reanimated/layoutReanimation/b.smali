.class public final synthetic Lcom/swmansion/reanimated/layoutReanimation/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/b;->k:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/b;->k:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;

    invoke-static {v0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->a(Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationListener;)V

    return-void
.end method
