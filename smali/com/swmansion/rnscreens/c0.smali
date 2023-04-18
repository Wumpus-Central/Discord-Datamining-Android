.class public final synthetic Lcom/swmansion/rnscreens/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# instance fields
.field public final synthetic a:Lcom/swmansion/rnscreens/d0;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/c0;->a:Lcom/swmansion/rnscreens/d0;

    return-void
.end method


# virtual methods
.method public final execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/c0;->a:Lcom/swmansion/rnscreens/d0;

    invoke-static {v0, p1}, Lcom/swmansion/rnscreens/d0;->a(Lcom/swmansion/rnscreens/d0;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    return-void
.end method
