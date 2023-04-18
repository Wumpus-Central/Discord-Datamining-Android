.class public final synthetic Lcom/swmansion/reanimated/layoutReanimation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

.field public final synthetic l:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;Ljava/lang/ref/WeakReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/a;->k:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    iput-object p2, p0, Lcom/swmansion/reanimated/layoutReanimation/a;->l:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/a;->k:Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;

    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/a;->l:Ljava/lang/ref/WeakReference;

    invoke-static {v0, v1}, Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;->a(Lcom/swmansion/reanimated/layoutReanimation/AnimationsManager;Ljava/lang/ref/WeakReference;)V

    return-void
.end method
