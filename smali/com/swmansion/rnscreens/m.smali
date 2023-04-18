.class public final synthetic Lcom/swmansion/rnscreens/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Z

.field public final synthetic l:Lcom/swmansion/rnscreens/n;


# direct methods
.method public synthetic constructor <init>(ZLcom/swmansion/rnscreens/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/m;->k:Z

    iput-object p2, p0, Lcom/swmansion/rnscreens/m;->l:Lcom/swmansion/rnscreens/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/m;->k:Z

    iget-object v1, p0, Lcom/swmansion/rnscreens/m;->l:Lcom/swmansion/rnscreens/n;

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/n;->d(ZLcom/swmansion/rnscreens/n;)V

    return-void
.end method
