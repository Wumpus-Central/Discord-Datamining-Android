.class public final synthetic Ly6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ly6/r;

.field public final synthetic l:Lq6/o;

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ly6/r;Lq6/o;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/g;->k:Ly6/r;

    iput-object p2, p0, Ly6/g;->l:Lq6/o;

    iput p3, p0, Ly6/g;->m:I

    iput-object p4, p0, Ly6/g;->n:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ly6/g;->k:Ly6/r;

    iget-object v1, p0, Ly6/g;->l:Lq6/o;

    iget v2, p0, Ly6/g;->m:I

    iget-object v3, p0, Ly6/g;->n:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Ly6/r;->a(Ly6/r;Lq6/o;ILjava/lang/Runnable;)V

    return-void
.end method
