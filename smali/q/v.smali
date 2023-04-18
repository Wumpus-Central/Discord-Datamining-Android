.class public final synthetic Lq/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/k;

.field public final synthetic l:Lw/t;


# direct methods
.method public synthetic constructor <init>(Lw/k;Lw/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/v;->k:Lw/k;

    iput-object p2, p0, Lq/v;->l:Lw/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/v;->k:Lw/k;

    iget-object v1, p0, Lq/v;->l:Lw/t;

    invoke-static {v0, v1}, Lq/w$a;->d(Lw/k;Lw/t;)V

    return-void
.end method
