.class public final synthetic Lf7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Lh7/f;


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Lh7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/l;->k:Lf7/r$a;

    iput-object p2, p0, Lf7/l;->l:Lh7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf7/l;->k:Lf7/r$a;

    iget-object v1, p0, Lf7/l;->l:Lh7/f;

    invoke-static {v0, v1}, Lf7/r$a;->b(Lf7/r$a;Lh7/f;)V

    return-void
.end method
