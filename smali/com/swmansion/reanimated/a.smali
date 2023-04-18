.class public final synthetic Lcom/swmansion/reanimated/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;


# instance fields
.field public final synthetic a:Lcom/swmansion/reanimated/NativeProxy;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/reanimated/NativeProxy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/a;->a:Lcom/swmansion/reanimated/NativeProxy;

    return-void
.end method


# virtual methods
.method public final onOptionSelected()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/reanimated/a;->a:Lcom/swmansion/reanimated/NativeProxy;

    invoke-static {v0}, Lcom/swmansion/reanimated/NativeProxy;->a(Lcom/swmansion/reanimated/NativeProxy;)V

    return-void
.end method
