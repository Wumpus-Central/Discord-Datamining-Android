.class public final synthetic Lh8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lh8/b0$a;

.field public final synthetic l:Lh8/b0;

.field public final synthetic m:Lh8/n;

.field public final synthetic n:Lh8/q;


# direct methods
.method public synthetic constructor <init>(Lh8/b0$a;Lh8/b0;Lh8/n;Lh8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/v;->k:Lh8/b0$a;

    iput-object p2, p0, Lh8/v;->l:Lh8/b0;

    iput-object p3, p0, Lh8/v;->m:Lh8/n;

    iput-object p4, p0, Lh8/v;->n:Lh8/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lh8/v;->k:Lh8/b0$a;

    iget-object v1, p0, Lh8/v;->l:Lh8/b0;

    iget-object v2, p0, Lh8/v;->m:Lh8/n;

    iget-object v3, p0, Lh8/v;->n:Lh8/q;

    invoke-static {v0, v1, v2, v3}, Lh8/b0$a;->e(Lh8/b0$a;Lh8/b0;Lh8/n;Lh8/q;)V

    return-void
.end method
