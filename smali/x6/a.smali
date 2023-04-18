.class public final synthetic Lx6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lx6/c;

.field public final synthetic l:Lq6/o;

.field public final synthetic m:Lo6/h;

.field public final synthetic n:Lq6/i;


# direct methods
.method public synthetic constructor <init>(Lx6/c;Lq6/o;Lo6/h;Lq6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/a;->k:Lx6/c;

    iput-object p2, p0, Lx6/a;->l:Lq6/o;

    iput-object p3, p0, Lx6/a;->m:Lo6/h;

    iput-object p4, p0, Lx6/a;->n:Lq6/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lx6/a;->k:Lx6/c;

    iget-object v1, p0, Lx6/a;->l:Lq6/o;

    iget-object v2, p0, Lx6/a;->m:Lo6/h;

    iget-object v3, p0, Lx6/a;->n:Lq6/i;

    invoke-static {v0, v1, v2, v3}, Lx6/c;->b(Lx6/c;Lq6/o;Lo6/h;Lq6/i;)V

    return-void
.end method
