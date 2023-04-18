.class public final synthetic Lf7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/p;->k:Lf7/r$a;

    iput-boolean p2, p0, Lf7/p;->l:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf7/p;->k:Lf7/r$a;

    iget-boolean v1, p0, Lf7/p;->l:Z

    invoke-static {v0, v1}, Lf7/r$a;->a(Lf7/r$a;Z)V

    return-void
.end method
