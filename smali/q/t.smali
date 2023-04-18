.class public final synthetic Lq/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/k;

.field public final synthetic l:Lw/m;


# direct methods
.method public synthetic constructor <init>(Lw/k;Lw/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/t;->k:Lw/k;

    iput-object p2, p0, Lq/t;->l:Lw/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/t;->k:Lw/k;

    iget-object v1, p0, Lq/t;->l:Lw/m;

    invoke-static {v0, v1}, Lq/w$a;->f(Lw/k;Lw/m;)V

    return-void
.end method
