.class public final synthetic Lf7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/i;->k:Lf7/r$a;

    iput-object p2, p0, Lf7/i;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf7/i;->k:Lf7/r$a;

    iget-object v1, p0, Lf7/i;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lf7/r$a;->f(Lf7/r$a;Ljava/lang/String;)V

    return-void
.end method
