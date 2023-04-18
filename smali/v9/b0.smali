.class final Lv9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic k:Lv9/e0;


# direct methods
.method constructor <init>(Lv9/e0;)V
    .locals 0

    iput-object p1, p0, Lv9/b0;->k:Lv9/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv9/b0;->k:Lv9/e0;

    invoke-static {v0}, Lv9/e0;->f0(Lv9/e0;)Lv9/d0;

    move-result-object v0

    new-instance v1, Lt9/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lt9/a;-><init>(I)V

    invoke-interface {v0, v1}, Lv9/d0;->b(Lt9/a;)V

    return-void
.end method
