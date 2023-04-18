.class public final synthetic Lj7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lj7/v$a;

.field public final synthetic l:Lj7/v;


# direct methods
.method public synthetic constructor <init>(Lj7/v$a;Lj7/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/q;->k:Lj7/v$a;

    iput-object p2, p0, Lj7/q;->l:Lj7/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj7/q;->k:Lj7/v$a;

    iget-object v1, p0, Lj7/q;->l:Lj7/v;

    invoke-static {v0, v1}, Lj7/v$a;->a(Lj7/v$a;Lj7/v;)V

    return-void
.end method
