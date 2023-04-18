.class public final synthetic Lcom/swmansion/rnscreens/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/swmansion/rnscreens/l;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/k;->k:Lcom/swmansion/rnscreens/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/k;->k:Lcom/swmansion/rnscreens/l;

    invoke-static {v0}, Lcom/swmansion/rnscreens/l;->a(Lcom/swmansion/rnscreens/l;)V

    return-void
.end method
