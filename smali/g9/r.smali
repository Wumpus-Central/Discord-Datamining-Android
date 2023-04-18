.class public final synthetic Lg9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:Lh7/f;


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;Lh7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/r;->k:Lg9/a0$a;

    iput-object p2, p0, Lg9/r;->l:Lh7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg9/r;->k:Lg9/a0$a;

    iget-object v1, p0, Lg9/r;->l:Lh7/f;

    invoke-static {v0, v1}, Lg9/a0$a;->a(Lg9/a0$a;Lh7/f;)V

    return-void
.end method
