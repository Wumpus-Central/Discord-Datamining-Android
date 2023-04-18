.class public final synthetic Ld9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ld9/o$c;

.field public final synthetic l:Ld9/o;


# direct methods
.method public synthetic constructor <init>(Ld9/o$c;Ld9/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/p;->k:Ld9/o$c;

    iput-object p2, p0, Ld9/p;->l:Ld9/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld9/p;->k:Ld9/o$c;

    iget-object v1, p0, Ld9/p;->l:Ld9/o;

    invoke-static {v0, v1}, Ld9/o$c;->a(Ld9/o$c;Ld9/o;)V

    return-void
.end method
