.class public final synthetic Lq/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/x2;

.field public final synthetic l:Lq/r2;


# direct methods
.method public synthetic constructor <init>(Lq/x2;Lq/r2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/u2;->k:Lq/x2;

    iput-object p2, p0, Lq/u2;->l:Lq/r2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/u2;->k:Lq/x2;

    iget-object v1, p0, Lq/u2;->l:Lq/r2;

    invoke-static {v0, v1}, Lq/x2;->x(Lq/x2;Lq/r2;)V

    return-void
.end method
