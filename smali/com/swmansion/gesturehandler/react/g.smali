.class public final synthetic Lcom/swmansion/gesturehandler/react/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lef/d;


# direct methods
.method public synthetic constructor <init>(Lef/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/g;->k:Lef/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/g;->k:Lef/d;

    invoke-static {v0}, Lcom/swmansion/gesturehandler/react/h;->b(Lef/d;)V

    return-void
.end method
