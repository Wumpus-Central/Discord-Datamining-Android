.class public final synthetic Lcom/swmansion/rnscreens/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/swmansion/rnscreens/s;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/rnscreens/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/o;->k:Lcom/swmansion/rnscreens/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/o;->k:Lcom/swmansion/rnscreens/s;

    invoke-static {v0}, Lcom/swmansion/rnscreens/r;->y(Lcom/swmansion/rnscreens/s;)V

    return-void
.end method
