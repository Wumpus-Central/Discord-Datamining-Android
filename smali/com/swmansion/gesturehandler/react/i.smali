.class public final synthetic Lcom/swmansion/gesturehandler/react/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/i;->k:Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/i;->k:Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;

    invoke-static {v0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;->a(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;)V

    return-void
.end method
