.class public final synthetic Lf7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Ld7/k;

.field public final synthetic m:Lh7/i;


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Ld7/k;Lh7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/j;->k:Lf7/r$a;

    iput-object p2, p0, Lf7/j;->l:Ld7/k;

    iput-object p3, p0, Lf7/j;->m:Lh7/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf7/j;->k:Lf7/r$a;

    iget-object v1, p0, Lf7/j;->l:Ld7/k;

    iget-object v2, p0, Lf7/j;->m:Lh7/i;

    invoke-static {v0, v1, v2}, Lf7/r$a;->d(Lf7/r$a;Ld7/k;Lh7/i;)V

    return-void
.end method
